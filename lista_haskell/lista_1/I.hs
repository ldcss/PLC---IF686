import Data.Char

gc :: Char -> [(Char, Char)] -> Char
gc c [] = c
gc c (a:ab) | c == fst a = snd a
            | c /= fst a = gc c ab

decEnigma :: String -> [(Char, Char)] -> String
decEnigma s as = [gc c as | c <- s]