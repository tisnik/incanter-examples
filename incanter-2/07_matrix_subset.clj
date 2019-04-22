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
; příklad číslo 7 - přístup k podmaticím
; ---------------------------------------------------

; matice 5x5 prvků
(def M5 (matrix (range 25) 5))

; výběr jednoho prvku (prostředního) z matice
(println (sel M5 2 2))

; výběr sloupců
(println (sel M5 :cols [0]))
(println (sel M5 :cols [1 2]))
(println (sel M5 :cols [2 1]))
(println (sel M5 :cols (range 1 4)))

; otočení sloupců
(println (sel M5 :cols (range 4 -1 -1)))

; výběr řádků
(println (sel M5 :rows [0]))
(println (sel M5 :rows [1 2]))
(println (sel M5 :rows [2 1]))
(println (sel M5 :rows (range 1 4)))

; otočení řádků
(println (sel M5 :rows (range 4 -1 -1)))

; bez vybraných sloupců
(println (sel M5 :except-cols [0]))
(println (sel M5 :except-cols [1 2]))
(println (sel M5 :except-cols (range 1 4)))

; bez vybraných řádků
(println (sel M5 :except-rows [0]))
(println (sel M5 :except-rows [1 2]))
(println (sel M5 :except-rows (range 1 4)))

; rozdíly mezi selektory :cols :rows a :all
(println (sel M5 :rows [1 3 4]))
(println (sel M5 :cols [1 3 4]))
(println (sel M5 :all [1 3 4]))
