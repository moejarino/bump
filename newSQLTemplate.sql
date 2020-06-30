drop database if exists bumpDB;
create database bumpDB;

use bumpDB;

create table compound_interval(
compound_interval_id int primary key,
`interval` varchar(20)
);

create table borrow_request(
borrow_request_id int primary key auto_increment,
interest decimal,
start_date date not null,
payback_date date not null,
annual_interest_rate decimal not null,
principal numeric not null,
compound_interval int not null,
accepted boolean not null,
completed boolean not null,
foreign key (compound_interval) references compound_interval(id));


create table lend_proposal(
lend_proposal_id int primary key auto_increment,
interest decimal,
start_date date not null,
payback_date date not null,
annual_interest_rate decimal not null,
principal numeric not null,
compound_interval int not null,
accepted boolean not null,
completed boolean not null,
foreign key (compound_interval) references compound_interval(id));


create table `account`(
account_id INT primary key auto_increment,
borrow_id INT null,
lend_id INT null,
balance numeric not null,
bank_acct char(10) not null,
foreign key (`borrow_id`) references borrow_request(id),
foreign key (`lend_id`) references lend_proposal(id));

create table `user`(
user_id int primary key auto_increment,
username varchar(30) not null unique,
`password` varchar(100) not null,
firstName varchar(30) not null,
lastName varchar(30) not null,
enabled boolean not null,
account_id int null,
foreign key (account_id) references `account`(id)
);

create table `role`(
role_id int primary key auto_increment,
`role` varchar(30) not null
);

create table user_role(
user_id int not null,
role_id int not null,
primary key(user_id, role_id),
foreign key (`user_id`) references `user`(id),
foreign key (`role_id`) references `role`(id));

insert into compound_interval(id, `interval`)
	values
    (1, "Yearly"),
    (2, "Semi-Annually"),
    (4, "Quarterly"),
    (12, "Monthly");
		
insert into borrow_request(id, interest, start_date, payback_date, annual_interest_rate, principal, compound_interval, accepted, completed)
	values(1, 0, '2015-04-13', '2015-12-31', 6, 1000, 4, true, false);
    
insert into lend_proposal(id, interest, start_date, payback_date, annual_interest_rate, principal, compound_interval, accepted, completed)
	values(1, 0, '2015-06-13', '2015-10-31', 8, 1000, 4, true, false);

insert into `account`(id, borrow_id, lend_id, balance, bank_acct)
	values(1, 1, null, 500.00, 1234567890);

insert into `user`(id, username,`password`, firstName,
lastName, enabled, account_id)
    values(1, "admin", "password", "Mr.", "Admin", true, null),
          (2, "joemarino", "password", "Joseph", "Marino", true, 1);

insert into `role`(id,`role`)
    values(1,"ROLE_ADMIN"), (2,"ROLE_USER");
    
insert into user_role(user_id, role_id)
    values(1,1),(1,2),(2,2);
    

    
    