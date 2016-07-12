create table User (
    userId integer not null auto_increment,
    password varchar(255),
    userName varchar(255),
    wifeId integer,
    primary key (userId)
) default charset=utf8 engine=innodb;

create table Wife (
    wifeId integer not null auto_increment,
    wifeName varchar(255),
    primary key (wifeId)
) default charset=utf8 engine=innodb;

alter table User 
    add index FK285FEB30D3E91D (wifeId), 
    add constraint FK285FEB30D3E91D 
    foreign key (wifeId) 
    references Wife (wifeId);