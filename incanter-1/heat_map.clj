(ns svg-output
  (:use (incanter core stats charts svg)))

(defn f
    [x y]
    (sin (sqrt (plus (sq x) (sq y)))))

(view (heat-map f -10 10 -15 15))
(view (heat-map f -10 10 -10 10 :color? false))
(view (heat-map f 5 10 5 10 :include-zero? false))
