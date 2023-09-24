data Tree t = Node t (Tree t) (Tree t) 
              | Nilt
              deriving (Read)

-- height :: Tree t -> Int
-- height Nilt = 0
-- height (Node  _ left right) = 1 + max (height left) (height right)

alturaArvore :: Tree t -> Int
alturaArvore Nilt = 0
alturaArvore (Node _ left right) = 1 + max (alturaArvore left) (alturaArvore right)
