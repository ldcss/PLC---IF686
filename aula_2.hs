-- Casamento de padrão (evitando usar o if)
totalVendas :: Int -> Int
totalVendas 0 = vendas 0
totalVendas n = totalVendas(n-1) + vendas n
-- totalVendas n | n = 0 = vendas 0
--               | otherwise = totalVendas (n-1) + vendas n 

vendas :: Int -> Int 
vendas 0 = 50
vendas 1 = 100
vendas 2 = 150
vendas 3 = 170
vendas 4 = 120
vendas n = 0

-- Definições locais

sumSquares :: Int -> Int -> Int
sumSquares x y = sqX + sqY
    where sqX = x * x
          sqY = y * y

--sumSquares x y = sq x + sq y
--  where sq z = z * z
--sumSquares x y = let sqX = x * x
--                     sqY = y * y
--                 in sqX + sqY

equalCount :: Int -> Int -> Int -> Int -> Int
equalCount w x y z | w == x && w == y && w == z = 3
                   | w /= x && w /= y = 3
                   | w /= x && w /= z = 3
                   | w /= y && w /= z = 3
                   | otherwise = 2

maxiThree :: Int -> Int -> Int -> Int
maxiThree a b c | (a > b) && (a > c) = a
                | (b > a) && (b > c) = b 
                | otherwise = c


-- ehPrimo :: Int -> Bool
-- ehPrimo x | (x == 1) = 

-- maxThreeOccurs :: Int -> Int -> Int -> (Int, Int)
-- maxThreeOccurs m n p = (mx, eqCount)
--   where mx = maxiThree m n p
--         eqCount = equalCount mx m n p
