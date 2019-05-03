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

(ns xy-plot
  (:use (incanter core stats charts svg)))


(def x (range 0 (* 2 Math/PI) 0.1))
(def y (sin x))

(-> (xy-plot x y)
    view)


(def t (range 0 (* 2 Math/PI) 0.1))
(def x (cos t))
(def y (sin t))

(-> (xy-plot x y)
    view)


(def t (range 0 (* 2 Math/PI) 0.1))
(def x (cos t))
(def y (sin t))

(-> (xy-plot x y :auto-sort false)
    view)

