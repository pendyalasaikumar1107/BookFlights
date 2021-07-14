DROP TABLE IF EXISTS Travellers;

CREATE TABLE Travellers(travellerid INT,flightid INT, numberoftravellers INT, travellername VARCHAR(200));

INSERT INTO Travellers(travellerid,flightid,numberoftravellers,travellername)
VALUES(10001,20001,4,'person1');


CREATE TABLE IF NOT EXISTS  Cart ( flightid INT, cartid INT, airwaysname VARCHAR(200), source VARCHAR(200),destination VARCHAR(200),seats INT); 
INSERT INTO Cart( flightid, cartid, airwaysname, source,destination ,seats )
VALUES(1,2,'SAS','Chennai','Dubai',5);