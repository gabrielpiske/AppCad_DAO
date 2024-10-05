# Sistema de Cadastro

Este projeto é um sistema de cadastro simples que implementei em sala de aula que permite gerenciar informações sobre clientes, produtos e fornecedores. O projeto serviu como aplicação prática do padrão de arquitetura DAO.

## Tecnologias Utilizadas

[![My Skills](https://skillicons.dev/icons?i=java,mysql&theme=dark)](https://skillicons.dev)

## Scripts de Criação do Banco de Dados

O seguinte script SQL cria um banco de dados chamado `db_cad` e três tabelas: `cliente`, `produto` e `fornecedor`.

```sql
-- Criar o banco de dados
CREATE DATABASE db_cad;
USE db_cad;

-- Criar a tabela cliente
CREATE TABLE cliente(
    id INT PRIMARY KEY,
    nome VARCHAR(45) NOT NULL,
    telefone VARCHAR(16) NOT NULL,
    email VARCHAR(100) NOT NULL,
    endereco VARCHAR(255) NOT NULL
);

-- Criar a tabela produto
CREATE TABLE produto(
    id INT PRIMARY KEY,
    descricao VARCHAR(255) NOT NULL,
    unidade VARCHAR(255) NOT NULL,
    quantidade DECIMAL(10,2) NOT NULL,
    preco DECIMAL(10,2) NOT NULL
);

-- Criar a tabela fornecedor
CREATE TABLE fornecedor(
    id INT PRIMARY KEY,
    empresa VARCHAR(255) NOT NULL,
    contato VARCHAR(255) NOT NULL,
    telefone VARCHAR(255) NOT NULL,
    email VARCHAR(255) NOT NULL
);
