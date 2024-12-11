CREATE EXTENSION IF NOT EXISTS "pgcrypto";

CREATE TABLE public.sale(
    id UUID DEFAULT gen_random_uuid() PRIMARY KEY,
    last_update TIMESTAMP NOT NULL
);