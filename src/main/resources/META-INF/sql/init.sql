drop table if exists reaction;
drop table if exists movie;
drop table if exists user;

create TABLE USER (ID long primary key auto_increment, NAME varchar(50), SURNAME varchar(50), EMAIL varchar(50), PASSWORD varchar(50));

create TABLE MOVIE (ID long primary key auto_increment, TITLE varchar(50), DESCRIPTION varchar(255), DATE timestamp, USER_ID long);
alter table MOVIE add FOREIGN KEY (USER_ID) REFERENCES USER (ID);

create TABLE REACTION (ID long primary key auto_increment, LOVE boolean, HATE boolean, USER_ID long, MOVIE_ID long);
alter table REACTION add FOREIGN KEY (USER_ID) REFERENCES USER (ID);
alter table REACTION add FOREIGN KEY (MOVIE_ID) REFERENCES movie (ID);
alter table REACTION add CONSTRAINT REACTION UNIQUE (USER_ID, MOVIE_ID);

insert into user (ID, NAME, SURNAME, EMAIL, PASSWORD) values (1, 'Jane', 'Doe', 'jane@email.com', 'password');
insert into user (ID, NAME, SURNAME, EMAIL, PASSWORD) values (2, 'Jody', 'Nichols', 'jody@email.com', 'password');
insert into user (ID, NAME, SURNAME, EMAIL, PASSWORD) values (3, 'Adelle', 'Holman', 'adelle@email.com', 'password');


insert into movie (ID, TITLE, DESCRIPTION, DATE, USER_ID) values (1, 'Kill Bill', 'Et harum quidem rerum facilis est et expedita distinctio. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.', '2021-07-20T09:56:55.044Z', 1);
insert into movie (ID, TITLE, DESCRIPTION, DATE, USER_ID) values (2, 'Bonnie and Clyde', 'Et harum quidem rerum facilis est et expedita distinctio. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.', '2021-07-27T02:56:55.044Z', 1);
insert into movie (ID, TITLE, DESCRIPTION, DATE, USER_ID) values (3, 'Rocky', 'Et harum quidem rerum facilis est et expedita distinctio. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.', '2021-07-26T05:56:55.044Z', 2);
insert into movie (ID, TITLE, DESCRIPTION, DATE, USER_ID) values (4, 'Vertigo', 'Et harum quidem rerum facilis est et expedita distinctio. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.', '2020-07-27T09:56:55.044Z', 3);
insert into movie (ID, TITLE, DESCRIPTION, DATE, USER_ID) values (5, 'Run Lola Run', 'Et harum quidem rerum facilis est et expedita distinctio. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.', current_timestamp() , 3);


insert into reaction (love, hate, user_id, movie_id) values (true, false, 1, 3);
insert into reaction (love, hate, user_id, movie_id) values (false, true, 1, 4);
insert into reaction (love, hate, user_id, movie_id) values (true, false, 2, 1);
insert into reaction (love, hate, user_id, movie_id) values (true, false, 2, 2);
insert into reaction (love, hate, user_id, movie_id) values (false, true, 2, 4);
insert into reaction (love, hate, user_id, movie_id) values (false, true, 3, 1);
insert into reaction (love, hate, user_id, movie_id) values (true, false, 3, 2);
insert into reaction (love, hate, user_id, movie_id) values (true, false, 3, 3);