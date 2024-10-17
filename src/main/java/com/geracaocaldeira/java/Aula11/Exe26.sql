

CREATE TABLE Autor(
	autorID SERIAL PRIMARY KEY,
	nome VARCHAR(255),
	dataNascimento DATE
);

CREATE TABLE Livro(
	livroID SERIAL PRIMARY KEY,
	titulo VARCHAR(255),
	anoPublicacao INT,
	autorID INT REFERENCES Autor(autorID)
);

CREATE TABLE Emprestimo(
	emprestimoID SERIAL PRIMARY KEY,
	livroID INT references Livro(livroID),
	nomePEssoa VARCHAR(255),
	dataEmprestimo DATE,
	dataDevolucao DATE
)