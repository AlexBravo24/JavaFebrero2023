-- con dos guiones puedo poner un comentario

/* Podemos poner comentarios de multiples lineas
SQL - Lensguaje de consulta estructurado
Es un lenguaje para actualizar, obtener y calcular informacion con
bases de datos relacionales

Base de datos - Conjunto de datos organizados y relacionados entre si
y que son almacenados en tablas
*/

/*
La estructura de las tablas queda de la siguiente manera

- Toda tabla debe llevar una llave primaria
(Id o un numero que identifique un registro de la misma)
Pueden llevar tambien llaves foraneas
- Una llave foranea es la llave primaria que proviene de otra tabla
- De de llevar un tipo de dato, pueden ser numericos, caracteres, fecha etc...

Caracter - Char,Varchar,Varchar2,Nchar,NVARCHAR2
Numericos - long,int,NUMBER
*/

-- Crear una tabla de ejemplo
-- Almacenar datos de una persona

--id de la persona
--nombre
--edad
--sexo

--Creando la tabla de la persona
--La sintaxis para crear una tabla es la siguiente
-- CREATA TABLE nombredelatabla(
--nombrecampo1,tipodedato
--nombrecampofinal, tipodedato );

--create table Persona(INE number primary key, nombre nvarchar2(20), edad number, sexo nvarchar2(1));

--Para ver la estructura de una tabla usamos esta sentencia
--Describe Persona;

/*Hay que establecer valores que no cambien, como en este caso
la edad
lo ideal seria cambiar el tipo de dato por date
*/

--eliminar tabla
--Drop table Persona;

/*Crear una tabla de alumnos
matricula
nombre
fecha de nacimiento
sexo
semestre
status si es alumno activo escolarmente
*/

--crear tabla alumno
create table Alumno(
ID_Alumno number primary key,
Nombre Nvarchar2(30),
FechaNac Date,
Sexo Nvarchar2(1),
Semestre Nvarchar2(30),
Status Number
);

--crear una tabla de carreras
Create table Carreras(
Id_Carrera number primary key,
Nombre Nvarchar2(30),
DuracionSem number,
Area Nvarchar2(30),
Creditos number
);

/*Entidades fuertes no dependen de otras para existir, tienen
sus datos completos
Entidades debiles dependen de otra tabla u otros datos para
existir, se identifican facilmente por que reciben llaves
foraneas
*/

/*Creamos una tabla que nos permita relacionar a los alumnos
con sus carreras
*/

create table Carreras_Alumnos(
Id_CA number primary key,
Id_Carrera number,
Id_Alumno number
);

/*Agregar restricciones a una tabla
las restricciones deben llevar un nombre y se identifican
con la palabra contraint
*/
--Vamos a agregar una restriccion en el sexo en la tabla alumno
--para que solo podamos introducir "Masculino" o "Femenino"

alter table Alumno add constraint Check_Sexo
Check(Sexo in('Masculino','Femenino'));

describe alumno;

/*Borrar o eliminar una restrinccion de una tabla*/

alter table Alumno drop constraint Check_Sexo;

alter table Alumno add constraint Check_Sexo
Check(Sexo in('Masculino','Femenino'));

alter table Alumno modify Sexo Nvarchar2(10);

--Crear otra restriccion, para no repetir valores en carrera
--Unique, para agregar una restriccion unica en un registro
alter table Carreras add constraint UNQ_Nombre_Carrera 
unique (Nombre);

/*agregando una llave foranea
una llave foranea es una restrccion porque vamos
a especificar de donde proviene dicha llave
Sintaxis general
alter table nombretabla add constraint nombrerestriccion
foreignkey (columna que recibe)
references nombredetabla (clumna con llave primaria);*/

--Crear llave foranea de id alumno
alter table Carreras_Alumnos add constraint FK_Id_Alumno
FOREIGN KEY (Id_Alumno) References Alumno(Id_Alumno);

--Crear llave foranea de id carrera
alter table Carreras_Alumnos add constraint FK_Id_Carreras
FOREIGN KEY (Id_Carrera) References Carreras(Id_Carrera);

alter table Carreras_Alumnos drop constraint FK_Id_Carreras;

describe Carreras;

/*agregar una columna a una tabla existente*/

alter table Carreras add Presupuesto number;

alter table Carreras drop column Presupuesto;

alter table Carreras add Presupuesto number(6,2);
/*podemos indicar el uso de decimales indicando la longitud
y separamos con una coma cuantas posiciones serian decimales*/

