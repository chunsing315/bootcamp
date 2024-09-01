-- comment
-- database -> table(row x c)
use db_bc2405p;
create table customers ( -- table name is unique
	id int unique,
    name varchar(50),
    email varchar(50)
);

-- insert into table_name (column1 name, ...) values(column1 value, ...)
insert into customers (id,name,email) values (1,'John Lau','john@gmail.com');
insert into customers (id,name,email) values (2,'Peter Wong','peter@gmail.com');

-- select. * is all columns
-- where: condition
select * from customers;
select * 
from customers
where id = 2;

select * 
from customers
where id = 1 and id = 2 ; -- no data match

select id 
from customers
where id >= 3
order by id;    

insert into customers (id,name,email) values (3,'Jenny Chan','jenny@gmail.com');

delete from customers where id = 2;

-- for testing
-- two database for testing

create table students (
	id integer unique,
    name varchar(20),
    weight numeric(5,2), -- ( 5p , 2 dp)
    height numeric(5,2)
);

alter table students rename column heigt to height;

insert into students (name, id, weight, height)
	values ("Peter Parker",1, 94.2, 1.82);

insert into students (name, id, weight, height)
	values ("Mary Jane",2, 60.2, 1.67);
insert into students (name, id, weight, height)
	values ("Harry Osbourn",3, 84.2, 1.88);
insert into students (name, id, weight, height)
	values ("Spiderpig",4, 40.2, 1.37);
select * from students group by subject;

alter table students add column subject varchar(20);

update students
set subject = 'CHEM'
where id = 3;
