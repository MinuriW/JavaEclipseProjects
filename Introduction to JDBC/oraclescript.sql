begin
   execute immediate 'drop table item_type';
exception
   when others then null;
end;
/

CREATE TABLE item_type(
id number(19) NOT NULL,
name varchar2(255) NOT NULL,
deposit BINARY_DOUBLE NOT NULL,
cost_per_day BINARY_DOUBLE NOT NULL,
PRIMARY KEY (id));

INSERT INTO item_type (id, name, deposit, cost_per_day) VALUES (1,'Food', '50000', '10000');
INSERT INTO item_type (id, name, deposit, cost_per_day) VALUES (2,'Books', '20000', '5500');