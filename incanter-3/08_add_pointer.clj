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

(ns add-pointer-to-plot
  (:use (incanter core stats charts optimize)))

(def pi java.lang.Math/PI)

(defn sinc
    [t]
    (/ (sin t) t))

(def d0 (/ (* pi 5) 2))

(doto (function-plot sinc -10 10 :x-label "t" :y-label "sinc + deriv sinc")
      (set-y-range -1/2 3/2)
      (add-function (derivative sinc) -10 10)
      (add-pointer 0 1 :text "deriv=0")
      (add-pointer d0 (sinc d0) :text "deriv=0")
      (add-pointer (- d0) (sinc (- d0)) :text "deriv=0")
      view)

