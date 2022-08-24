
CREATE TABLE schedule(
       date_num  int NOT NULL AUTO_INCREMENT,
       planeName   varchar(255)  ,
       start_time  varchar(255)   ,
       end_time  varchar(255)  ,
       departure   varchar(255)   ,
       arrival   varchar(255)  ,
    PRIMARY KEY(date_num)
);

insert into schedule(departure,arrival,planeName)
values ('JEJU', 'KWJ', 'name');

