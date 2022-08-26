CREATE TABLE Plane
(
    planeName    varchar2(30) NULL,
    planeCompany varchar2(30) NULL
);

CREATE TABLE Schedule
(
    scheduleNum   int NOT NULL AUTO_INCREMENT,
    planeName     varchar(255),
    departureDate varchar(255),
    departureTime varchar(255),
    arrivalTime   varchar(255),
    departure     varchar(255),
    arrival       varchar(255),
    PRIMARY KEY (scheduleNum)
);

CREATE TABLE Reservation
(
    ticketNum   integer      NULL,
    scheduleNum integer      NULL,
    planeName   varchar2(30) NULL,
    ticketDate  varchar(200) NULL,
    ticketPrice integer      NULL,
    userId      varchar(200) NULL
);

CREATE TABLE Seat
(
    setNum    varchar2(30) NULL,
    planeName varchar2(30) NULL,
    setGrade  varchar2(30) NULL,
    setPrice  integer      NULL
);

CREATE TABLE ReservationSeat
(
    reservatedSeat varchar2(30) NULL,
    setNum         varchar2(30) NULL,
    planeName      varchar2(30) NULL,
    passNum        integer      NULL,
    ticketNum      integer      NULL,
    scheduleNum    integer      NULL
);


CREATE TABLE Passenger
(
    passNum     integer       NULL,
    ticketNum   integer       NULL,
    scheduleNum integer       NULL,
    passTel     varchar2(200) NULL,
    passName    varchar2(30)  NULL
);
CREATE TABLE users
(
    userId    varchar(20) NULL,
    userPw    varchar(20) NULL,
    userName  varchar(10) NULL,
    userTel   integer     NULL,
    userBirth varchar(20) NULL
);

CREATE TABLE t_board
(
    board_id   INT AUTO_INCREMENT COMMENT '글 번호',
    title      VARCHAR(300) COMMENT '제목',
    contents   TEXT COMMENT '내용',
    hit_cnt    SMALLINT    DEFAULT '0' COMMENT '조회수',
    created_At DATETIME COMMENT '작성시간',
    creator_id VARCHAR(50) COMMENT '작성자',
    updated_At DATETIME    DEFAULT NULL COMMENT '수정시간',
    updater_id VARCHAR(50) DEFAULT NULL COMMENT '수정자',
    is_deleted CHAR(1)     DEFAULT 'N' COMMENT '삭제 여부',
    PRIMARY KEY (board_id)
);

CREATE TABLE Surveys
(
    idx integer AUTO_INCREMENT,
    q1  integer       NULL,
    q2  integer       NULL,
    q3  integer       NULL,
    q4  integer       NULL,
    q5  integer       NULL,
    q6  varchar2(200) NULL,
    q7  varchar2(200) NULL
);
