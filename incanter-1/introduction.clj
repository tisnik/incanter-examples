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

(ns introduction
  (:use (incanter core stats charts)))

(view (histogram (sample-normal 1000)))
(view (histogram (sample-normal 100000) :nbins 50 :title "Normální rozložení" :legend true :y-label "Četnost"))