--Renombrar una columna
alter table Carreras Rename column Presupuesto to Presupuesto_Mensual;

describe Carreras;

/*Modificar el tipo de dato de la columna siempre y cuando 
no tenga datos insertados*/

alter table Carreras modify Presupuesto_Mensual Nvarchar2(10);

--insercion de datos individuales

describe alumno;

insert into alumno values
(1,'Eduardo','13-Oct-97','Masculino','8o Semestre',1);

insert into alumno values
(2,'Estefany','23-Oct-97','Femenino','8o Semestre',1);

insert into alumno values
(3,'Juan','06-Oct-97','Masculino','8o Semestre',1);

insert into alumno values
(4,'Luis','04-Jan-98','Masculino','8o Semestre',1);

insert into alumno values
(5,'Gabriela','13-Oct-97','Femenino','8o Semestre',1);

SELECT SYSDATE FROM DUAL;

/*Realizando una consulta general de los datos ingresados en una tabla*/

select * from alumno;

/*Para confirmar cambios de los registros que insertamos GUARDAR*/

commit;

/*Borrar un registro especificando un campo a coincidir
con el registro*/

delete from alumno where id_Alumno=5;

describe carreras;

--insercion de datos en carrera

insert into carreras values
(1,'Ing Sistemas',8,'Exactas',400,9000);

insert into carreras values
(2,'Medicina',10,'Biologico',400,9500);

insert into carreras values
(3,'Nutricion',8,'Biologicos',400,9000);

insert into carreras values
(4,'Mercadotecnia',8,'Administrativa',300,8000);

insert into carreras values
(5,'Derecho',8,'Humanidades',300,9000);

select * from carreras;

commit;

--insertar datos en nuestra tabla relacional

describe carreras_alumnos;

insert into carreras_alumnos values(1,1,2);
insert into carreras_alumnos values(2,2,1);
insert into carreras_alumnos values(3,3,4);
insert into carreras_alumnos values(4,5,3);

select * from alumno;
select * from carreras;

--Ejercicio
/*Crear una tabla llamada tutores
id del tutor,nombre,sexo,telefono,clave del tutor
restricciones en la clave del tutor(a,b,c,d)
insertar 5 registros

crear una tabla relacional alumno tutores
id de la tabla
id alumno llave foranea
id tutor llave foranea
insertar 5 registros*/

create table Tutores
(Id_Tutor number primary key, nombre nvarchar2(20),
sexo nvarchar2(1), telefono number, Clave_Tutor nvarchar2(20));

alter table Tutores add constraint Check_Clave
Check(Clave_Tutor in('a','b','c','d'));

insert into tutores values (1,'Alfonso','M',9231394960,'a');
insert into tutores values (2,'Selene','F',9231114960,'b');
insert into tutores values (3,'Itzel','F',9268994960,'c');
insert into tutores values (4,'Rual','M',9231397060,'d');
insert into tutores values (5,'Isauro','M',9230004960,'a');

describe tutores;
select * from tutores;

create table Alumnos_Tutores
(Id_AT number primary key, Id_Alumno number, Id_Tutor number);

alter table Alumnos_Tutores add constraint Fo_Id_Alumno
FOREIGN KEY (Id_Alumno) References Alumno(Id_Alumno);

alter table Alumnos_Tutores add constraint Fo_Id_Tutor
FOREIGN KEY (Id_Tutor) References Tutores(Id_Tutor);

insert into alumnos_tutores values(1,1,1);
insert into alumnos_tutores values(2,2,2);
insert into alumnos_tutores values(3,3,3);
insert into alumnos_tutores values(4,4,4);
insert into alumnos_tutores values(5,1,5);

/*Emplear secuencias
Crear secuencias
Se emplean para generar valores de numeros enteros
pueden ser consecutivos o con un incremento que nosotros indiquemos
se utiliza para generar automaticamente una secuencia en 
de las llaves primarias
y asi asegurarnos que los valores no se repiten
creando una secuencia definiendo los valores*/

create sequence Alumno_Seq --crear la secuencia
start with 5 --indicamos el valor en el que inicia la secuencia
increment by 1 --incrementamos el valor de la secuencia como se le indique
maxvalue 999 --indicamos el valor maximo de la secuencia
minvalue 1 --indicamos el valor minimo de la secuencia
cycle; --indicamos si la secuencia se repite o no (no cycle)

