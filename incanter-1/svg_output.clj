(ns svg-output
  (:use (incanter core stats charts svg)))

(save-svg (histogram (sample-normal 1000))  "histogram1.svg")
(save-svg (histogram (sample-normal 100000) :nbins 50 :title "Normální rozložení" :legend true :y-label "Četnost")  "histogram2.svg")
(save-svg (function-plot (fn [x] ($= x ** 3 - 5 * x ** 2 + 3 * x + 5)) -10 10)  "funkce.svg")
