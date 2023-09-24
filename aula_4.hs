-- Compreensões de listas
[x^2 | x <- [1..10]]
[0 | x <- [1..10]]
[x | x <- [1..100], x mod 7 == 0]

--Biblioteca 
type Pessoa = String
type Livro = String
type BancoDados = [(Pessoa, Livro)]

baseExemplo :: BancoDados
baseExemplo = [("Sergio", "O senhor dos aneis"), ("Andre", "Duna"), ("Fernando", "Jonathan Strange")]

livros :: BancoDados -> Pessoa -> [Livro]
livros bd p =  [l | (p, l) <- bd, pp = p]

emprestimos :: BancoDados -> Livro -> [Pessoa]
emprestimos bd ll  = [p | (p, l) <- bd, ll == l]

emprestado :: BancoDados -> Livro -> Bool
emprestado bd l = (emprestimos l) /= []

qtdEmprestimos :: BancoDados -> Pessoa -> Livro
qtdEmprestimos bd p = length (livros p)

emprestar :: BancoDados -> Pessoa -> Livro
emprestar [] pessoa livro = [(pessoa, livro)]
emprestar ((p, l):as) pessoa livro | p = pessoa && l == livro = ((p, l):as)
                                   | otherwise                = (p,l): emprestar as pessoa livro