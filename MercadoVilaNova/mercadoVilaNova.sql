CREATE DATABASE VILANOVA;

USE VILANOVA;

CREATE TABLE produto(
	idProd INT AUTO_INCREMENT NOT NULL,
    nomeProd VARCHAR (60) NOT NULL,
    estoqueProd INT (3) NOT NULL,
    marcaProd VARCHAR (20) NOT NULL,
    precoProd DOUBLE (10,2) NOT NULL,
    codBarraProd VARCHAR (100) NOT NULL,
    caminhoImg varchar(500),
    PRIMARY KEY (idProd)
);
SELECT * FROM produto;

drop table produto;