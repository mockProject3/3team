
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

<<<<<<< HEAD
CREATE TABLE plane (
	planeName	varchar2(30)	NULL,
	planeCompany	varchar2(30)	NULL
=======
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

CREATE TABLE users(
                         userId   varchar(255) ,
                         userPw  varchar(255),
                         userName  varchar(255)   ,
                         userTel  varchar(255)  ,
                         userBirth   varchar(255)

);

CREATE TABLE schedule (
	scheduleNum integer   NOT NULL AUTO_INCREMENT,
	planeName	varchar2(30)	NULL,
	departureDate	varchar2(30)	NULL,
	departureTime	varchar2(30)	NULL,
	arrivalTime	varchar2(30)	NULL,
	departure	varchar2(30)	NULL,
	arrival	varchar2(30)	NULL
);

CREATE TABLE reservation (
	ticketNum	integer	NULL,
	scheduleNum	integer	NULL,
	planeName	varchar2(30)	NULL,
	ticketDate	varchar(20)	NULL,
	ticketPrice	integer	NULL,
	userId	varchar(20)	NULL
);

CREATE TABLE seat (
	setNum	varchar2(30)	NULL,
	planeName	varchar2(30)	NULL,
	setGrade	varchar2(30)	NULL,
	setPrice	integer	NULL
);

CREATE TABLE reservationSeat (
	reservatedSeat	varchar2(30)	NULL,
	setNum	varchar2(30)	NULL,
	planeName	varchar2(30)	NULL,
	passNum	integer	NULL,
	ticketNum	integer	NULL,
	scheduleNum	integer	NULL

);

CREATE TABLE users (
	userId	varchar(20)	NULL,
	userPw	varchar(20)	NULL,
	userName	varchar(10)	NULL,
	userTel	integer	NULL,
	userBirth	varchar(20)	NULL
);

CREATE TABLE passenger (
	passNum	integer	NULL,
	ticketNum	integer	NULL,
	scheduleNum	integer	NULL,
	passTel	varchar2(30)	NULL,
	passName	varchar2(30)	NULL
);

--비행일정 GMP 김포, CJU 제주, ICN 인천, KWJ 광주, USN 울산, MWX 무안, PUS 부산/김해, USN 울산
insert into schedule(departure,arrival,planeName,departureDate, departureTime, arrivalTime)
values ('GMP', 'CJU', 'OZ8901', '2022-08-20', '08:10', '20:30');

<<<<<<< HEAD
insert into schedule(departure,arrival,planeName,departureDate, departureTime, arrivalTime)
values ('GMP', 'CJU', 'OZ7901', '2022-08-24', '06:05', '07:15');

insert into schedule(departure,arrival,planeName,departureDate, departureTime, arrivalTime)
values ('GMP', 'CJU', '1A7777', '2022-08-24', '07:10', '09:11');

insert into schedule(departure,arrival,planeName,departureDate, departureTime, arrivalTime)
values ('GMP', 'CJU', '1A7777', '2022-08-24', '09:40', '10:20');

insert into schedule(departure,arrival,planeName,departureDate, departureTime, arrivalTime)
values ('GMP', 'CJU', 'OZ7901', '2022-08-24', '11:05', '13:15');

insert into schedule(departure,arrival,planeName,departureDate, departureTime, arrivalTime)
values ('GMP', 'CJU', '5C3300', '2022-08-24', '15:05', '17:15');

insert into schedule(departure,arrival,planeName,departureDate, departureTime, arrivalTime)
values ('CJU', 'GMP', 'OY8025', '2022-08-14', '18:45', '19:55');

insert into schedule(departure,arrival,planeName,departureDate, departureTime, arrivalTime)
values ('ICN', 'CJU', '1A7777', '2022-08-30', '11:05', '15:15');

insert into schedule(departure,arrival,planeName,departureDate, departureTime, arrivalTime)
values ('USN', 'ICN', '5C3300', '2022-09-10', '10:05', '13:15');



--비행기 종류
insert into plane(planeName,planeCompany) values ('OZ8901', 'ASIANA');
insert into plane(planeName,planeCompany) values ('1A7777', 'ASIANA');
insert into plane(planeName,planeCompany) values ('OY8025', 'ASIANA');
insert into plane(planeName,planeCompany) values ('5C3300', 'ASIANA');

--유저 더미
insert into users(userId, userPw, userName, userTel, userBirth)
values ('siwan','siwan', 'MinSiwan', '01012341234', '830101');

