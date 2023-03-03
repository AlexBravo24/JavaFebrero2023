
--CREAMOS LA TABLA CLIENTE
CREATE TABLE CLIENTE(
ID_CLIENTE NUMBER PRIMARY KEY,
NOMBRE NVARCHAR2(15),
EDAD NUMBER,
SEXO NVARCHAR2(1),
DIRECCION NVARCHAR2(50),
RFC NVARCHAR2(30)
);
--A�ADIMOS LA RESTRICCI�N DE SEXO
ALTER TABLE CLIENTE ADD CONSTRAINT CHECK_SEXO1
CHECK (SEXO IN ('MASCULINO','FEMENINO'));



--CREAMOS LA TABLA ASUNTOS
CREATE TABLE ASUNTOS(
ID_ASUNTOS NUMBER PRIMARY KEY,
FECHA_IN DATE,
FECHA_FIN DATE,
STATUS NVARCHAR2(20),
ID_CLIENTE NUMBER UNIQUE
);

--FOREIGN KEY PARA TABLA CLIENTE
ALTER TABLE ASUNTOS
ADD CONSTRAINT FK_AS FOREIGN KEY (ID_CLIENTE)
REFERENCES CLIENTE (ID_CLIENTE);

--PARA LA TABLA PROCURADORES
CREATE TABLE PROCURADORES(
ID_PROCURADOR NUMBER PRIMARY KEY,
NOMBRE NVARCHAR2(15),
EDAD NUMBER,
SEXO NVARCHAR2(1),
DIRECCION NVARCHAR2(50)
);
ALTER TABLE PROCURADORES ADD CONSTRAINT CHECK_SEXO2
CHECK (SEXO IN ('MASCULINO','FEMENINO'));

CREATE TABLE NORM_ASUNTOS (
ID_NORMA NUMBER PRIMARY KEY NOT NULL,
ID_PROCURADOR NUMBER,
ID_ASUNTO NUMBER
);

ALTER TABLE NORM_ASUNTOS ADD CONSTRAINT FK_ID_ASUNTOS1
FOREIGN KEY (ID_ASUNTO)
REFERENCES ASUNTOS(ID_ASUNTO);


ALTER TABLE NORM_ASUNTOS ADD CONSTRAINT FK_ID_PROCU
FOREIGN KEY (ID_PROCURADOR)
REFERENCES PROCURADORES(ID_PROCURADOR);


