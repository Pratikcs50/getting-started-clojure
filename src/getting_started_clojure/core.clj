(ns getting-started-clojure.core
  (:gen-class))


; (
;   "We shall contemplate truth by testing reality, via equality"
;   (= true true)

;   "To understand reality, we must compare our expectations against reality"
;   (= 2 (+ 1 1))

;   "You can test equality of many things"
;   (= (+ 3 4) 7 (+ 2 5))

;   "Some things may appear different, but be the same"
;   (= true (= 2 2/1))

;   "You cannot generally float to heavens of integers"
;   (= 2 (= 2 2.0))

;   "But a looser equality is also possible"
;   (= true (== 2.0 2))

;   "Something is not equal to nothing"
;   (= true (not (= 1 nil)))

;   "Strings, and keywords, and symbols: oh my!"
;   (= false (= "hello" :hello 'hello))

;   "Make a keyword with your keyboard"
;   (= :hello (keyword he))

;   "Symbolism is all around us"
;   (= 'hello (symbol __))

;   "What could be equivalent to nothing?"
;   (= __ nil)

;   "When things cannot be equal, they must be different"
;   (not= :fill-in-the-blank __))


(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println (+ 2 3))
  "We shall contemplate truth by testing reality, via equality"
  (println (= true true)))




