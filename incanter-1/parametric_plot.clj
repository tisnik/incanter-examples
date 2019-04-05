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

(ns svg-output
  (:use (incanter core stats charts svg)))


(defn spiral
    [t]
    [(* t (cos t)) (* t (sin t))])

(view (parametric-plot spiral 0 (* 6 Math/PI) :x-label "x" :y-label "y"))
