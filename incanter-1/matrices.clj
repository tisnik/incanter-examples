(ns matrices
  (:use (incanter core stats charts)))

(def M1 (matrix [[1 2 3] [4 5 6] [7 8 9]]))

(def M2 (matrix [1 2 3 4 5 6 7 8 9] 3))

(def M3 (matrix (range 1 10) 3))

(def M4 (matrix 0 10 10))

(println M1)
(println M2)
(println M3)
(println M4)
