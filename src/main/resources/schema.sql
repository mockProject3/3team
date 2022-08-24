
CREATE TABLE schedule(
       scheduleNum  int NOT NULL AUTO_INCREMENT,
       planeName   varchar(255) ,
       departureDate  varchar(255),
       departureTime  varchar(255)   ,
       arrivalTime  varchar(255)  ,
       departure   varchar(255)   ,
       arrival   varchar(255)  ,
    PRIMARY KEY(scheduleNum)
);


insert into schedule(departure,arrival,planeName,departureDate, departureTime, arrivalTime)
values ('GMP', 'CJU', 'OZ8901', '2022-08-24', '06:05', '07:15');

insert into schedule(departure,arrival,planeName,departureDate, departureTime, arrivalTime)
values ('GMP', 'CJU', 'OZ8023', '2022-08-24', '18:45', '19:55');



