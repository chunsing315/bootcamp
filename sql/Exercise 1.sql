create database bootcamp_exercise1;

use bootcamp_exercise1;

-- 1

create table regions (
	region_id int primary key ,
    region_name varchar(25)
);
create table countries (
	country_id char(2) primary key ,
    country_name varchar(40),
    region_id int,
    foreign key (region_id) references regions(region_id)
);

create table locations (
	location_id int primary key ,
    street_address varchar(25),
    postal_code varchar(12),
    city varchar(30),
    state_province varchar(12),
    country_id char(2),
    foreign key (country_id) references countries(country_id)
);
create table departments (
	department_id int primary key ,
    department_name varchar(20),
    manager_id int,
    location_id int,
    foreign key (location_id) references locations(location_id)
);
create table jobs(
	job_id varchar(10) primary key,
    job_title varchar(35),
    min_salary int,
    max_salary int
);
create table job_history (
	employee_id int ,
    start_date date ,
    end_date date ,
    job_id varchar(10) ,
    department_id int,
    foreign key (job_id) references jobs (job_id) , 
    foreign key (department_id) references departments(department_id),
    CONSTRAINT PK_employee_start PRIMARY KEY (employee_id,start_date)
);

create table employees (
	employee_id int primary key ,
    first_name varchar(20),
    last_name varchar(25),
    email varchar(25),
    phone_number varchar(25),
    hire_date date, 
    job_id varchar(10),
    salary int,
    commission_pct int,
    manager_id int,
    department_id int,
    foreign key (department_id) references departments(department_id),
    foreign key (job_id) references jobs(job_id)
);

create table job_grades (
	grade_level varchar(2) primary key,
    lowest_sal int,
    highest_sal int
);

create table job_grades_better (
	grade_level varchar(2) primary key,
    jobs_id varchar(10),
    foreign key (jobs_id) references jobs(job_id)
);

-- 2 

insert into regions (region_id,region_name)
values 
(1,'EMEA'),
(2,'NA'),
(3,'APAC');

insert into countries (country_id,country_name,region_id)
values 
('DE','Germany',1),
('IT','Italy',1),
('JP','Japan',3),
('US','United State',2);


insert into locations (location_id,postal_code,street_address,city,state_province,country_id)
values 
(1000,1297,'Via Cola Di Rie,989','Roma',null,'IT'),
(1100,93091,'Calle della Te','Venice',null,'IT'),
(1200,2017,'Shinjuku-ku','Tokyo','Tokyo','JP'),
(1400,2014,'Jabberwocky Rd','Southlake','Texas','US');

insert into departments (department_id,department_name, manager_id,location_id)
values
(10,'Administration',200,1100),
(20,'Marketing',201,1200),
(30,'Purchasing',202,1400);


insert into jobs(job_id,job_title,min_salary,max_salary)
values
('IT_Prog','IT programer',17000,30000),
('MK_REP','Market Representative',9000,29000),
('ST_Clerk','Clerk',15000,24000),
('Man','Management',30000,60000);

insert into job_history (employee_id, start_date,end_date,job_id,department_id)
values
(102,'1993-01-13','1998-07-24','IT_Prog',20),
(101,'1989-09-21','1993-10-27','MK_REP',10),
(101,'1993-10-28','1998-07-24','MK_REP',30),
(100,'1996-02-17','1999-12-19','ST_Clerk',30),
(103,'1998-03-24','1999-12-31','MK_REP',20);

insert into employees (employee_id,first_name,last_name,email,phone_number,hire_date,job_id,salary,commission_pct,manager_id,department_id)
value
(100,'Steven','King','Sking','515-1234567','1987-06-17','ST_clerk',24000,0,109,10),
(101,'Neena','Kochha','NKOCHHAR','515-1234568','1987-06-18','MK_rep',17000,0,103,20),
(102,'Lex','De Haan','LDEHAAN','515-1234569','1987-06-19','IT_prog',17000,0,108,30),
(103,'Alexander','Hunold','AHUNOLD','590-4234567','1987-06-20','mk_rep',9000,0,105,20),
(105,'Peter','Field','PFIELD','590-4234567','1986-01-20','mk_rep',30000,0,null,20),
(109,'Sammy','Law','SLAW','590-4234566','1986-06-20','st_clerk',39000,0,null,10),
(200,'april','lau','Lapril','123-555275','1977-01-20','Man',50000,0,null,10),
(201,'May','Chan','mchan','123-555276','1977-01-20','Man',50000,0,null,20),
(202,'June','Ho','jho','123-555279','1977-01-20','Man',50000,0,null,30);


-- 3. 
select l.location_id,l.street_address,l.city,l.state_province,c.country_name
from locations l inner join countries c on l.country_id = c.country_id;

-- 4.
select first_name,last_name,department_id 
from employees;

-- 5.
select e.first_name,e.last_name, e.department_id
from employees e 
inner join departments d on e.department_id = d.department_id
inner join locations l on d.location_id = l.location_id
inner join countries c on l.country_id = c.country_id
where c.country_name = 'Japan';

-- 6.
select e.employee_id, e.last_name, e.manager_id, manager.last_name as manager_last_name
from employees manager inner join employees e on manager.employee_id = e.manager_id;

-- 7.
select e.first_name,e.last_name, e.hire_date
from employees e 
where hire_date > 
	(select e.hire_date from employees e 
	where e.last_name = 'De Haan' and
    e.first_name = 'Lex');
    
-- 8.
select d.department_name, count(1) 
from employees e inner join departments d on e.department_id = d.department_id
group by department_name;

-- 9.
select h.employee_id, j.job_title,h.start_date,h.end_date, datediff(h.end_date,h.start_date) as Days_diff_end_start
from job_history h inner join jobs j on h.job_id = j.job_id
where h.department_id = 30;

-- 10.
select 
	d.department_name, 
    concat_ws(' ',e.first_name, e.last_name) as manager_name,
    l.city,
    c.country_name
from departments d inner join employees e on d.manager_id = e.employee_id
inner join locations l on d.location_id = l.location_id
inner join countries c on c.country_id = l.country_id;

-- 11
select d.department_name,concat('$',format(round(avg(e.salary),-1),0)) as average_sal
from employees e
inner join departments d on e.department_id = d.department_id
group by e.department_id;

-- 12.
select j.job_id, max(e.salary) as MAX_SALARY,min(e.salary) as MIN_SALARY
from employees e inner join jobs j on e.job_id = j.job_id
group by e.job_id;


-- insert into job_grades_better (jobs_id,grade_level)
-- values
-- ('IT_Prog','02'),
-- ('MK_REP','03'),
-- ('ST_Clerk','01'),
-- ('Man','04');

-- select j.grade_level,max(e.salary) As Highest_Sal,min(e.salary) As Lowest_Sal
-- from job_grades_better j left join employees e on j.jobs_id = e.job_id
-- group by j.grade_level;
