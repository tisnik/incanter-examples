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

