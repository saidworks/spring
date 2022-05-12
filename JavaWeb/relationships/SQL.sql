SELECT * FROM Student;
SELECT * FROM Student_Gfg_Detail;

CREATE TABLE department(
	dept_id int NOT NULL auto_increment PRIMARY KEY,
	dept_name varchar(255)
    );

DROP TABLE IF EXISTS TeacherM;
 CREATE TABLE TeacherM(
	id int NOT NULL auto_increment,
    salary varchar(255),
    dept_id int,
    Primary key(id),
   CONSTRAINT FK_TeacherDept FOREIGN KEY (dept_id)
    REFERENCES department(dept_id)
);

ALTER TABLE TeacherM
DROP CONSTRAINT FK_TeacherDept; 

ALTER TABLE teacherM
add name varchar(255);

ALTER TABLE teacherM
RENAME COLUMN name TO teacher_name;

SELECT *
FROM teacherM;
SELECT *
FROM department;