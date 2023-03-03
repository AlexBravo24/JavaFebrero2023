--creacion de tablas

--TABLA CLIENTE;
CREATE TABLE clientes (
id_cliente NUMBER(3) PRIMARY KEY NOT NULL,
nombre NVARCHAR2(30),
direccion NVARCHAR2(50),
edad NUMBER(2),
sexo NVARCHAR2(30),
estado_civil NVARCHAR2(30),
rfc NVARCHAR2(30),
curp NVARCHAR2(30)
);
--alteramos la tabla para que solo pueda tener un nombre sin repetir
ALTER TABLE clientes ADD CONSTRAINT clientes__un UNIQUE ( nombre );


--CREAR TABLA ASUNTOS
CREATE TABLE asuntos(
id_asunto NUMBER(3) PRIMARY KEY NOT NULL,
fecha_inicio DATE,
fecha_final DATE,
status NVARCHAR2(30),
id_cliente NUMBER(3) UNIQUE -- es para crear la FK con una relacion 1:1 (campo tipo UNIQUE)
);
--FOREIGN KEY EN TABLA ASUNTOS CON LA TABLA CLIENTE
ALTER TABLE asuntos
    ADD CONSTRAINT fk FOREIGN KEY ( id_cliente )
        REFERENCES clientes ( id_cliente)
        ON DELETE CASCADE;

--CREAR TABLA PROCURADOR
CREATE TABLE procurador(
id_procurador NUMBER(3) PRIMARY KEY NOT NULL,
nombre NVARCHAR2(30),
direccion NVARCHAR2(50),
edad NUMBER(2),
sexo NVARCHAR2(30),
rfc NVARCHAR2(30)
);

--CREAR TABLA DE NORMALIZACION (TABLA DEBIL) O TABLA AUZILIAR PARA RELACION N:N
CREATE TABLE norm_asuntos(
id_norm NUMBER PRIMARY KEY NOT NULL,
id_procurador NUMBER,
id_asunto NUMBER
);

ALTER TABLE norm_asuntos ADD CONSTRAINT FK_id_asuntos
FOREIGN KEY (id_asunto)
REFERENCES asuntos(id_asunto);

ALTER TABLE norm_asuntos ADD CONSTRAINT FK_id_proc
FOREIGN KEY (id_procurador)
REFERENCES procurador(id_procurador);

--AGREGAMOS RESTRICCION A CAMPO SEXO TABLA CLIENTE
ALTER TABLE clientes ADD CONSTRAINT CHECK_SEXOC
CHECK (sexo IN('MASCULINO','FEMENINO'));

--AGREGAMOS RESTRICCION A CAMPO SEXO TABLA PROCURADOR
ALTER TABLE procurador ADD CONSTRAINT CHECK_SEXOP
CHECK (sexo IN('MASCULINO','FEMENINO'));


-------------------------------------------------------------------

--TABLA SOSCIO;
CREATE TABLE socio (
id_socio NUMBER PRIMARY KEY NOT NULL,
nombre NVARCHAR2(30),
direccion NVARCHAR2(50),
edad NUMBER,
sexo NVARCHAR2(30)
);

ALTER TABLE socio ADD CONSTRAINT soscio__un UNIQUE ( nombre );
--
CREATE TABLE socio_barco (
id_ns NUMBER PRIMARY KEY NOT NULL,
matricula NUMBER,
ID_socio number
);

--CREAR TABLA barcos
CREATE TABLE barcos(
matricula NUMBER(3) PRIMARY KEY NOT NULL,
nombre NVARCHAR2(30),
num_amarre NUMBER(2),
cuota NVARCHAR2(30)
);

--CREAR TABLA salidas
CREATE TABLE salidas(
id_salidas NUMBER PRIMARY KEY NOT NULL,
num_amarre number,
fecha_salida DATE,
hora_salida NUMBER,
destino NVARCHAR2(30),
matricula NUMBER,
id_patron NUMBER
);

CREATE TABLE patron (
id_patron NUMBER PRIMARY KEY NOT NULL,
nombre NVARCHAR2(30),
edad NUMBER,
cuota NUMBER
);

ALTER TABLE socio_barco ADD CONSTRAINT fk_socio
FOREIGN KEY (id_socio)
REFERENCES socio(id_socio);

ALTER TABLE socio_barco ADD CONSTRAINT fk_matricula
FOREIGN KEY (matricula)
REFERENCES barcos(matricula);

