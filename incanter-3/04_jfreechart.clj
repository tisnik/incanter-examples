(ns jfre-chart-interface
  (:use (incanter core stats charts)))

(def x (range 0 100 0.5))
(def y (map #(/ (sin %) (inc %)) x))

(def plot (doto (line-chart x y :title "sinc") (set-y-range -1/2 1/2) (set-x-label "t") (set-y-label "sinc")))
(.setTickUnit (.getRangeAxis (.getPlot plot)) (org.jfree.chart.axis.NumberTickUnit. 0.05))
(view plot)

(.setVisible (.getDomainAxis (.getPlot plot)) false)
(view plot)
