getNumber :: [Int] -> Int
getNumber [] = 0
getNumber as = ((head as) * (10  ^length (tail as)) ) + getNumber (tail as)

toArray :: Int -> [Int]
toArray n 
 | n < 1 = []
 | otherwise = toArray (n `div` 10) ++ [n `mod` 10]

somarListas :: [Int] -> [Int] -> [Int]
somarListas [] [] = []
somarListas as sa = let a = getNumber(as)
                        b = getNumber(sa)
                        in toArray(a+b)

                        --            | otherwise = op as v