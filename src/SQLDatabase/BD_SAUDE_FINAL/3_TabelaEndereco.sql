-- CLINICAS ENDEREÇOS

INSERT INTO enderecos 
(logradouro, numero, complemento, cep, bairro, cidade, uf, fk_clinica_clinica_id)
VALUES
('Rua Um', '110', 'sala-3210', 53110081, 'Recife', 'Casa amarela', 'PE', 1),
('Rua Dois', '120', 'sala-3211', 50082311, 'Recife', 'Corrego buruti', 'PE', 2),
('AV. Tres', '106', '3821', 50089311, 'Recife', 'Recife', 'PE', 3),
('Rua Quatro', '100', '3212', 53110083, 'Jaboatao', 'Vila velha', 'PE', 4),
('Rua cinco', '910', '3216', 53110087, 'Olinda', 'Sitio novo', 'PE', 5),
('Rua seis', '110', '3231', 53008411, 'Olinda', 'Rio Doce', 'PE', 6),
('Rua sete', '130', '3421', 00855311, 'Paulista', 'Janga', 'PE', 7),
('Rua oito', '100', '5321', 10053186, 'Jaboatao', 'Prazeres', 'PE', 8),
('PRAÇA nove', '150', '3271', 53187100, 'Recife', 'Boa viagem', 'PE', 9),
('rua dez', '510', '9321', 31105090, 'ABREU E LIMA', 'Ilha do leite', 'PE', 10);

-- PROFISSIONAL ENDEREÇOS

INSERT INTO enderecos 
(logradouro, numero, complemento, cep, bairro, cidade, uf, fk_pessoa_pessoa_id)
VALUES
('Rua onze', '110', 'sala-3210', 53110081, 'Recife', 'Casa amarela', 'PE', 11),
('Rua doze', '120', 'sala-3211', 50082311, 'Recife', 'Corrego buruti', 'PE', 12),
('AV. treze', '106', '3821', 50089311, 'Recife', 'Recife', 'PE', 13),
('Rua quatorze', '100', '3212', 53110083, 'Jaboatao', 'Vila velha', 'PE', 14),
('Rua quinze', '910', '3216', 53110087, 'Olinda', 'Sitio novo', 'PE', 15),
('Rua desesseis', '110', '3231', 53008411, 'Olinda', 'Rio Doce', 'PE', 16),
('Rua desessete', '130', '3421', 00855311, 'Paulista', 'Janga', 'PE', 17),
('Rua dezoito', '100', '5321', 10053186, 'Jaboatao', 'Prazeres', 'PE', 18),
('PRAÇA dezenove', '150', '3271', 53187100, 'Recife', 'Boa viagem', 'PE', 19),
('rua vinte', '510', '9321', 31105090, 'ABREU E LIMA', 'Ilha do leite', 'PE', 20);
