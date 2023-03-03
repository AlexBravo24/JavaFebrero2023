

CREATE TABLE socios(
id_socio NUMBER PRIMARY KEY NOT NULL,
nombre NVARCHAR2(30),
edad NUMBER,
sexo NVARCHAR2(10)
);

CREATE TABLE n_socio_barco(
id_ns NUMBER PRIMARY KEY NOT NULL,
matricula NUMBER,
id_socio NUMBER
);


CREATE TABLE barcos(
matricula NUMBER PRIMARY KEY NOT NULL,
nombre NVARCHAR2(30),
n_amarre NUMBER,
cuota NUMBER
);

CREATE TABLE salidas(
id_salidas NUMBER PRIMARY KEY NOT NULL,
fecha_s DATE,
hora_s NUMBER,
destino NVARCHAR2(30),
matricula NUMBER,
id_patron NUMBER
);



CREATE TABLE patron(
id_patron NUMBER PRIMARY KEY NOT NULL,
nombre NVARCHAR2(30),
edad NUMBER,
cuota NUMBER
);

ALTER TABLE n_socio_barco ADD CONSTRAINT fk_socio
FOREIGN KEY (id_socio)
REFERENCES socios(id_socio);

ALTER TABLE n_socio_barco ADD CONSTRAINT fk_matricula
FOREIGN KEY (matricula)
REFERENCES barcos(matricula);




ALTER TABLE salidas ADD CONSTRAINT fk_matricula1
FOREIGN KEY (matricula)
REFERENCES barcos(matricula);

ALTER TABLE salidas ADD CONSTRAINT fk_patron
FOREIGN KEY (id_patron)
REFERENCES patron(id_patron);



