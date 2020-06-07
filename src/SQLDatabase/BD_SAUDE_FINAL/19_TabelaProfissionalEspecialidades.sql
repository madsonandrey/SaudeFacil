SELECT * FROM bd_saude_v2.profissional_Especialidades;
SELECT * FROM bd_saude_v2.Especialidades;
insert into profissional_Especialidades
	(
	fk_profissional_credencial, 
	fk_profissional_fk_pessoa_pessoa_id, 
	fk_Especialidades_especialidade_id
	)
	values 
	('CRA3248', 11, 1),
	('CRA3554', 12, 2),
	('CRA3562', 13, 3),
	('CRA3842', 14, 4),
	('CRB1542', 15, 5),
	('CRB4857', 16, 6),
	('CRC3652', 17, 7),
	('CRC4512', 18, 8),
	('CRC4522', 19, 9),
	('CRP5421', 20, 10);