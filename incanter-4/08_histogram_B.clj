(ns histogram-B
  (:use (incanter core stats charts svg)))

(def hody-kostkou   (take 5000 (repeatedly #(inc (rand-int 6)))))
(def hody-kostkou-2 (take 5000 (repeatedly #(inc (rand-int 6)))))
(def hody-kostkou-3 (take 5000 (repeatedly #(inc (rand-int 6)))))

; original idea:
; https://stackoverflow.com/questions/27991054/center-incanter-histogram-x-axis-tick-marks-directly-underneath-bars#27992128

(defn bar-chart-histogram
    [values]
    (let [freq (frequencies values)
          f    #(freq % 0)
          ks   (keys freq)
          a    (apply min ks)
          b    (apply max ks)
          x-values (range a (inc b))
          x-labels (map str x-values)
          y-values (map f x-values)]
      (bar-chart x-labels y-values)))

(view (bar-chart-histogram (map #(+ %1 %2 %3) hody-kostkou hody-kostkou-2 hody-kostkou-3)))
