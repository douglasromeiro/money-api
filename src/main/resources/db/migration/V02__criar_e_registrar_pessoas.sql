CREATE TABLE pessoa (
	codigo BIGINT(20) PRIMARY KEY AUTO_INCREMENT,
    nome VARCHAR(50) NOT NULL,
	logradouro VARCHAR(50),
	numero VARCHAR(10),
	complemento VARCHAR(50),
	bairro VARCHAR(50),
	cep VARCHAR(9),
	cidade VARCHAR(50),
	estado VARCHAR(50),
    ativo VARCHAR(5) NOT NULL
) Engine=InnoDB DEFAULT CHARSET=utf8;

INSERT INTO pessoa (nome, logradouro, numero, complemento, bairro, cep, cidade, estado, ativo)
	VALUES('Douglas', 'QNJ 9', '11', 'Supermercados SuperBom', 'Taguatinga Norte', '721400901', 'Brasilia', 'DF', 'true');
INSERT INTO pessoa (nome, logradouro, numero, complemento, bairro, cep, cidade, estado, ativo)
	VALUES('Isabela', 'QNL 24', '11', 'Conjunto E', 'Taguatinga Norte', '72161405', 'Brasilia', 'DF', 'true');
INSERT INTO pessoa (nome, logradouro, numero, complemento, bairro, cep, cidade, estado, ativo)
	VALUES('Elaine', 'QNJ 09', '11', 'Supermercados SuperBom', 'Taguatinga Norte', '721400901', 'Brasilia', 'DF', 'true');
INSERT INTO pessoa (nome, logradouro, numero, complemento, bairro, cep, cidade, estado, ativo)
	VALUES('Ester', 'QNJ 09', '11', 'Supermercados SuperBom', 'Taguatinga Norte', '721400901', 'Brasilia', 'DF', 'true');
INSERT INTO pessoa (nome, logradouro, numero, complemento, bairro, cep, cidade, estado, ativo)
	VALUES('Anderson', 'QNF 14', '13', 'Supermercados SuperBom', 'Taguatinga Norte', '72125640', 'Brasilia', 'DF', 'true');
INSERT INTO pessoa (nome, logradouro, numero, complemento, bairro, cep, cidade, estado, ativo)
	VALUES('Mario', 'QNF', '13', 'Supermercados SuperBom', 'Taguatinga Norte', '72125640', 'Brasilia', 'DF', 'true');