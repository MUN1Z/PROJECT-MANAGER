CREATE TABLE `usuario` (
`id` int(11) NOT NULL AUTO_INCREMENT,
`nome` varchar(255) NULL,
`email` varchar(255) NULL,
`login` varchar(255) NULL,
`senha` varchar(255) NULL,
PRIMARY KEY (`id`) 
);

CREATE TABLE `grupo_usuario` (
`id` int(11) NOT NULL AUTO_INCREMENT,
`usuario` int(11) NULL,
`grupo` int(11) NULL,
PRIMARY KEY (`id`) 
);

CREATE TABLE `projeto` (
`id` int(11) NOT NULL AUTO_INCREMENT,
`descricao` text NULL,
`data_criacao` date NULL,
`data_final` date NULL,
PRIMARY KEY (`id`) 
);

CREATE TABLE `backlog` (
`id` int(11) NOT NULL AUTO_INCREMENT,
`data_criacao` date NULL,
`data_modificacao` date NULL,
`projeto` int NULL,
PRIMARY KEY (`id`) 
);

CREATE TABLE `userstory` (
`id` int(11) NOT NULL AUTO_INCREMENT,
`descricao` text NULL,
`peso` int(11) NULL,
`prioridade` varchar(255) NULL,
PRIMARY KEY (`id`) 
);

CREATE TABLE `grupo` (
`id` int NULL,
`nome` varchar(255) NULL,
PRIMARY KEY (`id`) 
);

CREATE TABLE `sprint` (
`id` int NULL AUTO_INCREMENT,
`nome` varchar(255) NULL,
`backlog` int(11) NULL,
`usuario_criador` int(11) NULL,
PRIMARY KEY (`id`) 
);

CREATE TABLE `sprint_userstory` (
`id` int NULL AUTO_INCREMENT,
`sprint` int NULL,
`userstory` int NULL,
PRIMARY KEY (`id`) 
);

CREATE TABLE `projeto_usuario` (
`id` int NULL AUTO_INCREMENT,
`projeto` int(11) NULL,
`usuario` int(11) NULL,
PRIMARY KEY (`id`) 
);

CREATE TABLE `sprint_usuario` (
);

CREATE TABLE `userstory_task` (
`id` int NULL AUTO_INCREMENT,
`userstory` int(11) NULL,
`task` int(11) NULL,
PRIMARY KEY (`id`) 
);

CREATE TABLE `task` (
`id` int(11) NULL AUTO_INCREMENT,
`nome` int NULL,
`descricao` text NULL,
`usuario` int(255) NULL,
PRIMARY KEY (`id`) 
);


ALTER TABLE `grupo_usuario` ADD CONSTRAINT `gu_usuario` FOREIGN KEY (`usuario`) REFERENCES `usuario` (`id`);
ALTER TABLE `grupo_usuario` ADD CONSTRAINT `gu_grupo` FOREIGN KEY (`grupo`) REFERENCES `grupo` (`id`);
ALTER TABLE `backlog` ADD CONSTRAINT `backlog_projeto` FOREIGN KEY (`projeto`) REFERENCES `projeto` (`id`);
ALTER TABLE `sprint` ADD CONSTRAINT `sprint_backlog` FOREIGN KEY (`backlog`) REFERENCES `backlog` (`id`);
ALTER TABLE `sprint_userstory` ADD CONSTRAINT `su_sprint` FOREIGN KEY (`sprint`) REFERENCES `sprint` (`id`);
ALTER TABLE `sprint_userstory` ADD CONSTRAINT `su_userstory` FOREIGN KEY (`userstory`) REFERENCES `userstory` (`id`);
ALTER TABLE `projeto_usuario` ADD CONSTRAINT `pu_usuario` FOREIGN KEY (`usuario`) REFERENCES `usuario` (`id`);
ALTER TABLE `projeto_usuario` ADD CONSTRAINT `pu_projeto` FOREIGN KEY (`projeto`) REFERENCES `projeto` (`id`);
ALTER TABLE `sprint` ADD CONSTRAINT `sprint_usuario` FOREIGN KEY (`usuario_criador`) REFERENCES `usuario` (`id`);
ALTER TABLE `userstory_task` ADD CONSTRAINT `ut_task` FOREIGN KEY (`task`) REFERENCES `task` (`id`);
ALTER TABLE `userstory_task` ADD CONSTRAINT `ut_userstory` FOREIGN KEY (`userstory`) REFERENCES `userstory` (`id`);
ALTER TABLE `task` ADD CONSTRAINT `task_usuario` FOREIGN KEY (`usuario`) REFERENCES `usuario` (`id`);

