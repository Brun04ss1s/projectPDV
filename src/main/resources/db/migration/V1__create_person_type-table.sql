CREATE EXTENSION IF NOT EXISTS "pgcrypto";

CREATE TABLE IF NOT EXISTS public.person_type(
    id int PRIMARY KEY ,
    description VARCHAR(100) NOT NULL
);
