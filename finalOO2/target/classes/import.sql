INSERT INTO ESTADO (nome, sigla) VALUES ('Acre', 'AC');
INSERT INTO ESTADO (nome, sigla) VALUES ('Alagoas', 'AL');
INSERT INTO ESTADO (nome, sigla) VALUES ('Amapa', 'AP');
INSERT INTO ESTADO (nome, sigla) VALUES ('Amazonas', 'AM');
INSERT INTO ESTADO (nome, sigla) VALUES ('Bahia', 'BA');
INSERT INTO ESTADO (nome, sigla) VALUES ('Ceara', 'CE');
INSERT INTO ESTADO (nome, sigla) VALUES ('Distrito Federal', 'DF');
INSERT INTO ESTADO (nome, sigla) VALUES ('Espirito Santo', 'ES');
INSERT INTO ESTADO (nome, sigla) VALUES ('Goias', 'GO');
INSERT INTO ESTADO (nome, sigla) VALUES ('Maranhao', 'MA');
INSERT INTO ESTADO (nome, sigla) VALUES ('Mato Grosso', 'MT');
INSERT INTO ESTADO (nome, sigla) VALUES ('Mato Grosso do Sul', 'MS');
INSERT INTO ESTADO (nome, sigla) VALUES ('Minas Gerais', 'MG');
INSERT INTO ESTADO (nome, sigla) VALUES ('Para', 'PA');
INSERT INTO ESTADO (nome, sigla) VALUES ('Paraiba', 'PB');
INSERT INTO ESTADO (nome, sigla) VALUES ('Parana', 'PR');
INSERT INTO ESTADO (nome, sigla) VALUES ('Pernambuco', 'PE');
INSERT INTO ESTADO (nome, sigla) VALUES ('Piaui', 'PI');
INSERT INTO ESTADO (nome, sigla) VALUES ('Rio de Janeiro', 'RJ');
INSERT INTO ESTADO (nome, sigla) VALUES ('Rio Grande do Norte', 'RN');
INSERT INTO ESTADO (nome, sigla) VALUES ('Rio Grande do Sul', 'RS');
INSERT INTO ESTADO (nome, sigla) VALUES ('Rondonia', 'RO');
INSERT INTO ESTADO (nome, sigla) VALUES ('Roraima', 'RR');
INSERT INTO ESTADO (nome, sigla) VALUES ('Santa Catarina', 'SC');
INSERT INTO ESTADO (nome, sigla) VALUES ('Sao Paulo', 'SP');
INSERT INTO ESTADO (nome, sigla) VALUES ('Sergipe', 'SE');
INSERT INTO ESTADO (nome, sigla) VALUES ('Tocantins', 'TO');

INSERT INTO CIDADE (nome, estado_id) values ('Aracaju', 26);
INSERT INTO CIDADE (nome, estado_id) values ('Belem', 14);
INSERT INTO CIDADE (nome, estado_id) values ('Belo Horizonte', 13);
INSERT INTO CIDADE (nome, estado_id) values ('Boa Vista', 23);
INSERT INTO CIDADE (nome, estado_id) values ('Brasilia', 7);
INSERT INTO CIDADE (nome, estado_id) values ('Campo Grande', 12);
INSERT INTO CIDADE (nome, estado_id) values ('Cuiaba', 11);
INSERT INTO CIDADE (nome, estado_id) values ('Curitiba', 16);
INSERT INTO CIDADE (nome, estado_id) values ('Florianopolis', 24);
INSERT INTO CIDADE (nome, estado_id) values ('Fortaleza', 6);
INSERT INTO CIDADE (nome, estado_id) values ('Goiania', 9);
INSERT INTO CIDADE (nome, estado_id) values ('Joao Pessoa', 15);
INSERT INTO CIDADE (nome, estado_id) values ('Macapa', 3);
INSERT INTO CIDADE (nome, estado_id) values ('Maceio', 2);
INSERT INTO CIDADE (nome, estado_id) values ('Manaus', 4);
INSERT INTO CIDADE (nome, estado_id) values ('Natal', 20);
INSERT INTO CIDADE (nome, estado_id) values ('Palmas', 27);
INSERT INTO CIDADE (nome, estado_id) values ('Porto Alegre', 21);
INSERT INTO CIDADE (nome, estado_id) values ('Porto Velho', 22);
INSERT INTO CIDADE (nome, estado_id) values ('Recife', 17);
INSERT INTO CIDADE (nome, estado_id) values ('Rio Branco', 1);
INSERT INTO CIDADE (nome, estado_id) values ('Rio de Janeiro', 19);
INSERT INTO CIDADE (nome, estado_id) values ('Salvador', 5);
INSERT INTO CIDADE (nome, estado_id) values ('Sao Luis', 10);
INSERT INTO CIDADE (nome, estado_id) values ('Sao Paulo', 25);
INSERT INTO CIDADE (nome, estado_id) values ('Teresina', 18);
INSERT INTO CIDADE (nome, estado_id) values ('Vitoria', 8);

