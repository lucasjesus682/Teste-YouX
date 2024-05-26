CREATE TABLE clients (
                         id SERIAL PRIMARY KEY ,
                         name VARCHAR(255) NOT NULL,
                         cnpj VARCHAR(20) NOT NULL,
                         email VARCHAR(255) NOT NULL,
                         tel VARCHAR(20),
                         uf VARCHAR(2),
                         location VARCHAR(255)
);