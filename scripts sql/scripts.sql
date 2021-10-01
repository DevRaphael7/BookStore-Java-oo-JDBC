CREATE TABLE Livro( 
	id int not null UNIQUE AUTO_INCREMENT,
    quantPages int not null,
    preco float(3, 2) not null,
    editora varchar(25) not null,
    descricao varchar(255) not null,
    autor varchar(30) not null,
    PRIMARY KEY(id)
);

CREATE TABLE Ebook( 
	id int not null UNIQUE AUTO_INCREMENT,
    quantPages int not null,
    preco float(3, 2) not null,
    editora varchar(25) not null,
    descricao varchar(255) not null,
    autor varchar(30) not null,
    tipoDeArquivo varchar(32) not null,
    PRIMARY KEY(id)
);

DROP TABLE Ebook;

ALTER TABLE Livro ADD tipoDeLivro varchar(14) not null; 
ALTER TABLE Livro ADD nome varchar(50) not null;

INSERT INTO Livro VALUES (1, 119, 5, "Penguim Companhia", "Incapaz de compartilhar momentos de amizade e de compreender a magia do Natal, Ebenezer Scrooge só encontra refúgio na riqueza e na solidão. Até que, num 24 de dezembro, recebe a visita do fantasma de Jacob Marley, seu ex-sócio falecido há sete anos. É ele quem avisa a Scrooge que mais três espíritos o visitarão para lhe dar a chance de mudar seu triste fim e ser poupado de vagar a esmo depois de morto, como Marley. Assim, o Fantasma dos Natais Passados, o Fantasma do Natal Presente e o Fantasma dos Natais Futuros levarão o protagonista para uma viagem no tempo, mostrando-lhe que a generosidade é sempre a melhor escolha. Um dos livros mais carismáticos da literatura inglesa, Uma canção de Natal recebe o crédito por ter concebido a celebração desse evento como a entendemos hoje: uma ocasião para agradecer e ajudar o próximo.", " Charles Dickens", "Livro Impresso", "Uma canção de Natal");
ALTER TABLE Livro MODIFY preco double(6, 2) not null

ALTER TABLE Livro MODIFY extensaoDeArquivo varchar(32);