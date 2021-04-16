begin
   execute immediate 'drop table event';
exception
   when others then null;
end;
/
DROP SEQUENCE event_seq;

CREATE  TABLE event(
id NUMBER(10) NOT NULL,
name VARCHAR2(255) NOT NULL,
detail VARCHAR2(255) NOT NULL,
start_date TIMESTAMP(0) NOT NULL,
end_date TIMESTAMP(0) NOT NULL,
organizer VARCHAR2(255) NOT NULL,
PRIMARY KEY (id));

-- Generate ID using sequence and trigger
CREATE SEQUENCE event_seq START WITH 1 INCREMENT BY 1;

CREATE OR REPLACE TRIGGER event_seq_tr
 BEFORE INSERT ON event FOR EACH ROW
 WHEN (NEW.id IS NULL)
BEGIN
 SELECT event_seq.NEXTVAL INTO :NEW.id FROM DUAL;
END;
/

INSERT INTO event (name, detail, start_date, end_date, organizer) VALUES ('Event 1', 'event 1', TO_DATE('2018-01-01 12:00:00', 'YYYY-MM-DD HH24-MI-SS'), TO_DATE('2018-02-01 12:00:00', 'YYYY-MM-DD HH24-MI-SS'), 'John');
INSERT INTO event (name, detail, start_date, end_date, organizer) VALUES ('Event 2', 'event 2', TO_DATE('2018-02-15 18:00:00', 'YYYY-MM-DD HH24-MI-SS'), TO_DATE('2018-03-20 15:00:00', 'YYYY-MM-DD HH24-MI-SS'), 'Peter');

