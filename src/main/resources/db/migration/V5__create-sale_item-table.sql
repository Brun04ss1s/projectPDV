CREATE EXTENSION IF NOT EXISTS "pgcrypto";

CREATE TABLE public.sale_item(
    id INT PRIMARY KEY,
    quantity INT NOT NULL,
    sale_id UUID,
    product_id UUID,
    FOREIGN KEY (sale_id) REFERENCES sale(id) ON DELETE SET NULL,
    FOREIGN KEY (product_id) REFERENCES product(id) ON DELETE SET NULL
);