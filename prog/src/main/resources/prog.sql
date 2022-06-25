CREATE TEBLE users (
id INT AUTOINCREMENT PRIMARY KEY,
email VARCHAR(150) NOT NULL,
name VARCHAR(150) NOT NULL,
password VARCHAR(150) NOT NULL,
date DATE NOT NULL,
role INT(1) NOT NULL coment '1 for Admin, 2 for User, 0 is blocked',
CONSTRAINT user_email_uindex
UNIQUE (email)
)

COMMENT 'all users';

INSERT INTO 'users' ('email', 'password', 'name', 'data', 'role')
VALUES ("test1@ukr.net", "1111", "John", "2000-01-01", 1);

INSERT INTO 'users' ('email', 'password', 'name', 'data', 'role')
VALUES ("test2@ukr.net", "1111", "Sarah", "2000-01-01", 2);

INSERT INTO 'users' ('email', 'password', 'name', 'data', 'role')
VALUES ("test3@ukr.net", "1111", "Paul", "2000-01-01", 2);