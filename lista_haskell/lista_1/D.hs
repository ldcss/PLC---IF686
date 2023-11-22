multiples :: Int -> Int -> Int -> Int
multiples 0 0 n = 0
multiples m n 0 = 0
multiples i m n
  | m > n || n < 0 = 0
  | m <= n = m + multiples i (m + i) n
  | otherwise = 0 + multiples i (m + i) n

somarMultiplos :: [Int] -> Int -> [Int]
somarMultiplos [] m = []
somarMultiplos (a : as) m = multiples m m a : somarMultiplos as m
  
main = do
  lista <- getLine
  let readList = read lista :: [Int]
  num <- getLine
  let readNum = read num :: Int
  let result = somarMultiplos readList readNum
  print result