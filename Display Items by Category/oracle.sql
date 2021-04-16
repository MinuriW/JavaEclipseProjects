begin
   execute immediate 'drop table item';
exception
   when others then null;
end;
/
begin
   execute immediate 'drop table item_type';
exception
   when others then null;
end;
/
DROP SEQUENCE item_type_seq;
DROP SEQUENCE item_seq;

CREATE TABLE item_type(
id number(19) NOT NULL,
name varchar2(255) NOT NULL,
deposit BINARY_DOUBLE NOT NULL,
cost_per_day BINARY_DOUBLE NOT NULL,
PRIMARY KEY (id));

-- Generate ID using sequence and trigger
CREATE SEQUENCE item_type_seq START WITH 1 INCREMENT BY 1;

CREATE OR REPLACE TRIGGER item_type_seq_tr
 BEFORE INSERT ON item_type FOR EACH ROW
 WHEN (NEW.id IS NULL)
BEGIN
 SELECT item_type_seq.NEXTVAL INTO :NEW.id FROM DUAL;
END;
/

INSERT INTO item_type (name, deposit, cost_per_day) VALUES ('Food', '50000', '10000');
INSERT INTO item_type (name, deposit, cost_per_day) VALUES ('Electronics', '85000', '15000');


CREATE  TABLE item(
id number(19) NOT NULL,
name VARCHAR2(255) NOT NULL,
vendor VARCHAR2(255) NOT NULL,
type_id number(19) NULL,
foreign key(type_id) references item_type(id),
PRIMARY KEY (id));

-- Generate ID using sequence and trigger
CREATE SEQUENCE item_seq START WITH 1 INCREMENT BY 1;

CREATE OR REPLACE TRIGGER item_seq_tr
 BEFORE INSERT ON item FOR EACH ROW
 WHEN (NEW.id IS NULL)
BEGIN
 SELECT item_seq.NEXTVAL INTO :NEW.id FROM DUAL;
END;
/

INSERT INTO item (name, vendor, type_id) VALUES ('Chocolate', 'Foodies Court', '1');
INSERT INTO item (name, vendor, type_id) VALUES ('Laptop', 'AMP electronics', '2');

