-- Con dos guiones puedo poner un comentario
/* Poner comentarios de multiples lineas
SQL Lenguaje de Consulta Estructurado
Es un lenguaje para actualizar, obtener, y calcular informacion en base de datos
relacionales
Base de datos - Conjunto de datos organizados y relacionados entre s�, y que son 
almacenados en tablas
*/
/*
La estructura de las tablas queda de la siguiente manera
- Toda tabla debe de llevar una llave primaria
(Id o un numero que identifique cada registro de la misma)
-Pueden llevar tambien llaves foraneas
-Una lleva foreana es la llave primaria que proviene de otra tabla
-Tipo de dato puede ser numericos, caracteres, tipo fecha, etc.
-Caracter Char, Varchar, Varchar2, Nchar, NVARCHAR2
-Numericos long, int, NUMBER, 
*/
--CREAR UNA TABLA DE EJEMPLO 
--Almacenar datos d euna personas
--ID persona
--Nombre
--Edad
--Sexo

--Creando la tabla para PERSONA
--La sintaxis para crear una tabla es la siguiente:
--CREATE TABLE NOMBRETABLA(
--...
--NOMBRECAMPO1 TIPODEDATO
--);

--selecccionar sentencia Ctrl + Enter
CREATE TABLE PERSONA(
INE NUMBER PRIMARY KEY,
NOMBRE NVARCHAR2(20), 
EDAD NUMBER, 
SEXO NVARCHAR2(1)
);

--Para ver la estructura de una tabla 
DESCRIBE PERSONA;

--Hay que establecer valores que no cambien , como en este caso la edad. Lo
--ideal ser�a cambiar el tipo de dato por DATE

--ELIMINAR TABLA
DROP TABLE PERSONA;

--CREAR TABLA DE ALUMNOS
--MATRICULA
--NOMBRE
--FEHA DE NACIMIENTO
--SEXO
--SEMESTRE
--CARRERA
CREATE TABLE ALUMNO(
ID_ALUMNO NUMBER PRIMARY KEY, 
NOMBRE NVARCHAR2(30),
FECHANAC DATE, 
SEXO NVARCHAR2(20),
SEMESTRE NVARCHAR2(30),
STATUS NUMBER
);



--Las entidades fuertes no dependen de otras para existir (Tienen sus datos completos)
--Entidades debiles dependen de otra tabla u otros datos para existir. 
--Se identifican porque reciben una llave foreana


--Creamos una tabla que nos permita relacionar a los alumnos con las carreras
CREATE TABLE CARRERAS_ALUMNOS(
ID_CA NUMBER PRIMARY KEY,
ID_CARRERA NUMBER,
ID_ALUMNO NUMBER
);

CREATE TABLE CARRERAS(
ID_CARRERA NUMBER PRIMARY KEY,
NOMBRE NVARCHAR2(30),
DURACIONSEM NUMBER,
AREA NVARCHAR2 (30),
CREDITOS NUMBER
);

--Agregando restricciones a una tabla
--Las restricciones deben de llevar un nombre y se ientifican por
--la palabra "CONSTRAINT"

--EJEMPLO: Vamos a agregar una  restriccion en el sexo en la tabla de Alumno
--para que solo se pueda introducir "Masculino" "Femenino"

ALTER TABLE ALUMNO ADD CONSTRAINT CHECK_SEXO
CHECK (SEXO IN('MASCULINO','FEMENINO'));

DESCRIBE ALUMNO;

--Ctrl + s guardar cambios en script

--Borrar o eliminar restriccion en tabla
ALTER TABLE ALUMNO DROP CONSTRAINT CHECK_SEXO;

--Crear restriccion en la tabla Carreras
--para no repetir valores UNIQUE para agregar una restriccion unica en un registro
ALTER TABLE CARRERAS ADD CONSTRAINT UNQ_NOMBRE_CARRERA
UNIQUE (NOMBRE);

--Agregando un llave foreana
--Una llave foreana es una restriccion, porque vamos a especificar de donde 
--proviene dicha llave, sintaxis general:
--ALTER TABLE nombre_de_tabla ADD CONSTRAINT nombre_restriccion
--FOREING KEY (columna que recibe)
--REFERENCES nombre_de_tabla (columna con llave primaria);-- Quien da

ALTER TABLE CARRERAS_ALUMNOS ADD CONSTRAINT FK_ID_ALUMNO
FOREIGN KEY (ID_ALUMNO)
REFERENCES ALUMNO (ID_ALUMNO);

--CREAR LLAVE FOREANA DE ID_CARRERA
ALTER TABLE CARRERAS_ALUMNOS ADD CONSTRAINT FK_ID_CARRERA
FOREIGN KEY (ID_CARRERA)
REFERENCES CARRERAS (ID_CARRERA);

DESCRIBE CARRERAS;

--Agregar una columna a una tabla existente
ALTER TABLE CARRERAS ADD PRESUPUESTO NUMBER;

--Eliminar una columna 
ALTER TABLE CARRERAS DROP COLUMN PRESUPUESTO;


--Podemos indicar el uso de decimales, indicando la longitud numerica y separarlos
--con una coma, cuantas posiciones serian decimales, quedando en el ejemplo
--  un valor maximo entero de 9,999 y un decimal de .99
ALTER TABLE CARRERAS ADD PRESUPUESTO NUMBER (6,2);

--Renombrar una columna
ALTER TABLE CARRERAS RENAME COLUMN PRESUPUESTO TO PRESUPUESTO_MENSUAL;

DESCRIBE CARRERAS;

--Modificar el tipo de dato de la columna (Siempre y cuando no tenga registros)
ALTER TABLE CARRERAS MODIFY PRESUPUESTO_MENSUAL NVARCHAR2(10);

ALTER TABLE CARRERAS MODIFY PRESUPUESTO_MENSUAL NUMBER (6,2);

