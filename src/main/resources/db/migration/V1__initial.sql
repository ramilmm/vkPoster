CREATE TABLE SCHEDULE(
  id serial PRIMARY KEY,
  time TIMESTAMP NOT NULL
);

CREATE TABLE POSTS (
  id serial PRIMARY KEY,
  text varchar(1000),
  image varchar(1000),
  publish_date TIMESTAMP NOT NULL
);

CREATE TABLE ARCHIVE_POSTS (
  id serial PRIMARY KEY,
  text varchar(1000),
  image varchar(1000),
  publish_date TIMESTAMP NOT NULL,
  publish_status varchar(30),
  publish_status_msg varchar(300)
)