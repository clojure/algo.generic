;; Generic interfaces for mathematical functions

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
     :doc "Generic math function interface
           This library defines generic versions of common mathematical
           functions such as sqrt or sin as multimethods that can be
           defined for any type."}
  clojure.algo.generic.math-functions
  (:require [clojure.algo.generic.arithmetic :as ga]
            [clojure.algo.generic.comparison :as gc]))

; This used to be in clojure.contrib.def (by Steve Gilardi),
; which has not been migrated to the new contrib collection.
(defmacro defmacro-
  "Same as defmacro but yields a private definition"
  [name & decls]
  (list* `defmacro (with-meta name (assoc (meta name) :private true)) decls))

; One-argument math functions
(defmacro- defmathfn-1
  [name]
  (let [java-symbol (symbol "java.lang.Math" (str name))]
    `(do
       (defmulti ~name
         ~(str "Return the " name " of x.")
         {:arglists '([~'x])}
         type)
       (defmethod ~name java.lang.Number
         [~'x]
         (~java-symbol ~'x)))))

(defn- two-types [x y] [(type x) (type y)])

; Two-argument math functions
(defmacro- defmathfn-2
  [name]
  (let [java-symbol (symbol "java.lang.Math" (str name))]
    `(do
       (defmulti ~name
         ~(str "Return the " name " of x and y.")
         {:arglists '([~'x ~'y])}
         two-types)
       (defmethod ~name [java.lang.Number java.lang.Number]
         [~'x ~'y]
         (~java-symbol ~'x ~'y)))))

; List of math functions taken from
; http://java.sun.com/j2se/1.4.2/docs/api/java/lang/Math.html
(defmathfn-1 abs)
(defmathfn-1 acos)
(defmathfn-1 asin)
(defmathfn-1 atan)
(defmathfn-2 atan2)
(defmathfn-1 ceil)
(defmathfn-1 cos)
(defmathfn-1 exp)
(defmathfn-1 floor)
(defmathfn-1 log)
(defmathfn-2 pow)
(defmathfn-1 rint)
(defmathfn-1 round)
(defmathfn-1 sin)
(defmathfn-1 sqrt)
(defmathfn-1 tan)

;; http://docs.oracle.com/javase/6/docs/api/java/lang/Math.html
(defmathfn-1 cbrt)
(defmathfn-1 cosh)
(defmathfn-1 expm1)
(defmathfn-2 hypot)
(defmathfn-1 log10)
(defmathfn-1 log1p)
(defmathfn-1 sinh)
(defmathfn-1 tanh)

;
; Sign
;
(defmulti sgn
  "Return the sign of x (-1, 0, or 1)."
  {:arglists '([x])}
  type)

(defmethod sgn :default
  [x]
  (cond (gc/zero? x) 0
        (gc/> x 0) 1
        :else -1))

;
; Conjugation
;
(defmulti conjugate
  "Return the conjugate of x."
  {:arglists '([x])}
  type)

(defmethod conjugate :default
  [x] x)

;
; Square
;
(defmulti sqr
  "Return the square of x."
  {:arglists '([x])}
  type)

(defmethod sqr :default
  [x]
  (ga/* x x))

;
; Approximate equality for use with floating point types
;
(defn approx=
  "Return true if the absolute value of the difference between x and y
   is less than eps."
  [x y eps]
  (gc/< (abs (ga/- x y)) eps))
