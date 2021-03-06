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

(ns parametric-graph-b
  (:use (incanter core stats charts svg)))


(defn shape
    [xt yt]
    (fn [t]
        [(cos (* t xt))
         (sin (* t yt))]))

(def shape-1
    (shape 1 2))

(def shape-2
    (shape 2 1))

(def shape-3
    (shape 1/3 3/2))

(-> (parametric-plot shape-1 0 (* 2 Math/PI) :x-label "x" :y-label "y")
    view)

(-> (parametric-plot shape-2 0 (* 2 Math/PI) :x-label "x" :y-label "y")
    view)

(-> (parametric-plot shape-3 0 (* 2 Math/PI) :x-label "x" :y-label "y")
    view)

(-> (parametric-plot shape-1 0 (* 2 Math/PI) :x-label "x" :y-label "y")
    (add-parametric shape-2 0 (* 2 Math/PI))
    (add-parametric shape-3 0 (* 2 Math/PI))
    view)
