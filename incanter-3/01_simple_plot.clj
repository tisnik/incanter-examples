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

(ns simple-plot
  (:use (incanter core stats charts)))

(def hody-kostkou (take 10 (repeatedly #(inc (rand-int 6)))))

(view (bar-chart (range 1 11) hody-kostkou))

(view (bar-chart (range 1 (inc (count hody-kostkou))) hody-kostkou))
