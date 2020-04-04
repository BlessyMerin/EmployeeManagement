drop database group_10_db;
CREATE DATABASE  IF NOT EXISTS `group_10_db`;
use `group_10_db`;

create table employee_management(
employee_id int(10) primary key,
firstName varchar(50),
lastName varchar(50),
mail_id varchar(50),
contact_number varchar(11),
gender varchar(10),
age int,
job_location varchar(20),
Business_Unit varchar(20),
project_id int,
Job_title varchar(20),
DateOfJoining date,
Salary double(7,2));

select * from employee_management;

