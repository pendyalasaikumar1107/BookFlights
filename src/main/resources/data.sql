DROP TABLE IF EXISTS Travellers;

CREATE TABLE Travellers(travellerid INT,flightid INT, numberoftravellers INT, travellername VARCHAR(200));

INSERT INTO Travellers(travellerid,flightid,numberoftravellers,travellername)
VALUES(10001,20001,4,'person1');