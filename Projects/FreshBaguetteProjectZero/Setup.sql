drop table if exists users cascade;
drop type if exists role;
create type role as enum ('CUSTOMER', 'EMPLOYEE', 'MANAGER');
create table users
(
    user_id       serial primary key,
    username      varchar(20) unique not null,
    password      text               not null,
    assigned_role role default 'CUSTOMER'
);

drop table if exists product cascade;

--create type stock as enum ('AVAILABLE', 'OWNED');
create table product
(
    product_id   serial primary key,
    product_name varchar(30) unique not null,
    inventory_qty     int
);

drop table if exists offer cascade;
create table offer
(
    user_id      integer references users (user_id),
    product_id      integer references product (product_id),
    offer_date   date default current_date,
    offer_amount money not null,
    primary key (user_id, product_id)
);

insert into users (username, password, assigned_role)
values ('gigi', '1234', 'EMPLOYEE');
insert into users (username, password, assigned_role)
values ('JeanPhilippe', 'secret', 'MANAGER');

insert into product (product_name)
values ('Crossint');
insert into product (product_name)
values ('Coke');
insert into product (product_name)
values ('Coffe');
insert into product (product_name)
values ('Baguette');
insert into product (product_name)
values ('PASTRY');
insert into product (product_name)
values ('Quiche');
insert into product (product_name)
values ('Sweets');
insert into product (product_name)
values ('Sandwitches');
insert into product (product_name)
values ('CroqueHam');
insert into product (product_name)
values ('Chocolate');