--Insercion de datos individuales
DESCRIBE ALUMNO;

INSERT INTO ALUMNO VALUES 
(1, 'ALMA', '01/04/1996', 'FEMENINO', '8vo semestre', 1);

--Conocer que formato de fecha maneja el sistema
SELECT SYSDATE FROM DUAL;

--Realizando consulta general de datos
SELECT * FROM ALUMNO;

--Para confirmar cambios de los registros que insertamos(guardar)
COMMIT;

INSERT INTO ALUMNO VALUES 
(2, 'ANA', '28/12/1992', 'FEMENINO', '8vo semestre', 1);
INSERT INTO ALUMNO VALUES 
(3, 'FATIMA', '16/09/1997', 'FEMENINO', '3ro semestre', 1);
INSERT INTO ALUMNO VALUES 
(4, 'LUIS', '04/01/1998', 'MASCULINO', '5to semestre', 1);
INSERT INTO ALUMNO VALUES 
(5, 'ANGEL', '16/07/1995', 'MASCULINO', '9no semestre', 1);

COMMIT;

--BORRAR UN REGISTRO  ESPECIFICANDO UN CAMPO A COINCIDIR CON EL REGISTRO
DELETE FROM ALUMNO WHERE ID_ALUMNO=5;

SELECT * FROM ALUMNO;

DESCRIBE CARRERAS;

--INSERTAR DATOS EN LA TABLA CARRERAS
INSERT INTO CARRERAS VALUES
(1, 'ING EN SISTEMAS', 8, 'EXACTAS', 400, 9000);
INSERT INTO CARRERAS VALUES
(2, 'MEDICINA', 8, 'SALUD', 400, 9500);
INSERT INTO CARRERAS VALUES
(3, 'NUTRICION', 8, 'SALUD', 350, 8000);
INSERT INTO CARRERAS VALUES
(4, 'ADMINISTRACION', 8, 'ADMIN', 400, 9000);
INSERT INTO CARRERAS VALUES
(5, 'FISICA', 8, 'EXACTAS', 400, 9000);

--INSERTAR DATOS EN NUESTRA TABLA RELACIONAL
DESCRIBE CARRERAS_ALUMNOS;

INSERT INTO CARRERAS_ALUMNOS VALUES (1,1,2);
INSERT INTO CARRERAS_ALUMNOS VALUES (2,2,1);
INSERT INTO CARRERAS_ALUMNOS VALUES (3,3,4);
INSERT INTO CARRERAS_ALUMNOS VALUES (4,5,3);


SELECT * FROM ALUMNO;

CREATE TABLE TUTORES(
ID_TUTOR NUMBER PRIMARY KEY,
NOMBRE NVARCHAR2(30),
SEXO NVARCHAR2(20),
TELEFONO NUMBER,
CLAVE_TUTOR NVARCHAR2(1)
);

CREATE TABLE ALUMNO_TUTORES(
ID_AT NUMBER PRIMARY KEY,
ID_ALUMNO NUMBER,
ID_TUTOR NUMBER
);

DESCRIBE TUTORES;

ALTER TABLE TUTORES ADD CONSTRAINT CHECK_CLAVE_TUTOR
CHECK (CLAVE_TUTOR IN('A','B', 'C', 'D'));


ALTER TABLE ALUMNO_TUTORES ADD CONSTRAINT FK_ID_TUTOR
FOREIGN KEY (ID_TUTOR)
REFERENCES TUTORES (ID_TUTOR);

alter table ALUMNO_TUTORES drop constraint FK_ID_TUTOR; --ELIMINAR LLAVE FOREANA

ALTER TABLE ALUMNO_TUTORES ADD CONSTRAINT FK_IDALUMNO
FOREIGN KEY (ID_ALUMNO)
REFERENCES ALUMNO (ID_ALUMNO);


INSERT INTO TUTORES VALUES (1, 'ANDRES', 'MASCULINO', 7125689451, 'A' );
INSERT INTO TUTORES VALUES (2, 'ROSI', 'FEMENINO', 7125689451, 'B' );
INSERT INTO TUTORES VALUES (3, 'ARIZ', 'FEMENINO', 7125852635, 'A' );
INSERT INTO TUTORES VALUES (4, 'ARNOL', 'MASCULINO', 7125978367, 'C' );
INSERT INTO TUTORES VALUES (5, 'ALEJANDRO', 'MASCULINO', 7125689451, 'D' );

INSERT INTO ALUMNO_TUTORES VALUES (1, 1, 1);
INSERT INTO ALUMNO_TUTORES VALUES (2, 2, 2);
INSERT INTO ALUMNO_TUTORES VALUES (3, 3, 3);
INSERT INTO ALUMNO_TUTORES VALUES (4, 4, 4);
INSERT INTO ALUMNO_TUTORES VALUES (5, 1, 5);
COMMIT;


--EMPLEAR SECUENCIAS
--CREAR SECUENCIAS
--Se emplean para generar valores de numeros enteros, pueden ser consecutivos
--o con un incremento que nosotros indiquemos, se utiliza para generar automaticamente
--en los valores de las llaves primarias , y asi asegurar que no se repitan

--CREANDO UNA SECUENCIA DEFINIENDO VALORES

SELECT * FROM ALUMNO;

CREATE SEQUENCE ALUMNO_SEQ --CREAMOS LA SECUENCIA Y SU NOMBRE
START WITH 5 --INDICAMOS EL VALOR EN EL QUE INICIA LA SECUENCIA
INCREMENT BY 1 --INCREMENTAMOS EL VALOR DE LA SECUENCIA COMO SE LE INDIQUE
MAXVALUE 999  --INIDCAMOS EL VALOR MAXIMO DE LA SECUENCIA
MINVALUE 1  --INDICAMOS EL VALOR MINIMO DE LA SECUENCIA
CYCLE; --INDICAMOS SI LA SECUENCIA SE REPITE O NO (NOCYCLE)

