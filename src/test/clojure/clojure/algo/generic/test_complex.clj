;; Test routines for clojure.algo.generic.arithmetic
;; and clojure.algo.generic.math_functions.

;; Copyright (c) Konrad Hinsen, 2011. All rights reserved.  The use
;; and distribution terms for this software are covered by the Eclipse
;; Public License 1.0 (http://opensource.org/licenses/eclipse-1.0.php)
;; which can be found in the file epl-v10.html at the root of this
;; distribution.  By using this software in any fashion, you are
;; agreeing to be bound by the terms of this license.  You must not
;; remove this notice, or any other, from this software.

(ns clojure.algo.generic.test-complex
  (:use [clojure.test :only (deftest is are run-tests)]
        [clojure.algo.generic :only (root-type)])
  (:require [clojure.algo.generic.arithmetic :as ga]
            [clojure.algo.generic.math-functions :as gmf]
	    [clojure.algo.generic.comparison :as gc]))

; Define a basic complex number type
(defrecord complex-number [real imag])

(defn complex
  [real imag]
  (new complex-number real imag))

(defn real
  [c]
  (:real c))

(defn imag
  [c]
  (:imag c))

; Minimal implementation of generic.comparison to facilitate testing
(defmethod gc/zero? complex-number
  [x]
  (and (zero? (real x)) (zero? (imag x))))

(defmethod gc/= [complex-number complex-number]
  [x y]
  (and (gc/= (real x) (real y))
       (gc/= (imag x) (imag y))))

(defmethod gc/= [complex-number root-type]
  [x y]
  (and (gc/zero? (imag x)) (gc/= (real x) y)))

(defmethod gc/= [root-type complex-number]
  [x y]
  (and (gc/zero? (imag y)) (gc/= x (real y))))

; Arithmetic
(defmethod ga/+ [complex-number complex-number]
  [x y]
  (complex (ga/+ (real x) (real y)) (ga/+ (imag x) (imag y))))

(defmethod ga/+ [complex-number root-type]
  [x y]
  (complex (ga/+ (real x) y) (imag x)))

(defmethod ga/+ [root-type complex-number]
  [x y]
  (complex (ga/+ x (real y)) (imag y)))

(defmethod ga/- complex-number
  [x]
  (complex (ga/- (real x)) (ga/- (imag x))))

(defmethod ga/* [complex-number complex-number]
  [x y]
  (complex (ga/- (ga/* (real x) (real y)) (ga/* (imag x) (imag y)))
           (ga/+ (ga/* (real x) (imag y)) (ga/* (imag x) (real y)))))

(defmethod ga/* [complex-number root-type]
  [x y]
  (complex (ga/* (real x) y) (ga/* (imag x) y)))

(defmethod ga/* [root-type complex-number]
  [x y]
  (complex (ga/* x (real y)) (ga/* x (imag y))))

(ga/defmethod* ga / complex-number
  [x]
  (let [rx (real x)
        ix (imag x)
	den ((ga/qsym ga /) (ga/+ (ga/* rx rx) (ga/* ix ix)))]
    (complex (ga/* rx den) (ga/- (ga/* ix den)))))

; Math functions
(defmethod gmf/conjugate complex-number
  [x]
  (complex (real x) (ga/- (imag x))))

(defmethod gmf/abs complex-number
  [x]
  (let [r (real x)
        i (imag x)]
    (gmf/sqrt (ga/+ (ga/* r r) (ga/* i i)))))

(let [one-half   (/ 1 2)
      one-eighth (/ 1 8)]
  (defmethod gmf/sqrt complex-number
    [x]
    (let [[r i] (vals x)]
      (if (and (gc/zero? r) (gc/zero? i))
        0
        (let [; The basic formula would say
              ;    abs (gmf/sqrt (ga/+ (ga/* r r) (ga/* i i)))
	      ;    p   (gmf/sqrt (ga/* one-half (ga/+ abs r)))
	      ; but the slightly more complicated one below
	      ; avoids overflow for large r or i.
	      ar  (gmf/abs r)
	      ai  (gmf/abs i)
	      r8  (ga/* one-eighth ar)
	      i8  (ga/* one-eighth ai)
	      abs (gmf/sqrt (ga/+ (ga/* r8 r8) (ga/* i8 i8)))
	      p   (ga/* 2 (gmf/sqrt (ga/+ abs r8)))
	      q   ((ga/qsym ga /) ai (ga/* 2 p))
	      s   (gmf/sgn i)]
	  (if (gc/< r 0)
	    (complex q (ga/* s p))
	    (complex p (ga/* s q))))))))

(defmethod gmf/exp complex-number
  [x]
  (let [r (real x)
        i (imag x)
	exp-r (gmf/exp r)
	cos-i (gmf/cos i)
	sin-i (gmf/sin i)]
    (complex (ga/* exp-r cos-i) (ga/* exp-r sin-i))))

; Complex number tests
(deftest complex-addition
  (is (gc/= (ga/+ (complex 1 2) (complex 1 2)) (complex 2 4)))
  (is (gc/= (ga/+ (complex 1 2) (complex -3 -7)) (complex -2 -5)))
  (is (gc/= (ga/+ (complex -3 -7) (complex 1 2)) (complex -2 -5)))
  (is (gc/= (ga/+ (complex 1 2) 3) (complex 4 2)))
  (is (gc/= (ga/+ 3 (complex 1 2)) (complex 4 2)))
  (is (gc/= (ga/+ (complex -3 -7) (complex 1 2)) (complex -2 -5)))
  (is (gc/= (ga/+ (complex 1 2) (complex -3 -7)) (complex -2 -5)))
  (is (gc/= (ga/+ (complex -3 -7) (complex -3 -7)) (complex -6 -14)))
  (is (gc/= (ga/+ (complex -3 -7) -1) (complex -4 -7)))
  (is (gc/= (ga/+ -1 (complex -3 -7)) (complex -4 -7)))
  (is (gc/= (ga/+ 3 (complex 1 2)) (complex 4 2)))
  (is (gc/= (ga/+ (complex 1 2) 3) (complex 4 2)))
  (is (gc/= (ga/+ -1 (complex -3 -7)) (complex -4 -7)))
  (is (gc/= (ga/+ (complex -3 -7) -1) (complex -4 -7))))

(deftest complex-subtraction
  (is (gc/= (ga/- (complex 1 2) (complex 1 2)) 0))
  (is (gc/= (ga/- (complex 1 2) (complex -3 -7)) (complex 4 9)))
  (is (gc/= (ga/- (complex -3 -7) (complex 1 2)) (complex -4 -9)))
  (is (gc/= (ga/- (complex 1 2) 3) (complex -2 2)))
  (is (gc/= (ga/- 3 (complex 1 2)) (complex 2 -2)))
  (is (gc/= (ga/- (complex 1 2) -1) (complex 2 2)))
  (is (gc/= (ga/- -1 (complex 1 2)) (complex -2 -2)))
  (is (gc/= (ga/- (complex -3 -7) (complex 1 2)) (complex -4 -9)))
  (is (gc/= (ga/- (complex 1 2) (complex -3 -7)) (complex 4 9)))
  (is (gc/= (ga/- (complex -3 -7) (complex -3 -7)) 0))
  (is (gc/= (ga/- (complex -3 -7) 3) (complex -6 -7)))
  (is (gc/= (ga/- 3 (complex -3 -7)) (complex 6 7)))
  (is (gc/= (ga/- (complex -3 -7) -1) (complex -2 -7)))
  (is (gc/= (ga/- -1 (complex -3 -7)) (complex 2 7)))
  (is (gc/= (ga/- 3 (complex 1 2)) (complex 2 -2)))
  (is (gc/= (ga/- (complex 1 2) 3) (complex -2 2)))
  (is (gc/= (ga/- 3 (complex -3 -7)) (complex 6 7)))
  (is (gc/= (ga/- (complex -3 -7) 3) (complex -6 -7)))
  (is (gc/= (ga/- -1 (complex 1 2)) (complex -2 -2)))
  (is (gc/= (ga/- (complex 1 2) -1) (complex 2 2)))
  (is (gc/= (ga/- -1 (complex -3 -7)) (complex 2 7)))
  (is (gc/= (ga/- (complex -3 -7) -1) (complex -2 -7))))

(deftest complex-multiplication
  (is (gc/= (ga/* (complex 1 2) (complex 1 2)) (complex -3 4)))
  (is (gc/= (ga/* (complex 1 2) (complex -3 -7)) (complex 11 -13)))
  (is (gc/= (ga/* (complex -3 -7) (complex 1 2)) (complex 11 -13)))
  (is (gc/= (ga/* (complex 1 2) 3) (complex 3 6)))
  (is (gc/= (ga/* 3 (complex 1 2)) (complex 3 6)))
  (is (gc/= (ga/* (complex 1 2) -1) (complex -1 -2)))
  (is (gc/= (ga/* -1 (complex 1 2)) (complex -1 -2)))
  (is (gc/= (ga/* (complex -3 -7) (complex 1 2)) (complex 11 -13)))
  (is (gc/= (ga/* (complex 1 2) (complex -3 -7)) (complex 11 -13)))
  (is (gc/= (ga/* (complex -3 -7) (complex -3 -7)) (complex -40 42)))
  (is (gc/= (ga/* (complex -3 -7) 3) (complex -9 -21)))
  (is (gc/= (ga/* 3 (complex -3 -7)) (complex -9 -21)))
  (is (gc/= (ga/* (complex -3 -7) -1) (complex 3 7)))
  (is (gc/= (ga/* -1 (complex -3 -7)) (complex 3 7)))
  (is (gc/= (ga/* 3 (complex 1 2)) (complex 3 6)))
  (is (gc/= (ga/* (complex 1 2) 3) (complex 3 6)))
  (is (gc/= (ga/* 3 (complex -3 -7)) (complex -9 -21)))
  (is (gc/= (ga/* (complex -3 -7) 3) (complex -9 -21)))
  (is (gc/= (ga/* -1 (complex 1 2)) (complex -1 -2)))
  (is (gc/= (ga/* (complex 1 2) -1) (complex -1 -2)))
  (is (gc/= (ga/* -1 (complex -3 -7)) (complex 3 7)))
  (is (gc/= (ga/* (complex -3 -7) -1) (complex 3 7))))

(let [div (ga/qsym ga /)]
  (deftest complex-division
    (is (gc/= (div (complex 1 2) (complex 1 2)) 1))
    (is (gc/= (div (complex 1 2) (complex -3 -7)) (complex -17/58 1/58)))
    (is (gc/= (div (complex -3 -7) (complex 1 2)) (complex -17/5 -1/5)))
    (is (gc/= (div (complex 1 2) 3) (complex 1/3 2/3)))
    (is (gc/= (div 3 (complex 1 2)) (complex 3/5 -6/5)))
    (is (gc/= (div (complex 1 2) -1) (complex -1 -2)))
    (is (gc/= (div -1 (complex 1 2)) (complex -1/5 2/5)))
    (is (gc/= (div (complex -3 -7) (complex 1 2)) (complex -17/5 -1/5)))
    (is (gc/= (div (complex 1 2) (complex -3 -7)) (complex -17/58 1/58)))
    (is (gc/= (div (complex -3 -7) (complex -3 -7)) 1))
    (is (gc/= (div (complex -3 -7) 3) (complex -1 -7/3)))
    (is (gc/= (div 3 (complex -3 -7)) (complex -9/58 21/58)))
    (is (gc/= (div (complex -3 -7) -1) (complex 3 7)))
    (is (gc/= (div -1 (complex -3 -7)) (complex 3/58 -7/58)))
    (is (gc/= (div 3 (complex 1 2)) (complex 3/5 -6/5)))
    (is (gc/= (div (complex 1 2) 3) (complex 1/3 2/3)))
    (is (gc/= (div 3 (complex -3 -7)) (complex -9/58 21/58)))
    (is (gc/= (div (complex -3 -7) 3) (complex -1 -7/3)))
    (is (gc/= (div -1 (complex 1 2)) (complex -1/5 2/5)))
    (is (gc/= (div (complex 1 2) -1) (complex -1 -2)))
    (is (gc/= (div -1 (complex -3 -7)) (complex 3/58 -7/58)))
    (is (gc/= (div (complex -3 -7) -1) (complex 3 7)))))

(deftest complex-conjugate
  (is (gc/= (gmf/conjugate (complex 1 2)) (complex 1 -2)))
  (is (gc/= (gmf/conjugate (complex -3 -7)) (complex -3 7)))
  (is (gc/= (gmf/conjugate (complex 0 -2)) (complex 0 2)))
  (is (gc/= (gmf/conjugate (complex 0 5)) (complex 0 -5))))

(deftest complex-abs
  (doseq [c [(complex 1 2) (complex -2 3) (complex 4 -2)
             (complex -3 -7) (complex 0 -2) (complex 0 5)]]
    (is (gmf/approx= (ga/* c (gmf/conjugate c))
                 (gmf/sqr (gmf/abs c))
                 1e-14))))

(deftest complex-sqrt
  (doseq [c [(complex 1 2) (complex -2 3) (complex 4 -2)
             (complex -3 -7) (complex 0 -2) (complex 0 5)]]
    (let [r (gmf/sqrt c)]
      (is (gmf/approx= c (gmf/sqr r) 1e-14))
      (is (>= (real r) 0)))))

(deftest complex-exp
  (is (gmf/approx= (gmf/exp (complex 1 2))
                   (complex -1.1312043837568135 2.4717266720048188)
                   1e-14))
  (is (gmf/approx= (gmf/exp (complex 2 3))
                   (complex -7.3151100949011028 1.0427436562359045)
                   1e-14))
  (is (gmf/approx= (gmf/exp (complex 4 -2))
                   (complex -22.720847417619233 -49.645957334580565)
                   1e-14))
  (is (gmf/approx= (gmf/exp (complex 3 -7))
                   (complex 15.142531566086868 -13.195928586605717)
                   1e-14))
  (is (gmf/approx= (gmf/exp (complex 0 -2))
                   (complex -0.41614683654714241 -0.90929742682568171)
                   1e-14))
  (is (gmf/approx= (gmf/exp (complex 0 5))
                   (complex 0.2836621854632263 -0.95892427466313845)
                   1e-14)))
