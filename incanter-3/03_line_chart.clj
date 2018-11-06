(ns simple-line-chart
  (:use (incanter core stats charts)))

(def x (range 0 100 0.5))
(def y (map #(/ (sin %) (inc %)) x))
(view (line-chart x y))

(view (doto (line-chart x y) (set-y-range -1/2 1/2)))

(view (doto (line-chart x y :title "sinc") (set-y-range -1/2 1/2) (set-x-label "t") (set-y-label "sinc")))
