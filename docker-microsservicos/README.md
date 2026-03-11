# Docker: Utilização prática no cenário de Microsserviços

Projeto desenvolvido durante o Bootcamp da DIO com o objetivo de demonstrar um cenário de microsserviços utilizando Docker.

## Tecnologias utilizadas

- Docker
- Nginx
- PHP
- MySQL

## Arquitetura do projeto

O projeto simula um ambiente de microsserviços onde:

- A aplicação PHP realiza inserções em um banco de dados MySQL
- O Nginx atua como balanceador de carga
- Containers Docker são utilizados para isolar os serviços

## Estrutura do projeto

banco.sql → Script para criação da tabela no banco
index.php → Aplicação PHP
Dockerfile → Criação da imagem Docker
nginx.conf → Configuração do Nginx para load balancing


## Objetivo

Demonstrar de forma prática a utilização de containers Docker em um cenário simples de microsserviços.
