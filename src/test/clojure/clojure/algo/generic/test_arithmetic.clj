;; Test routines for clojure.algo.generic.arithmetic

;; Copyright (c) Konrad Hinsen, 2011. All rights reserved.  The use
;; and distribution terms for this software are covered by the Eclipse
;; Public License 1.0 (http://opensource.org/licenses/eclipse-1.0.php)
;; which can be found in the file epl-v10.html at the root of this
;; distribution.  By using this software in any fashion, you are
;; agreeing to be bound by the terms of this license.  You must not
;; remove this notice, or any other, from this software.

(ns clojure.algo.generic.test-arithmetic
  (:use [clojure.test :only (deftest is are run-tests)]
        [clojure.algo.generic :only (root-type)])
  (:require [clojure.algo.generic.arithmetic :as ga]
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
