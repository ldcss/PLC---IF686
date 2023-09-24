applyBinOper :: (t -> t -> t) -> t -> t -> t
applyBinOper f x y = f x y

times2 :: Int -> Int
times2 x = x * 2

sqr :: Int -> Int
sqr x = x * x

--Map
doubleList :: [Int] -> [Int]
doubleList x = map times2 x

sqrList :: [Int] -> [Int]
sqrList x = map sqr x

--Como compreensão de lista
map f l  = [f a | a <- l]