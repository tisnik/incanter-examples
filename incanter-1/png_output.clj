(ns png-output
  (:use (incanter core stats charts svg)))

(save (histogram (sample-normal 1000))  "histogram1.png")
(save (histogram (sample-normal 100000) :nbins 50 :title "Normální rozložení" :legend true :y-label "Četnost")  "histogram2.png")
(save (function-plot (fn [x] ($= x ** 3 - 5 * x ** 2 + 3 * x + 5)) -10 10)  "funkce.png")
