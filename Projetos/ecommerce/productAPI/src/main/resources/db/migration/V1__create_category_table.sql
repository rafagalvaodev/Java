create schema if not exists products;

create table products.category (
    id bigserial primary key,
    name varchar(80) not null
);