# Spring Básico

API REST em Spring Boot para estudo de JPA, relacionamentos e CRUD básico.

## Tecnologias

- Java 21
- Spring Boot 4
- Spring Data JPA
- Spring Web
- PostgreSQL
- H2 Console (dependência incluída)

## Funcionalidades

- Cadastro, consulta, atualização e remoção de usuários
- Consulta de produtos, categorias e pedidos
- Tratamento centralizado de erros

## Endpoints

### Users

- `GET /users`
- `GET /users/{id}`
- `POST /users`
- `PUT /users/{id}`
- `DELETE /users/{id}`

### Products

- `GET /products`
- `GET /products/{id}`

### Categories

- `GET /categories`
- `GET /categories/{id}`

### Orders

- `GET /orders`
- `GET /orders/{id}`

## Configuração

O projeto está configurado para iniciar com o profile `test`:

- `src/main/resources/application.properties`
- `src/main/resources/application-test.properties`

O profile `test` lê as variáveis abaixo de um arquivo `.env` ou `.env.properties`:

- `LOCAL_DB_URL`
- `LOCAL_DB_USERNAME`
- `LOCAL_DB_PASSWORD`

## Como executar

1. Configure o banco PostgreSQL local.
2. Crie um arquivo `.env.properties` na raiz do projeto com as credenciais do banco.
3. Execute a aplicação:

```bash
mvn spring-boot:run
```

## Observações

- A aplicação usa JPA com geração de schema configurada em `application.properties`.
- Existe uma classe `TestConfig` para carga inicial de dados de exemplo.
- Alguns inserts de exemplo estão comentados no código.
