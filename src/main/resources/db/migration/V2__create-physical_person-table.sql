CREATE EXTENSION IF NOT EXISTS "pgcrypto";

CREATE TABLE IF NOT EXISTS public.physical_person(
    id int PRIMARY KEY ,
    name varchar(255) NOT NULL,
    cpf varchar(11) NOT NULL,
    type_id INT NOT NULL,
    FOREIGN KEY (type_id) REFERENCES person_type(id) ON DELETE CASCADE
);
