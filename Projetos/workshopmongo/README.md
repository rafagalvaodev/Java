# workshopmongo

API REST desenvolvida com Spring Boot e MongoDB para cadastrar usuarios e posts, com busca por titulo e busca completa por texto e periodo.

## Tecnologias

- Java 21
- Spring Boot
- Spring Web
- Spring Data MongoDB
- Maven

## Estrutura

- `domain`: entidades `User` e `Post`
- `dto`: objetos de transferencia usados na API
- `repository`: acesso ao MongoDB
- `service`: regras de negocio
- `resources`: controllers REST
- `config`: carga inicial de dados

## Requisitos

- Java 21
- Maven
- MongoDB rodando em `localhost:27017`

## Configuracao

O banco e configurado em `src/main/resources/application.properties`:

```properties
spring.data.mongodb.uri=mongodb://localhost:27017/workshop
spring.data.mongodb.database=workshop
```

## Como executar

```bash
mvn spring-boot:run
```

Ou compile e execute o jar:

```bash
mvn clean package
java -jar target/workshopmongo-0.0.1-SNAPSHOT.jar
```

## Dados iniciais

A classe `Instantiation` remove os dados atuais e insere usuarios, posts e comentarios de exemplo sempre que a aplicacao inicia.

## Endpoints

### Usuarios

- `GET /users` - lista usuarios
- `GET /users/{id}` - busca usuario por id
- `POST /users` - cria usuario
- `PUT /users/{id}` - atualiza usuario
- `DELETE /users/{id}` - remove usuario
- `GET /users/{id}/posts` - lista posts de um usuario
- `GET /users/test-mongo` - retorna o nome do banco conectado
- `GET /users/Hello` - resposta simples de teste

### Posts

- `GET /posts/{id}` - busca post por id
- `GET /posts/titlesearch?text=...` - busca posts por titulo
- `GET /posts/fullsearch?text=...&minDate=...&maxDate=...` - busca completa por texto e intervalo de datas

## Tratamento de erro

Quando um recurso nao e encontrado, a API retorna `404` com payload padronizado.

## Observacoes

- O projeto nao possui autenticacao.
- O endpoint de inicializacao apaga os registros existentes ao subir a aplicacao.
