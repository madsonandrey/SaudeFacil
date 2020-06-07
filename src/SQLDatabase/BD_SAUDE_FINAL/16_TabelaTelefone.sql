
insert into telefone ( telefone_id, tipo, ddd, numero, operadora, fk_pessoa_pessoa_id )
VALUES 
(2101, 'CELULAR', '011', '90123-4567', 'OI', 1001 ),
(2102, 'CELULAR', '082', '90123-4567', 'OI', 1001 ),
(2103, 'FIXO', '082', '4321-5624', NULL, 1001),
(2104, 'WHATSAPP', '082', '90123-4567', 'TIM', 1010),
(2105, 'CELULAR', '012', '90123-4542', 'CLARO', 1010 ),
(2106, 'CELULAR', '081', '90123-4567', 'OI', 1011 ),
(2107, 'FIXO', '081', '4321-5678', NULL, 1012 ),
(2108, 'WHATSAPP', '081', '90123-4567', 'TIM', 1013),
(2109, 'CELULAR', '011', '90123-4567', 'CLARO', 1014 ),
(2110, 'CELULAR', '021', '90112-4567', 'OI', 1014 ),
(2111, 'FIXO', '021', '4321-5678', NULL, 1015 ),
(2112, 'WHATSAPP', '021', '90121-4567', 'TIM', 1015),
(2113, 'CELULAR', '021', '90123-4567', 'CLARO', 1016 );
--- Telefone das crlinicas
GO
insert into telefone ( telefone_id, tipo, ddd, numero, operadora, fk_pessoa_pessoa_id )
VALUES
(2114, 'FIXO', '031', '4357-5148', NULL, NULL),
(2115, 'FIXO', '021', '5721-5478', NULL,NULL),
(2116, 'FIXO', '081', '4571-5648', NULL,NULL),
(2117, 'FIXO', '011', '5541-5458', NULL,NULL),
(2118, 'FIXO', '011', '4321-5678', NULL,NULL),
(2119, 'FIXO', '013', '4751-5478', NULL,NULL),
(2120, 'FIXO', '016', '7521-5148', NULL,NULL),
(2121, 'FIXO', '031', '4321-5258', NULL,NULL),
(2122, 'FIXO', '081', '4571-5758', NULL,NULL),
(2123, 'FIXO', '032', '4321-5578', NULL,NULL),
(2124, 'FIXO', '032', '4321-5675', NULL,NULL);
GO