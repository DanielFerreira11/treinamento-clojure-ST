(ns self_testing_code.self-testing-code-test
  (:require [clojure.test :refer :all]
            [self_testing_code.self-testing-code :refer :all]))

(deftest nao-sei-o-nome-ainda-test
  (testing "Dado um valor abaixo de 100 reais, então a taxa de entrega deve ser de 15 reais"
    (is (= 15 (taxa-de-entrega 1 )))
    (is (= 15 (taxa-de-entrega 100  ))))
  (testing "Dado um valor entre 100 e 200 reais, então a taxa de entrega deve ser de 15 reais"
    (is (= 5 (taxa-de-entrega 100.01)))
    (is (= 5 (taxa-de-entrega 200))))
  (testing "Dado um valor acima de 200 reais, então a taxa de entrega deve ser 0"
    (is (= 0 (taxa-de-entrega 200.01)))))