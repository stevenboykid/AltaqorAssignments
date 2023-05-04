  CREATE DATABASE QASample
USE QASample

Go
CREATE TABLE Driver_Details
	(
	DriverID INT IDENTITY (1,1) NOT NULL,
	FirstName VARCHAR(45) NOT NULL,
	MiddleName VARCHAR(45) NOT NULL,
	LastName VARCHAR(45) NOT NULL,
	City VARCHAR (45) NOT NULL,
	[State] VARCHAR(45) NOT NULL,
	Country VARCHAR (45) NOT NULL,
	Address1 VARCHAR (45) NOT NULL,
	Enrolment_Option_Date DATE,
	CONSTRAINT PK_DriverID PRIMARY KEY (DriverID)
	)
GO 
SELECT * FROM Driver_Details
GO

CREATE TABLE Driver_Details
	(
	DriverID INT IDENTITY (1,1) NOT NULL,
	FirstName VARCHAR(45) NOT NULL,
	MiddleName VARCHAR(45) NOT NULL,
	LastName VARCHAR(45) NOT NULL,
	City VARCHAR (45) NOT NULL,
	[State] VARCHAR(45) NOT NULL,
	Country VARCHAR (45) NOT NULL,
	Address1 VARCHAR (45) NOT NULL,
	Enrolment_Option_Date DATE,
	CONSTRAINT PK_DriverID PRIMARY KEY (DriverID)
	)
GO 
SELECT * FROM Driver_Details
GO

--INSERT INTO Driver_Details
--SELECT 'Dinesh','Jung','Rana','Kalanki','Kathmandu','Nepal','Kalanki KashiBazar ', '2023-07-07'
--UNION ALL
--SELECT 'Amit','Kumar','Shrestha','Tandi','Chitwan','Nepal','SaurahaChock Tandi ', '2023-08-11'
--UNION ALL
--SELECT 'Hari','Kala','Tamang','LakeSide','Pokhara','Nepal','LakeSide Baidam', '2023-05-10'
--UNION ALL
--SELECT 'John','Abraham','Khan','Irving','Texas','USA','145 BeerCreeck Park', '2023-06-05'
Go
--Example 1#
SELECT	DriverID,
		FirstName,
		Enrolment_Option_Date
FROM Driver_Details
WHERE FirstName like '%am'
GO
SELECT	DriverID,
		FirstName,
		Enrolment_Option_Date
FROM Driver_Details
WHERE FirstName like 'am%'
GO
--Example 2#
	SELECT * FROM Driver_Details
	WHERE Address1 LIKE 'ka%' Or Address1 LIKE '%rk'
GO
--Example 3#
UPDATE	Driver_Details
SET		FirstName ='Suresh',
		LastName ='Dhami',
		Address1 = '345 Fair Oaks Blvd'
WHERE	DriverID = 3 
GO
--Example 4#
UPDATE  Driver_Details
SET		City='Pokhara'
WHERE	Country='Nepal'
GO
--Example 5#
DELETE Driver_Details
WHERE FirstName ='Ram'
Go
--Example 6#
DELETE	Driver_Details 
WHERE	FirstName='Shyam' and LastName='Dahal'
Go
--Example 7#
SELECT * FROM  Driver_Details
WHERE DriverID BETWEEN 3 AND 6
GO
--Example 8#
SELECT MIN(Enrolment_Option_Date) AS "Inrollment Date"
FROM Driver_Details
GO
--Example 9#
SELECT Max(Enrolment_Option_Date) AS "Inrollment Date"
FROM Driver_Details
GO
--Example 10#
SELECT	SUM(DriverID) AS "Total Number of Drivers"
FROM	Driver_Details
Go
--Example 11#
--Example 12#
GO
--Example 13#
SElECT	FirstName,MiddleName,LastName
FROM	Driver_Details
WHERE DriverID=(SELECT MAX(DriverID) FROM Driver_Details) 

Go
--Example 1#
SELECT	DriverID,
		FirstName,
		Enrolment_Option_Date
