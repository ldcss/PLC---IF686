import Data.List (nub)

arrayWithoutHigher :: [(String, Int)] -> [(String, Int)]
arrayWithoutHigher s = removeHigher s (getHigher s ("", 0))

getHigher :: [(String, Int)] -> (String, Int) -> (String, Int)
getHigher [] (x, y) = (x, y)
getHigher (a : as) (x, y)
  | snd a == y && length (fst a) < length x = getHigher (as) (a)
  | snd a > y = getHigher (as) (a)
  | otherwise = getHigher (as) (x, y)

removeHigher :: [(String, Int)] -> (String, Int) -> [(String, Int)]
removeHigher [] _ = []
removeHigher (a : as) (x, y)
  | fst a == x = removeHigher as (x, y)
  | otherwise = a : removeHigher as (x, y)

palavrasFrequentes :: [String] -> [String]
palavrasFrequentes s = take 3 (byOrder (wordsWithRepeated (uniqueWords s) s))


byOrder :: [(String, Int)] -> [String]
byOrder [] = []
byOrder s = (fst (getHigher s ("", 0))) : byOrder (arrayWithoutHigher s)

uniqueWords :: [String] -> [String]
uniqueWords [] = []
uniqueWords s = nub s

wordRepeated :: String -> [String] -> Int
wordRepeated s [] = 0
wordRepeated s (a : as)
  | s == a = 1 + wordRepeated s as
  | otherwise = wordRepeated s as

wordsWithRepeated :: [String] -> [String] -> [(String, Int)]
wordsWithRepeated [] _ = []
wordsWithRepeated (a : as) s = (a, wordRepeated a s) : wordsWithRepeated as s

main = do
        lista <- getLine
        print $ palavrasFrequentes (read lista :: [String])