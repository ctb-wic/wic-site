CREATE DATABASE db_wic;

GRANT ALL PRIVILEGES ON db_wic.* TO 'wic'@'localhost' IDENTIFIED BY '1234';

INSERT INTO user (username, password) VALUES ('wic', '1234')