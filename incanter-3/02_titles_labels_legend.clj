(ns simple-plot-tith-title-legend-labels
  (:use (incanter core stats charts)))

(def hody-kostkou (take 10 (repeatedly #(inc (rand-int 6)))))

(view (bar-chart (range 1 (inc (count hody-kostkou))) hody-kostkou :x-label "Pokusy" :y-label "Výsledek hodu"))

(view (bar-chart (range 1 (inc (count hody-kostkou))) hody-kostkou :x-label "Pokusy" :y-label "Výsledek hodu" :legend true))

(def indexy (range 1 (inc (count hody-kostkou))))

(view (bar-chart indexy hody-kostkou :x-label "Pokusy" :y-label "Výsledek hodu" :legend true))

(view (bar-chart indexy hody-kostkou :x-label "Pokusy" :y-label "Výsledek hodu" :legend true :title "Hody kostkou"))
