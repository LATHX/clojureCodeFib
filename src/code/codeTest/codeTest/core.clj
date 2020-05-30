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

;43466557686937456435688527675040625802564660517371780402481729089536555417949051890403879840079255169295922593080322634775209689623239873322471161642996440906533187938298969649928516003704476137795166849228875

;(loop [v [0 1], x 1]
;  (when (<= x 1000000)
;    (if (= x 1000) (println "q1 = " (last v) ))
;    (if (= x 1000000) (println "q2 = " (last v)))
;    (recur (subvec (conj v (reduce + v)) 1) (inc x))
;    )
;  )