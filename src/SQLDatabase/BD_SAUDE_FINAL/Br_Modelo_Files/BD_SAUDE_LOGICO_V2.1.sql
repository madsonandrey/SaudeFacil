

DROP DATABASE BD_TESTE;
CREATE DATABASE BD_TESTE;
USE BD_TESTE;
-- 17
CREATE TABLE pessoa (
    pessoa_id INT AUTO_INCREMENT,
    cpf VARCHAR(15),
    rg VARCHAR(15),
    sexo CHAR(1),
    nome VARCHAR(200),
    data_nascimento DATE,
    tipo_sanguineo VARCHAR(5),
    PRIMARY KEY (pessoa_id)
);
-- 16
CREATE TABLE clinica (
    clinica_id INT PRIMARY KEY AUTO_INCREMENT,
    forma_pagamento VARCHAR(5),
    cnpj VARCHAR(20),
    status_clinica BIT
);
-- 15
CREATE TABLE plano_saude (
    id_plano INT PRIMARY KEY AUTO_INCREMENT,
    descricao VARCHAR(50),
    status_plano BIT
);
-- 14

CREATE TABLE clinica_plano_saude (
    fk_clinica_clinica_id INT,
    fk_plano_saude_id_plano INT,
    FOREIGN KEY (fk_clinica_clinica_id) REFERENCES clinica (clinica_id),
    FOREIGN KEY (fk_plano_saude_id_plano) REFERENCES plano_saude (id_plano)
);
-- 13
CREATE TABLE paciente (
    id_paciente INT AUTO_INCREMENT,
    status_paciente BIT,
    fk_pessoa_pessoa_id INT,
    PRIMARY KEY (id_paciente),
    CONSTRAINT FK_paciente_2
    FOREIGN KEY (fk_pessoa_pessoa_id) REFERENCES pessoa (pessoa_id)
);
 -- 12
CREATE TABLE enderecos (
    endereco_id INT PRIMARY KEY AUTO_INCREMENT,
    logradouro VARCHAR(150),
    numero INT,
    complemento VARCHAR(50),
    cep INT,
    bairro VARCHAR(100),
    cidade VARCHAR(100),
    uf VARCHAR(2),
    fk_pessoa_pessoa_id INT ,
    fk_clinica_clinica_id INT,
    FOREIGN KEY (fk_pessoa_pessoa_id) REFERENCES pessoa (pessoa_id),
    FOREIGN KEY (fk_clinica_clinica_id) REFERENCES clinica (clinica_id)
);
-- 11
CREATE TABLE telefone (
    telefone_id INT PRIMARY KEY AUTO_INCREMENT,
    tipo VARCHAR(20),
    ddd VARCHAR(5),
    numero VARCHAR(20),
    operadora VARCHAR(10),
    fk_pessoa_pessoa_id INT,
    fk_clinica_clinica_id INT,
    FOREIGN KEY (fk_pessoa_pessoa_id) REFERENCES pessoa (pessoa_id),
    FOREIGN KEY (fk_clinica_clinica_id) REFERENCES clinica (clinica_id)
);
-- 10
CREATE TABLE sintomas (
    sintomas_id INT AUTO_INCREMENT,
    descricao VARCHAR(50),
    PRIMARY KEY (sintomas_id)
);
-- 9
CREATE TABLE sintomas_paciente (
    fk_sintomas_sintomas_id INT,
    fk_paciente_id_paciente INT,
    fk_paciente_fk_pessoa_pessoa_id INT,
    FOREIGN KEY (fk_sintomas_sintomas_id) REFERENCES sintomas (sintomas_id),
    FOREIGN KEY (fk_paciente_id_paciente) REFERENCES paciente (id_paciente),
    FOREIGN KEY (fk_paciente_fk_pessoa_pessoa_id) REFERENCES paciente (fk_pessoa_pessoa_id)
);
 -- 8
CREATE TABLE patologia (
    id_patologia INT AUTO_INCREMENT,
    nome_patologia VARCHAR(100),
    descricao VARCHAR(100),
    PRIMARY KEY (id_patologia)
);
-- 7
CREATE TABLE sintomas_patologia (
    fk_sintomas_sintomas_id INT,
    fk_patologia_id_patologia INT,
    FOREIGN KEY (fk_sintomas_sintomas_id) REFERENCES sintomas (sintomas_id),
    FOREIGN KEY (fk_patologia_id_patologia) REFERENCES patologia (id_patologia)
);
-- 6
CREATE TABLE Especialidades (
    especialidade_id INT AUTO_INCREMENT,
    descricao VARCHAR(50),
    PRIMARY KEY (especialidade_id)
);
-- 5
CREATE TABLE Especialidades_patologia (
    fk_Especialidades_especialidade_id INT,
    fk_patologia_id_patologia INT,
    FOREIGN KEY (fk_Especialidades_especialidade_id) REFERENCES Especialidades (especialidade_id),
    FOREIGN KEY (fk_patologia_id_patologia) REFERENCES patologia (id_patologia)
);
 -- 4
CREATE TABLE conselho_medico (
    conselho_medico_id INT AUTO_INCREMENT,
    nome_conselho VARCHAR(50),
    site VARCHAR(50),
    PRIMARY KEY (conselho_medico_id)
);
-- 3
CREATE TABLE profissional (
    credencial VARCHAR(50),
    autonomo BIT,
    atende_clinica BIT,
    status_profissional BIT,
    fk_pessoa_pessoa_id INT,
    fk_conselho_medico_conselho_medico_id INT,
    PRIMARY KEY (credencial),
    FOREIGN KEY (fk_pessoa_pessoa_id) REFERENCES pessoa (pessoa_id),
    FOREIGN KEY (fk_conselho_medico_conselho_medico_id) REFERENCES conselho_medico (conselho_medico_id)
);
-- 2
CREATE TABLE profissional_Especialidades (
    fk_profissional_credencial VARCHAR(50),
    fk_profissional_fk_pessoa_pessoa_id INT,
    fk_Especialidades_especialidade_id INT,
    FOREIGN KEY (fk_profissional_credencial) REFERENCES profissional (credencial),
    FOREIGN KEY (fk_profissional_fk_pessoa_pessoa_id) REFERENCES profissional (fk_pessoa_pessoa_id),
    FOREIGN KEY (fk_Especialidades_especialidade_id) REFERENCES Especialidades (especialidade_id)
);
-- 1
CREATE TABLE profissional_clinica (
    fk_profissional_credencial VARCHAR(50),
    fk_profissional_fk_pessoa_pessoa_id INT,
    fk_clinica_clinica_id INT,
    FOREIGN KEY (fk_profissional_credencial) REFERENCES profissional (credencial),
    FOREIGN KEY (fk_profissional_fk_pessoa_pessoa_id) REFERENCES profissional (fk_pessoa_pessoa_id),
    FOREIGN KEY (fk_clinica_clinica_id) REFERENCES clinica (clinica_id)
);
 