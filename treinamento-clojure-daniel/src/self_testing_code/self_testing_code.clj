(ns self_testing_code.self-testing-code)

(defn taxa-de-entrega
  [valor-da-compra]
  (if (<= valor-da-compra 100)
    15
    (if  (<= valor-da-compra 200)
      5
      0)))