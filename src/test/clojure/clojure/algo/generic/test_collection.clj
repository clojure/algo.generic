;; Test routines for clojure.algo.generic.collection

;; Copyright (c) Konrad Hinsen, 2011. All rights reserved.  The use
;; and distribution terms for this software are covered by the Eclipse
;; Public License 1.0 (http://opensource.org/licenses/eclipse-1.0.php)
;; which can be found in the file epl-v10.html at the root of this
;; distribution.  By using this software in any fashion, you are
;; agreeing to be bound by the terms of this license.  You must not
;; remove this notice, or any other, from this software.

(ns clojure.algo.generic.test-collection
  (:use [clojure.test :only (deftest is are run-tests)])
  (:require [clojure.algo.generic.collection :as gc]))

; Define a multiset class. The representation is a map from values to counts.
(defrecord multiset [map])

(defn mset
  [& elements]
  (gc/into (new multiset {}) elements))

; Implement the collection multimethods.
(defmethod gc/conj multiset
  ([ms x]
   (let [msmap (:map ms)]
     (new multiset (assoc msmap x (inc (get msmap x 0))))))
  ([ms x & xs]
   (reduce gc/conj (gc/conj ms x) xs)))

(defmethod gc/empty multiset
  [ms]
  (new multiset {}))

(defmethod gc/seq multiset
  [ms]
  (apply concat (map (fn [[x n]] (repeat n x)) (:map ms))))

; Define a sparse vector class. The representation is a map from
; integer indices to values.
(defrecord sparse-vector [map])

(defn s-vector
  [& values]
  (apply gc/conj (new sparse-vector {}) values))

; Implement the collection multimethods
(defmethod gc/assoc sparse-vector
  [sv key value]
  (assert (integer? key))
  (assert (not (neg? key)))
  (new sparse-vector
       (if (nil? value)
         (:map sv)
         (assoc (:map sv) key value))))

(defmethod gc/get sparse-vector
  ([sv key]
   (gc/get sv key nil))
  ([sv key default]
   (get (:map sv) key default)))

(defmethod gc/conj sparse-vector
  [sv & xs]
  (loop [svmap (:map sv)
         index (inc (apply max (conj (keys svmap) -1)))
         xs    xs]
    (if (empty? xs)
      (new sparse-vector svmap)
      (recur (if (nil? (first xs))
               svmap
               (assoc svmap index (first xs)))
             (inc index) (rest xs)))))

(defmethod gc/empty sparse-vector
  [sv]
  (new sparse-vector {}))

(defmethod gc/seq sparse-vector
  [sv]
  (let [svmap     (:map sv)
        max-index (apply max (conj (keys svmap) -1))]
    (if (neg? max-index)
      nil
      (for [i (range (inc max-index))] (get svmap i nil)))))

; Multiset tests
(deftest multiset-tests
  (are [a b] (= a b)
       (mset :a :a :b) (mset :a :b :a)
       (gc/conj (mset) :a) (mset :a)
       (gc/conj (mset) :b :a :b :a) (mset :a :a :b :b)
       (gc/empty (mset :a)) (mset)
       (gc/seq (mset :a :a :a)) '(:a :a :a)))

; Sparse vector tests
(deftest sparse-vector-tests
  (are [a b] (= a b)
       (gc/empty (s-vector)) (s-vector)
       (gc/conj (s-vector 1 2) 3) (s-vector 1 2 3)
       (gc/assoc (s-vector 1 2) 2 3) (s-vector 1 2 3)
       (gc/assoc (s-vector 1 2) 4 3) (s-vector 1 2 nil nil 3)
       (gc/get (s-vector 1 2 3) 1) 2
       (gc/seq (gc/assoc (s-vector 1) 3 3)) '(1 nil nil 3)))
