create database JavaJDBC DEFAULT CHARACTER SET utf8;

use JavaJDBC;

CREATE TABLE country (
  id INT NOT NULL AUTO_INCREMENT,
  name VARCHAR(450) NULL,
  PRIMARY KEY (id)
);

CREATE TABLE car (
  id INT NOT NULL AUTO_INCREMENT,
  name VARCHAR(450) NULL,
  price INT NULL,
  manufacture VARCHAR(450) NULL,
  country_id INT NULL,
  PRIMARY KEY (id)
);

  


