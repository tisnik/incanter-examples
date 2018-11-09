(ns parametric-graph
  (:use (incanter core stats charts svg)))


(defn spiral
    [t]
    [(* t (cos t)) (* t (sin t))])

(view (parametric-plot spiral 0 (* 6 Math/PI) :x-label "x" :y-label "y"))

(defn lis
    [t] 
    [(cos (* t 3)) (sin (* t 4))])

(view (parametric-plot lis 0 (* 6 Math/PI) :x-label "x" :y-label "y"))
