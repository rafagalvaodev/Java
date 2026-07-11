create schema if not exists shopping;

create table shopping.shop (
    id bigserial primary key,
    user_identifier varchar(85) not null,
    date timestamp not null,
    total float not null
);

create table shopping.item (
    shop_id bigserial REFERENCES shopping.shop(id),
    product_identifier varchar(80) not null,
    price float not null
);