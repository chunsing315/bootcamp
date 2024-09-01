use db_bc2405p;

-- approach 1: subquery to join two tables)
-- limitations: cannot select the columns from the subquery
select *
from customers c
where exists (select 1 from orders o where o.customer_id = c.id); -- customers who ordered

select * from customers;
insert into customers values (4, 'benny', 'b@gmail.com');
-- join table style
-- without on the row number = a*b = 9 rows x 4 rows
-- on is to link the primary key to secondary key
select c.id,c.name,count(1) number_of_orders 
from customers c left join orders o on c.id = o.customer_id 
group by c.name, c.id order by count(1) desc;


-- left join + group by
-- count , right side instead of the rows on the left side 
-- count (c.id) <> count (o.id)
select c.id,c.name,count(o.id) number_of_orders, ifnull(max(total_amount),0) as max
from customers c left join orders o on c.id = o.customer_id 
group by c.name, c.id;

select c.id,c.name,count(o.id) number_of_orders, ifnull(max(total_amount),0) as max
from customers c left join orders o on c.id = o.customer_id -- and o.total_amount > 100
where (o.total_amount > 900.0 or 0.total_amount is null)
group by c.name, c.id
order by c.name asc;



select * from 

select * from customers;
select * from orders;

select * from customers c;
select * from orders;

select * from orders o where o.customer_id;

select * from orders;
update orders o 
set tran_date = date_format('2024-8-21','%Y-%m-%d')  where o.id = 1 ;
update orders o 
set tran_date = date_format('2024-4-21','%Y-%m-%d')  where o.id = 2 ;
update orders o 
set tran_date = date_format('2024-5-21','%Y-%m-%d')  where o.id = 6 ;
update orders o 
set tran_date = date_format('2021-2-21','%Y-%m-%d')  where o.id = 5 ;

select * from spiderverse;
update spiderverse o set weight = 100 where o.id = 5;

select * from orders order by id;
select distinct extract(month from tran_date)as mo from orders o;
select distinct extract(month from tran_date)as mo,o.* from orders o; -- distinct 2 columns;
select extract(month from tran_date) from orders o group by extract(month from tran_date);
select distinct concat_ws('-',extract(year from tran_date),extract(month from tran_date)),total_amount from orders; -- distinct 2 columns;
select distinct concat_ws('-',extract(year from tran_date),extract(month from tran_date)) from orders;
insert into orders  values (7,9999,3,Date_format('2024-08-04','%y-%m-%d'));

select o.*, (select max(total_amount) from orders	) from orders o ; -- meaningless
select o.*, 70000 from orders o ; -- as useless

select * 
from orders ;

-- subquery, 
-- first, select id from customers where name like "%Lau"
-- second, DBMS executes " select * from orders where customer_id in ... "
-- bad syntax, should use join, because the performance is poor. 	
select * ,'Wong' as remarks
from orders 
where customer_id in (select id from customers where name like "%Wong");

select id,'meow' from customers where name like "%Lau";
select * from customers;

-- there are two queries here. and there must be two.  you must know the average first before you can filter throught the avg
select * from orders
where total_amount <  (select avg(total_amount) from orders);

select avg(total_amount) as average_AMT from orders ;

--
insert into customers values (5, 'baby','baby@gmail.com');
delete from customers values id = 3;


-- Add primary kei
ALTER TABLE orders
ADD CONSTRAINT fk_customer_id
FOREIGN KEY (customer_id)
REFERENCES customers(id);

DELETE FROM orders
WHERE customer_id NOT IN (SELECT id FROM customers);



alter table orders add constraint pk_customer_id primary Key (id);
alter table customers add constraint pk_customer_id primary Key (id);
delete from orders where id = 7;



-- Other COnstraints: Unique Constraint
-- 1 table has only 1 PK
select * from customers;
select * from orders;
Delete from customers where id =2;

alter table customers add constraint unique_email unique (email);
alter table customers modify name varchar(50) not null;

insert into customers values(6,'who','baby@gmail.com'); -- error
use db_bc2405p;
select * from customers;
-- combine column

select 1 
from customers
union all
select 1 
from orders;

select 1 
from customers
union -- is distinct
select 1 
from orders;

(select name,email,id
from customers
union all
select id, total_amount, customer_id
from orders);

select * from players;

alter table players drop player_no;

alter table teams
add primary key (team_id);

alter table teams
drop column;

SHOW CREATE TABLE teams;

alter table teams
add constraint fk_TeamPlayer foreign key (player_no)
references players(player_no);

create table playerWeight (
	weight decimal(5,2),
    foreign key id
    