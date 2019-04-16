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

; ----------------------------------------------------------------
; demonstrační příklad číslo 3 - operace aplikované na celé matice
; ----------------------------------------------------------------

(ns matrix-operation
  (:use (incanter core)))


; matice 3x3 prvky
(def M1 (matrix [[1 2 3] [4 5 6] [7 8 9]]))

; matice s jedním řádkem
(def M2 (matrix [1 2 3 4 5 6 7 8 9]))

; matice s jedním sloupcem
(def M3 (matrix [1 2 3 4 5 6 7 8 9] 1))

; matice 5x5 prvků
(def M4 (matrix (range 25) 5))


; násobení matic
(println (mmult M1 M1))
(println (mmult M2 M3))
(println (mmult M4 M4))

; operátor násobení matic aplikovatelný v makru $=
(println ($= M1 <*> M1))
(println ($= M2 <*> M3))
(println ($= M4 <*> M4))

; transpozice matic
(println (trans M1))
(println (trans M2))
(println (trans M3))
(println (trans M4))

; výpočet determinantu matice
(println (det (matrix [[1 2] [3 4]])))
(println (det (matrix [[1 0 0] [0 5 0] [0 0 1]])))
(println (det (matrix [[0 0 1] [0 5 0] [1 0 1]])))

; výpočet stopy matice
(println (trace M1))
(println (trace M2))
(println (trace M3))
(println (trace M4))
