# sistema-de-cadastro
Sistema de Cadastro de Usuários (Console)

Projeto desenvolvido em Java para fins de estudo, com foco em Programação Orientada a Objetos (POO), organização de pacotes, separação de responsabilidades e persistência simples em arquivo.

📌 Objetivo

Criar um sistema de cadastro em console capaz de:

Cadastrar usuários

Listar usuários

Listar apenas nomes

Excluir usuários

Salvar e carregar dados automaticamente via arquivo .csv

🧠 Conceitos praticados

Encapsulamento

Classes e Objetos

Repositório (Camada de acesso a dados)

Persistência com arquivo texto

Organização em pacotes (br.com.vinicius.cadastro)

Uso de Scanner

Sobrescrita de toString()

📂 Estrutura do projeto
src/
 └── br/com/vinicius/cadastro/
        Main.java
        Usuario.java
        UsuarioRepository.java
        FileService.java
        usuarios.csv (gerado automaticamente)

▶️ Como executar

Compile o projeto:

javac br/com/vinicius/cadastro/*.java


Execute:

java br.com.vinicius.cadastro.Main

📁 Persistência dos dados

Os usuários são armazenados no arquivo:

usuarios.csv


Criado automaticamente ao sair do sistema.

Formato:

numUser;nome;sobrenome;idade;sexo

🧪 Funcionalidades do menu
Opção	Função
C	Cadastrar novo usuário
E	Excluir usuário pelo índice
L	Listar apenas nomes
T	Listar todos os dados dos usuários
X	Salvar e sair

✔️ Status

Concluído e funcional.
