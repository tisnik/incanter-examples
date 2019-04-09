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

(ns png-output
  (:use (incanter core stats charts svg)))

(save (histogram (sample-normal 1000))  "histogram1.png")
(save (histogram (sample-normal 100000) :nbins 50 :title "Normální rozložení" :legend true :y-label "Četnost")  "histogram2.png")
(save (function-plot (fn [x] ($= x ** 3 - 5 * x ** 2 + 3 * x + 5)) -10 10)  "funkce.png")
