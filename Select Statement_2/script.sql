begin
   execute immediate 'drop table airport';
exception
   when others then null;
end;
/

create table airport(
id number(10) not null,
iata_airport_code VARCHAR2(45) not null,
name VARCHAR2(45) not null,
city VARCHAR2(45) not null,
country_name VARCHAR2(45) not null,
primary key(id));

insert into airport(id,iata_airport_code,name,city,country_name)values(1,'COK','Cochin International Airport','Cochin','India');
insert into airport(id,iata_airport_code,name,city,country_name)values(2,'MDZ','Mendoza Airport','Mendoza','Australia');


                                  

            