FROM Driver_Details
WHERE FirstName like '%am'
GO
SELECT	DriverID,
		FirstName,
		Enrolment_Option_Date
FROM Driver_Details
WHERE FirstName like 'am%'
GO
--Example 2#
	SELECT * FROM Driver_Details
	WHERE Address1 LIKE 'ka%' Or Address1 LIKE '%rk'
GO
--Example 3#
UPDATE	Driver_Details
SET		FirstName ='Suresh',
		LastName ='Dhami',
		Address1 = '345 Fair Oaks Blvd'
WHERE	DriverID = 3 
GO
--Example 4#
UPDATE  Driver_Details
SET		City='Pokhara'
WHERE	Country='Nepal'
GO
--Example 5#
DELETE Driver_Details
WHERE FirstName ='Ram'
Go
--Example 6#
DELETE	Driver_Details 
WHERE	FirstName='Shyam' and LastName='Dahal'
Go
--Example 7#
SELECT * FROM  Driver_Details
WHERE DriverID BETWEEN 3 AND 6
GO
--Example 8#
SELECT MIN(Enrolment_Option_Date) AS "Inrollment Date"
FROM Driver_Details
GO
--Example 9#
SELECT Max(Enrolment_Option_Date) AS "Inrollment Date"
FROM Driver_Details
GO
--Example 10#
SELECT	COUNT(DriverID) AS "Total Number of Drivers"
FROM	Driver_Details
Go
--Example 11# Number of Driver having DriverID less than 4.
SELECT COUNT(DriverID) 
FROM Driver_Details
WHERE DriverID<4
GO
--Example 12# Number of Driver having DriverID Greater than 4.
SELECT COUNT(DriverID) 
FROM Driver_Details
WHERE DriverID>4
GO
--Example 13#
SElECT	FirstName,MiddleName,LastName
FROM	Driver_Details
WHERE DriverID=(SELECT MAX(DriverID) FROM Driver_Details) 
GO
--Example 14# Write a SQL query to display the columns in specific order such as driver_id and enrollment_optin_date. (asc, desc) 
SELECT * FROM Driver_Details
ORDER by	DriverID Desc, 
			Enrolment_Option_Date asc
GO 

--Example 15# Write a SQL query to display top 5 records in descending order of driver_id.  
SELECT TOP	5*
FROM	Driver_Details
ORDER BY	DriverID Desc
 GO

--Example 16# Write a SQL query to find the details of driver_detials whose lastname is ‘Shrestha’. Return driver_id, firstname,middlename and lastname. 
SELECT	DriverID,
		FirstName,
		MiddleName,
		LastName
FROM Driver_Details
WHERE LastName='Shrestha'
GO

--Example 17# Write a SQL statement to insert a record in the driver_details table and make sure you inserted null values in address and email fields. (Insert at last 5 records) 
--1st following Syntax help to add a new column named EmailID in Table.
ALTER Table Driver_Details
ADD EmailID NVARCHAR(20)
GO
INSERT INTO Driver_Details(DriverID,FirstName,LastName,City,[State],Country,Address1,Enrolment_Option_Date,EmailID)
VALUES(11,'Padam','Kumar','Nepal','Pokhara','Kaski','Nepal','LakeSide Pokhara','2023-05-30')
--Above inserted commoand is not work as we use autoincrement IDENTITY ID Colunn at the time of crating Driver_Details Table. So lets use following different command.
INSERT INTO Driver_Details
SELECT 'Ram','Kishor','Yadab','Pokhara','Kaski','Nepal','LakeSide Pokhara','2023-05-15',null
GO
INSERT INTO Driver_Details
VALUES ('Hari','Maya','Tamang','Nayabazar','Kathmandu','Nepal',Null,'2023-05-05',Null)

--Example 18# Write SQL query to find the details of driver whose email and address is null. Return driver_id, firstname,middlename and lastname. 
SELECT	DriverID,
		FirstName,
		MiddleName 
FROM	Driver_Details
WHERE EmailID IS NULL and Address1 IS NULL
