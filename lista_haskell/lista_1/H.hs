import Data.Char


ehDigito :: Char -> Bool
ehDigito ch = ('0' <= ch) && (ch <= '9')

sumNumbers :: String -> Int
sumNumbers as | as == [] = 0
              | ehDigito (head as) == True = (ord (head as) - 48) + sumNumbers (tail as)
              | otherwise = sumNumbers (tail as)

multiplicarLista :: [Int] -> [Int] -> [Int]
multiplicarLista as sa | as == [] && sa == [] = []
                       | as == [] || sa == [] = (0:[])
                       | otherwise = ((head as) * (head sa) : multiplicarLista (tail as) (tail sa))