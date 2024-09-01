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

-- DML (Manipulate)
insert into students (name, id, weight, height)
	values ("Mary Jane",2, 60.2, 1.67);
insert into students (name, id, weight, height)
	values ("Harry Osbourn",3, 84.2, 1.88);
insert into students (name, id, weight, height)
	values ("Spiderpig",4, 40.2, 1.37);
select * from spiderverse ;

alter table students add column subject varchar(20);
update students
set subject = 'CHEM'
where id = 3;

insert into spiderverse values (5,'Steven Wong',null, 174.3,"CHI");

-- DDL (Data Definition Language structure, create table, add column)alter
-- e.g. create/ drop table / add/drop column, modify column definition. modify definition varchar(50) -> varchar(49)
-- DML: insert row, update column, delete row, truncate table (remove all data)

select weight + higher as ABC, weight, height, id, name from spiderverse;

Select * from spiderverse group by subject, 

Select * from spiderverse where id not in (1,3);
select * from spiderverse where name like '%ker';
select * from spiderverse where name not like '%ker';
select * from spiderverse where weight is null or height is null;
select char_length(s.name) as name_char_length, s.* from spiderverse s;

create table orders (
	id integer unique,
    total_amount numeric(13,2),
    customer_id integer
);

select * from orders;
insert into orders values (1, 2005.1,2);
insert into orders values (2, 2005.1,2);
insert into orders values (3,999.9,1);

select sum(o.total_amount) from orders o;
select avg(o.total_amount) from orders o where customer_id = 2;
select min(o.total_amount) from orders o;
-- filter first then min max; order of function present
select max(o.total_amount) as max ,min(o.total_amount) as min,avg(o.total_amount)as avg, count(o.total_amount) as count from orders o where customer_id = 2;
select max(o.total_amount) as max ,min(o.total_amount) as min,avg(o.total_amount)as avg, count(*) as count from orders o where customer_id = 2;
select max(o.total_amount) as max ,min(o.total_amount) as min,avg(o.total_amount)as avg, count(1) as count from orders o where customer_id = 2;

select o.*,'1' as AddNumber, 'hello' as AddString from orders o;

-- why can we put all in one statement? because they are aggregate function. a comprehensive result. aggregated from all data
-- e.g. max, min, count, avg. 
-- error below: (combine aggregate function and results)
select o.total_amount, sum(o.total_amount) from orders o; -- err
select o.total_amount from orders o;
select sum(o.total_amount) from orders o;

-- group by
select o.customer_id, sum(o.total_amount)as sum ,avg(o.total_amount),max(o.total_amount)  from orders o 
group by customer_id
order by o.customer_id asc;

-- sequence: 1. group by 2. having
select o.customer_id, sum(o.total_amount)as sum ,avg(o.total_amount),max(o.total_amount)  from orders o 
group by customer_id
having customer_id =2
order by o.customer_id asc;


-- filter, after grouping, another grouping
select avg(o.total_amount)as avg,o.customer_id 
from orders o 
where o.customer_id in (2,3)
group by o.customer_id 
having avg>2500 or avg <2400
order by o.customer_id ;

select * from orders;

insert into orders values (4,10000,3);
insert into orders values (5,20000,3);
insert into orders values (6,70000,3);