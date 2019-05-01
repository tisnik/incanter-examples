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

(defn spiral-2
    [t]
    [(+ (* t (cos t))
        (* 0.4 (sin (* 20 t))))
     (+ (* t (sin t))
        (* 0.4 (cos (* 20 t))))])

(-> (parametric-plot spiral 0 (* 6 Math/PI) :x-label "x" :y-label "y")
    (add-parametric spiral-2 0 (* 6 Math/PI))
    view)
