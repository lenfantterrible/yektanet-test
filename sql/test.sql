create database test;
use test;
go;
CREATE TABLE Advertiser (
    id int NOT NULL UNIQUE,
    clicks int default 0,
    views int default 0,
    name VARCHAR(255) NOT NULL,
    PRIMARY KEY (id)
); 

CREATE TABLE Ad (
    id int NOT NULL UNIQUE,
    clicks int default 0,
    views int default 0,
    title VARCHAR(255) NOT NULL,
    imgUrl VARCHAR(255), 
    link VARCHAR(255),
    advertiser int,
    FOREIGN KEY(advertiser) REFERENCES Advertiser(id),
    PRIMARY KEY (id)
); 
