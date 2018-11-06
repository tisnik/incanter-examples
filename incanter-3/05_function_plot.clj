(ns simple-function-plot
  (:use (incanter core stats charts)))

(defn sinc
    [t]
    (/ (sin t) t))

(view (function-plot sinc -20 20))
