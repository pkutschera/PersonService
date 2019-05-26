create table person (
  id int not null,
  vorname varchar(256),
  nachname varchar(256),
  primary key (id)
);

insert into person(id, vorname, nachname) values (1, 'Peter', 'Parker');
insert into person(id, vorname, nachname) values (2, 'Bruce', 'Banner');
insert into person(id, vorname, nachname) values (3, 'Tony', 'Stark');