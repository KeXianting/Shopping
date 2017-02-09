create DATABASE IF NOT EXISTS shopping;
connect shopping;

create table products (
        id int(11) NOT NULL AUTO_INCREMENT,
        createdate datetime not null,
        image longblob,
        name varchar(255) not null,
        price double precision not null,
        primary key (id)
    );


insert into Products ( NAME, PRICE, CREATE_DATE) 
values ('Item1', 50, '2013-01-01' );

insert into Products ( NAME, PRICE, CREATE_DATE) 
values ('Item2', 50, '2013-01-01' );

insert into Products ( NAME, PRICE, CREATE_DATE) 
values ('Item3', 50, '2013-01-01' );

 