/*Trigger (disparador)
ejecuta o desencadena una accion*/

create trigger Insert_Alumno --creamos el trigger y su nombre
before insert on Alumno for each row begin --donde se ejecuta el trigger
select Alumno_Seq.nextval into:new.Id_Alumno from dual; --selecciona el valor de la secuencia y lo inserta
end;

describe alumno;

insert into alumno values(1,'Alejandro','14-Mar-90','Masculino','8o Semestre',1);

select * from alumno;

select * from alumnos_tutores;

drop table alumnos_tutores;

/*Crear una secuencia con valores por default*/

create sequence alumnos_tutores_Seq;

insert into alumnos_tutores values(5,2,1);

/*insertando valores indicando solo las columnas en las que vamos a insertar datos*/
insert into alumnos_tutores (Id_Alumno, Id_Tutor) values (1,2);
insert into alumnos_tutores (Id_Alumno, Id_Tutor) values (2,3);

/*otra forma de insercion masiva*/
insert all
into alumno (nombre,fechanac,semestre,status) values 
('Alejandro','14-Mar-90','Masculino','8o Semestre',1)
 into alumno (nombre,fechanac,semestre,status)values
('Estefany','23-Oct-97','Femenino','8o Semestre',1)
into alumno (nombre,fechanac,semestre,status)values
(3,'Juan','06-Oct-97','Masculino','8o Semestre',1)
select * from dual;


select * from tutores;

commit;

/*Ejercicio 1 Asuntos y procuradores*/

create table Clientes
(Id_Cli number primary key, DNI Nvarchar2(10),Nombre Nvarchar2(20),Direccion Nvarchar2(20));

create table Asuntos
(Id_Num number primary key, FechaInicio Date, FechaArchivo Date, Estado Nvarchar2(15));

create table Procuradores
(Id_Pro number primary key, NombrePro Nvarchar2(10), DireccionPro Nvarchar2(20));

create table Asuntos_Clientes
(Id_AA number primary key, Id_Num number, Id_Cli number);

drop table Asuntos_Clientes;

alter table Asuntos_Clientes add constraint FK_Id_Asuntos
FOREIGN KEY (Id_Num) References Asuntos(Id_Num);

alter table Asuntos_Clientes add constraint FK_Id_Clientes
FOREIGN KEY (Id_Cli) References Clientes(Id_Cli);

create table Asuntos_Procuradores
(Id_AP number primary key, Id_Num number, Id_Pro number);

alter table Asuntos_Procuradores add constraint FK_Id_Procuradores
FOREIGN KEY (Id_Pro) References Procuradores(Id_Pro);

alter table Asuntos_Procuradores add constraint FK_Id_Asuntos_Pro
FOREIGN KEY (Id_Num) References Asuntos(Id_Num);

commit;

create table Patron
(Id_Patron number primary key, Nombre Nvarchar2(20), Direccion Nvarchar2(20));

create table Salidas
(Id_Salidas number primary key, Fecha Date, Hora TIMESTAMP, Destino Nvarchar2(20),Id_Patron number);

create table Barcos
(Id_Barcos number primary key, Matricula NVARCHAR2(20), Nombre Nvarchar2(20),Num_Amarre number,Cuota number,Id_Salidas number);

create table Socios
(Id_Socios number primary key, Nombre Nvarchar2(20), Direccion Nvarchar2(20), Id_Barcos number);

alter table Salidas add constraint FK_Id_Patron
FOREIGN KEY (Id_Patron) References Patron(Id_Patron);

alter table Barcos add constraint FK_Id_Barcos
FOREIGN KEY (Id_Salidas) References Salidas(Id_Salidas);

alter table Socios add constraint FK_Id_Socios
FOREIGN KEY (Id_Barcos) References Barcos(Id_Barcos);

describe Socios;

insert into Patron values (1,'Jose','Prolongacion');

insert into Salidas (id_salidas,fecha,destino)
values (1,'10-Feb-22','Cabo verde');

insert into Barcos (id_barcos,matricula,nombre,num_amarre,cuota)
values (1,'JUDJ970','Titanica',5,5000);

insert into Socios (id_Socios,nombre,direccion,id_barcos)
values (1,'Jorge','Veracruz',1);

delete from Socios where nombre = 'Jorge';

select * from Socios join Barcos on Socios.Id_Barcos = Barcos.Id_Barcos;

select * from Salidas,Barcos;

--Ejercicio Aerolinea

