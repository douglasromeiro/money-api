CREATE TABLE lancamento (
	codigo BIGINT(20) PRIMARY KEY AUTO_INCREMENT,
    descricao VARCHAR(50) NOT NULL,
    data_vencimento DATE NOT NULL,
    data_lancamento DATE,
    valor DECIMAL(10, 2) NOT NULL,
    observacao VARCHAR(100),
    tipo VARCHAR(20) NOT NULL,
    codigo_categoria BIGINT(20) NOT NULL,
    codigo_pessoa BIGINT(20) NOT NULL,
    FOREIGN KEY (codigo_pessoa) REFERENCES pessoa(codigo),
    FOREIGN KEY(codigo_categoria) REFERENCES categoria(codigo)
) Engine=InnoDB DEFAULT charset=utf8;

INSERT INTO lancamento (descricao, data_vencimento, data_lancamento, valor, observacao, tipo, codigo_categoria, codigo_pessoa)
	VALUES('Saco de Arroz', '2022-10-23', '2022-11-22', '17.00', 'Compras para alimentação', 'DESPESA', '2','1');
INSERT INTO lancamento (descricao, data_vencimento, data_lancamento, valor, observacao, tipo, codigo_categoria, codigo_pessoa)
	VALUES('Feijáo', '2022-10-25', '2022-11-22', '9.99', 'Compras para alimentção', 'DESPESA', '2','1');
INSERT INTO lancamento (descricao, data_vencimento, data_lancamento, valor, observacao, tipo, codigo_categoria, codigo_pessoa)
	VALUES('Carne bovina', '2022-08-03', '2022-11-22', '29.90', 'Compras para alimentação', 'DESPESA', '2', '1');
INSERT INTO lancamento (descricao, data_vencimento, data_lancamento, valor, observacao, tipo, codigo_categoria, codigo_pessoa)
	VALUES('Maquiagem', '2022-12-01', '2023-01-02', '19.90', 'Beleza Pessoal', 'DESPESA', '5','2');
INSERT INTO lancamento (descricao, data_vencimento, data_lancamento, valor, observacao, tipo, codigo_categoria, codigo_pessoa)
	VALUES('Shapoo', '2022-10-02', '2023-01-03', '23.5', 'Higiene Pessoal', 'DESPESA', '5','2');
INSERT INTO lancamento (descricao, data_vencimento, data_lancamento, valor, observacao, tipo, codigo_categoria, codigo_pessoa)
	VALUES('Rendimento', '2023-01-03', '2023-01-03', '243.5', 'Investimento', 'RECEITA', '5','2');
