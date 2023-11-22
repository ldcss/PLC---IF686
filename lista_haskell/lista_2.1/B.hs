data Tree t = Node t (Tree t) (Tree t) | Nilt
  deriving (Read, Show)
  
stringToList :: String -> String -> Int -> [String]
stringToList "" "" n = []
stringToList "" a n = [a]
stringToList (a:as) b n | mod n 8 == 7 = (b++[a]) : stringToList as "" 0
                        | otherwise = stringToList as (b++[a]) (n+1)

conversor :: Int -> Char
conversor x | mod x 5 == 0 = 'E'
            | mod x 5 == 1 = 'M'
            | mod x 5 == 2 = 'A'
            | mod x 5 == 3 = 'C'
            | otherwise = 'S'

dnaAux :: Tree Int -> String
dnaAux Nilt = ""
dnaAux (Node a al ar) =  dnaAux al ++ [conversor a] ++ dnaAux ar

dna1 :: Tree Int -> [String]
dna1 t = stringToList (dnaAux t) "" 0

main = do
bin <- getLine
let result = dna1 (read bin::Tree Int)
print result