create table bases(
Id_Base number primary key, Tipo Nvarchar2(20));

--Creamos la secuencia para la tabla de bases
create sequence Bases_Seq;
--Creamos el disparador para la tabla bases
create trigger Insert_Bases
Before insert on Bases for each row begin
Select Bases_Seq.NextVal into:New.Id_Base from dual;
end;

--Creamos la entidad cliente
create table Clientes_Vuelos(
Id_Cliente number primary key, Nombre Nvarchar2(30),
Direccion Nvarchar2(30), Telefono Nvarchar2(10), Email Nvarchar2(30));

create sequence Clientes_Seq;

create trigger Insert_Clientes before insert on Clientes_Vuelos
for each row begin select Clientes_Seq.NextVal into:New.Id_Cliente from dual;
end;

--Creando entidades debiles
create table Pilotos(
Id_Piloto number primary key, Nombre Nvarchar2(30),HorasVuelo number,
Id_Base number,
constraint Fk_IdBase_Pilotos
Foreign key (Id_Base)
references Bases(Id_Base),
constraint Check_Base_Pilotos check (Id_Base in (1))
);

create sequence Piloto_Seq;

create trigger Insert_Pilotos before insert on Pilotos
for each row begin select Piloto_Seq.NextVal into:New.Id_Piloto from dual;
end;

drop trigger Insert_Pilotos;

--

create table Tripulacion(
Id_Tripulacion number primary key,
Nombre Nvarchar2(30),
Id_Base number,
constraint Fk_IdBase_Tripulacion
Foreign key (Id_Base)
references Bases(Id_Base),
constraint Check_Base_Tripulacion check (Id_Base in (1))
);

create Sequence Tripulacion_Seq;

create trigger Insert_Tripulacion before insert on Tripulacion
for each row begin select Tripulacion_Seq.NextVal into:New.Id_Tripulacion from dual;
end;

--
create table Aviones(
Id_Avion number primary key,
Modelo Nvarchar2(30),
Id_Base number,
constraint Fk_IdBase_Aviones
Foreign key (Id_Base)
references Bases(Id_Base),
constraint Check_Base_Aviones check (Id_Base in (2))
);

create sequence Aviones_Seq;

create trigger Insert_Aviones before insert on Aviones
for each row begin select Aviones_Seq.NextVal into:New.Id_Avion from dual;
end;

create table vuelos(
Id_Vuelo Number primary key,
Origen Nvarchar2(30),
Destino Nvarchar2(30),
HoraFecha Date,
Id_Piloto number,
Id_Avion number,
constraint Fk_IdPiloto_Vuelos
Foreign key (Id_Piloto)
references Pilotos(Id_Piloto),
constraint Fk_IdAvion_Vuelos
Foreign key (Id_Avion)
references Aviones(Id_Avion)
);

create sequence Vuelos_Seq;

create trigger Insert_Vuelos
before insert on Vuelos for each row begin
select Vuelos_Seq.NextVal into:New.Id_Vuelo from dual;
end;

create table Tripulacion_Vuelo(
Id_Tv number primary key,
Id_Tripulacion number,
Id_Vuelo number,
constraint Fk_IdTripulacion_Tv
Foreign key (Id_Tripulacion)
references Tripulacion (Id_Tripulacion),
constraint Fk_IdVuelo_Tv
Foreign key (Id_Vuelo)
references Vuelos(Id_Vuelo)
);

create sequence TV_Seq;

create trigger Insert_Tv
before insert on Tripulacion_Vuelo for each row begin
select Tv_Seq.NextVal into:New.Id_Tv from dual;
end;

create table Boletos(
Id_Boleto number primary key,
Id_Vuelo number,
Id_Cliente number,
Costos number(8,2),
constraint Fk_IdVuelo_Boletos
Foreign key (Id_Vuelo)
references Vuelos (Id_Vuelo),
constraint Fk_IdCliente_Boletos
Foreign key (Id_Cliente)
references Clientes_Vuelos(Id_Cliente)
);

drop table boletos;

select * from boletos;

create sequence Boletos_Seq;

create trigger Insert_Boletos
before insert on Boletos for each row begin
select Boletos_Seq.NextVal into:New.Id_Boleto from dual;
end;

drop sequence Boletos_Seq;

drop trigger Insert_Boletos;
----------------------------
--Insercion de registros, comenzando por las entidades fuertes
--Insercion de registros de bases
insert into bases (Id_Base,Tipo) values (1,'Descanso');
insert into bases (Id_Base,Tipo) values (1,'Mantenimiento');

