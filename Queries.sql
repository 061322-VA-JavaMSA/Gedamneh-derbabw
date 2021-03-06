

 create table  Sales(
             
SalesPersonid  serial primary key ,
SalesPersonName   varchar(50) 

);


insert into Sales (SalesPersonName)
values ('mike'),('Jhon'),('Deborah');
drop if exists SalesofficeAdress
create table SalesofficeAdress(
 Adressid  serial,
 street  varchar(20)  ,
 city  varchar(20) ,
 state  char(10) ,
 zip    int  ,
 Empid  int 
 
 CONSTRAINT  fk_Empid  FOREIGN KEY(Empid) REFERENCES Employee(Employeeid)




);

update table salesofficeadress add  CONSTRAINT  fk_Empid  FOREIGN KEY(Empid) REFERENCES Employee(Employeeid);

drop if exists Customer
create table Customer(
customerid  serial,
customername varchar(20) ,
age  int ,
DOB  date,
Empid int 
--CONSTRAINT  fk_Empid  FOREIGN KEY(Empid) REFERENCES Employee(Employeeid)

);


insert into customer (customername, age, dob )
values ('Customer1' ,10 , '10/20/22'),('Customer2',20 , '11/2/21'),('Customer3',20 , '12/2/20');

drop table if exists employee;
create table Employee(
employeeid serial primary key not null ,
Fname varchar(10),
Lname varchar(10),
DOB date,

);

alter table employee 
add  Offerid int references Offers(Offerid);


  drop  table if exists Product ;
  create table if not exists Product( prodid serial primary key ,prodname varchar(20),catagory varchar(20), price int ,Qty int );
  insert into Product ( prodname ,catagory , price  ,Qty )
  values ( ' Baguette ', 'Bread  ', 4 , 200),
       ( ' Eclair ', 'Pastry ', 5 , 300),
       ( ' Kouignamann ', 'Croissant'  , 4 , 200),
       ( ' Parsian' , 'Sandwitchs ', 4 , 200),
       ( ' Coke ', 'Beverage', 2 , 100),
       ( ' Madelene ', 'Sweet', 2 , 40),
       ( 'Quiche ', 'Savory' , 7 , 50)

       
       select * from  product ;
      
   drop  table if exists Customer ;
   create table if not exists Customer( custid serial primary key ,firstName varchar(20),lastName varchar(20), emailId varchar(20) ,password varchar(20),phoneNo  );
      
 
   drop table if exists users
   create table if not exists users(
   id serial primary key,
   username varchar(30) unique not null check(length(username) > 2),
   password varchar(30) not null
--manager_id references users(id)
);

insert into users (username, password) values ('hcocking0', 'Gox1eyM1ph');
insert into users (username, password) values ('dvalenta1', 'GcYCYy4Q');
insert into users (username, password) values ('msargerson2', 'rN3ef1EzL');
insert into users (username, password) values ('jmoorey3', 'FZfFjGnS2L8N');
insert into users (username, password) values ('bfrancomb4', 'LpMu6k1');
insert into users (username, password) values ('jkahen5', 'GNgoHXs');
insert into users (username, password) values ('rblackster6', '4ZAhhFGDUQal');
insert into users (username, password) values ('ebyng7', 'Q2ujnRtXlAe7');
insert into users (username, password) values ('tbirkenshaw8', 'thIcitV');
insert into users (username, password) values ('jabele9', 'KcKuPU0lb');
      
drop table if exists tasks;
create table tasks (
id serial primary key,
description text,
due_date date default current_date,
status varchar(15) default 'new', -- whenever a record is created, value should be "new"
user_assigned_id integer references users(id)
);  
      
      

insert into tasks (description, user_assigned_id) values ('Networked encompassing complexity', 1);
insert into tasks (description, user_assigned_id) values ('Phased 4th generation internet solution', 2);
insert into tasks (description, user_assigned_id) values ('Down-sized zero administration standardization', 3);
insert into tasks (description, user_assigned_id) values ('Object-based multimedia core', 1);
insert into tasks (description, user_assigned_id) values ('Realigned didactic time-frame', 2);
insert into tasks (description, user_assigned_id) values ('Seamless fresh-thinking contingency', 3);
insert into tasks (description, user_assigned_id) values ('Front-line composite info-mediaries', 4);
insert into tasks (description, user_assigned_id) values ('Cross-group user-facing internet solution', 5);
insert into tasks (description, user_assigned_id) values ('Programmable intangible parallelism', 6);
insert into tasks (description, user_assigned_id) values ('Function-based even-keeled instruction set', 7);


create table payments(
paymentid serial primary key,
date date default current_date,
amount numeric not null,
)




drop table if exists customer;
create table Customer(
customerid  serial primary key not null,
Firstname varchar(20) ,
Lastname varchar(20) ,
Emailid varchar(20) ,
DOB  date,
Password varchar(20),
Phoneno  int ,
employeeid  int references employee(employeeid),
prodid int ,
 price  int,
  Qty int
);




drop table if exists Offers;
create table Offers(
Offerid  serial primary key not null,
prodid int references product(prodid),
customerid int  references  customer(customerid),
status varchar(20)
);


drop table if exists members;
create table if not exists members(
id serial primary key,
account_id serial,
user_name varchar(30) unique not null,
pass_word varchar(30) not null,
full_name varchar(30),
address varchar(30) not null,
phone_number varchar(40),
is_staff boolean,
fee varchar(4),
offerid int  references offers(offerid)

);













