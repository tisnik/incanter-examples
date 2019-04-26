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

(ns simple-line-chart
  (:use (incanter core stats charts)))

(def x (range 0 100 0.5))
(def y (map #(/ (sin %) (inc %)) x))
(view (line-chart x y))

(view (doto (line-chart x y) (set-y-range -1/2 1/2)))

(view (doto (line-chart x y :title "sinc") (set-y-range -1/2 1/2) (set-x-label "t") (set-y-label "sinc")))
