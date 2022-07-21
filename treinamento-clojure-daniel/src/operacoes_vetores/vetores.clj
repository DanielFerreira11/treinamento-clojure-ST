(ns operacoes-vetores.vetores)

(defn substituir-primeiro-nome
  [nomes novo-primeiro-nome]
  (assoc nomes 0 novo-primeiro-nome))

(substituir-primeiro-nome ["Marcio" "João" "Maria"] "Daniel")