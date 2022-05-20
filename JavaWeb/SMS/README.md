# Welcome to SYSTEM MANAGEMENT SCHOOL!

This app allow students to manage their courses registration after they login with their credentials

before running the app please:

1.  Create a database with name "sms" using your RDBMS

2.  In the hibernate.cfg.xml file please
    a. Modify the user, password with your RDBMS user and password
    b. Modify RDBMS dialect and driver if you are not using mariadb, as well as the port as the app is using 1234 (MYSQL/Mariadb by default uses 3306)

3.  Create the tables by running the following class:

         /SMS/src/main/java/com/perscholas/jpa/SMS/App.java

4.  Insert the data from the database using the fake students and courses by running this two scripts in the SMS database:

    > Student.sql
    > Course.sql

5.  Please start the app by running the SMSRunner class from Eclipse Project Explorer:
    /SMS/src/main/java/com/perscholas/jpa/mainrunner/SMSRunner.java
