create schema if not exists users;

create table users.user (
    id bigserial primary key,
    name varchar(100) not null,
    cpf varchar(25) not null,
    address varchar(150) not null,
    email varchar(80) not null,
    cellphone varchar(25) not null,
    registration_date timestamp not null
);