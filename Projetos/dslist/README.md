# dslist

API REST para gerenciar listas de jogos, construída com Spring Boot, JPA e PostgreSQL/H2.

## Funcionalidades

- Listar jogos
- Buscar jogo por ID
- Listar coleções de jogos
- Listar jogos de uma coleção em ordem
- Reordenar jogos dentro de uma coleção

## Stack

- Java 21
- Spring Boot 3.5.4
- Spring Web
- Spring Data JPA
- H2 Database
- PostgreSQL

## Execução

O perfil ativo é definido por `APP_PROFILE` e, por padrão, usa `test`.

### Perfil padrão

```bash
./mvnw spring-boot:run
```

### Perfis disponíveis

- `test`: usa H2 em memória
- `dev`: usa PostgreSQL local em `localhost:5432/dslist`
- `prod`: reservado para ambiente de produção

Exemplo:

```bash
APP_PROFILE=dev ./mvnw spring-boot:run
```

No perfil `dev`, o banco espera o usuário `postgres` e a senha `123`.

## Configuração

### Variáveis de ambiente

- `APP_PROFILE`: define o perfil do Spring
- `CORS_ORIGINS`: origens liberadas no CORS

Valor padrão de `CORS_ORIGINS`:

```text
http://localhost:5173,http://localhost:3000
```

## API

Base URL local:

```text
http://localhost:8080
```

### Jogos

`GET /games`

Retorna uma lista resumida de jogos.

`GET /games/{id}`

Retorna os detalhes completos de um jogo.

### Listas

`GET /lists`

Retorna as listas cadastradas.

`GET /lists/{listId}/games`

Retorna os jogos de uma lista, ordenados por posição.

`POST /lists/{listId}/replacement`

Reordena um jogo dentro da lista.

Exemplo de corpo:

```json
{
  "sourceIndex": 0,
  "destinationIndex": 2
}
```

## Dados iniciais

O projeto sobe com dados de exemplo em `src/main/resources/import.sql`.

## Testes

```bash
./mvnw test
```
