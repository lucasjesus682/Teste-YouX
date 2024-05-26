CREATE TABLE clients (
    id int8,
    name VARCHAR(255) NOT NULL,
    cnpj VARCHAR(20) NOT NULL,
    email VARCHAR(255) NOT NULL,
    tel VARCHAR(20),
    ufId int8,
    location VARCHAR(255)
);