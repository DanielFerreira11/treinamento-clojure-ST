(ns funcoes-primeira-ordem.funcoes)

(defn imposto-retido
  "Se salario abaixo de 1000 reais não tem imposto. Acima ou igual a 1000 deve aplicar imposto padrão"
  [salario]
  (let [imposto-padrao 0.2]
    (if (< salario 1000)
      0
      (* salario imposto-padrao))))

(defn consulta-taxa-padrao-por-http
  "Imagine que este código faz uma requisição httṕ para obter a taxa-padrao."
  []
  0.30)

(defn imposto-retido
  "Forma 2 de executar a função"
  [salario]
    (if (< salario 1000)
      0
      (* salario (consulta-taxa-padrao-por-http))))

(defn imposto-retido
  "Forma 3 de executar a função (menos eficiente)"
  [taxa-padrao salario]
  (if (< salario 1000)
    0
    (* salario taxa-padrao)))

(defn imposto-retido
  "Refatorando a função de uma forma mais eficiente"
  [consulta-taxa-padrao salario]
  (if (< salario 1000)
    0
    (* salario (consulta-taxa-padrao))))

(imposto-retido consulta-taxa-padrao-por-http 2000)

(defn consulta-taxa-padrao-fixa
  []
  0.10)

(imposto-retido consulta-taxa-padrao-fixa 2000)
(imposto-retido consulta-taxa-padrao-por-http 2000)

(defn escolhe-consulta-taxa-padrao
  [ambiente]
  (if (= ambiente :teste)
    consulta-taxa-padrao-fixa
    consulta-taxa-padrao-por-http))

(imposto-retido (escolhe-consulta-taxa-padrao :producao) 1000)

((fn [x] (* 2 x)) 3)

(#(* 2 %) 5)

(#(+ % %)25)

((fn [x y] (+ x y)) 6 7)

(#(+ %1 %2) 6 7)

((constantly 0.2) 1 2 3 4 5 67987)

(imposto-retido (fn [] 0.7) 3000)
(imposto-retido (constantly 0.27) 3000)

