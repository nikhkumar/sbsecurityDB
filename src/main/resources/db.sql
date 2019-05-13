-- Table: public."user"

-- DROP TABLE public."user";

CREATE TABLE public."user"
(
    userid numeric NOT NULL,
    password text COLLATE pg_catalog."default" NOT NULL,
    fname text COLLATE pg_catalog."default",
    lname text COLLATE pg_catalog."default",
    email text COLLATE pg_catalog."default" NOT NULL,
    active smallint,
    CONSTRAINT user_pkey PRIMARY KEY (userid)
)
WITH (
    OIDS = FALSE
)
TABLESPACE pg_default;

ALTER TABLE public."user"
    OWNER to postgres;
    
    
-- Table: public.role

-- DROP TABLE public.role;

CREATE TABLE public.role
(
    roleid numeric NOT NULL,
    role text COLLATE pg_catalog."default" NOT NULL,
    CONSTRAINT role_pkey PRIMARY KEY (roleid)
)
WITH (
    OIDS = FALSE
)
TABLESPACE pg_default;

ALTER TABLE public.role
    OWNER to postgres;
    
    -- Table: public.user_role

-- DROP TABLE public.user_role;

CREATE TABLE public.user_role
(
    userid numeric NOT NULL,
    roleid numeric NOT NULL
)
WITH (
    OIDS = FALSE
)
TABLESPACE pg_default;

ALTER TABLE public.user_role
    OWNER to postgres;
    
    
    