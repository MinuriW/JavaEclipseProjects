begin
   execute immediate 'drop table "user"';
exception
   when others then null;
end;
/
begin
   execute immediate 'drop table hall';
exception
   when others then null;
end;
/
DROP SEQUENCE "user_seq";
DROP SEQUENCE hall_seq;
CREATE  TABLE "user"(
id number(19) NOT NULL,
name VARCHAR2(45) NOT NULL,
contact_detail VARCHAR2(45) NOT NULL,
username VARCHAR2(45) NOT NULL,
password VARCHAR2(45) NOT NULL,
PRIMARY KEY (id));

-- Generate ID using sequence and trigger
CREATE SEQUENCE "user_seq" START WITH 1 INCREMENT BY 1;

CREATE OR REPLACE TRIGGER "user_seq_tr"
 BEFORE INSERT ON "user" FOR EACH ROW
 WHEN (NEW.id IS NULL)
BEGIN
 SELECT "user_seq".NEXTVAL INTO :NEW.id FROM DUAL;
END;
/

CREATE  TABLE hall(
id number(19) NOT NULL,
name VARCHAR2(255) NOT NULL,
contact_detail VARCHAR2(255) NOT NULL,
cost_per_day BINARY_DOUBLE NOT NULL,
owner_id NUMBER(19) NOT NULL,
foreign key(owner_id) references "user"(id),
PRIMARY KEY (id));

-- Generate ID using sequence and trigger
CREATE SEQUENCE hall_seq START WITH 1 INCREMENT BY 1;

CREATE OR REPLACE TRIGGER hall_seq_tr
 BEFORE INSERT ON hall FOR EACH ROW
 WHEN (NEW.id IS NULL)
BEGIN
 SELECT hall_seq.NEXTVAL INTO :NEW.id FROM DUAL;
END;
/

INSERT INTO "user" (name, contact_detail, username, password) VALUES ('Tony', '7894561230', 'tonii', 'abc123');

INSERT INTO hall (name, contact_detail, cost_per_day, owner_id) VALUES ('Party hall', '9874653201', '5000', '1');

