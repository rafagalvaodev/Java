# Santander Dev Week 2023

API REST em Java com Spring Boot para cadastro e consulta de usuários com conta, cartão, features e notícias.

## Tecnologias

- Java 17
- Spring Boot 3.1.2
- Spring Web
- Spring Data JPA
- H2 Database (dev)
- PostgreSQL (prd)
- Swagger/OpenAPI via springdoc

## Estrutura de domínio

- `User`
- `Account`
- `Card`
- `Feature`
- `News`

## Banco de dados

### Ambiente de desenvolvimento

- Banco em memória H2
- Console H2 habilitado em `/h2-console`
- Schema criado automaticamente com `ddl-auto: create`

### Ambiente de produção

- PostgreSQL configurado via variáveis de ambiente:
  - `PGHOST`
  - `PGPORT`
  - `PGDATABASE`
  - `PGUSER`
  - `PGPASSWORD`
- Validação de schema com `ddl-auto: validate`

## Como executar

### Desenvolvimento

```bash
./gradlew bootRun --args='--spring.profiles.active=dev'
```

### Build

```bash
./gradlew clean build
```

### Executar o JAR

```bash
java -jar build/libs/*.jar --spring.profiles.active=dev
```

## Endpoints

### `GET /users/{id}`

Busca um usuário pelo ID.

### `POST /users`

Cria um novo usuário.

Exemplo de payload:

```json
{
  "nome": "João Silva",
  "account": {
    "number": "0001",
    "agency": "0001",
    "balance": 2500.0,
    "limit": 1000.0
  },
  "card": {
    "number": "1234 5678 9012 3456",
    "limit": 2000.0
  },
  "feature": [],
  "news": []
}
```

## Tratamento de erros

- `404`: usuário não encontrado
- `422`: regra de negócio violada
- `500`: erro inesperado

## Swagger

Após iniciar a aplicação, a documentação fica disponível no Swagger UI do springdoc.

## Testes

```bash
./gradlew test
```
