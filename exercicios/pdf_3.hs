--Vendas por semana
vendas :: Int -> Int 
vendas 1 = 5
vendas 2 = 6
vendas 3 = 7
vendas 5 = 3
vendas 6 = 7
vendas 7 = 6
vendas n = 0

vendasIgual :: Int -> Int -> Int
vendasIgual s n | n == 0 = 0
                | s == vendas n = 1 + vendasIgual s (n-1)
                | otherwise = 0 + vendasIgual s (n-1)

--Acumulação por divisao
division :: Int -> Int -> Int
division s n | n == 1 = 1
             | (mod s n) == 0 = 1 + division s (n-1)
             | (mod s n) /= 0 = 0 + division s (n-1)

--Numero de divisores
numDiv :: Int -> Int 
numDiv s | s == 0 = 0
         | s == 1 = 1
         | s == 2 = 2
         | otherwise = division s s

--Calcular MDC
mdc :: Int -> Int -> Int
mdc a b | mod a b == 0 = b
        | mod b a == 0 = a
        | a > b = mdc b (mod a b)
        | b > a = mdc a (mod b a)

--Primos entre si
primosEntreSi :: Int -> Int -> Bool
primosEntreSi s n | mdc s n == 1 = True
                  | otherwise = False

--Fatorial
fatorial :: Int -> Int
fatorial s | s == 1 = 1
           | otherwise = s * fatorial(s-1)

--Se todos sao iguais
allEqual :: Int -> Int -> Int -> Bool
allEqual n m p = (n == m) && (m == p)

--Checa se os 4 parametros sao iguais
all4Equal :: Int -> Int -> Int -> Int -> Bool
all4Equal a b c d | (allEqual a b c) == True && (allEqual b c d) == True = True
                  | otherwise = False

