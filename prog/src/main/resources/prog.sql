ALTER TABLE notes DROP FOREING KEY 'note_user_fk';
DROP TABLE IF EXISTS secret_notes.users;
DROP TABLE IF EXISTS secret_notes.notes;

CREATE TABLE users (
id INT AUTO_INCREMENT PRIMARY KEY,
email VARCHAR(150) NOT NULL,
name VARCHAR(150) NOT NULL,
password VARCHAR(150) NOT NULL,
data_registration VARCHAR(10) NOT NULL,
role INT(1) NOT NULL coment '1 for Admin, 2 for User, 0 is blocked',
CONSTRAINT user_email_uindex UNIQUE (email)
)

CREATE TABLE notes (
id INT AUTO_INCREMENT PRIMARY KEY,
note TEXT,
note_title VARCHAR(255),
is_archive TINIT(1) DEFAULT '0' NOT NULL,
data_create VARCHAR(10) NOT NULL,
color VARCHAR(6) DEFAULT 'FFFFFF',
user_id INT NOT NULL
);

CREATE INDEX notes
ADD CONSTRAINT note-user_fk FOREING KEY (user_id) REFERENCES secret_notes.users (id)
ON UPDATE CASCADE
ON DELETE CASCADE;

INSERT INTO users ('email', 'password', 'name', 'data', 'role')
VALUES ("test1@ukr.net", "1111", "John", "2000-01-01", 1);

INSERT INTO users ('email', 'password', 'name', 'data', 'role')
VALUES ("test2@ukr.net", "1111", "Sarah", "2000-01-01", 2);

INSERT INTO users ('email', 'password', 'name', 'data', 'role')
VALUES ("test3@ukr.net", "1111", "Paul", "2000-01-01", 2);