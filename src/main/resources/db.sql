create DATABASE IF NOT EXISTS shopping;

create table Products (
        Code varchar(20) not null,
        Create_Date datetime not null,
        Image longblob,
        Name varchar(255) not null,
        Price double precision not null,
        primary key (Code)
    );


insert into Products (CODE, NAME, PRICE, CREATE_DATE) 
values ('S001', 'Item1', 50, '2013-01-01' );

insert into Products (CODE, NAME, PRICE, CREATE_DATE) 
values ('S002', 'Item2', 50, '2013-01-01' );

insert into Products (CODE, NAME, PRICE, CREATE_DATE) 
values ('S003', 'Item3', 50, '2013-01-01' );

 
