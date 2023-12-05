drop database if exists pruebatecnica;
create database pruebatecnica;
use pruebatecnica;

CREATE TABLE users(
id int auto_increment,
name VARCHAR(100),
email VARCHAR(100),
steam VARCHAR(100),
PRIMARY KEY (id)
);
insert users(name,email,steam) values('asier','a@a.com','asiersteam');

create table login(
id int auto_increment,
users_name varchar(100),
users_passwords varchar(100),
id_user int auto_increment,
PRIMARY KEY (id),
FOREIGN KEY (id_user) REFERENCES users (id) ON DELETE CASCADE ON UPDATE CASCADE
);
insert login(user_name,users_passwords) values('asierusername','1234');

create table videogames(
id  int auto_increment,
name VARCHAR(100),
PRIMARY KEY (id)
);
insert videogames

CREATE TABLE users_videogame(
id  int auto_increment,
id_user int,
id_videogame int,
PRIMARY KEY (id),
FOREIGN KEY (id_user) REFERENCES users (id) ON DELETE CASCADE ON UPDATE CASCADE,
FOREIGN KEY (id_videogame) REFERENCES videogames (id) ON DELETE CASCADE ON UPDATE CASCADE
);

CREATE TABLE party(
id int auto_increment,
name VARCHAR(100),
videogame_id int,
PRIMARY KEY (id),
FOREIGN KEY (id) REFERENCES users_videogame (id) ON DELETE CASCADE ON UPDATE CASCADE
);


