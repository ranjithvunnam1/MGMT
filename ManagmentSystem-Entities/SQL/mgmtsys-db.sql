DROP DATABASE IF EXISTS mgmtsys;
CREATE DATABASE mgmtsys;
USE mgmtsys;

CREATE TABLE tbl_contact_us (
  id INTEGER UNSIGNED  NOT NULL   AUTO_INCREMENT,
  first_name VARCHAR(255)  NULL  ,
  last_name VARCHAR(255)  NULL  ,
  email VARCHAR(255)  NULL  ,
  phone VARCHAR(255)  NULL  ,
  description VARCHAR(1000)  NULL  ,
  isContacted BOOL  NULL  ,
  sent_date DATETIME  NULL    ,
PRIMARY KEY(id));