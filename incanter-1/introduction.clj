(ns introduction
  (:use (incanter core stats charts)))

(view (histogram (sample-normal 1000)))
(view (histogram (sample-normal 100000) :nbins 50 :title "Normální rozložení" :legend true :y-label "Četnost"))
