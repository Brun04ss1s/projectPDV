CREATE SEQUENCE IF NOT EXISTS physical_person_id_seq START WITH 1 INCREMENT BY 1;

ALTER TABLE public.physical_person
    ALTER COLUMN id SET DEFAULT nextval('physical_person_id_seq');