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
