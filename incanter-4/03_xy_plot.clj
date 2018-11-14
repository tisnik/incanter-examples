(ns xy-plot
  (:use (incanter core stats charts svg)))


(def x (range 0 (* 2 Math/PI) 0.1))
(def y (sin x))

(-> (xy-plot x y)
    view)


(def t (range 0 (* 2 Math/PI) 0.1))
(def x (cos t))
(def y (sin t))

(-> (xy-plot x y)
    view)


(def t (range 0 (* 2 Math/PI) 0.1))
(def x (cos t))
(def y (sin t))

(-> (xy-plot x y :auto-sort false)
    view)

