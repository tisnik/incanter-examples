; ---------------------------------------------------
; příklad číslo 6 - dekompozice matic
; ---------------------------------------------------

(ns introduction
  (:use (incanter core)))


; matice 3x3 prvky
(def M1 (matrix [[1 2 3] [4 5 6] [7 8 9]]))

; matice 5x5 prvků
(def M2 (matrix (range 25) 5))

; výpočet dekompozice a výpis výsledků
(println (decomp-cholesky M1))
(println (decomp-cholesky M2))
(println (decomp-lu M1))
(println (decomp-lu M2))
(println (decomp-qr M1))
(println (decomp-qr M2))
(println (decomp-svd M1))
(println (decomp-svd M2))
