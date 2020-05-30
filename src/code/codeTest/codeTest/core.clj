(ns code.codeTest.codeTest.core
  (:gen-class))
(defn -main [& args]
  (loop [a1 0, a2 1, x 1]
    (when (<= x 1000000)
      (if (= x 1000) (println "Find out 1000 Fib digits and sum them = " a2))
      (if (= x 1000000) (println "Find out 1000000 Fib digits and sum them = " a2))
      (recur a2 (+ a1 a2) (inc x)))
    )

  )

