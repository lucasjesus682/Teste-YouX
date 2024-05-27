# Teste YouX

## O QUE FOI FEITO NA APLICAÇÃO :

Ao longo do desafio foi feito uma sistema de autenticacao com websecurity, criado os endpoints de login, criado a entidade cliente, o crud do client e seus endpoints.
## FUNCIONALIDADES :

- Registra usuario
- Lista Usuarios
- Verifica se usuario está registrado antes de conceder o login
- Registra clientes
- Lista clientes
- Atualiza Cliente
- Deleta um cliente do sistema.

## VERSIONAMENTO :

Versão do Java: 17

Versão do Spring Boot: 2.7.3

## FERRAMENTAS :

Back end:

      - Java
      - Spring Data JPA
      - Maven

Dependências:

     Data JPA - > Utilizando o JPA para fazer a ponte entre o banco de dados e a aplicação -> ORM

     Web -> É uma aplicação WEB, Utilizado para receber requisições, devolver uma resposta ...

     Security -> Security é um framework de segurança de alto nível e personalizável para aplicações Java.

     Flyway-> Flyway é uma ferramenta poderosa de gerenciamento de migrações de banco de dados para ambientes Java

     PostgreSQL -> Utilizado esse BANCO no ambiente de desenvolvimento e produção.

     LomBok -> Utilizado para evitar muitas linhas de código através de annotations.

Programas Utilizados :

    Insomnia - Utilizado para fazer as requisições (CONSUMIR) a aplicação.
    
    IntelliJ - IDE escolhida para desenvolver o projeto.
    
    Git e GitHub - Utilizados para commitar o projeto e subir o código para a nuvem(remoto).

    Docker - Utilizado para integracao com o banco de dados.

Bancos de Dados :

    PostgreSQL - Usado em ambiente de desenvolvimento e produção.

## Programas Utilizados :

    Tenha a ferramenta docker instalada no seu computador.
    
    Para iniciar você irá, dentro da IDE de escolha (preferencialmente Intelij IDEA), irá rodar o arquivo compose.yaml.
    
    Após isso irá rodar a aplicacao chamada TesteyouxApplication.

    Seu backend já está rodando.

    Para testar você pode usar o programa insomnia ou postman.

    Utilizando o frontend disponível em https://github.com/lucasjesus682/Teste-YouX-FrontEnd você poderá registrar e logar o usuário.

    
## Como usar :
    No programa para rotas você poderá testar o CRUD Clients.

    Para cadastro (POST) -> http://localhost:8080/client

    {
	"name": "Lucas",
	"cnpj": "09355211000111",
	"tel": "(74) 2642-3993",
	"email": "lucas@teste.com",
	"uf": "RJ",
	"location": "Rua 7"
      }

    Para listar todos (GET) -> http://localhost:8080/client/{id}

    Para procurar por id (GET) -> http://localhost:8080/client/{id}

    Para atualizar algum client (UPDATE) -> http://localhost:8080/client/{id}

    Para deletar algum client (DELETE) -> http://localhost:8080/client/{id}

      

      