--TRIGGER (DISPARADOR)
--Ejecutar o desencadenar una accion 
CREATE TRIGGER INSERT_ALUMNO  --Creamos el trigger y el nombre 
BEFORE INSERT ON ALUMNO FOR EACH ROW BEGIN --Donde se ejecuta el trigger
SELECT ALUMNO_SEQ.NEXTVAL INTO:NEW.ID_ALUMNO FROM DUAL;  --Selecciona el valor de la secuencia
END;

--ELIMINAR UN TRIGGER
DROP TRIGGER INSERT_ALUMNO;

DESCRIBE ALUMNO;

INSERT INTO ALUMNO VALUES
(1, 'DANIEL', '05/06/2000', 'MASCULINO', '6to SEMESTRE', 1);

INSERT INTO ALUMNO VALUES
(1, 'MANUEL', '05/06/1993', 'MASCULINO', '6to SEMESTRE', 1);

SELECT * FROM ALUMNO;


SELECT * FROM ALUMNO_TUTORES;

DROP TABLE ALUMNO_TUTORES;

--CREAR SECUENCIA CON VALORES POR DEFAULT 
CREATE SEQUENCE ALUMNO_TUTORES_SEQ;

CREATE TRIGGER INSERT_ALUMNO_TUTORES  --CREAMOS EL TRIGGER Y SU NOMBRE
BEFORE INSERT ON ALUMNO_TUTORES FOR EACH ROW BEGIN --DONDE SE EJECUTA EL TRIGGER
SELECT ALUMNO_TUTORES_SEQ.NEXTVAL INTO:NEW.ID_AT FROM DUAL; --SELECCIONA EL VALOR DE LA 
END;

DROP TRIGGER INSERT_ALUMNO_TUTORES;

--INSERTANDO VALORES INDICANDO SOLO LAS COLUMNAS EN LAS QUE VAMOS A INSERTAR DATOS
INSERT INTO ALUMNO_TUTORES(ID_ALUMNO, ID_TUTOR) VALUES (1,2);
INSERT INTO ALUMNO_TUTORES(ID_ALUMNO, ID_TUTOR) VALUES (2,3);

--INSERCION "MASIVA"
INSERT ALL
INTO ALUMNO (NOMBRE, FECHANAC, SEXO, SEMESTRE, STATUS) 
VALUES ('GABRIELA', '08/01/1998', 'FEMENINO', '8vo semestre', 1)
INTO ALUMNO (NOMBRE, FECHANAC, SEXO, SEMESTRE, STATUS) 
VALUES ('BELLA', '19/07/1990', 'FEMENINO', '1ro semestre', 1)
INTO ALUMNO (NOMBRE, FECHANAC, SEXO, SEMESTRE, STATUS) 
VALUES ('JAVIER', '06/06/1996', 'MASCULINO', '2do semestre', 1)
INTO ALUMNO (NOMBRE, FECHANAC, SEXO, SEMESTRE, STATUS) 
VALUES ('LUISA', '19/12/1991', 'FEMENINO', '3er semestre', 1)
SELECT * FROM DUAL;



--EJERCICIO
CREATE TABLE CLIENTE(
ID_CLIENTE NUMBER PRIMARY KEY, 
NOMBRE NVARCHAR2(30),
DNI NVARCHAR2(30),
DIRECCION NVARCHAR2(30),
TELEFONO NUMBER,
SEXO NVARCHAR2(20)
);

CREATE TABLE PROCURADOR(
ID_PROCURADOR NUMBER PRIMARY KEY, 
NOMBRE NVARCHAR2(30),
CEDULA NVARCHAR2(30),
DIRECCION NVARCHAR2(30),
TELEFONO NUMBER,
SEXO NVARCHAR2(20)
);

CREATE TABLE ASUNTO(
ID_ASUNTO NUMBER PRIMARY KEY, 
DESCRIP_ASUNTO NVARCHAR2(30),
FECHA_INICIO DATE,
STATUS NVARCHAR2(20),
FECHA_FIN DATE
);

CREATE TABLE ASUNTOS(
ID_ACP NUMBER PRIMARY KEY, 
ID_ASUNTO NUMBER,
ID_CLIENTE NUMBER,
ID_PROCURADOR NUMBER
);


ALTER TABLE ASUNTOS ADD CONSTRAINT FK_ID_ASUNTO
FOREIGN KEY (ID_ASUNTO)
REFERENCES ASUNTO (ID_ASUNTO);

ALTER TABLE ASUNTOS ADD CONSTRAINT FK_ID_CLIENTE
FOREIGN KEY (ID_CLIENTE)
REFERENCES CLIENTE (ID_CLIENTE);

ALTER TABLE ASUNTOS ADD CONSTRAINT FK_ID_PROCURADOR
FOREIGN KEY (ID_PROCURADOR)
REFERENCES PROCURADOR (ID_PROCURADOR);
COMMIT;

CREATE SEQUENCE CLIENTE_SEQ;
CREATE TRIGGER INSERT_CLIENTE  
BEFORE INSERT ON CLIENTE FOR EACH ROW BEGIN 
SELECT CLIENTE_SEQ.NEXTVAL INTO:NEW.ID_CLIENTE FROM DUAL; 
END;

CREATE SEQUENCE PROCURADOR_SEQ;
CREATE TRIGGER INSERT_PROCURADOR  
BEFORE INSERT ON PROCURADOR FOR EACH ROW BEGIN 
SELECT PROCURADOR_SEQ.NEXTVAL INTO:NEW.ID_PROCURADOR FROM DUAL; 
END;

CREATE SEQUENCE ASUNTO_SEQ;
CREATE TRIGGER INSERT_ASUNTO  
BEFORE INSERT ON ASUNTO FOR EACH ROW BEGIN 
SELECT ASUNTO_SEQ.NEXTVAL INTO:NEW.ID_ASUNTO FROM DUAL;
END;

