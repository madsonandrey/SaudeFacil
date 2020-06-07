-- Endereços das pessoas
INSERT INTO enderecos 
(endereco_id, logradouro, numero, complemento, cep, bairro, cidade, uf, fk_pessoa_pessoa_id)
VALUES
(2021, 'Rua A', '110', 'AP-3210', 53110081, 'Sitio Novo', 'PB CIDADE', 'PB', 1001),
(2022, 'Rua B', '120', 'AP-3211', 50082311, 'Sitio Novo', 'CIDAE BA', 'BA', 2002),
(2023, 'AV. DO G', '106', 'AP-3821', 50089311, 'ALREIA VELHA', 'PIPA', 'PE', 3003),
(2024, 'Rua C', '100', 'AP-3212', 53110083, 'Sitio Novo', 'RO CIDADE', 'RO', 4004),
(2025, 'ALAMEDA XYZ', '910', 'AP-3216', 53110087, 'Sitio Novo', 'MONGI', 'PE', 5005),
(2026, 'Rua D', '110', 'AP-3231', 53008411, 'Sitio Novo', 'CIDADE PE', 'PE', 6006),
(2027, 'Rua E', '130', 'AP-3421', 00855311, 'Sitio Novo', 'RECIFE', 'PE', 7007),
(2028, 'Rua F', '100', 'AP-5321', 10053186, 'Sitio Novo', 'BAIRRO NOVO', 'PE', 8008),
(2029, 'PRAÇA XYZ', '150', 'AP-3271', 53187100, 'NOVA ALAMEDA', 'PIPA', 'PE', 9009),
(2030, 'VIELA DO R', '510', 'AP-9321', 31105090, 'ABREU E LIMA', 'JABOATAO', 'PE', 1010);
GO -- Para insert de endereço de pessoas sempre passar o id da pessoa no último parametro

-- Endereços das clínicas
INSERT INTO enderecos 
(endereco_id, logradouro, numero, complemento, cep, bairro, cidade, uf, fk_pessoa_pessoa_id)
VALUES
(2235, 'Rua Z', '110', 'AP-3210', 53110081, 'Sitio Novo', 'PB CIDADE', 'PB', null),
(2514, 'Rua xX', '120', 'AP-3211', 53110082, 'Sitio Novo', 'CIDAE BA', 'BA', null),
(5485, 'AV. DO T', '106', 'AP-3821', 53110089, 'ALREIA VELHA', 'PIPA', 'PE', null),
(4518, 'Rua C', '100', 'AP-3212', 53110083, 'Sitio Novo', 'RO CIDADE', 'RO', null),
(4512, 'DISNEY XYZ', '910', 'AP-3216', 53110087, 'Sitio Novo', 'MONGI', 'PE', null),
(5541, 'Rua H', '110', 'AP-3231', 53110084, 'Sitio Novo', 'CIDADE PE', 'PE', null),
(8959, 'Rua P', '130', 'AP-3421', 53110085, 'Sitio Novo', 'RECIFE', 'PE', null),
(2356, 'Rua R', '100', 'AP-5321', 53110086, 'Sitio Novo', 'BAIRRO NOVO', 'PE', null),
(1452, 'PRAÇA XYZ', '150', 'AP-3271', 53110087, 'NOVA ALAMEDA', 'PIPA', 'PE', null),
(2346, 'VILA DO V', '510', 'AP-9321', 53110090, 'ABREU E LIMA', 'JABOATAO', 'PE', null);
GO -- Para insert de clinicas passe o ultimo valor como null
