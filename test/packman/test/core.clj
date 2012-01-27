(ns packman.test.core
  (:require [packman.core :as packman])
  (:use [clojure.test])
  (:use [midje.sweet]))

(deftest greeting
  (is (= (packman/greeting) "Welcome to PackMan!") "(greeting) should return the string \"Welcome to PackMan!\""))

(fact
 (packman/greeting) => "Welcome to PackMana!")

