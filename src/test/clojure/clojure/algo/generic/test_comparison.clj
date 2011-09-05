;; Test routines for clojure.algo.generic.comparison

;; Copyright (c) Konrad Hinsen, 2011. All rights reserved.  The use
;; and distribution terms for this software are covered by the Eclipse
;; Public License 1.0 (http://opensource.org/licenses/eclipse-1.0.php)
;; which can be found in the file epl-v10.html at the root of this
;; distribution.  By using this software in any fashion, you are
;; agreeing to be bound by the terms of this license.  You must not
;; remove this notice, or any other, from this software.

(ns clojure.algo.generic.test-comparison
  (:use [clojure.test :only (deftest is are run-tests)])
  (:require [clojure.algo.generic.comparison :as gc]))

; Define a class that wraps a number.
(defrecord my-number [value])
(defn n [value] (new my-number value))

; Implement the minimal comparison multimethods.
(defmethod gc/zero? my-number
  [x]
  (zero? (:value x)))

(defmethod gc/= [my-number my-number]
  [x y]
  (= (:value x) (:value y)))

(defmethod gc/> [my-number my-number]
  [x y]
  (> (:value x) (:value y)))

; Basic tests
(deftest number-comparison
  (is (gc/zero? (n 0)))
  (is (not (gc/zero? (n 1))))
  (is (gc/= (n 2) (n 2)))
  (is (gc/not= (n 2) (n 3)))
  (is (gc/> (n 3) (n 2)))
  (is (gc/>= (n 3) (n 2)))
  (is (gc/< (n 2) (n 3)))
  (is (gc/<= (n 2) (n 3)))
  (is (gc/>= (n 2) (n 2)))
  (is (gc/<= (n 2) (n 2))))
