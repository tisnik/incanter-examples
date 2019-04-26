;
;  (C) Copyright 2018  Pavel Tisnovsky
;
;  All rights reserved. This program and the accompanying materials
;  are made available under the terms of the Eclipse Public License v1.0
;  which accompanies this distribution, and is available at
;  http://www.eclipse.org/legal/epl-v10.html
;
;  Contributors:
;      Pavel Tisnovsky
;

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

(doto (function-plot sinc -10 10 :x-label "t" :y-label "sinc + deriv sinc")
      (add-function (derivative sinc :dx 5) -10 10)
      view)

(doto (function-plot sinc -10 10 :x-label "t" :y-label "sinc + deriv sinc")
      (add-function (derivative sinc) -10 10)
      (add-function (derivative sinc :dx 1/2) -10 10)
      (add-function (derivative sinc :dx 1) -10 10)
      (add-function (derivative sinc :dx 5) -10 10)
      view)
