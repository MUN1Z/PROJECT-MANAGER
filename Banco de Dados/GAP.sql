CREATE SCHEMA gap;

USE gap;

CREATE TABLE `usuario` (

`id` int(11) NOT NULL  AUTO_INCREMENT,

`nome` varchar(255) NULL,

`email` varchar(255) NULL,

`login` varchar(255) NULL,

`senha` varchar(255) NULL,

PRIMARY KEY (`id`) 

);



CREATE TABLE `grupo_usuario` (

`id` int(11) NOT NULL AUTO_INCREMENT,

`nome` varchar(255) NULL,

PRIMARY KEY (`id`) 

);



CREATE TABLE `projeto` (

`id` int(11) NOT NULL AUTO_INCREMENT,

`descricao` text NULL,

`data_criacao` timestamp NULL ON UPDATE CURRENT_TIMESTAMP,

`data_final` timestamp NULL ON UPDATE CURRENT_TIMESTAMP,

PRIMARY KEY (`id`) 

);



CREATE TABLE `backlog` (

`id` int(11) NOT NULL AUTO_INCREMENT,

`data_criacao` timestamp NULL ON UPDATE CURRENT_TIMESTAMP,

`data_modificacao` timestamp NULL ON UPDATE CURRENT_TIMESTAMP,

PRIMARY KEY (`id`) 

);



CREATE TABLE `userstory` (

`id` int(11) NOT NULL AUTO_INCREMENT,

`descricao` text NULL,

`peso` int(11) NULL,

`prioridade` varchar(255) NULL,

PRIMARY KEY (`id`) 

);



