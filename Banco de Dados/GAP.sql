CREATE TABLE `usuario` (
`id` int(11) NOT NULL,
`nome` varchar(255) NULL,
`email` varchar(255) NULL,
`login` varchar(255) NULL,
`senha` varchar(255) NULL,
PRIMARY KEY (`id`) 
);

CREATE TABLE `grupo_usuario` (
`id` int(11) NOT NULL,
`nome` varchar(255) NULL,
PRIMARY KEY (`id`) 
);

CREATE TABLE `projeto` (
`id` int(11) NOT NULL,
`descricao` text NULL,
`data_criacao` timestamp NULL ON UPDATE CURRENT_TIMESTAMP,
`data_final` timestamp NULL ON UPDATE CURRENT_TIMESTAMP,
PRIMARY KEY (`id`) 
);

CREATE TABLE `backlog` (
`id` int(11) NOT NULL,
`data_criacao` date NULL,
`data_modificacao` date NULL,
PRIMARY KEY (`id`) 
);

CREATE TABLE `userstory` (
`id` int(11) NOT NULL,
`descricao` text NULL,
`peso` int(11) NULL,
`prioridade` varchar(255) NULL,
PRIMARY KEY (`id`) 
);

