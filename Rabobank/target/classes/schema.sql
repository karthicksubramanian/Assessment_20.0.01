DROP TABLE IF EXISTS Transaction;  
CREATE TABLE Transaction (  
Transaction_Reference INT IDENTITY(100001,1)  PRIMARY KEY,  
Account_Number VARCHAR(50) NOT NULL,
Description VARCHAR(50) NOT NULL,
Start_Balance FLOAT NOT NULL,
Mutation FLOAT NOT NULL,
End_Balance FLOAT NOT NULL
);