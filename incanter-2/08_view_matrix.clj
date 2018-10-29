; ----------------------------------------------------
; příklad číslo 8 - zobrazení matic v samostatném okně
; ----------------------------------------------------

(ns matrix-constructors
  (:use (incanter core)))


; matice 3x3 prvky
(def M1 (matrix [[1 2 3] [4 5 6] [7 8 9]]))

; matice s jedním řádkem
(def M2 (matrix [1 2 3 4 5 6 7 8 9]))

; matice s jedním sloupcem
(def M3 (matrix [1 2 3 4 5 6 7 8 9] 1))

; matice 4x4 s nulovými prvky
(def M4 (matrix (repeat 16 0) 4))

; matice 5x5 prvků
(def M5 (matrix (range 25) 5))

; matice 5x5 se všemi prvky nastavenými na jedničku
(def M6 (matrix (repeat 25 1) 5))

; zobrazení všech matic
(view M1)
(view M2)
(view M3)
(view M4)
(view M5)
(view M6)

; diagonální matice
(def D1 (diag [1 2 3 4]))
(def D2 (diag (range 10)))
(def D3 (diag (repeat 10 1)))

; zobrazení všech matic
(view D1)
(view D2)
(view D3)
