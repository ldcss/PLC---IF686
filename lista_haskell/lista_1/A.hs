import Data.Char

main = do
  a <- getLine
  let result = sumNumbers a
  print result
  
ehDigito :: Char -> Bool
ehDigito ch = ('0' <= ch) && (ch <= '9')

sumNumbers :: String -> Int
sumNumbers as | as == [] = 0
              | ehDigito (head as) == True = (ord (head as) - 48) + sumNumbers (tail as)
              | otherwise = sumNumbers (tail as)