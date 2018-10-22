(ns svg-output
  (:use (incanter core stats charts svg)))


(defn spiral
    [t]
    [(* t (cos t)) (* t (sin t))])

(view (parametric-plot spiral 0 (* 6 Math/PI) :x-label "x" :y-label "y"))
