--Se quiere dise�ar una base de datos relacional para gestionar los datos
--de los socios de un club n�utico
--De cada socio se guardan datos personales
--y los datos del barco o barcos que posee
--n�mero de matr�cula, nombre, numero del amarre y cuotra que paga
--adem�s se quiere mantener informaci�n sobre las salidas realizadas
--por cada barco, como la fecha y hora de salida, el destino
-- y los datos personales del patr�n, que no tiene porque ser el 
--propietario del barco, ni es necesario que sea socio del club.


CREATE TABLE SOCIOS (
ID_SOCIO NUMBER PRIMARY KEY,
NOMBRE NVARCHAR2(15),
EDAD NUMBER,
SEXO NVARCHAR2(1),
STATUS NVARCHAR2(4),
ID_BARCO NUMBER,
MEMBRESIA NUMBER UNIQUE
);

DROP TABLE SOCIOS;--BORRAR TABLA SOCIOS

CREATE TABLE BARCOS (
ID_BARCO NUMBER PRIMARY KEY,
NOMBRE NVARCHAR2(15),
NUMAMARRE NUMBER(5),
CUOTA NUMBER(10)

);

ALTER TABLE BARCOS ADD ID_SALIDA NUMBER;
---------------
INSERT INTO BARCOS (ID_BARCO, NOMBRE,NUMAMARRE, CUOTA, ID_SALIDA) 
VALUES (1,'LA PINTA',00001,15000,1);

CREATE TABLE SALIDAS(
ID_SALIDA NUMBER PRIMARY KEY,
FECHA DATE,
HORA TIMESTAMP,
DESTINO NVARCHAR2(18),
PATRON NVARCHAR2(15)
);
ALTER TABLE SALIDAS ADD ID_PATRON NUMBER;
DROP TABLE SALIDAS;
ALTER TABLE SALIDAS DROP COLUMN HORA;

-------
CREATE TABLE PATRON (
ID_PATRON NUMBER PRIMARY KEY,
NOMBRE NVARCHAR2(15),
EDAD NUMBER,
SEXO NVARCHAR2(1),
DIRECCION NVARCHAR2(20)

);
INSERT INTO PATRON (ID_PATRON, NOMBRE, EDAD, SEXO, DIRECCION) VALUES (1,'DIEGO',29,'M','96PTE COL. ROMA');
--FOREIGN KEY 
ALTER TABLE SOCIOS
ADD CONSTRAINT FK FOREIGN KEY (ID_SOCIO)
REFERENCES BARCOS (ID_BARCO);

--FOREIGN KEY DE SALIDAS
ALTER TABLE BARCOS
ADD CONSTRAINT FK_IDSALIDA FOREIGN KEY (ID_SALIDA)
REFERENCES SALIDAS (ID_SALIDA);



--FK key de patron
ALTER TABLE SALIDAS
ADD CONSTRAINT FK_IDPATRON FOREIGN KEY (ID_PATRON)
REFERENCES PATRON (ID_PATRON);


DESCRIBE SALIDAS;
INSERT INTO SALIDAS (ID_SALIDA, FECHA, DESTINO, PATRON,ID_PATRON) VALUES(1,TO_DATE('21/01/2023 13:30:00','DD-MM-YYYY HH24:MI:SS'),'COREA','DIEGO',1);
SELECT * FROM SALIDAS;

SELECT * FROM PATRON;

SELECT SYSDATE FROM DUAL; --para consultar formato de fecha