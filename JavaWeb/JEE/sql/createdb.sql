use test;
CREATE TABLE customer(
	firstname VARCHAR(30) NOT NULL,
    lastname VARCHAR(30) NOT NULL,
    custID INT UNSIGNED NOT NULL PRIMARY KEY);
    
CREATE USER "dbadmin"@"localhost" IDENTIFIED BY 'turtledove';
GRANT ALL privileges ON test.customer TO "dbadmin"@"localhost" IDENTIFIED BY 'turtledove';
