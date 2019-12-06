CREATE TABLE `usuarios` (
  `id_usuario` bigint(20) AUTO_INCREMENT PRIMARY KEY,
  `nome_usuario` varchar(255) NOT NULL,
  `cpf_usuario` varchar(11) NOT NULL UNIQUE,
  `sexo_usuario` varchar(1) NOT NULL,
  `dt_nascimento_usuario` datetime NOT NULL,
  `id_cargo` bigint(20) NOT NULL,
  `id_perfil` bigint(20) NOT NULL,
  `status_usuario` integer NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE `cargos` (
  `id_cargo` bigint(20) AUTO_INCREMENT PRIMARY KEY,
  `nome_cargo` varchar(100) NOT NULL,
  `desc_cargo` varchar(255) NOT NULL UNIQUE,
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE `perfis` (
  `id_perfil` bigint(20) AUTO_INCREMENT PRIMARY KEY,
  `nome_perfil` varchar(100) NOT NULL,
  `desc_perfil` varchar(255) NOT NULL UNIQUE,
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

ALTER TABLE `usuarios`
  ADD CONSTRAINT `fk_usuario_cargo` FOREIGN KEY (`id_cargo`) REFERENCES `cargos` (`id_cargo`);

ALTER TABLE `usuarios`
  ADD CONSTRAINT `fk_usuario_perfil` FOREIGN KEY (`id_perfil`) REFERENCES `perfis` (`id_perfil`);
  
