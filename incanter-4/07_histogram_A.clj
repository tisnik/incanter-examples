(ns histogram-A
  (:use (incanter core stats charts svg)))

(def hody-kostkou   (take 5000 (repeatedly #(inc (rand-int 6)))))
(def hody-kostkou-2 (take 5000 (repeatedly #(inc (rand-int 6)))))
(def hody-kostkou-3 (take 5000 (repeatedly #(inc (rand-int 6)))))

(view (histogram (map #(+ %1 %2 %3) hody-kostkou hody-kostkou-2 hody-kostkou-3)))

(view (histogram (map #(+ %1 %2 %3) hody-kostkou hody-kostkou-2 hody-kostkou-3) :nbins 18))
