import Data.String

splitString :: String -> [String]
splitString s = words [if c == ';' then ' ' else c|c <- s]

joinMonthString :: [String] -> Int -> [String]
joinMonthString [] i = []
joinMonthString (a:as) i | mod i 4 /= 0 && mod i 2 == 0 = a : joinMonthString as (i+1)
                         | otherwise = joinMonthString as (i+1)

joinValueString :: [String] -> Int -> [Double]
joinValueString [] i = []
joinValueString (a:as) i | mod i 4 == 0 = read a : joinValueString as (i+1)
                         | otherwise = joinValueString as (i+1)

addTuple :: [String] -> [Double] -> [(String , Double)]
addTuple [] b = []
addTuple a [] = []
addTuple (a:as) (b:bs) = (a,b) : addTuple as bs 

getAllValues :: String -> [(String , Double)]
getAllValues s = addTuple (joinMonthString (splitString s) 1) (joinValueString (splitString s) 1)

valuesByMonth :: String -> [(String , Double)] -> [Double]
valuesByMonth [] as = []
valuesByMonth s [] = []
valuesByMonth s (a:as) | s == fst a = snd a : valuesByMonth s as
                       | otherwise = valuesByMonth s as
                    
getValues :: [Double] -> Double
getValues (a:[]) = a
getValues (a:as) = a + getValues as

logMes :: String -> String -> Double
logMes s m = foldl (+) 0 (valuesByMonth s (getAllValues m))