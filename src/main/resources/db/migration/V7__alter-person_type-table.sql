CREATE SEQUENCE IF NOT EXISTS person_type_id_seq START WITH 1 INCREMENT BY 1;

ALTER TABLE public.person_type
    ALTER COLUMN id SET DEFAULT nextval('person_type_id_seq');