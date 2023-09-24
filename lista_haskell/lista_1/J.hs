type Comando = String
type Valor = Int

op [] v = v
op (a:as) v | snd a == 0 && fst a == "Divide" = -666
            | fst a == "Soma" = op as (v + snd a)
            | fst a  == "Subtrai" = op as (v - snd a)
            | fst a == "Multiplica" = op as (v * snd a)
            | fst a == "Divide" = op as (v `div` snd a)

executa :: [(Comando, Valor)] -> Int 
executa as = op as 0
               