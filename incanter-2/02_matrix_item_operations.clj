; -----------------------------------------------
; příklad číslo 2 - operace provádění nad jednotlivými prvky matic
; -----------------------------------------------

(ns matrix-item-operations
  (:use (incanter core)))


; matice 3x3
(def M1 (matrix [[1 2 3] [4 5 6] [7 8 9]]))

; matice s jedním řádkem
(def M2 (matrix [1 2 3 4 5 6 7 8 9]))

; matice s jedním sloupcem
(def M3 (matrix [1 2 3 4 5 6 7 8 9] 1))

; matice 5x5
(def M4 (matrix (range 25) 5))


; operace nad souvisejícími prvky
(println (plus M1 M1))
(println (mult M1 M1))
(println ($= M1 + M1))
(println ($= M1 + M1))

; broadcasting při použití skalární hodnoty
(println (plus M1 10))
(println (plus M4 12))
(println (mult M1 -1))
(println ($= M1 + 10))
(println ($= M4 - 12))
(println ($= M1 * -1))
(println ($= M1 * 10 - 100))


; suma a produkt všech prvků matice
(println (sum M1))
(println (sum M4))
(println (prod M4))
(println (prod M1))


; operace/funkce aplikované na každý prvek matice
(println (abs M4))
(println (exp M4))
(println (sqrt M4))
(println (pow M4 2))
(println (sin M4))
(println (cos M4))
