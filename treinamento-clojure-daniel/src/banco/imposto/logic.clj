(ns banco.imposto.logic)

(defn- esta-na-faixa-insencao?
  [valor]
  (< valor 1000))

(defn imposto-retido-fonte
  [valor]
  (if (esta-na-faixa-insencao? valor)
    0
    (* valor 0.1)))