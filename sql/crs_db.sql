CREATE database crs_db;

-- Tạo bảng user
CREATE TABLE user (
    user_id INT PRIMARY KEY,
    user_role VARCHAR(50),
    user_firstname VARCHAR(50),
    user_midname VARCHAR(50),
    user_lastname VARCHAR(50),
    user_username VARCHAR(50),
    user_password VARCHAR(50),
    user_phone VARCHAR(50),
    user_email VARCHAR(50)
);

-- Chèn dữ liệu
INSERT INTO user VALUES 
(1,'ADMIN','Mai','Duc','Binh','admin','123','0943568797','tuantv797@gmail.com'),
(2,'FACULTY','Tran','Tien','Cong','cong','123','0943568857','congtt857@gmail.com'),
(3,'FACULTY','Tran','Dinh','Que','que','123','0943568515','quetd515@gmail.com'),
(4,'FACULTY','Nguyen','Manh','Ninh','ninh','123','0943568962','ninhnm962@gmail.com'),
(5,'FACULTY','Nguyen','Thuy','Quynh','quynh','123','0943568123','quynhnt123@gmail.com'),
(6,'STUDENT','Tran','Duc','Quan','quan','123','0943568727','quantd727@gmail.com'),
(7,'STUDENT','Duong','Tuan','Nam','nam','123','0943598197','namdt197@gmail.com'),
(8,'STUDENT','Tong','Viet','Hoang','hoang','123','0936568797','hoangtv797@gmail.com'),
(9,'STUDENT','Nguyen','Viet','Hung','hung','123','0949268797','hungnv797@gmail.com'),
(10,'STUDENT','Nguyen','Anh','Tu','tu','123','0944268797','tuna797@gmail.com'),
(11,'STUDENT','Nguyen','Dinh','Nam','nam','123','0954568797','namnd797@gmail.com'),
(12,'STUDENT','Tran','Quang','Hieu','hieu','123','0983568797','hieutq797@gmail.com');

drop table courses;

-- Tạo bảng course
CREATE TABLE courses (
    course_id VARCHAR(50) PRIMARY KEY,
    course_name VARCHAR(255),
    course_credits INT,
    course_maxStudents INT,
    course_location VARCHAR(50)
);

-- Chèn dữ liệu
INSERT INTO courses VALUES 
('CSCI-GA.2130','Compiler Construction',3,15,'A1'),
('CSCI-GA.2246','Open Source Tools',2,10,'A2'),
('CSCI-GA.2250','Operating Systems',3,15,'A3'),
('CSCI-GA.2433','Database Systems',4,15,'A4'),
('CSCI-GA.2440','Software Engineering',3,16,'A3'),
('CSCI-GA.2580','Web Search Engines',2,10,'A4'),
('CSCI-GA.3033','Special Topic: Big Data Science',4,25,'A2'),
('CSCI-UA.0002','Intro To Computer Programming',2,10,'A1'),
('CSCI-UA.0004','Intro to Web Design & Computer Principles',3,30,'A2'),
('CSCI-UA.0060','Database Design And Web Implementation',4,10,'A5');

ALTER TABLE user
RENAME TO users;

ALTER TABLE course
RENAME TO courses;

create table courses_faculty(
	course_id varchar(50) references courses(course_id),
    faculty_id int references users(user_id),
    primary key(course_id, faculty_id)
);

-- Chèn dữ liệu vào bảng courses_student
INSERT INTO courses_student (course_id, student_id) VALUES
('CSCI-GA.2246', 6),
('CSCI-GA.2433', 6),
('CSCI-GA.2433', 7),
('CSCI-GA.2433', 8),
('CSCI-GA.2433', 9),
('CSCI-GA.2580', 7),
('CSCI-GA.2580', 8),
('CSCI-UA.0002', 9),
('CSCI-UA.0004', 8);


create table courses_student(
	course_id varchar(50) references courses(course_id),
    student_id int references users(user_id),
    primary key(course_id, student_id)
);

-- Chèn dữ liệu vào bảng courses_faculty
INSERT INTO courses_faculty (course_id, faculty_id) VALUES
('CSCI-GA.2246', 2),
('CSCI-GA.2433', 2),
('CSCI-GA.2580', 3),
('CSCI-UA.0002', 5),
('CSCI-UA.0004', 3);