CREATE SEQUENCE ASUNTOS_SEQ;
CREATE TRIGGER INSERT_ASUNTOS  
BEFORE INSERT ON ASUNTOS FOR EACH ROW BEGIN 
SELECT ASUNTOS_SEQ.NEXTVAL INTO:NEW.ID_ACP FROM DUAL; 
END;

DESCRIBE CLIENTE;

INSERT ALL 
INTO CLIENTE (NOMBRE, DNI, DIRECCION, TELEFONO, SEXO) 
VALUES('DAVID', '1234567891011', 'CDMX', 5598762132, 'MASCULINO')
INTO CLIENTE (NOMBRE, DNI, DIRECCION, TELEFONO, SEXO) 
VALUES('JORGE', '1234567891012', 'GUADALAJARA', 5598762133, 'MASCULINO')
INTO CLIENTE (NOMBRE, DNI, DIRECCION, TELEFONO, SEXO) 
VALUES('OSCAR', '1234567891013', 'NUEVO LEON', 5598762134, 'MASCULINO')
INTO CLIENTE (NOMBRE, DNI, DIRECCION, TELEFONO, SEXO) 
VALUES('LIDIA', '1234567891014', 'PUEBLA', 5598762135, 'FEMENINO')
INTO CLIENTE (NOMBRE, DNI, DIRECCION, TELEFONO, SEXO) 
VALUES('MARIA', '1234567891015', 'QUERETARO', 5598762136, 'FEMENINO')
SELECT * FROM DUAL;


DESCRIBE PROCURADOR;

INSERT ALL
INTO PROCURADOR(NOMBRE, CEDULA, DIRECCION, TELEFONO, SEXO)
VALUES('ELISA', '1110987654321', 'CDMX', 5592168498, 'FEMENINO')
INTO PROCURADOR(NOMBRE, CEDULA, DIRECCION, TELEFONO, SEXO)
VALUES('MAYRA', '2110987654321', 'QUERETARO', 5592168497, 'FEMENINO')
INTO PROCURADOR(NOMBRE, CEDULA, DIRECCION, TELEFONO, SEXO)
VALUES('ERICK', '3110987654321', 'CDMX', 5592168496, 'MASCULINO')
INTO PROCURADOR(NOMBRE, CEDULA, DIRECCION, TELEFONO, SEXO)
VALUES('GISEL', '4110987654321', 'MORELOS', 5592168495, 'FEMENINO')
INTO PROCURADOR(NOMBRE, CEDULA, DIRECCION, TELEFONO, SEXO)
VALUES('JOSE', '5110987654321', 'HIDALGO', 5592168494, 'MASCULINO')
SELECT * FROM DUAL;

DESCRIBE ASUNTO;

INSERT ALL 
INTO ASUNTO(DESCRIP_ASUNTO, FECHA_INICIO, STATUS, FECHA_FIN)
VALUES ('DERECHO CIVIL', '28/02/2023', 'INICIO', '')
INTO ASUNTO(DESCRIP_ASUNTO, FECHA_INICIO, STATUS, FECHA_FIN)
VALUES ('DERECHO MERCANTIL', '16/07/2021', 'CONCLUIDO', '09/02/2022')
INTO ASUNTO(DESCRIP_ASUNTO, FECHA_INICIO, STATUS, FECHA_FIN)
VALUES ('DERECHO SOCIAL', '06/09/2022', 'EN PROCESO', '')
INTO ASUNTO(DESCRIP_ASUNTO, FECHA_INICIO, STATUS, FECHA_FIN)
VALUES ('DERECHO CIVIL', '14/03/2019', 'EN PROCESO', '')
INTO ASUNTO(DESCRIP_ASUNTO, FECHA_INICIO, STATUS, FECHA_FIN)
VALUES ('DERECHO MERCANTIL', '16/04/2022', 'CONCLUIDO', '01/06/2022')
SELECT * FROM DUAL;



INSERT INTO ASUNTOS(ID_ASUNTO, ID_CLIENTE, ID_PROCURADOR) VALUES (1,1,1);
INSERT INTO ASUNTOS(ID_ASUNTO, ID_CLIENTE, ID_PROCURADOR) VALUES (2,2,4);
INSERT INTO ASUNTOS(ID_ASUNTO, ID_CLIENTE, ID_PROCURADOR) VALUES (2,2,5);
INSERT INTO ASUNTOS(ID_ASUNTO, ID_CLIENTE, ID_PROCURADOR) VALUES (5,5,1);
INSERT INTO ASUNTOS(ID_ASUNTO, ID_CLIENTE, ID_PROCURADOR) VALUES (5,5,3);





--Ejercicio 2
CREATE TABLE SOCIO(
ID_SOCIO NUMBER PRIMARY KEY, 
NOMBRE NVARCHAR2(30),
DIRECCION NVARCHAR2(30),
TELEFONO NUMBER,
SEXO NVARCHAR2(20),
INSCRIPCION NVARCHAR2(30)
);

CREATE TABLE BARCO(
ID_BARCO NUMBER PRIMARY KEY, 
ID_SOCIO NUMBER,
NO_MATRICULA NVARCHAR2(30),
NOMBRE NVARCHAR2(30),
NO_AMARRE NVARCHAR2(30),
CUOTA NUMBER
);


CREATE TABLE PATRON(
ID_PATRON NUMBER PRIMARY KEY, 
NOMBRE NVARCHAR2(30),
DIRECCION NVARCHAR2(30),
TELEFONO NUMBER,
SEXO NVARCHAR2(20)
);

CREATE TABLE PROPIETARIO(
ID_PROPIETARIO NUMBER PRIMARY KEY, 
NOMBRE NVARCHAR2(30),
DIRECCION NVARCHAR2(30),
TELEFONO NUMBER,
SEXO NVARCHAR2(20)
);

