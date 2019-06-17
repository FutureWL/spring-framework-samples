create table if not exists student
(
    ID   int auto_increment
        primary key,
    NAME varchar(20) not null,
    AGE  int         not null
);

