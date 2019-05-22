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

(ns heat-map-chart
  (:use (incanter core stats charts svg)))

(defn f
    [x y]
    (sin (sqrt (plus (sq x) (sq y)))))

(view (heat-map f -10 10 -15 15))
(view (heat-map f -10 10 -10 10 :color? false))
(view (heat-map f 5 10 5 10 :include-zero? false))
