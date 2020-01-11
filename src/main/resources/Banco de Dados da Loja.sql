/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * Author:  adn_e
 * Created: 11/01/2020
 */

CREATE DATABASE loja_eletronicos;

USE loja_eletronicos;

CREATE TABLE `clientes` (
  `idCliente` int(11) NOT NULL AUTO_INCREMENT,
  `Nome` varchar(255) DEFAULT NULL,
  `Sobrenome` varchar(255) DEFAULT NULL,
  `Nascimento` date DEFAULT NULL,
  `email` varchar(255) DEFAULT NULL,
  `Sexo` enum('M','F') DEFAULT NULL,
  `Estado` varchar(255) DEFAULT NULL,
  `Cidade` varchar(255) DEFAULT NULL,
  `Bairro` varchar(255) DEFAULT NULL,
  `Rua` varchar(255) DEFAULT NULL,
  `NumeroCasa` int(11) DEFAULT NULL,
  `Complemento` varchar(255) DEFAULT NULL,
  `CPF` varchar(255) DEFAULT NULL,
  `Telefone` varchar(255) DEFAULT NULL,
  `Celular` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`idCliente`)
);

CREATE TABLE `clientespj` (
  `idCliente` int(11) NOT NULL AUTO_INCREMENT,
  `Nome` varchar(255) DEFAULT NULL,
  `email` varchar(255) DEFAULT NULL,
  `Estado` varchar(255) DEFAULT NULL,
  `Cidade` varchar(255) DEFAULT NULL,
  `Bairro` varchar(255) DEFAULT NULL,
  `Rua` varchar(255) DEFAULT NULL,
  `NumeroCasa` int(11) DEFAULT NULL,
  `Complemento` varchar(255) DEFAULT NULL,
  `CNPJ` varchar(255) DEFAULT NULL,
  `Telefone` varchar(255) DEFAULT NULL,
  `Celular` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`idCliente`)
);

CREATE TABLE `login` (
  `IdLogin` int(11) NOT NULL AUTO_INCREMENT,
  `Usuario` varchar(255) NOT NULL,
  `Senha` varchar(255) NOT NULL,
  PRIMARY KEY (`IdLogin`)
);

CREATE TABLE `produto` (
  `Nome` varchar(255) NOT NULL,
  `Descricao` text DEFAULT NULL,
  `Tipo` varchar(255) DEFAULT NULL,
  `Quantidade` int(11) NOT NULL,
  `CodProduto` int(11) NOT NULL AUTO_INCREMENT,
  `Preco` double DEFAULT NULL,
  PRIMARY KEY (`CodProduto`)
);

CREATE TABLE `venda` (
  `idCliente` int(11) NOT NULL,
  `Venda` int(11) NOT NULL,
  `CodProduto` int(11) NOT NULL,
  `Dia` date DEFAULT NULL,
  `Valor` double DEFAULT NULL,
  `TotalProdutos` int(11) DEFAULT NULL,
  `qtdProduto` int(11) DEFAULT NULL,
  PRIMARY KEY (`Venda`,`CodProduto`,`idCliente`),
  FOREIGN KEY (CodProduto) REFERENCES produto(CodProduto),
  FOREIGN KEY (idCliente) REFERENCES clientes(idCliente)
) ;

INSERT INTO Login (Usuario, Senha) values ('admin', 'admin');

INSERT INTO clientes (Nome, Sobrenome, Nascimento, email, Sexo, Estado, Cidade, Bairro, Rua, NumeroCasa, Complemento, CPF, Telefone, Celular)
values ('João','Silva','1985-01-11','joaosilva@outlook.com','M','Ceará','Fortaleza','Jardim Iracema',
'Rua Iracema',25,'Próximo ao supermercado Extra','542.638.125-53','(11)5735-8463','(11)98934-7263');

INSERT INTO clientes (Nome, Sobrenome, Nascimento, email, Sexo, Estado, Cidade, Bairro, Rua, NumeroCasa, Complemento, CPF, Telefone, Celular)
values ('Maria', 'Santos', '1900-12-31', 'mariasantos@gmail.com', 'F', 'São Paulo', 'São Paulo', 'Jardim Ibirapuera', 'Rua ibirapuera', 50,
 'Em frente a padaria', '632.581.436-85', '(11)5813-5823', '(11)95248-3150');
 
INSERT INTO clientespj (Nome, email, Estado, Cidade, Bairro, Rua, NumeroCasa, Complemento, CNPJ, Telefone, Celular)
values ('Empresa X', 'empresax@gmail.com', 'Bahia ', 'Salvador', 'Águas Claras', 'Rua Águas Claras', 500, 'Margens da BR-324',
 '65.764.134/3843-46', '(11)5813-5624', '(11)96825-1683');
 
INSERT INTO produto (Nome, Descricao, Tipo, Quantidade, Preco)
values ('Samsung Galaxy J5 2016 Metal Dourado', 'Samsung Galaxy J5 2016 Metal Dourado Desbloqueado com Garantia', 'Smartphone', 20, 499);

INSERT INTO produto (Nome, Descricao, Tipo, Quantidade, Preco)
values ('Smart TV LED 50" LG 50UK6510', 'Smart TV LED 50" LG 50UK6510 Ultra HD 4k com Conversor Digital 4 HDMI \n2 USB Wi-Fi ThinQ AI WebOS 4.0 60Hz Inteligencia Artificial - Prata',
 'Televisão', 10, 2499.99);

INSERT INTO produto (Nome, Descricao, Tipo, Quantidade, Preco)
values ('Notebook Lenovo Ideapad 330', 'Notebook Ideapad 330 Intel Core I5-8250u 8GB (Geforce MX150 com 2GB)\n 1TB HD 15,6\" W10 Prata - Lenovo',
 'Notebook', 10,2989.99);
 
INSERT INTO produto (Nome, Descricao, Tipo, Quantidade, Preco)
values ('Computador Gamer Smart Pc SMT80502', 'Computador Gamer Smart Pc SMT80502 Intel Core i5 8GB (Gtx 1050 2GB) 1TB', 
 'Computador/Desktop', 10,2159.9);
 
INSERT INTO produto (Nome, Descricao, Tipo, Quantidade, Preco)
values ('Mouse Wireless 1850', 'Mouse Wireless 1850 Azul - Microsoft', 'Acessório', 20, 54.99);

INSERT INTO venda (Venda,idCliente,CodProduto, Dia, Valor, TotalProdutos, qtdProduto)
values (0, 1, 1, '2018-11-30', 499, 1, 1);

INSERT INTO venda (Venda,idCliente,CodProduto, Dia, Valor, TotalProdutos, qtdProduto)
values (0, 1, 2, '2018-11-29', 2499.99, 1, 1);

INSERT INTO venda (Venda,idCliente,CodProduto, Dia, Valor, TotalProdutos, qtdProduto)
values (1, 2, 3, '2018-11-28', 2989.99, 1, 1);

INSERT INTO venda (Venda,idCliente,CodProduto, Dia, Valor, TotalProdutos, qtdProduto)
values (1, 2, 4, '2018-11-27', 2159.9, 1, 1);

INSERT INTO venda (Venda,idCliente,CodProduto, Dia, Valor, TotalProdutos, qtdProduto)
values (1, 2, 5, '2018-11-26', 54.99, 1, 1);
 


