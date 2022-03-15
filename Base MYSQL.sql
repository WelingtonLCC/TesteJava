
DROP SCHEMA IF EXISTS java_mysql ;

CREATE SCHEMA IF NOT EXISTS java_mysql DEFAULT CHARACTER SET utf8 ;
USE java_mysql ;

DROP TABLE IF EXISTS aluno ;

CREATE TABLE IF NOT EXISTS aluno (
  codigo INT NOT NULL,
  nome VARCHAR(50) NULL,
  PRIMARY KEY (codigo));

DROP TABLE IF EXISTS curso ;

CREATE TABLE IF NOT EXISTS curso (
  codigo INT NOT NULL,
  descricao VARCHAR(50) NULL,
  ementa TEXT(200) NULL,
  PRIMARY KEY (codigo));

DROP TABLE IF EXISTS curso_aluno ;

CREATE TABLE IF NOT EXISTS curso_aluno (
  curso_codigo INT NOT NULL,
  aluno_codigo INT NOT NULL,
  codigo INT NOT NULL,
  PRIMARY KEY (codigo));

