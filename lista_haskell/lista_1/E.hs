import Data.String

splitString :: String -> [String]
splitString s = words [if c == ';' then ' ' else c|c <- s]

joinString:: [String] -> Int -> [Double]
joinString [] i = []
joinString (a:as) i | mod i 4 /= 0 = joinString as (i+1)
                    | otherwise = read a : joinString as (i+1)
                    
getMaxMin :: [Double] -> (Double, Double)
getMaxMin x = (minimum x, maximum x)  

minMaxCartao :: String -> (Double, Double)
minMaxCartao a = getMaxMin (joinString (splitString a) 1)