CREATE TABLE SALIDAS(
ID_SALIDA NUMBER PRIMARY KEY, 
ID_BARCO NUMBER,
FECHA_SALIDA DATE,
HORA_SALIDA NVARCHAR2(20),
ID_PATRON NUMBER,
ID_PROPIETARIO NUMBER
);

COMMIT;


ALTER TABLE BARCO ADD CONSTRAINT FK_ID_SOCIO
FOREIGN KEY (ID_SOCIO)
REFERENCES SOCIO (ID_SOCIO);

ALTER TABLE SALIDAS ADD CONSTRAINT FK_ID_BARCO
FOREIGN KEY (ID_BARCO)
REFERENCES BARCO (ID_BARCO);

ALTER TABLE SALIDAS ADD CONSTRAINT FK_ID_PATRON
FOREIGN KEY (ID_PATRON)
REFERENCES PATRON (ID_PATRON);

ALTER TABLE SALIDAS ADD CONSTRAINT FK_ID_PROPIETARIO
FOREIGN KEY (ID_PROPIETARIO)
REFERENCES PROPIETARIO (ID_PROPIETARIO);

DESCRIBE SOCIO;
INSERT INTO SOCIO VALUES
(1, 'DANIEL', 'VERACRUZ', 5596135455, 'MASCULINO','165FV67985');
INSERT INTO SOCIO VALUES
(2, 'JUANA', 'COLIMA', 1654874654, 'FEMENINO','697FV36541');


DESCRIBE BARCO;
INSERT INTO BARCO VALUES
(1, 1, 'V35464HJI', 'BARCOBCO', '00597', 1509);
INSERT INTO BARCO VALUES
(2, 1, 'J48931NGF', 'BARCOGS', '00598',3596);

DESCRIBE PATRON;

INSERT INTO PATRON VALUES
(1, 'JAVIER', 'OAXACA', 5498751321, 'MASCULINO');
INSERT INTO PATRON VALUES
(2, 'JOANA', 'CANCUN', 1879751319, 'FEMENINO');

INSERT INTO PROPIETARIO VALUES
(1, 'LUIS', 'COLIMA', 5487894516, 'MASCULINO');
INSERT INTO PROPIETARIO VALUES
(2, 'ANGELICA', 'VERACUZ', 51698845612, 'FEMENINO');


DESCRIBE SALIDAS;
INSERT INTO SALIDAS VALUES
(1, 1, '01/03/2023', '10:30:00',1,1);





--EJERCICIO3  AEROLINEA

--ENTIDADES FUERTES
--creamos base
CREATE TABLE BASE(
ID_BASE NUMBER PRIMARY KEY,
TIPO NVARCHAR2(20)
);
--creamos la secuencia de base
CREATE SEQUENCE BASE_SEQ;
--creamos el disparador de base
CREATE TRIGGER INSERT_BASE 
BEFORE INSERT ON BASE FOR EACH ROW BEGIN
SELECT BASE_SEQ.NEXTVAL INTO:NEW.ID_BASE FROM DUAL;
END;

--creamos clientes
CREATE TABLE CLIENTES_VUELO(
ID_CLIENTE NUMBER PRIMARY KEY, 
NOMBRE NVARCHAR2(30),
DIRECCION NVARCHAR2(30),
TELEFONO NVARCHAR2(10),
EMAIL NVARCHAR2(30)
);
--secuencia
CREATE SEQUENCE CLIENTES_SEQ;
--disparador
CREATE TRIGGER INSERT_CLIENTES
BEFORE INSERT ON CLIENTES_VUELO FOR EACH ROW BEGIN
SELECT CLIENTES_SEQ.NEXTVAL INTO:NEW.ID_CLIENTE FROM DUAL;
END;

--creamos entidades debiles Pilotos
CREATE TABLE PILOTOS(
ID_PILOTO NUMBER PRIMARY KEY,
NOMBRE NVARCHAR2(30),
HORASVUELO NUMBER,
ID_BASE NUMBER,
CONSTRAINT FK_IDBASE_PILOTOS     --llave foreana de base
FOREIGN KEY (ID_BASE)
REFERENCES BASE (ID_BASE),
CONSTRAINT CHECK_BASE_PILOTOS CHECK (ID_BASE IN(1)) --restriccion de tipo (1)
);
--secuencia
CREATE SEQUENCE PILOTOS_SEQ;
--disparador
CREATE TRIGGER INSERT_PILOTOS
BEFORE INSERT ON PILOTOS FOR EACH ROW BEGIN
SELECT PILOTOS_SEQ.NEXTVAL INTO:NEW.ID_PILOTO FROM DUAL;
END;

--tripulacion
CREATE TABLE TRIPULACION(
ID_TRIPULACION NUMBER PRIMARY KEY,
NOMBRE NVARCHAR2(30),
ID_BASE NUMBER,
CONSTRAINT FK_IDBASE_TRIPULACION     --llave foreana de base
FOREIGN KEY (ID_BASE)
REFERENCES BASE (ID_BASE),
CONSTRAINT CHECK_BASE_TRIPULACION CHECK (ID_BASE IN(1)) --restriccion de tipo (1)
);
--secuencia
CREATE SEQUENCE TRIPULACION_SEQ;
--disparador
CREATE TRIGGER INSERT_TRIPULACION
BEFORE INSERT ON TRIPULACION FOR EACH ROW BEGIN
SELECT TRIPULACION_SEQ.NEXTVAL INTO:NEW.ID_TRIPULACION FROM DUAL;
END;

