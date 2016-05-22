CREATE SCHEMA gap;

USE gap;

CREATE TABLE `usuario` (

`id` int(11) NOT NULL auto_increment,

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

`id` int(11) NOT NULL auto_increment,

`descricao` text NULL,

`data_criacao` varchar(10),

`data_final` varchar(10),

PRIMARY KEY (`id`) 

);



CREATE TABLE `backlog` (

`id` int(11) NOT NULL,

`data_criacao` varchar(10),

`data_modificacao` varchar(10),

PRIMARY KEY (`id`) 

);



CREATE TABLE `userstory` (

`id` int(11) NOT NULL,

`descricao` text NULL,

`peso` int(11) NULL,

`prioridade` varchar(255) NULL,

PRIMARY KEY (`id`) 

);



