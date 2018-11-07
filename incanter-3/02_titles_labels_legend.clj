(ns simple-plot-tith-title-legend-labels
  (:use (incanter core stats charts)))

(def hody-kostkou (take 10 (repeatedly #(inc (rand-int 6)))))

(view (bar-chart (range 1 (inc (count hody-kostkou))) hody-kostkou :x-label "Pokusy" :y-label "Výsledek hodu"))

(view (bar-chart (range 1 (inc (count hody-kostkou))) hody-kostkou :x-label "Pokusy" :y-label "Výsledek hodu" :legend true))

(def indexy (range 1 (inc (count hody-kostkou))))

(view (bar-chart indexy hody-kostkou :x-label "Pokusy" :y-label "Výsledek hodu" :legend true))

(view (bar-chart indexy hody-kostkou :x-label "Pokusy" :y-label "Výsledek hodu" :legend true :title "Hody kostkou"))

(def seasons (mapcat identity (repeat 3 ["jaro" "léto" "podzim" "zima"])))
(def years (mapcat identity (repeat 4 [2016 2017 2018])))
(def values (sample-uniform 12 :integers true :max 100))
(view (bar-chart years values :group-by seasons :legend true :x-label "Rok" :y-label "Úroda"))
