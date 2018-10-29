; -----------------------------------------------
; příklad číslo 1 - konstruktory matic
; -----------------------------------------------

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

(println M1)
(println M2)
(println M3)
(println M4)
(println M5)
(println M6)


; jednotkové matice
(def I0 (identity-matrix 0))
(def I1 (identity-matrix 1))
(def I2 (identity-matrix 2))
(def I3 (identity-matrix 3))
(def I4 (identity-matrix 4))
(def I5 (identity-matrix 5))

; vytištění obsahu jednotkových matic
(println I1)
(println I2)
(println I3)
(println I4)
(println I5)


; diagonální matice
(def D1 (diag [1 2 3 4]))
(def D2 (diag (range 10)))
(def D3 (diag (repeat 10 1)))

; vytištění obsahu diagonálních matic
(println D1)
(println D2)
(println D3)
