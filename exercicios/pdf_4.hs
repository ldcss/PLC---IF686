--addEspacos
addEspacos :: Int -> [Char]
addEspacos n | n == 0 = " "
             | otherwise = " " ++ addEspacos (n-1)

paraDireita :: Int -> String -> String
paraDireita n as = (addEspacos n) ++ as

--SumList
sumList :: [Int] -> Int
sumList as | as == [] = 0
           | otherwise = (head as) + sumList (tail as)

--Dobrar elementos de lista
doubleList :: [Int] -> [Int]
doubleList as | as == [] = []
              | otherwise = ((head as)*2) : doubleList (tail as)
--Verifica membros da lista
membership :: [Int] -> Int -> Bool
membership as n | as == [] = False
                | head as == n = True
                | otherwise = membership (tail as) n  
--Verifica se é digito
ehDigito :: Char -> Bool
ehDigito ch = ('0' <= ch) && (ch <= '9')

--Filtragem apenas num da string
-- digitos :: String -> String
-- digitos as | as == [] = ""
--            | ehDigito (head as) == True = (head as) ++ digitos (tail as)
--            | ehDigito (head as) == False = digitos (tail as) 

--Maior lista (casamento de padrão)
maiorLista :: [Int] -> Int
maiorLista [] = 0
maiorLista (x:[]) = x
maiorLista (x:xs) | x > maiorLista xs = x
                  | otherwise = maiorLista xs

-- fibonacci :: Int -> [Int]
-- fibonacci x | x == 0 = (0:[])
--             | (x == 1) || (x == 2) = (1:[])
--             | otherwise = (head (fibonacci (x-1) + fibonacci (x-2)) : tail (fibonacci(x-2) + fibonacci(x-2)))

ehPar :: Int -> Bool
ehPar x | mod x 2 == 0 = True
        | otherwise = False
