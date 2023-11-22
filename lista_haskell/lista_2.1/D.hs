data Tree t = Nilt |
               Node t (Tree t) (Tree t)
               deriving (Read, Show)
               
main = do
       s <- getLine
       let result = isBST (read s::Tree Int)
       print result

isOrderedLess :: Ord t => Tree t -> t -> Bool
isOrderedLess Nilt n = True
isOrderedLess (Node a al ar) n | n < a = isOrderedLess al n && isOrderedLess ar n
                               | otherwise = False

isOrderedHigh :: Ord t => Tree t -> t -> Bool
isOrderedHigh Nilt n = True
isOrderedHigh (Node a al ar) n | n > a = isOrderedHigh al n && isOrderedHigh ar n
                               | otherwise = False

isBST :: Ord t => Tree t -> Bool
isBST Nilt = True
isBST (Node a al ar) = isBST al && isBST ar && isOrderedLess ar a && isOrderedHigh al a