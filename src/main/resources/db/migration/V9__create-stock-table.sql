CREATE EXTENSION IF NOT EXISTS "pgcrypto";

CREATE TABLE public.stock(
    id SERIAL PRIMARY KEY,
    quantity INT NOT NULL,
    last_update TIMESTAMP NOT NULL,
    product_id UUID,
    FOREIGN KEY (product_id) REFERENCES product(id) ON DELETE CASCADE
);