select * from bases;

--Insercion de registros de Clientes

insert all
into Clientes_Vuelos(Nombre,Direccion,Telefono,Email) values
('Mario','Zacatecas',9231394960,'mario@gmail.com')
into Clientes_Vuelos(Nombre,Direccion,Telefono,Email) values
('Jose Zahid','Edomex',8231394960,'jose@gmail.com')
into Clientes_Vuelos(Nombre,Direccion,Telefono,Email) values
('Gabriela','Veracrruz',7231394960,'gaby@gmail.com')
into Clientes_Vuelos(Nombre,Direccion,Telefono,Email) values
('Aaron','Puebla',6231394960,'aaron@gmail.com')
into Clientes_Vuelos(Nombre,Direccion,Telefono,Email) values
('Luis','Michoacan',5231394960,'luis@gmail.com')
select * from dual;

select * from Clientes_Vuelos;

--Insercion de registros de pilotos

describe Pilotos;

Insert all
into Pilotos(Nombre,HorasVuelo,Id_Base) values
('Gerardo',1200,1)
into Pilotos(Nombre,HorasVuelo,Id_Base) values
('Cesar',700,1)
into Pilotos(Nombre,HorasVuelo,Id_Base) values
('Pedro',1200,1)
into Pilotos(Nombre,HorasVuelo,Id_Base) values
('Juan',1400,1)
into Pilotos(Nombre,HorasVuelo,Id_Base) values
('Gustavo',300,1)
select * from dual;

select * from Pilotos;

commit;

-- INSERCION DE DATOS EN LA TABLA DE TRIPULACION

INSERT ALL 
INTO TRIPULACION (NOMBRE, ID_BASE) VALUES ('EDUARDO',1)
INTO TRIPULACION (NOMBRE, ID_BASE) VALUES ('CAROLINA',1)
INTO TRIPULACION (NOMBRE, ID_BASE) VALUES ('STEPHANY',1)
INTO TRIPULACION (NOMBRE, ID_BASE) VALUES ('JUAN',1)
INTO TRIPULACION (NOMBRE, ID_BASE) VALUES ('ANDRES',1)
SELECT * FROM DUAL;

-- INSERCIÓN DE REGISTROS DE AVIONES
DESCRIBE AVIONES;

INSERT ALL
INTO AVIONES (MODELO, ID_BASE) VALUES ('BOEING-1900',2)
INTO AVIONES (MODELO, ID_BASE) VALUES ('AIRBUS-900',2)
INTO AVIONES (MODELO, ID_BASE) VALUES ('BOEING-3900',2)
INTO AVIONES (MODELO, ID_BASE) VALUES ('BOEING-2900',2)
INTO AVIONES (MODELO, ID_BASE) VALUES ('PELICAN-2300',2)
SELECT * FROM DUAL;

-- INSERCIÓN DE REGISTROS EN VUELOS
DESCRIBE VUELOS;
INSERT ALL
INTO VUELOS (ORIGEN, DESTINO, HORAFECHA, ID_PILOTO, ID_AVION) VALUES
('VIENNA','TOKYO', TO_DATE('2/03/2023 14:30:00', 'DD-MM-YYYY HH24:MI:SS'),1,2)
INTO VUELOS (ORIGEN, DESTINO, HORAFECHA, ID_PILOTO, ID_AVION) VALUES
('PARIS','EGIPTO', TO_DATE('3/03/2023 17:30:00', 'DD-MM-YYYY HH24:MI:SS'),2,3)
INTO VUELOS (ORIGEN, DESTINO, HORAFECHA, ID_PILOTO, ID_AVION) VALUES
('TIJUANA','ACAPULCO', TO_DATE('4/03/2023 12:00:00', 'DD-MM-YYYY HH24:MI:SS'),4,1)
INTO VUELOS (ORIGEN, DESTINO, HORAFECHA, ID_PILOTO, ID_AVION) VALUES
('CDMX','MOSCU', TO_DATE('5/03/2023 18:10:00', 'DD-MM-YYYY HH24:MI:SS'),3,5)
INTO VUELOS (ORIGEN, DESTINO, HORAFECHA, ID_PILOTO, ID_AVION) VALUES
('BERLÍN','ROMA', TO_DATE('6/03/2023 15:50:00', 'DD-MM-YYYY HH24:MI:SS'),5,5)
SELECT * FROM DUAL;

