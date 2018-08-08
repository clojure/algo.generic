;; Generic interface for functors

;; by Konrad Hinsen

;; Copyright (c) Konrad Hinsen, 2009-2011. All rights reserved.  The use
;; and distribution terms for this software are covered by the Eclipse
;; Public License 1.0 (http://opensource.org/licenses/eclipse-1.0.php)
;; which can be found in the file epl-v10.html at the root of this
;; distribution.  By using this software in any fashion, you are
;; agreeing to be bound by the terms of this license.  You must not
;; remove this notice, or any other, from this software.

(ns
  ^{:author "Konrad Hinsen"
     :doc "Generic functor interface (fmap)"}
  clojure.algo.generic.functor)


(defmulti fmap
  "Applies function f to each item in the data structure s and returns
   a structure of the same kind."
   {:arglists '([f s])}
   (fn [f s] (type s)))

(defmethod fmap clojure.lang.IPersistentList
  [f v]
  (map f v))

(defmethod fmap clojure.lang.IPersistentVector
  [f v]
  (into (empty v) (map f v)))

(defmethod fmap clojure.lang.IPersistentMap
  [f m]
  (into (empty m) (for [[k v] m] [k (f v)])))

(defmethod fmap clojure.lang.IPersistentSet
  [f s]
  (into (empty s) (map f s)))

(defmethod fmap clojure.lang.IFn
  [f fn]
  (comp f fn))

(prefer-method fmap clojure.lang.IPersistentVector clojure.lang.IFn)
(prefer-method fmap clojure.lang.IPersistentMap clojure.lang.IFn)
(prefer-method fmap clojure.lang.IPersistentSet clojure.lang.IFn)
(prefer-method fmap clojure.lang.IPersistentList clojure.lang.ISeq)

(defmethod fmap clojure.lang.ISeq
  [f s]
  (map f s))

(defmethod fmap java.util.concurrent.Future
  [f o]
  (future (f @o)))

(defmethod fmap clojure.lang.Delay
  [f d]
  (delay (f @d)))

(defmethod fmap nil
  [_ _]
  nil)
