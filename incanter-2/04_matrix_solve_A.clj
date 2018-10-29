; ---------------------------------------------------
; příklad číslo 4 - řešení soustavy lineárních rovnic
; ---------------------------------------------------

(ns equation-solver-a
  (:use (incanter core)))

; příklad nalezení řešení jediné funkce:
; 7x = 21

; matice s koeficienty na levé části rovnice
(def A (matrix [[7]]))

; matice s výsledky na pravé části rovnice
(def B (matrix [21]))

; výpočet
(println (solve A B))

; -----------------------------------------------

; příklad nalezení řešení jediné funkce:
; 0x = 0

; matice s koeficienty na levé části rovnice
(def A (matrix [[0]]))

; matice s výsledky na pravé části rovnice
(def B (matrix [0]))

; výpočet
(println (solve A B))

; -----------------------------------------------

; příklad nalezení řešení jediné funkce:
; 0x = 1

; matice s koeficienty na levé části rovnice
(def A (matrix [[0]]))

; matice s výsledky na pravé části rovnice
(def B (matrix [1]))

; výpočet
(println (solve A B))

