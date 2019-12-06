CREATE TABLE usuarios (
  id_usuario int NOT NULL,
  nome_usuario varchar(255) NOT NULL,
  cpf_usuario varchar(11) NOT NULL UNIQUE,
  sexo_usuario varchar(1) NOT NULL,
  dt_nascimento_usuario datetime NOT NULL,
  id_cargo int NOT NULL,
  id_perfil int NOT NULL,
  status_usuario integer NOT NULL
);


ALTER TABLE usuarios
  ADD PRIMARY KEY (id_usuario);

