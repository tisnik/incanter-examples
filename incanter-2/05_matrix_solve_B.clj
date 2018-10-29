; ---------------------------------------------------
; příklad číslo 5 - řešení soustavy lineárních rovnic
; ---------------------------------------------------

(ns equation-solver-b
  (:use (incanter core)))

; dvojice rovnic:
; 3x + 2y = 8
; x + y =2

; matice s koeficienty na levé části rovnic
(def A (matrix [[3 2] [1 1]]))

; matice s výsledky na pravé části rovnic
(def B (matrix [8 2]))

; výpočet
(println (solve A B))

; zpětná kontrola výpočtu
(println (mmult A (solve A B)))

; vylepšená kontrola
(println (minus B (mmult A (solve A B))))

; jednodušší zápis kontroly pomocí threading makra
(->> (solve A B) (mmult A) (minus B) println)


; -----------------------------------------

; trojice rovnic:
; 4x + 5y - 2z = -14
; 7x -  y + 2z = 42
; 3x +  y + 4z = 28

; matice s koeficienty na levé části rovnic
(def A (matrix [[4 5 -2] [7 -1 2] [3 1 4]]))

; matice s výsledky na pravé části rovnic
(def B (matrix [-14 42 28]))

; výpočet koeficientů
(println (solve A B))

; jednodušší zápis kontroly pomocí threading makra
(->> (solve A B) (mmult A) (minus B) println)
