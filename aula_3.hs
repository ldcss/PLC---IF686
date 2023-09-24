import Data.Char (isDigit)

--Listas
--função len
len :: [t] -> Int
len [] = 0
len (a:as) = 1 + len as

--função somar lista
sumList :: [Int] -> Int
sumList as
    | as == [] = 0
    | otherwise = head as + sumList (tail as)

--função maxi lista
maxList :: [Int] -> Int
maxList [] = minBound :: Int
maxList [x] = x
maxList (x:xs)
    | x > maxList xs = x
    | otherwise = maxList xs

nonDigit :: Char -> Bool
nonDigit = not . isDigit

-- digits :: String -> String
-- digits 

-- -- Expressão case
-- firstDigit :: String -> Char
-- firstDigit st = case (digits st) of
--                 [] -> '\0'
--                 (a:as) -> a

--Tuplas
intP :: (Int, Int)
intP = (33, 43) 

addPair :: (Int, Int) -> Int
addPair (x, y) = x + y

shift :: ((Int, Int), Int) -> (Int, (Int, Int))
shift ((x, y), z) = (x, (y, z))

--Sinônimos de tipos
type Name = String
type Age = Int
type Phone = Int
type Person = (Name, Age, Phone)

name :: Person -> Name
name (n, a, p) = n