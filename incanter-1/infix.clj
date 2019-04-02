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

(ns infix
  (:use (incanter core stats charts)))

(println ($= 1 + 2))
(println ($= 1 + 2 * 3))
(println ($= 2 ** 10))
(println ($= 2 ** -4))

(println ($= [1 2 3] + [4 5 6]))
(println ($= [1 2 3] * [4 5 6]))
(println ($= [1 2 3] + 10))
(println ($= [1 2 3] * -1))
