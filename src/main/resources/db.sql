create DATABASE IF NOT EXISTS shopping;
connect shopping;


create table users (
        id int(11) NOT NULL AUTO_INCREMENT,
        username varchar(255) not null,
 	password varchar(255) not null,
	createdate datetime not null,
        image longblob,
        name varchar(255) not null,
	surname varchar(255) not null,
        auth int ,
        primary key (id)
    );

insert into users ( username,password,createdate,name,surname,auth) 
values ('user1', '123', '2017-01-01','Emre','Eren','1' );

insert into users ( username,password,createdate,name,surname,auth) 
values ('admin', '123', '2017-01-01','ADMIN','bigboss','2' );

create table products (
        id int(11) NOT NULL AUTO_INCREMENT,
        createdate datetime not null,
        image longblob,
        name varchar(255) not null,
        price double precision not null,
	description varchar(255) not null,
        primary key (id)
    );


insert into products ( name, price, createdate,description) 
values ('Item1', 50, '2013-01-01','First item has very good quality.' );

insert into products ( name, price, createdate,description) 
values ('Item2', 150, '2014-01-01','Second item is exported from Turkey where best rice are grown');

insert into Products ( name, price, createdate,description) 
values ('Item3', 250, '2015-01-01','Third item is limited so hurry up!' );

 