--aviones
CREATE TABLE AVIONES(
ID_AVION NUMBER PRIMARY KEY,
MODELO NVARCHAR2(30),
ID_BASE NUMBER,
CONSTRAINT FK_IDBASE_AVIONES     --llave foreana de base
FOREIGN KEY (ID_BASE)
REFERENCES BASE (ID_BASE),
CONSTRAINT CHECK_BASE_AVIONES CHECK (ID_BASE IN(2)) --restriccion de tipo (2) mantenimiento
);
--secuencia
CREATE SEQUENCE AVIONES_SEQ;
--disparador
CREATE TRIGGER INSERT_AVIONES
BEFORE INSERT ON AVIONES FOR EACH ROW BEGIN
SELECT AVIONES_SEQ.NEXTVAL INTO:NEW.ID_AVION FROM DUAL;
END;


--vuelos
CREATE TABLE VUELOS(
ID_VUELO NUMBER PRIMARY KEY,
ORIGEN NVARCHAR2(30),
DESTINO NVARCHAR2(30),
HORAFECHA DATE,
ID_PILOTO NUMBER,
CONSTRAINT FK_IDPILOTO_VUELOS    --llave foreana
FOREIGN KEY (ID_PILOTO)
REFERENCES PILOTOS (ID_PILOTO),
ID_AVION NUMBER,
CONSTRAINT FK_IDAVION_VUELOS    --llave foreana
FOREIGN KEY (ID_AVION)
REFERENCES AVIONES (ID_AVION)
);
--secuencia
CREATE SEQUENCE VUELOS_SEQ;
--creamos el disparador 
CREATE TRIGGER INSERT_VUELOS 
BEFORE INSERT ON VUELOS FOR EACH ROW BEGIN
SELECT VUELOS_SEQ.NEXTVAL INTO:NEW.ID_VUELO FROM DUAL;
END;


------------------------------
CREATE TABLE TRIPULACION_VUELO(
ID_TV NUMBER PRIMARY KEY,
ID_TRIPULACION NUMBER,
ID_VUELO NUMBER,
CONSTRAINT FK_IDTRIPULACION_TV   --llave foreana
FOREIGN KEY (ID_TRIPULACION)
REFERENCES TRIPULACION (ID_TRIPULACION),
CONSTRAINT FK_IDVUELO_TV    --llave foreana
FOREIGN KEY (ID_VUELO)
REFERENCES VUELOS (ID_VUELO)
);

--secuencia
CREATE SEQUENCE TV_SEQ;
--disparador
CREATE TRIGGER INSERT_TV
BEFORE INSERT ON TRIPULACION_VUELO FOR EACH ROW BEGIN
SELECT TV_SEQ.NEXTVAL INTO:NEW.ID_TV FROM DUAL;
END;


----boletos
CREATE TABLE BOLETOS(
ID_BOLETO NUMBER PRIMARY KEY,
ID_VUELO NUMBER,
ID_CLIENTE NUMBER,
COSTO NUMBER(8,2),
CONSTRAINT FK_IDVUELO_BOLETOS   --llave foreana
FOREIGN KEY (ID_VUELO)
REFERENCES VUELOS (ID_VUELO),
CONSTRAINT FK_IDCLIENTE_BOLETOS    --llave foreana
FOREIGN KEY (ID_CLIENTE)
REFERENCES CLIENTES_VUELO (ID_CLIENTE)
);
--secuencia
CREATE SEQUENCE BOLETOS_SEQ;
--disparador
CREATE TRIGGER INSERT_BOLETOS
BEFORE INSERT ON BOLETOS FOR EACH ROW BEGIN
SELECT BOLETOS_SEQ.NEXTVAL INTO:NEW.ID_BOLETO FROM DUAL;
END;

COMMIT;

--INSERCION DE DATOS
--Entidades fuertes
INSERT INTO BASE (ID_BASE, TIPO) VALUES (1, 'DESCANSO');
INSERT INTO BASE (ID_BASE, TIPO) VALUES (2, 'MANTENIMIENTO');

SELECT * FROM BASE;

DESCRIBE CLIENTES_VUELO;
INSERT ALL
INTO CLIENTES_VUELO(NOMBRE, DIRECCION, TELEFONO, EMAIL) 
VALUES ('MARIO', 'ZACATECAS', '4798156512', 'mario@gmail.com')
INTO CLIENTES_VUELO(NOMBRE, DIRECCION, TELEFONO, EMAIL) 
VALUES ('JOSE ZAHID', 'EDOMEX', '4798156973', 'jose@gmail.com')
INTO CLIENTES_VUELO(NOMBRE, DIRECCION, TELEFONO, EMAIL) 
VALUES ('GABY', 'VERACRUZ', '4798151512', 'gaby@gmail.com')
INTO CLIENTES_VUELO(NOMBRE, DIRECCION, TELEFONO, EMAIL) 
VALUES ('AARON', 'PUEBLA', '4798715651', 'aaron@gmail.com')
INTO CLIENTES_VUELO(NOMBRE, DIRECCION, TELEFONO, EMAIL) 
VALUES ('LUIS', 'MICHOACAN', '4798516546', 'luis@gmail.com')
SELECT * FROM DUAL;

SELECT * FROM CLIENTES_VUELO;

--insercion de registros Pilotos
DESCRIBE PILOTOS;
INSERT ALL
INTO PILOTOS (NOMBRE, HORASVUELO, ID_BASE)
VALUES ('GERARDO', 1200, 1)
INTO PILOTOS (NOMBRE, HORASVUELO, ID_BASE)
VALUES ('CESAR', 700, 1)
INTO PILOTOS (NOMBRE, HORASVUELO, ID_BASE)
VALUES ('PEDRO', 450, 1)
INTO PILOTOS (NOMBRE, HORASVUELO, ID_BASE)
VALUES ('JUAN', 1400, 1)
INTO PILOTOS (NOMBRE, HORASVUELO, ID_BASE)
VALUES ('GUSTAVO', 300, 1)
SELECT * FROM DUAL;

SELECT * FROM PILOTOS;

--ACTUALIZAR UN REGISTRO INDIVIDUAL
UPDATE PILOTOS SET NOMBRE='ALBERTO' WHERE ID_PILOTO=8;

