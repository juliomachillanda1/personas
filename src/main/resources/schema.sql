DROP TABLE IF EXISTS persona;

CREATE TABLE persona (
    id INTEGER IDENTITY PRIMARY KEY,
    nombre VARCHAR(45) NOT NULL,
    apellido VARCHAR(45) NOT NULL,
    edad INTEGER NOT NULL,
    sexo CHAR NOT NULL
);
