(ns xy-plot-lorenz
  (:use (incanter core stats charts svg)))


(def s 10)
(def r 28)
(def b 2.667)

; krok (změna času)
(def dt 0.01)

; celkový počet vypočtených bodů na Lorenzově atraktoru
(def n 2000)

; funkce pro výpočet dalšího bodu Lorenzova atraktoru
(defn next-values
    [[x y z]]
    (let [xd (* s (- y x))
          yd (- (* r x) y (* x z))
          zd (- (* x y) (* b z))]
         [(+ x (* xd dt))
          (+ y (* yd dt))
          (+ z (* zd dt))]))

(defn compute-lorenz-attractor
    [x0 y0 z0 n]
    (let [lorenz (iterate next-values [x0 y0 z0])
          values (take n lorenz)]
          values))

(defn x-vals
    [coordinates]
    (map first coordinates))

(defn y-vals
    [coordinates]
    (map second coordinates))

; dva atraktory, které se nepatrně liší počáteční podmínku
(def attractor1 (compute-lorenz-attractor 0.0 1.0 1.05 n))
(def attractor2 (compute-lorenz-attractor 0.01 1.0 1.05 n))

; vykreslení a zobrazení grafu
(-> (xy-plot   (x-vals attractor1) (y-vals attractor1) :auto-sort false)
    (add-lines (x-vals attractor2) (y-vals attractor2) :auto-sort false)
    view)

