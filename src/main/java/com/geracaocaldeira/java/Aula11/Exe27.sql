INSERT INTO Autor(autorID,nome,dataNascimento) VALUES (2,'Mario','10-01-2005');
INSERT INTO Livro(livroID, titulo,anoPUblicacao,autorID) VALUES (2,'amor', 2010,2);
INSERT INTO Emprestimo(emprestimoID, livroID, nomePessoa, dataEmprestimo,dataDevolucao) VALUES (2,2,'bruna','10-01-2005','10-01-2005');

 SELECT * from Emprestimo