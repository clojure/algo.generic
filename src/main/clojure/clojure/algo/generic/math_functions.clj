;; Generic interfaces for mathematical functions

;; by Konrad Hinsen

;; Copyright (c) Konrad Hinsen, 2009-2011. All rights reserved.  The use
;; and distribution terms for this software are covered by the Eclipse
;; Public License 1.0 (http://opensource.org/licenses/eclipse-1.0.php)
;; which can be found in the file epl-v10.html at the root of this
;; distribution.  By using this software in any fashion, you are
;; agreeing to be bound by the terms of this license.  You must not
;; remove this notice, or any other, from this software.

;; Cort Spellman, 2015:
;; Changes of abs and round to be manually defined for various types instead
;; of via defmathfn-1.

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
(defmathfn-1 sin)
(defmathfn-1 sqrt)
(defmathfn-1 tan)

;
; Absolute value
; defmathfn-1 only works for types of numbers for which java.Math has an abs
; method:
; * java.math.BigInteger and java.math.BigDecimal classes define their own abs
; methods.
; * clojure.lang.BigInt may internally be a long or a BigInteger but in either
; case clojure.lang.BigInt does not have an abs method.
; * clojure.lang.Ratio does not have an abs method.
;
(defmulti abs
  "Return the absolute value of x. If x is a BigDecimal, abs takes an optional
  math-context argument."
  {:arglists '([x] [x math-context])}
  (fn [x & more] (type x)))

(defmethod abs :default
  [x]
  (cond (gc/neg? x) (- x)
        :else x))

(defmethod abs java.lang.Number
  [x]
  (java.lang.Math/abs x))

(defmethod abs java.math.BigDecimal
  ([x]
   (.abs x))
  ([x math-context]
   (.abs x math-context)))

(defmethod abs java.math.BigInteger
  [x]
  (.abs x))

(defmethod abs clojure.lang.BigInt
  [x]
  (if (nil? (.bipart x))
    (clojure.lang.BigInt/fromLong (abs (.lpart x)))
    (clojure.lang.BigInt/fromBigInteger (abs (.bipart x)))))

(defmethod abs clojure.lang.Ratio
  [x]
  (/ (abs (numerator x))
     (abs (denominator x))))

;
; Round
; defmathfn-1 only works for types of numbers for which java.Math has an abs
; method:
; * java.math.BigInteger and java.math.BigDecimal classes define their own round
; methods.
; * clojure.lang.BigInt may internally be a long or a BigInteger but in either
; case clojure.lang.BigInt does not have an round method.
; * clojure.lang.Ratio does not have an round method.
;
(defmulti round
  "Round x.
  If x is a BigDecimal, a math-context argument is also required:
    (round x math-context)
  If x is a Ratio,
    (round x) converts x to a double and rounds;
    (round x math-context) converts x to a BigDecimal and rounds."
  {:arglists '([x] [x math-context])}
  (fn [x & more] (type x)))

(doseq [c [java.lang.Float
           java.lang.Double]]
  (defmethod round c [x] (java.lang.Math/round x)))

(doseq [c [java.lang.Byte
           java.lang.Short
           java.lang.Integer
           java.lang.Long
           java.math.BigInteger
           clojure.lang.BigInt]]
  (defmethod round c [x] x))

(defmethod round java.math.BigDecimal
  [x math-context]
  (.round x math-context))

(defmethod round clojure.lang.Ratio
  ([x]
   (round (double x)))
  ([x math-context]
   (round (bigdec x) math-context)))


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
