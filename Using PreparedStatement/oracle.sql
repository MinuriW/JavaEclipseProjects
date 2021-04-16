begin
   execute immediate 'drop table "user"';
exception
   when others then null;
end;
/
DROP SEQUENCE "user_seq";
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


INSERT INTO "user"(name, contact_detail, username, password) VALUES ('Tony', '7894561230', 'tonii', 'abc123');
