;; Test routines for clojure.algo.generic.collection

;; Copyright (c) Konrad Hinsen, 2011. All rights reserved.  The use
;; and distribution terms for this software are covered by the Eclipse
;; Public License 1.0 (http://opensource.org/licenses/eclipse-1.0.php)
;; which can be found in the file epl-v10.html at the root of this
;; distribution.  By using this software in any fashion, you are
;; agreeing to be bound by the terms of this license.  You must not
;; remove this notice, or any other, from this software.

(ns clojure.algo.generic.test-functor
  (:use [clojure.test :only (deftest is are run-tests)])
  (:require [clojure.algo.generic.functor :as gf])
  (:require [clojure.algo.generic.collection :as gc]))

; Test implementations for CLojure's built-in collections
(deftest builtin-collections
  (are [a b] (= a b)
       (gf/fmap inc (list 1 2 3)) (list 2 3 4)
       (gf/fmap inc [1 2 3]) [2 3 4]
       (gf/fmap inc {:A 1 :B 2 :C 3}) {:A 2 :B 3 :C 4}
       (gf/fmap inc #{1 2 3}) #{2 3 4}
       (gf/fmap inc (lazy-seq [1 2 3])) (list 2 3 4)
       (gf/fmap inc (seq [1 2 3])) (list 2 3 4)
       (gf/fmap inc (range 3)) (list 1 2 3)
       (gf/fmap inc nil) nil))

; Test implementation for functions
(deftest functions
  (let [f (fn [x] (+ x x))
        x [-1 0 1 2]]
    (is (= (map (gf/fmap - f) x)
           (map (comp - f) x)))))

; Futures and delays
(deftest future-test
  (is (= 2 @(gf/fmap inc (future 1)))))

(deftest delay-test
  (is (= 2 @(gf/fmap inc (delay 1)))))

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

; Implement fmap
(defmethod gf/fmap multiset
  [f m]
  (gc/into (gc/empty m) (map f (gc/seq m))))

; Multiset tests
(deftest multiset-tests
  (are [a b] (= a b)
       (gf/fmap inc (mset 1 2 3)) (mset 2 3 4)))

