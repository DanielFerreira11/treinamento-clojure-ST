(ns banco.imposto.logic-test
  (:require [clojure.test :refer :all]
            [banco.imposto.logic :as l]))

;; Solicitação da Cliente:
;; Valores abaixo de mil reais não tem imposto retido na fonte
;; Acima disso pagam 10% de imposto


(deftest imposto-retido-fonte-test
  (testing "Dado um valor abaixo de 1000 reais então não deve ter imposto retido"
    (is (= 0 (l/imposto-retido-fonte 1)))
    (is (= 0 (l/imposto-retido-fonte 999.99))))
  (testing "Dado um valor igual ou superior a 1000 reais então deve ter um imposto retido de 10%"
    (is (= 100.0 (l/imposto-retido-fonte 1000.0)))
    ))