

 create table  Sales(
             
SalesPersonid  serial primary key ,
SalesPersonName   varchar(50) 

);


insert into Sales (SalesPersonName)
values ('mike'),('Jhon'),('Deborah');

create table SalesofficeAdress(
 Adressid  serial,
 street  varchar(20)  ,
 city  varchar(20) ,
 state  char(10) ,
 zip    int  ,
 Empid  int 
 
 --CONSTRAINT  fk_Empid  FOREIGN KEY(Empid) REFERENCES Employee(Employeeid)




);

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


create table Employee(
Employeeid serial ,
Fname varchar(10),
Lname varchar(10),
age  int ,
DOB date);


