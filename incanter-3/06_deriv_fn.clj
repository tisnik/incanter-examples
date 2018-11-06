(ns deriv-fn-examples
  (:use (incanter core stats charts deriv)))

(def pi java.lang.Math/PI)

(view (function-plot sin 0 pi))
(view (function-plot (deriv-fn [t] (sin t) t) 0 pi))

(doto (function-plot sin 0 pi)
      (add-function (deriv-fn [t] (sin t) t) 0 pi)
      view)

(defn sinc
    [t]
    (/ (sin t) t))

(view (function-plot sinc -20 20))
(view (function-plot (deriv-fn [t] (/ (sin t) t) t) -20 20))

(doto (function-plot sinc -10 10)
      (add-function (deriv-fn [t] (/ (sin t) t) t) -10 10)
      view)

(doto (function-plot #(* 5 (sinc %)) -10 10)
      (add-function (deriv-fn [t] (/ (sin t) t) t) -10 10)
      view)

(doto (function-plot #(* 5 (sinc %)) -10 10 :x-label "t" :y-label "sinc + deriv sinc")
      (add-function (deriv-fn [t] (/ (sin t) t) t) -10 10)
      view)
