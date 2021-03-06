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

(ns simple-function-plot
  (:use (incanter core stats charts)))

(defn sinc
    [t]
    (/ (sin t) t))

(view (function-plot sinc -20 20))
