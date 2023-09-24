maior :: Int -> Int -> Int -> Int
maior a b c | (a >= b) && (a >= c) = a
            | (b >= a) && (b >= c) = b
            | (c >= a) && (c >= b) = c

menorMaior :: Int -> Int -> Int -> (Int, Int)
menorMaior a b c | maiorDosTres = 