ALTER TABLE salidas ADD CONSTRAINT fk_matricula1
FOREIGN KEY (matricula)
REFERENCES barcos(matricula);

ALTER TABLE salidas ADD CONSTRAINT fk_capitan
FOREIGN KEY (id_patron)
REFERENCES patron(id_patron);

----------------------------------------------------------------
--ejercicio de la areolinea

--creando entidades fuertes

CREATE TABLE BASES(
ID_BASE NUMBER PRIMARY KEY,
TIPO NVARCHAR2(20)
);
--CREAMOS LA SECUENCIA PARA LA TABLA DE BASES
CREATE SEQUENCE BASE_SEQ;
--CREAMOS EL DISPARADOR PARA LA TABLA BASES
CREATE TRIGGER INSERT_BASES
BEFORE INSERT ON BASES FOR EACH ROW BEGIN
SELECT BASES_SEQ.NEXTVAL INTO:NEW.ID_BASE FROM DUAL;
END;
-- CREAR TABLA LISTAS_CLIENTES
CREATE TABLE CLIENTES_VUELO(
ID_CLIENTE NUMBER PRIMARY KEY,
NOMBRE NVARCHAR2(30),
DIRECCION NVARCHAR2(30),
TELEFONO  NVARCHAR2(10),
EMAIL NVARCHAR2(30)
); 

CREATE SEQUENCE CLIENTES_SEQ;

CREATE TRIGGER INSERT_CLIENTES
BEFORE INSERT ON CLIENTES_VUELO FOR EACH ROW BEGIN
SELECT CLIENTES_SEQ.NEXTVAL INTO:NEW.ID_CLIENTE FROM DUAL;
END;

-- CREANDO ENTIDADES DEBILES

CREATE TABLE PILOTOS(
ID_PILOTO NUMBER PRIMARY KEY,
NOMBRE NVARCHAR2(30),
HORAS_VUELO NUMBER,
ID_BASE NUMBER,
CONSTRAINT FK_IDBASE_PILOTOS
FOREIGN KEY (ID_BASE)
REFERENCES BASE (ID_BASE),
CONSTRAINT CHECK_BASE_PILOTOS CHECK (ID_BASE IN (1))
);

CREATE SEQUENCE PILOTOS_SEQ;

CREATE TRIGGER INSERT_PILOTOS
BEFORE INSERT ON PILOTOS FOR EACH ROW BEGIN
SELECT PIILOTOS_SEQ.NEXTVAL INTO:NEW.ID_PILOTO FROM DUAL;
END;

CREATE TABLE TRIPULACION(
ID_TRIPULACION NUMBER PRIMARY KEY,
NOMBRE NVARCHAR2(30),
ID_BASE NUMBER,
CONSTRAINT FK_IDBASE_TRIPULACION
FOREIGN KEY (ID_BASE)
REFERENCES BASE (ID_BASE),
CONSTRAINT CHECK_BASE_TRIPULACION CHECK (ID_BASE IN (1))
);

CREATE SEQUENCE TRIPULACION_SEQ;

CREATE TRIGGER INSERT_TRIPULACION
BEFORE INSERT ON TRIPULACION FOR EACH ROW BEGIN
SELECT TRIPULACION_SEQ.NEXTVAL INTO:NEW.ID_TRIPULACION FROM DUAL;
END;


CREATE TABLE AVIONES(
ID_AVION NUMBER PRIMARY KEY,
MODELO NVARCHAR2(30),
ID_BASE NUMBER,
CONSTRAINT FK_IDBASE_AVIONES
FOREIGN KEY (ID_BASE)
REFERENCES BASE (ID_BASE),
CONSTRAINT CHECK_BASE_AVIONES CHECK (ID_BASE IN (1))
); 

CREATE SEQUENCE AVIONES_SEQ;


CREATE TRIGGER INSERT_AVIONES
BEFORE INSERT ON AVIONES FOR EACH ROW BEGIN
SELECT AVIONES_SEQ.NEXTVAL INTO:NEW.ID_AVION FROM DUAL;
END;

CREATE TABLE VUELOS(
ID_VUELO NUMBER PRIMARY KEY,
ORIGEN NVARCHAR2(30),
DESTINO NVARCHAR2(30),
HORAFECHA DATE,
ID_PILOTO NUMBER,
ID_AVION NUMBER,
CONSTRAINT FK_IDPILOTO_VUELOS
FOREIGN KEY (ID_PILOTO)
REFERENCES PILOTOS (ID_PILOTO),
CONSTRAINT FK_IDAVION_VUELOS
FOREIGN KEY (ID_AVION)
REFERENCES AVIONES(ID_AVION)
); 

