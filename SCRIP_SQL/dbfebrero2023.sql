CREATE TABLE PERSONA(
INE NUMBER PRIMARY KEY,
NOMBRE NVARCHAR2(20),
EDAD NUMBER,
SEXO NVARCHAR2(1)
);

DESCRIBE PERSONA;

CREATE TABLE ALUMNO(
ID_ALUMNO NUMBER PRIMARY KEY,
NOMBRE NVARCHAR2(30),
FECHANAC DATE,
SEXO NVARCHAR2(20),
SEMESTRE NVARCHAR2(30),
STATUS NUMBER
);

CREATE TABLE CARRERAS(
ID_CARRERA NUMBER PRIMARY KEY,
NOMBRE NVARCHAR2(30),
DURACIONSEM NUMBER,
AREA NVARCHAR2(30),
CREDITOS NUMBER
);

CREATE TABLE CARRERAS_ALUMNOS(
ID_CA NUMBER PRIMARY KEY,
ID_CARRERA NUMBER,
ID_ALUMNO NUMBER
);

ALTER TABLE ALUMNO ADD CONSTRAINT CHECK_SEXO
CHECK (SEXO IN('MASCULINO','FEMENINO'));

ALTER TABLE CARRERAS ADD CONSTRAINT UNQ_NOMBRE_CARRERA
UNIQUE(NOMBRE);

ALTER TABLE CARRERAS_ALUMNOS ADD CONSTRAINT FK_ID_ALUMNO
FOREIGN KEY(ID_ALUMNO)
REFERENCES ALUMNO(ID_ALUMNO);


ALTER TABLE CARRERAS_ALUMNOS ADD CONSTRAINT FK_ID_CARRERA
FOREIGN KEY(ID_CARRERA)
REFERENCES CARRERAS(ID_CARRERA);

DESCRIBE CARRERAS;

ALTER TABLE CARRERAS ADD PRESUPUESTO NUMBER;

DESCRIBE CARRERAS;

ALTER TABLE CARRERAS DROP COLUMN PRESUPUESTO;

ALTER TABLE CARRERAS ADD PRESUPUESTO NUMBER (6,2);

DESCRIBE CARRERAS;
ALTER TABLE CARRERAS RENAME COLUMN PRESUPUESTO TO PRESUPUESTO_MENSUAL;
ALTER TABLE CARRERAS MODIFY PRESUPUESTO_MENSUAL NVARCHAR2(10);

ALTER TABLE CARRERAS MODIFY PRESUPUESTO_MENSUAL NUMBER (6,2);
DESCRIBE ALUMNO;

INSERT INTO ALUMNO VALUES
(1,'EDUARDO','13/10/1990','MASCULINO','8o SEMESTRE',1);

INSERT INTO ALUMNO VALUES
(2,'JOSE','19/11/1999','MASCULINO','8o SEMESTRE',1);

INSERT INTO ALUMNO VALUES
(3,'EDUARDO','24/04/1998','MASCULINO','8o SEMESTRE',1);

INSERT INTO ALUMNO VALUES
(4,'GERARDO','02/12/1992','MASCULINO','8o SEMESTRE',1);

INSERT INTO ALUMNO VALUES
(5,'JUAN','14/10/1995','MASCULINO','8o SEMESTRE',1);

INSERT INTO ALUMNO VALUES
(6,'LUIS','13/10/1990','MASCULINO','8o SEMESTRE',1);
------------------------------------------------------------


select * FROM ALUMNO;
--PARA GUARDAR Y CONFIRMAR LOS CAMBIOS 

COMMIT;

--borrar un campo especificando en id o el nombre, un campo a coincidir

DELETE FROM ALUMMNO WHERE ID_ALUMNO=4;

DESCRIBE CARRERAS;
SELECT * FROM ALUMNO;

INSERT INTO CARRERAS VALUES
(1,'ING COMPUTACION',8,'EXACTAS',400,9000);
INSERT INTO CARRERAS VALUES
(2,'ING CIVIL',8,'EXACTAS',400,9000);
INSERT INTO CARRERAS VALUES
(3,'DERECHO',8,'EXACTAS',350,9000);
INSERT INTO CARRERAS VALUES
(4,'ING COMUNICACION',8,'EXACTAS',400,9000);

SELECT * FROM CARRERAS;

COMMIT;

DESCRIBE CARRERAS_ALUMNOS;
INSERT INTO CARRERAS_ALUMNOS VALUES (1,1,2);
INSERT INTO CARRERAS_ALUMNOS VALUES (2,2,1);
INSERT INTO CARRERAS_ALUMNOS VALUES (3,3,4);

select * from alumno;
select * from carreras;

CREATE TABLE TUTORES(
ID_TUTOR NUMBER PRIMARY KEY,
NOMBRE NVARCHAR2(30),
SEXO NVARCHAR2(20),
TELEFONO NUMBER,
CLAVE_TUTOR NUMBER
); 
DESCRIBE TUTORES;

