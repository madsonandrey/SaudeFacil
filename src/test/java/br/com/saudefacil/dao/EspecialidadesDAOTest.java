package br.com.saudefacil.dao;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import br.com.saudefacil.models.Especialidades;

/**
* EspecielidadesDAOTest implements an application test
* simply displays "ALL Especialidades!" standard output to string.
*
* @author  Relton Lima
* @version 1.0
* @since   2020-06-24
*/

class EspecialidadesDAOTest {
	
	List<Especialidades> especielidades;
	EspecialidadesDAO especialidadeDAO;
	

	@BeforeEach
	void init() {
		HibernatesUtil conn;
		especialidadeDAO = new EspecialidadesDAO();
		List<Especialidades> especielidades;
	}
	
	@Nested
	@DisplayName("Cenario CT003 - Teste Listar Todas as Especialidade")

		class ListaEspecialidade {
		
		@Test
		@DisplayName("CT003.1")
		void listaAllEspecialidades(){
			especielidades = especialidadeDAO.getEspecialidades();
			
			if(especialidadeDAO.toString() != null) {
				assertEquals(1, 1);
				System.out.println(especielidades.toString());
			}else {
				assertEquals(1, 0);
			}
		}
	}

}
