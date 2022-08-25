
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

CREATE TABLE users(
                         userId   varchar(255) ,
                         userPw  varchar(255),
                         userName  varchar(255)   ,
                         userTel  varchar(255)  ,
                         userBirth   varchar(255)
);