INSERT INTO usuario (nome, cpf, salario, comissao, foto, email, senha, permissoes) VALUES ('a', '11111111111', 1500, 2, null, 'a', 'batata', 0);
INSERT INTO usuario (nome, cpf, salario, comissao, foto, email, senha, permissoes) VALUES ('Administrador', '00100200345', 10, 2, null, 'admin@admin.com', 'F4610AA514477222AFAC2B77F971D069780CA2846F375849F3DFA3C0047EBBD1', 0); --senha: batata
INSERT INTO usuario (nome, cpf, salario, comissao, foto, email, senha, permissoes) VALUES ('Teste', '00600700890', 10, 3, null, 'teste@teste.com', '123', 0);
INSERT INTO usuario (nome, cpf, salario, comissao, foto, email, senha, permissoes) VALUES ('Jean Peiter', '10185092918', 4000, 6, null, 'jpeiter15@gmail.com', 'F4610AA514477222AFAC2B77F971D069780CA2846F375849F3DFA3C0047EBBD1', 0); --senha: batata
INSERT INTO usuario (nome, cpf, salario, comissao, foto, email, senha, permissoes) VALUES ('Financeiro', '12345678914', 1000, 2, null, 'fin@nceiro.com', 'F4610AA514477222AFAC2B77F971D069780CA2846F375849F3DFA3C0047EBBD1', 2); --senha: batata
INSERT INTO usuario (nome, cpf, salario, comissao, foto, email, senha, permissoes) VALUES ('Vendedor', '98765432196', 1000, 2, null, 'vendedor@vendas.com', 'F4610AA514477222AFAC2B77F971D069780CA2846F375849F3DFA3C0047EBBD1', 1); --senha: batata

INSERT INTO cliente (cpf, nome, endereco, cep, cidade_id) VALUES ('71014760070','Barack Hussein Obama II', 'Rua dos Bobos nº 0, Bairro Top', '85501020', 6);
INSERT INTO cliente (cpf, nome, endereco, cep, cidade_id) VALUES ( '52545712094' ,'Abraham Lincoln', 'Avenida Tupy 476, Centro', '85504400', 12);
INSERT INTO cliente (cpf, nome, endereco, cep, cidade_id) VALUES ( '31502054094','Neymar da Silva Santos Junior', 'Alameda Barça', '85301111', 24);

INSERT INTO categoria (descricao) VALUES ('Informatica');
INSERT INTO categoria (descricao) VALUES ('Eletronico');
INSERT INTO categoria (descricao) VALUES ('Telefonia');

INSERT INTO produto (nome, descricao, valor, categoria_id) VALUES ('Teclado Microsoft 3000', 'Teclado com tecnologia Wireless; ABNT2 ...', 199.49, 1);
INSERT INTO produto (nome, descricao, valor, categoria_id) values ('Monitor 24pol. FHD Samsung', 'Monitor Full HD de 24pol. Taxa de atualização 144Hz...', 2099.00, 1);
INSERT INTO produto (nome, descricao, valor, categoria_id) VALUES ('Smarpthone Samsung A9', 'Smartphone Samsung A9, Tela 2k 440ppi, 64GB ...', 199.49, 3);
INSERT INTO produto (nome, descricao, valor, categoria_id) VALUES ('Home Theater LG LHB655NW', 'O novo Home Theater LG LHB655NW possui 5.1 canais de áudio e 1000W RMS de potência,...', 1899.99, 2);
INSERT INTO produto (nome, descricao, valor, categoria_id) VALUES ('Processador Core I9', 'Processador Intel Core I9 4.3Ghz...', 7099.99, 1);

INSERT INTO venda(data, numeropedido, cliente_id, tipoPagamento, usuario_id) VALUES ('2018-03-20', '172839', 1, 3, 3);    
INSERT INTO venda(data, numeropedido, cliente_id, tipoPagamento, usuario_id) VALUES ('2018-04-12', '976431', 2, 2, 2);
INSERT INTO venda(data, numeropedido, cliente_id, tipoPagamento, usuario_id) VALUES ('2018-05-15', '481926', 3, 1, 1);

INSERT INTO vendaproduto(quantidade, valor, produto_id, venda_id) VALUES (1, 199.49, 1, 1);
INSERT INTO vendaproduto(quantidade, valor, produto_id, venda_id) VALUES (3, 6297, 2, 1);
INSERT INTO vendaproduto(quantidade, valor, produto_id, venda_id) VALUES (2, 398.98, 3, 2);
INSERT INTO vendaproduto(quantidade, valor, produto_id, venda_id) VALUES (4, 797.96, 1, 2);
INSERT INTO vendaproduto(quantidade, valor, produto_id, venda_id) VALUES (2, 14199.98, 4, 3);

INSERT INTO fornecedor (nome, cnpj, cidade_id, telefone, endereco)VALUES ('COPEL', '76483817000120', 8, '4632234365', 'Rodovia PR-280, s/n - Km 139');
INSERT INTO fornecedor (nome, cnpj, cidade_id, telefone, endereco)VALUES ('SANEPAR', '76484013000145', 8, '4632724000', 'Tv. Clárice Soares Cerqueira, 185 - Centro, Pato Branco - PR');

INSERT INTO contapagar (dataVencimento, dataPagamento, valor, valorPago, tipoPagamento, usuario_id, fornecedor_id) values ('2018-11-24', '2018-12-05', 600, 559, 1, 1, 1);
INSERT INTO contapagar (dataVencimento, dataPagamento, valor, valorPago, tipoPagamento, usuario_id, fornecedor_id) values ('2017-01-01', '2018-01-01', 450, 450, 2, 1, 2);
INSERT INTO contapagar (dataVencimento, dataPagamento, valor, valorPago, tipoPagamento, usuario_id, fornecedor_id) values ('2017-09-01', '2018-06-01', 1500, 1500, 3, 3, 1);

INSERT INTO contareceber (valor, venda_id, data, numeroRecibo, tipoRecebimento) values (625, 1, '2018-03-20', '999666333', 3);
INSERT INTO contareceber (valor, venda_id, data, numeroRecibo, tipoRecebimento) values (1155, 2, '2018-04-12', '111222333', 2);
INSERT INTO contareceber (valor, venda_id, data, numeroRecibo, tipoRecebimento) values (930, 3, '2018-11-28', '444555666', 1);