CREATE TABLE ALUMNO_TUTORES
(ID_AT NUMBER PRIMARY KEY, ID_ALUMNO NUMBER, ID_TUTOR NUMBER);

ALTER TABLE ALUMNO_TUTORES ADD CONSTRAINT RE_ID_ALUMNO
FOREIGN KEY (ID_ALUMNO) REFERENCES ALUMNO(ID_ALUMNO);

ALTER TABLE ALUMNO_TUTORES ADD CONsTRAINT RE_ID_TUTOR
FOREIGN KEY (ID_TUTOR) REFERENCES TUTORES(ID_TUTOR);



INSERT INTO tutores VALUES(1,'el pepe','m',5,1);
INSERT INTO tutores VALUES(2,'matracas','m',0,2);
INSERT INTO tutores VALUES(3,'felipe','m',3,3);
INSERT INTO tutores VALUES(4,'carlos','m',7,4);

INSERT INTO alumno_tutores VALUES(1,1,1);
INSERT INTO alumno_tutores VALUES(2,2,2);
INSERT INTO alumno_tutores VALUES(3,3,3);

select * from tutores;

select * from alumno_tutores;

--emplear secuencia
--crear secuencias
--se emplean para generar valores de numeros enteros
--pueden se consecutivos
-- o con un incremento que nosotros indiquemos 
--se utiliza para genrar automaticamente una 
--secuencia en los valores
--de las llaves primarias
--y asi aseguraremos que los valores no se reitan 

--- creando una secuencia definiendo los valores 
CREATE SEQUENCE ALUMNO_SEQ ---CREAMOS LA SECUENCIA Y SU NOEMBRE 
START WITH 5 --INDICAMOS EL VALOR EN EL QUE SE INICIA LA SECUENCIA
INCREMENT BY 1--INCREMENTAMOS EL VALOR DE LA SECUENCIA COMO SE LE INDIQUE 
MAXVALUE 999 --INDICAMOS EL VALOR MAXIMO DE LA SECUENCIA
MINVALUE 1 -- EL VALOR MINIMO DE LA SECUENCIA
CYCLE; -- INIDCAMOS SI LA SECUENCIA SE REPITE O NO (NON CYCLE)

--TRIGGER (DISPARADOR)
-- EJECUTAR O DESENCADENAR UNA ACCION
--
CREATE TRIGGER INSERT_ALUMNO --CREAMOS EL TRIGGER Y SU NOMBRE
BEFORE INSERT ON ALUMNO FOR EACH ROW BEGIN --DONDE SE EJECUTA EL TRIGGER
SELECT ALUMNO_SEQ.NEXTVAL INTO:NEW.ID_ALUMNO FROM DUAL;--SELECIONA EL VALOR DE LA SECEUENCIA Y LO INSERTA 
END;

DESCRIBE ALUMNO;

INSERT INTO ALUMNO VALUES
(1, 'GERARDO', '14/03/1990','MASCULINO','80 SEMESTRE',1);

SELECT *FROM ALUMNO;

DROP TABLE ALUMNO_TUTORES;

CREATE SEQUENCE ALUMNOS_TUTORES_SEQ;

CREATE TRIGGER INSERT_ALUMNO_TUTORES --CREAMOS EL TRIGGER Y SU NOMBRE
BEFORE INSERT ON ALUMNO_TUTORES FOR EACH ROW BEGIN --DONDE SE EJECUTA EL TRIGGER
SELECT ALUMNO_TUTORES_SEQ.NEXTVAL INTO:NEW.ID_AT FROM DUAL;--SELECIONA EL VALOR DE LA SECEUENCIA Y LO INSERTA 
END;

drop trigger insert_alumno;

select* from alumno_tutores;

insert into alumno_tutores (ID_ALUMNO, ID_TUTOR)VALUES (1,2);

insert into alumno_tutores (ID_ALUMNO, ID_TUTOR)VALUES (2,3);

insert into alumno_tutores (ID_ALUMNO, ID_TUTOR)VALUES (3,4);

insert into alumno_tutores (ID_ALUMNO, ID_TUTOR)VALUES (4,5);

INSERT ALL
INTO ALUMNO(NOMBRE )
('GERARDO', '14/03/1990','MASCULINO','80 SEMESTRE',1);
INSERT INTO ALUMNO VALUES
('GERARDO', '14/03/1990','MASCULINO','80 SEMESTRE',1);
INSERT INTO ALUMNO VALUES
('GERARDO', '14/03/1990','MASCULINO','80 SEMESTRE',1);
INSERT INTO ALUMNO VALUES
(1, 'GERARDO', '14/03/1990','MASCULINO','80 SEMESTRE',1);

