(ns simple-plot
  (:use (incanter core stats charts)))

(def hody-kostkou (take 10 (repeatedly #(inc (rand-int 6)))))

(view (bar-chart (range 1 11) hody-kostkou))

(view (bar-chart (range 1 (inc (count hody-kostkou))) hody-kostkou))
