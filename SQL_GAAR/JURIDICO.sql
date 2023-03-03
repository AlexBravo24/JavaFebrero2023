
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
        REFERENCES clientes ( id_cliente);





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

INSERT INTO clientes VALUES 
(1,'GERARDO','20 de noviembre ... ',25,'MASCULINO','SOLTERO','aurg971030e','AURGE971030..');
INSERT INTO clientes VALUES 
(2,'zahid','20 de noviembre ... ',25,'MASCULINO','SOLTERO','aurg971030e','AURGE971030..');
INSERT INTO clientes VALUES 
(3,'alan','20 de noviembre ... ',25,'MASCULINO','CASADO','aurg971030e','AURGE971030..');
INSERT INTO clientes VALUES 
(4,'jose','20 de noviembre ... ',25,'MASCULINO','SOLTERO','aurg971030e','AURGE971030..');
INSERT INTO clientes VALUES 
(5,'manuel','20 de noviembre ... ',25,'MASCULINO','CASADO','aurg971030e','AURGE971030..');

select * from clientes;

INSERT INTO asuntos VALUES 
(1,'10/02/2015','','pendiente',1);
INSERT INTO asuntos VALUES 
(2,'12/9/2014','','pendiente',2);
INSERT INTO asuntos VALUES 
(3,'19/6/2016','','pendiente',3);
INSERT INTO asuntos VALUES 
(4,'13/03/2015','','pendiente',4);
INSERT INTO asuntos VALUES 
(5,'8/02/2015','','pendiente',5);

-- PRUEBA DE CARDINALIDAD (1:1)
INSERT INTO asuntos VALUES 
(8,'8/02/2015','','pendiente',1);

select * from asuntos;


INSERT INTO procurador VALUES 
(1,'alfonso','20 de noviembre ... ',32,'MASCULINO','aurg971030e');
INSERT INTO procurador VALUES 
(2,'job','20 de noviembre ... ',35,'MASCULINO','aurg971030e');
INSERT INTO procurador VALUES 
(3,'ezequiel','20 de noviembre ... ',80,'MASCULINO','aurg971030e');
INSERT INTO procurador VALUES 
(4,'roberto','20 de noviembre ... ',19,'MASCULINO','aurg971030e');
INSERT INTO procurador VALUES 
(5,'miguel','20 de noviembre ... ',21,'MASCULINO','aurg971030e');

select * from procurador;

INSERT INTO norm_asuntos VALUES
(1,1,2);
INSERT INTO norm_asuntos VALUES
(2,1,3);
INSERT INTO norm_asuntos VALUES
(3,2,2);
INSERT INTO norm_asuntos VALUES
(4,3,2);
INSERT INTO norm_asuntos VALUES
(5,4,2);
INSERT INTO norm_asuntos VALUES
(6,5,2);
INSERT INTO norm_asuntos VALUES
(7,5,5);
select *from norm_asuntos;

COMMIT;
