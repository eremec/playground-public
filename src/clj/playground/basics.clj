(ns playground.basics)


;; Data primitives
;;
;; Strings: "Hello", "Roses are blue"
;; Numbers: 1, 67, 1020434


;; Functions

(+ 1 2)


(defn minus3 [n]
  (- n 3))

(minus3 5)

(minus3 1)


(+ 2
   (minus3 1))


(defn foo [n]  ;; subtract 3, then add 5, and then subtract 7. Use previously defined function
  )
  


(= "Red" "Green")

(def my-color "Grey")

(if (= my-color "Grey")
  "There is my favourite color"
  "I hope it isn't yellow at least")
  

;; Write a function that takes two strings and if they are equal returns "green" otherwise "red"


;; Work with state

(def container (atom 1))

@container

(reset! container 5)

@container

(inc 3)

(swap! container inc)

@container

(swap! container foo)

@container
