(ns derivate-fn-examples
  (:use (incanter core stats charts optimize)))

(def pi java.lang.Math/PI)

(view (function-plot sin 0 pi))
(view (function-plot (derivative sin) 0 pi))

(doto (function-plot sin 0 pi)
      (add-function (derivative sin) 0 pi)
      view)

(defn sinc
    [t]
    (/ (sin t) t))

(doto (function-plot sinc -10 10)
      (add-function (derivative sinc) -10 10)
      view)

(doto (function-plot sinc -10 10 :x-label "t" :y-label "sinc + deriv sinc")
      (add-function (derivative sinc) -10 10)
      view)
