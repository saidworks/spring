-- SELECT * FROM Student;
-- SELECT * FROM Student_Gfg_Detail;
-- DROP TABLE IF EXISTS department;
-- CREATE TABLE department(
-- 	dept_id int NOT NULL auto_increment PRIMARY KEY,
-- 	dept_name varchar(255)
--     );

-- DROP TABLE IF EXISTS TeacherM;
--  CREATE TABLE TeacherM(
-- 	id int NOT NULL auto_increment,
--     salary varchar(255),
--     dept_id int,
--     Primary key(id),
--    CONSTRAINT FK_TeacherDept FOREIGN KEY (dept_id)
--     REFERENCES department(dept_id)
-- );
-- -- --drop/add auto increment
-- SET FOREIGN_KEY_CHECKS=0;
-- alter table teacherm modify column id int(11) not null auto_increment;
-- SET FOREIGN_KEY_CHECKS=1;

--  
-- ALTER TABLE TeacherM
-- DROP CONSTRAINT FK_TeacherDept; 

-- ALTER TABLE teacherM
-- add name varchar(255);

-- ALTER TABLE teacherM
-- RENAME COLUMN name TO teacher_name;

SELECT *
FROM teacherM;
SELECT *
FROM department;student_coursestudent_course