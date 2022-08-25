
--CREATE TABLE schedule(
--       scheduleNum  int NOT NULL AUTO_INCREMENT,
--       planeName   varchar(255) ,
--       departureDate  varchar(255),
--       departureTime  varchar(255)   ,
--       arrivalTime  varchar(255)  ,
--       departure   varchar(255)   ,
--       arrival   varchar(255)  ,
--    PRIMARY KEY(scheduleNum)
--);

CREATE TABLE Plane (
   planeName   varchar2(30)   NULL,
   planeCompany   varchar2(30)   NULL
);

CREATE TABLE Schedule (
   scheduleNum   integer   NOT NULL AUTO_INCREMENT,
   planeName   varchar2(30)   NULL,
   departureDate   varchar2(30)   NULL,
   departureTime   varchar2(30)   NULL,
   arrivalTime   varchar2(30)   NULL,
   departure   varchar2(30)   NULL,
   arrival   varchar2(30)   NULL
);

CREATE TABLE Reservation (
   ticketNum   integer   NULL,
   scheduleNum   integer   NULL,
   planeName   varchar2(30)   NULL,
   ticketDate   varchar(200)   NULL,
   ticketPrice   integer   NULL,
   userId   varchar(200)   NULL
);

CREATE TABLE Seat (
   setNum   varchar2(30)   NULL,
   planeName   varchar2(30)   NULL,
   setGrade   varchar2(30)   NULL,
   setPrice   integer   NULL
);

CREATE TABLE ReservationSeat (
   reservatedSeat   varchar2(30)   NULL,
   setNum   varchar2(30)   NULL,
   planeName   varchar2(30)   NULL,
   passNum   integer   NULL,
   ticketNum   integer   NULL,
   scheduleNum   integer   NULL
);

CREATE TABLE users (
   userId   varchar(20)   NULL,
   userPw   varchar(20)   NULL,
   userName   varchar(10)   NULL,
   userTel   integer   NULL,
   userBirth   varchar(20)   NULL
);

CREATE TABLE Passenger (
   passNum   integer   NULL,
   ticketNum   integer   NULL,
   scheduleNum   integer   NULL,
   passTel   varchar2(200)   NULL,
   passName   varchar2(30)   NULL
);
