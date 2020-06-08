INSERT INTO clinica
(forma_pagamento, cnpj, status_clinica, razaoSocial)
VALUES
('1|2|3', '1048748/0001-01',1, "SAÚDE FACIL"),
('1||3', '0948748/0002-02',1, "MEDICAL CENTER"),
('2|3', '0848748/0003-03',1, "HAPCLINICA"),
('2|3', '0748748/0004-04',0, "CERPE"),
('2|3', '0648748/0004-05',1, "HEMOPE"),
('1|2|3', '0548748/0004-06',0, "IHENE"),
('1|2|3', '0448748/0004-07',1, "TI SAUDE"),
('2|3', '0348748/0004-08',0, "UBS CAXANGA"),
('1|2|3', '0248748/0004-09',0, "REAL DOR"),
('1|2', '0148748/0004-10',1, "GILSON CIDRIN");
-- formas de pagamento aceitas
-- 1 = dinheiro
-- 2 = débito / crédito
-- 3 = plano de saúde
GO
