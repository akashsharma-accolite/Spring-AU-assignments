create database taximgmtsystem;

use taximgmtsystem;

create table customer(cust_id varchar(20), cust_pwd varchar(20), cust_name varchar(50), cust_phno varchar(10), cust_location varchar(10) ,cust_rating integer(1));

create table taxi(car_name varchar(50), taxi_no varchar(50), td_id varchar(20));

create table taxi_driver(td_id varchar(20), td_pwd varchar(50), taxi_no varchar(50), td_phno varchar(10), td_location varchar(50), td_rating integer(1));

create table booking(booking_id varchar(20), cust_id varchar(20), td_id varchar(20), fare integer, taxi_no varchar(50));

alter table customer add primary key (cust_id);

alter table taxi add primary key (taxi_no);

alter table taxi_driver add primary key (td_id);

alter table booking add primary key(booking_id);

alter table taxi add foreign key (td_id) references taxi_driver(td_id);

alter table booking add foreign key(cust_id) references customer(cust_id);

alter table booking add foreign key(td_id) references taxi_driver(td_id);

alter table booking add foreign key(taxi_no) references taxi(taxi_no);  


SELECT * from booking where cust_id='101';

SELECT car_name from taxi where td_id='203';

SELECT * from customer natural join booking where cust_rating>=5 and fare>=150;

select max(td_rating)
from taxi_driver;  

SELECT td_id
from taxi_driver natural join booking
where td_rating<(select avg(cust_rating)
					from customer);
                                    
select max(cust_rating)
from customer;

select avg(td_rating)
from taxi_driver;

select sum(fare)
from booking
where td_id='201';