-- INSERCION DE REGISTROS DE TRIPULACION_VUELO

DESCRIBE TRIPULACION_VUELO;

INSERT ALL
INTO TRIPULACION_VUELO (ID_TRIPULACION,ID_VUELO) VALUES (1,5)
INTO TRIPULACION_VUELO (ID_TRIPULACION,ID_VUELO) VALUES (2,3)
INTO TRIPULACION_VUELO (ID_TRIPULACION,ID_VUELO) VALUES (3,1)
INTO TRIPULACION_VUELO (ID_TRIPULACION,ID_VUELO) VALUES (4,4)
INTO TRIPULACION_VUELO (ID_TRIPULACION,ID_VUELO) VALUES (5,2)
SELECT * FROM DUAL;

-- INSERCIÓN DE REGISTROS DE BOLETOS
DESCRIBE BOLETOS;

INSERT ALL 
INTO BOLETOS (ID_VUELO,ID_CLIENTE,COSTOS) VALUES (1,2,25000.00)
INTO BOLETOS (ID_VUELO,ID_CLIENTE,COSTOS) VALUES (3,4,5000.00)
INTO BOLETOS (ID_VUELO,ID_CLIENTE,COSTOS) VALUES (5,1,35000.00)
INTO BOLETOS (ID_VUELO,ID_CLIENTE,COSTOS) VALUES (2,5,50000.00)
INTO BOLETOS (ID_VUELO,ID_CLIENTE,COSTOS) VALUES (4,3,125000.00)
SELECT * FROM DUAL;

commit;

--Realizar la siguiente consulta
/*Buscar los datos de la tripulacion que estuvo con determinado cliente
en un vuelo y donde el nombre del cliente haya sido = nombre*/

select * from Clientes_Vuelos;

select * from Tripulacion where Id_Tripulacion =(
select Id_Tripulacion from Tripulacion_Vuelo where Id_Vuelo =(
select Id_Vuelo from Boletos where Id_Cliente =(
select Id_Cliente from Clientes_Vuelos where nombre = 'Aaron')));

--Consultas con join
/*Inner join
Se muestran los registros que coinciden de una tabla 'A' y una tabla B
La coincidencia de ambas se muestra justo en el medio del campo  que los une llave
todo esto se logra gracias al uso de valores compartidos primary y foreign keys

Forma explicita
Indicamos el uso de inner join*/

select * from Pilotos --Seleccionamos una tabla A
inner join Bases --Indicamos la union con una tabla B
on Pilotos.Id_Base=Bases.Id_Base; --Indicamos en donde el dato en comuncon el nombre de la tabla y su columna

--Podemos crear alias de las tablas para evitar escribir el nombre completo de la misma

select * from Pilotos P
Inner join Bases B
on P.Id_Base=B.Id_Base;

--Forma Implicita
--Omitimos la instruccion inner join y on y se sustituye por where
Select * from Pilotos,Bases
Where Pilotos.Id_Base=Bases.Id_Base;

--Left Join / Right
/*Se muestran o priorizan los datos o elementos de la primera tabla
y se muestran los coincidentes con la segunda tabla*/

Select * from Bases
Left Join Pilotos
on Pilotos.Id_Base=Bases.Id_Base;

--Full Join

Select * from Pilotos
Full Join Bases
on Pilotos.Id_Base=Bases.Id_Base;

Select T.Id_Tripulacion,T.Nombre,T.Id_Base from Tripulacion t
inner join Tripulacion_Vuelo Tv
on T.Id_Tripulacion=Tv.Id_Tripulacion
Inner join  Boletos B
on B.Id_Vuelo=Tv.Id_Vuelo
inner join Clientes_Vuelos Cv
on Cv.Id_Cliente=B.Id_Cliente
Where Cv.Nombre='Aaron';

-- BUSCAR EL ID DEL AVION, MODELO, DESTINO DEL VUELO, DEL PILOTO CON MÁS HORAS DE VUELO
-- RESOLVER CON JOINS

Select A.Id_Avion,A.Modelo,V.Destino,P.Nombre,P.HorasVuelo from Vuelos V
Inner join Pilotos P
on V.Id_Piloto=P.Id_Piloto
inner join Aviones A
on V.Id_Avion=A.Id_Avion
where P.HorasVuelo = (SELECT MAX (HORASVUELO) FROM PILOTOS);


