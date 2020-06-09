-- Telefones das pessoas
insert into telefone (tipo, ddd, numero, operadora, fk_pessoa_pessoa_id)
VALUES 
('CELULAR', '011', '98123-4990', 'OI', 1 ),
('CELULAR', '082', '98123-4337', 'OI', 1 ),
('FIXO', '082', '4321-5624', NULL, 1),
('WHATSAPP', '082', '99963-4567', 'TIM', 2),
('CELULAR', '012', '99673-4542', 'CLARO', 3),
('CELULAR', '081', '98623-4567', 'OI', 4),
('FIXO', '081', '4321-5678', NULL, 4),
('WHATSAPP', '081', '99023-2567', 'TIM', 5),
('CELULAR', '011', '99653-4500', 'CLARO', 6),
('CELULAR', '021', '98112-4567', 'OI', 6),
('FIXO', '021', '4321-5678', NULL, 7),
('WHATSAPP', '021', '99131-3347', 'TIM', 8),
('CELULAR', '021', '99623-9988', 'CLARO', 9),
('CELULAR', '084', '98823-2798', 'OI', 10),
('CELULAR', '021', '98822-4222', 'OI', 11),
('CELULAR', '082', '98664-4354', 'OI', 12),
('FIXO', '082', '4322-5890', NULL, 12),
('WHATSAPP', '082', '9992-2247', 'TIM', 13),
('CELULAR', '012', '9233-4342', 'CLARO', 14),
('CELULAR', '081', '98333-4427', 'OI', 15),
('FIXO', '081', '4452-2223', NULL, 16),
('WHATSAPP', '081', '99922-2567', 'TIM', 16),
('CELULAR', '011', '99334-4110', 'CLARO', 17),
('CELULAR', '021', '98233-6657', 'OI', 18),
('FIXO', '021', '4355-3178', NULL, 19),
('WHATSAPP', '021', '9932-3127', 'TIM', 19),
('CELULAR', '021', '99610-9008', 'CLARO', 20),
('CELULAR', '084', '98834-7633', 'OI', 20);

-- Telefones das clínicas
insert into telefone (tipo, ddd, numero, operadora, fk_pessoa_pessoa_id)
VALUES
('FIXO', '031', '4357-5148', NULL, 1),
('FIXO', '021', '5721-5478', NULL, 2),
('FIXO', '081', '4571-5648', NULL, 3),
('FIXO', '011', '5541-5458', NULL, 4),
('FIXO', '011', '4321-5678', NULL, 5),
('FIXO', '013', '4751-5478', NULL, 6),
('FIXO', '016', '7521-5148', NULL, 7),
('FIXO', '031', '4321-5258', NULL, 8),
('FIXO', '081', '4571-5758', NULL, 9),
('FIXO', '032', '4321-5578', NULL, 10);
