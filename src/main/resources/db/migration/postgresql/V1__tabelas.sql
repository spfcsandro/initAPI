CREATE TABLE empresa (
id bigint NOT NULL ,
cnpj character varying(255) NOT NULL ,
data_atualizacao date NOT NULL ,
data_criacao date NOT NULL ,
razao_social character varying(255) NOT NULL
);

ALTER TABLE empresa
ADD PRIMARY KEY ( id );

INSERT INTO empresa (id, cnpj, data_atualizacao, data_criacao, razao_social)
VALUES (1, '82198127000121' , CURRENT_DATE, CURRENT_DATE, 'Empresa ADMIN' );