CREATE SEQUENCE VUELOS_SEQ;


CREATE TRIGGER INSERT_VUELOS
BEFORE INSERT ON VUELOS FOR EACH ROW BEGIN
SELECT VUELOS_SEQ.NEXTVAL INTO:NEW.ID_VUELO FROM DUAL;
END;


CREATE TABLE TRIPULACION_VUELO(
ID_TV NUMBER PRIMARY KEY,
ID_TRIPULACION NUMBER,
ID_VUELO NUMBER,
CONSTRAINT FK_IDTRIPULACION_TV
FOREIGN KEY (ID_TRIPULACION)
REFERENCES TRIPULACION (ID_TRIPULACION),
CONSTRAINT FK_IDVUELO_TV
FOREIGN KEY (ID_VUELO)
REFERENCES AVIONES(ID_VUELO)
);

CREATE SEQUENCE TV_SEQ;

CREATE TRIGGER INSERT_TV
BEFORE INSERT ON TRIPULACION_VUELO FOR EACH ROW BEGIN
SELECT TV_SEQ.NEXTVAL INTO:NEW.ID_TV FROM DUAL;
END;

CREATE TABLE BOLETOS(
ID_BOLETO NUMBER PRIMARY KEY,
ID_VUELO NUMBER,
ID_CLIENTE NUMBER,
COSTO NUMBER (8,2),
CONSTRAINT FK_IDVUEELO_BOLETOS
FOREIGN KEY (ID_VUELO)
REFERENCES VUELOS (ID_VUELO),
CONSTRAINT FK_IDCLIENTE_BOLETOS
FOREIGN KEY (ID_CLIENTE)
REFERENCES CLIENTES_VUELO (ID_CLIENTE)
);

CREATE SEQUENCE BOLETOS_SEQ;

CREATE TRIGGER INSERT_BOLETOS
BEFORE INSERT ON BOLETOS FOR EACH ROW BEGIN
SELECT BOLETOS_SEQ.NEXTVAL INTO:NEW.ID_BOLETO FROM DUAL;
END;

--INSERCIONES DE REGISTROS, COMENZANDO POR LAS ENTIDADES FUERTES

INSERT INTO BASES (ID_BASE,TIPO) VALUES (1,'DESCANSO');
INSERT INTO BASES (ID_BASE,TIPO) VALUES (2,'MANTENIMIENTO');

SELECT * FROM BASES;

----INSERT DE REGISTROS DE CLIENTES
DESCRIBE CLIENTES_VUELO;

INSERT ALL
INTO CLIENTES_VUELO(NOMBRE,DIRECCION,TELEFONO,EMAIL)VALUES
('ZAHID','EDOMEX','5535750876','LDKASCJK')
INTO CLIENTES_VUELO(NOMBRE,DIRECCION,TELEFONO,EMAIL)VALUES
('MARIO','ZACATECAS','5535750876','LDKASCJK')
INTO CLIENTES_VUELO(NOMBRE,DIRECCION,TELEFONO,EMAIL)VALUES
('GABRIELA','VERACRUZ','5535750876','CDKJN')
INTO CLIENTES_VUELO(NOMBRE,DIRECCION,TELEFONO,EMAIL)VALUES
('ARON','PUEBLA','5535750876','CDKJN')

SELECT *FROM DUAL;

SELECT *FROM CLIENTES_VUELO;

---INSERCION DE REGISTROS DE PILOTOS

DESCRIBE PILOTOS;
INSERT ALL
INTO PILOTOS (NOMBRE,HORASVUELO,ID_BASE)VALUES
('GERARDO',1200,1)
INTO PILOTOS (NOMBRE,HORASVUELO,ID_BASE)VALUES
('CESAR',700,1)
INTO PILOTOS (NOMBRE,HORASVUELO,ID_BASE)VALUES
('PEDRO',450,1)
INTO PILOTOS (NOMBRE,HORASVUELO,ID_BASE)VALUES
('JUAN',1400,1)
INTO PILOTOS (NOMBRE,HORASVUELO,ID_BASE)VALUES
('GUSTAVO',300,1)
SELECT * FROM DUAL;

SELECT * FROM PILOTOS;

--ACTUALIZA UN REGISTRO INDIVIDUAL

--UPDATE PILOTOS SET NOMBRE ='ALBERTO' WHERE ID_PILOTO=8;