--insercion en tripulacion
DESCRIBE TRIPULACION; 

INSERT ALL
INTO TRIPULACION(NOMBRE, ID_BASE) VALUES ('EDUARDO',1)
INTO TRIPULACION(NOMBRE, ID_BASE)VALUES ('CAROLINA',1)
INTO TRIPULACION(NOMBRE, ID_BASE)VALUES ('STEPHANY',1)
INTO TRIPULACION(NOMBRE, ID_BASE)VALUES ('JUAN',1)
INTO TRIPULACION(NOMBRE, ID_BASE)VALUES ('ANDRES',1)
SELECT * FROM DUAL;

SELECT * FROM TRIPULACION;

--insercion de registros Aviones
DESCRIBE AVIONES;
INSERT ALL INTO AVIONES (MODELO, ID_BASE) VALUES ('BOEING-1900', 2)
INTO AVIONES (MODELO, ID_BASE) VALUES ('AIRBUS-900', 2)
INTO AVIONES (MODELO, ID_BASE) VALUES ('BOEING-3900', 2)
INTO AVIONES (MODELO, ID_BASE) VALUES ('BOEING-2300', 2)
INTO AVIONES (MODELO, ID_BASE) VALUES ('PELICAN-2300', 2)
SELECT * FROM DUAL;

SELECT * FROM AVIONES;


--Registros en vuelos
DESCRIBE VUELOS;

INSERT ALL
INTO VUELOS (ORIGEN, DESTINO, HORAFECHA, ID_PILOTO, ID_AVION)
VALUES ('VIENNA', 'TOKIO', TO_DATE('02/03/2023 14:30:00', 'DD-MM-YYYY HH24:MI:SS'), 1,2)
INTO VUELOS (ORIGEN, DESTINO, HORAFECHA, ID_PILOTO, ID_AVION)
VALUES ('PARIS', 'EGIPTO', TO_DATE('03/03/2023 17:30:00', 'DD-MM-YYYY HH24:MI:SS'), 2,3)
INTO VUELOS (ORIGEN, DESTINO, HORAFECHA, ID_PILOTO, ID_AVION)
VALUES ('TIJUANA', 'ACAPULCO', TO_DATE('04/03/2023 12:00:00', 'DD-MM-YYYY HH24:MI:SS'), 4,1)
INTO VUELOS (ORIGEN, DESTINO, HORAFECHA, ID_PILOTO, ID_AVION)
VALUES ('CDMX', 'MOSCU', TO_DATE('05/03/2023 16:10:00', 'DD-MM-YYYY HH24:MI:SS'), 3,5)
INTO VUELOS (ORIGEN, DESTINO, HORAFECHA, ID_PILOTO, ID_AVION)
VALUES ('BERLIN', 'ROMA', TO_DATE('06/03/2023 15:50:00', 'DD-MM-YYYY HH24:MI:SS'), 5,5)
SELECT * FROM DUAL;

SELECT * FROM VUELOS;
    
--Insercion Tripulacion Vuelo
DESCRIBE TRIPULACION_VUELO;

INSERT ALL 
INTO TRIPULACION_VUELO(ID_TRIPULACION, ID_VUELO) VALUES (1,5)
INTO TRIPULACION_VUELO(ID_TRIPULACION, ID_VUELO) VALUES (2,3)
INTO TRIPULACION_VUELO(ID_TRIPULACION, ID_VUELO) VALUES (3,1)
INTO TRIPULACION_VUELO(ID_TRIPULACION, ID_VUELO) VALUES (4,4)
INTO TRIPULACION_VUELO(ID_TRIPULACION, ID_VUELO) VALUES (5,2)
SELECT * FROM DUAL;

SELECT * FROM TRIPULACION_VUELO;


--Insercion Boletos
DESCRIBE BOLETOS;

INSERT ALL
INTO BOLETOS (ID_VUELO, ID_CLIENTE, COSTO) VALUES (1,2,25000.00)
INTO BOLETOS (ID_VUELO, ID_CLIENTE, COSTO) VALUES (3,4,5000.00)
INTO BOLETOS (ID_VUELO, ID_CLIENTE, COSTO) VALUES (5,1,35000.00)
INTO BOLETOS (ID_VUELO, ID_CLIENTE, COSTO) VALUES (2,5,50000.00)
INTO BOLETOS (ID_VUELO, ID_CLIENTE, COSTO) VALUES (4,3,125000.00)
SELECT * FROM DUAL;

SELECT * FROM BOLETOS;

UPDATE BOLETOS SET COSTO=8000.88 WHERE ID_BOLETO=5;




INSERT INTO TRIPULACION(NOMBRE, ID_BASE) VALUES ('MANUEL',1);
SELECT * FROM TRIPULACION;
--
--REVERTIR LA INSERCION DE LOS DATOS, ACTUALIZACION O BORRADO, NOS LLEVA AL ULTIMO COMMIT
ROLLBACK;

DELETE FROM TRIPULACION WHERE ID_TRIPULACION=8;

--Borrar un registro haciendolo coincidir  con otro campo
DELETE FROM TRIPULACION WHERE NOMBRE='MANUEL';

--CONSULTA DE TODOS LOS DATOS DE UNA TABLA
SELECT * FROM nombre_tabla;

--Realizar consulta especifica de columnas especif
SELECT NOMBRE, ID_PILOTO FROM PILOTOS;

--CONSULTAR DATOS CON UNA DETERMINADA CONDICION
SELECT NOMBRE, HORASVUELO FROM PILOTOS WHERE HORASVUELO>700;

--CONSULTAR DATOS CON MAS DE UNA CONDICION Y CONCATENAR CON AND
SELECT NOMBRE, HORASVUELO FROM PILOTOS WHERE HORASVUELO<700 AND NOMBRE='GUSTAVO';

