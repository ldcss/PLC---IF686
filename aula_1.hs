-- Definição de funções

answer :: Int
answer = 42

greater :: Bool
greater = answer > 73

square :: Int -> Int
square x = x * x

allEqual :: Int -> Int -> Int -> Bool
allEqual n m p = (n == m) && (m == p)

-- | é parecido com um if
maxi :: Int -> Int -> Int
maxi n m
  | n >= m = n
  | otherwise = m

squareAndSum :: Int -> (Int, Int)
squareAndSum x = (x * x, x + x)