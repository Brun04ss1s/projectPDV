CREATE EXTENSION IF NOT EXISTS "pgcrypto";

CREATE TABLE public.product(
    id UUID DEFAULT gen_random_uuid() PRIMARY KEY,
    name VARCHAR(100) NOT NULL,
    price INTEGER NOT NULL,
    last_update TIMESTAMP NOT NULL,
    person_id INT NOT NULL,
    FOREIGN KEY (person_id) REFERENCES physical_person(id) ON DELETE CASCADE
);