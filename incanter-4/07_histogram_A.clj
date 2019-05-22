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

(ns histogram-A
  (:use (incanter core stats charts svg)))

(def hody-kostkou   (take 5000 (repeatedly #(inc (rand-int 6)))))
(def hody-kostkou-2 (take 5000 (repeatedly #(inc (rand-int 6)))))
(def hody-kostkou-3 (take 5000 (repeatedly #(inc (rand-int 6)))))

(view (histogram (map #(+ %1 %2 %3) hody-kostkou hody-kostkou-2 hody-kostkou-3)))

(view (histogram (map #(+ %1 %2 %3) hody-kostkou hody-kostkou-2 hody-kostkou-3) :nbins 18))
