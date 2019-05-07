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

(ns xy-plot-lorenz
  (:use (incanter core stats charts svg)))


(def s 10)
(def r 28)
(def b 2.667)

; krok (změna času)
(def dt 0.01)

; celkový počet vypočtených bodů na Lorenzově atraktoru
(def n 10000)

; funkce pro výpočet dalšího bodu Lorenzova atraktoru
(defn next-values
    [[x y z]]
    (let [xd (* s (- y x))
          yd (- (* r x) y (* x z))
          zd (- (* x y) (* b z))]
         [(+ x (* xd dt))
          (+ y (* yd dt))
          (+ z (* zd dt))]))

; vlastní výpočet atraktoru -> nekonečná lazy sekvence
(def lorenz (iterate next-values [0.0, 1.0, 1.05]))

; vykreslovat budeme jen konečný počet bodů
(def values (take n lorenz))

; x-ové souřadnice
(def x (map first values))

; y-ové souřadnice
(def y (map second values))

; vykreslení a zobrazení grafu
(-> (xy-plot x y :auto-sort false)
    view)