--CONSULTAR DATOS PARA BUSCAR RANGOS MEDIANTE BETWEEN
SELECT NOMBRE, HORASVUELO FROM PILOTOS WHERE HORASVUELO BETWEEN 400 AND 1200;

--Consultar valores similares 
SELECT * FROM PILOTOS WHERE NOMBRE LIKE 'P%';--inicia con P

SELECT * FROM PILOTOS WHERE NOMBRE LIKE '%O';--termina con O

--FUNCIONES DE AGREGACION
SELECT MAX(HORASVUELO) FROM PILOTOS;--maximo

SELECT MIN(HORASVUELO) FROM PILOTOS;--minimo

--Buscar al piloto con mas horas de vuelo
SELECT * FROM PILOTOS WHERE HORASVUELO = (SELECT MAX(HORASVUELO) FROM PILOTOS);
COMMIT;

--ESTABLECER UNA COLUMNA CON VALORES NULOS
UPDATE PILOTOS SET HORASVUELO=NULL;--Actualizar los valores a nulos
SELECT *FROM PILOTOS;

ROLLBACK;


--Realizar conteo de las filas o registros para determinados datos
SELECT COUNT (ID_PILOTO) FROM PILOTOS WHERE HORASVUELO>700; --nos retorna el valor de cuantos registos cumplen determinada condicion

--Obtener el promedio de los valores de una columna
SELECT AVG(HORASVUELO) FROM PILOTOS;
--Sumatoria de una columna
SELECT SUM(HORASVUELO) FROM PILOTOS;



--FUNCIONES GROUP BY
--Mostrar cuantos alumnos  hay por genero
SELECT COUNT(ID_ALUMNO), SEXO FROM ALUMNO GROUP BY SEXO;

SELECT * FROM ALUMNO;

--Ordenar registros de forma descendente
SELECT * FROM ALUMNO ORDER BY NOMBRE DESC;

SELECT * FROM ALUMNO ORDER BY NOMBRE ASC;--ascendente



--Buscar los datos de la tripulacion que estuvo con un determinado cliente en un vuelo, cliente=
SELECT * FROM TRIPULACION WHERE ID_TRIPULACION = 
(SELECT ID_TRIPULACION FROM TRIPULACION_VUELO WHERE ID_VUELO =
(SELECT ID_BOLETO FROM BOLETOS WHERE ID_CLIENTE = 
(SELECT ID_CLIENTE FROM CLIENTES_VUELO WHERE NOMBRE = 'GABY')));



---CONSULTAS CON JOINS
--INNER JOIN se muestran los regitros que coinciden de una tabla A y una tabla B
--La coincidencia de ambas se muestra en el medio del campo que los une
--Esto se logra gracias al uso de valores compartidos (primary keys, foreign keys)
--Indicamos INNER JOIN o JOIN

SELECT * FROM PILOTOS--seleccionar la tabla a
INNER JOIN BASE--indicamos la union de la tabla b con INNER JOIN
ON PILOTOS.ID_BASE=BASE.ID_BASE;--indicamos donde se unen con ON y dato en comun con el nombre de la tabla y su columna
--=
SELECT * FROM PILOTOS
JOIN BASE
ON PILOTOS.ID_BASE=BASE.ID_BASE;

--Podemos crear alias de la tabla, para evitar escribir nombres completos
SELECT * FROM PILOTOS P--crear alias
JOIN BASE B--alias
ON P.ID_BASE=B.ID_BASE;--solo ponemos alias

--FORMA IMPLICITA
SELECT * FROM PILOTOS, BASE--omitimos la instruccion join
WHERE PILOTOS.ID_BASE=BASE.ID_BASE;--se sustituye on por where


--LEFT JOIN muestran o priorizan los datos o elementos de la primera tabla, 
--y se muestran las coincidencias con la segunda tabla
SELECT * FROM PILOTOS--PRIORIDAD
LEFT JOIN BASE
ON PILOTOS.ID_BASE=BASE.ID_BASE;

SELECT * FROM BASE--PRIORIDAD
LEFT JOIN PILOTOS
ON PILOTOS.ID_BASE=BASE.ID_BASE;


--RIGHT
SELECT * FROM BASE--PRIORIDAD
RIGHT JOIN PILOTOS
ON PILOTOS.ID_BASE=BASE.ID_BASE;


--FULL JOIN
SELECT * FROM PILOTOS
FULL JOIN BASE
ON PILOTOS.ID_BASE=BASE.ID_BASE;


--Buscar los datos de la tripulacion que estuvo con un determinado cliente en un vuelo, cliente=

SELECT T.ID_TRIPULACION, T.NOMBRE, T.ID_BASE FROM TRIPULACION T
JOIN TRIPULACION_VUELO TV
ON T.ID_TRIPULACION=TV.ID_TRIPULACION
JOIN BOLETOS B
ON B.ID_VUELO=TV.ID_VUELO
JOIN CLIENTES_VUELO CV
ON CV.ID_CLIENTE=B.ID_CLIENTE
WHERE CV.NOMBRE='GABY';


COMMIT;

SELECT A.ID_AVION, A.MODELO, V.DESTINO FROM AVIONES A
JOIN VUELOS V
ON A.ID_AVION=V.ID_AVION
JOIN PILOTOS P
ON V.ID_PILOTO=P.ID_PILOTO
WHERE P.HORASVUELO=(SELECT MAX(HORASVUELO) FROM PILOTOS); 


DESCRIBE VUELOS;


SELECT AVIONES.ID_AVION,AVIONES.MODELO,VUELOS.DESTINO FROM PILOTOS
INNER JOIN VUELOS
ON VUELOS.ID_PILOTO=PILOTOS.ID_PILOTO
INNER JOIN AVIONES
ON AVIONES.ID_AVION=VUELOS.ID_AVION
WHERE PILOTOS.HORASVUELO= (SELECT MIN (HORASVUELO) FROM PILOTOS);



