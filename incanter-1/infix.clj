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
