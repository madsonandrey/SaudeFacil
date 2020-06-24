package br.com.saudefacil.dao;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import br.com.saudefacil.models.Sintoma	;
import br.com.saudefacil.view.SintomaView;
class SintomaDAOTest {
	
	Sintoma sintoma; 
	SintomaDAO sintomaDAO;
	SintomaView sintomaView;
	
	@BeforeEach
	void init(){
		HibernatesUtil con;
		sintoma = new Sintoma();
		sintomaDAO = new SintomaDAO();
		sintomaView = new SintomaView();
	}
	@Nested
	@DisplayName("Cenario 005 - Test Listar sintomas")
		
		class listaSintomas {
		@Test
		@DisplayName("CT005.01 - Test Listar sintomas")
		void listaSintomas() {
			sintoma = sintomaDAO.getSintoma().get(4);
		
			String resultadoAtual = sintoma.getDescricao();
			String resultadoEsperado = "Tosse";
			assertEquals(resultadoEsperado, resultadoAtual, "Sintoma n�o cadastrado");
			}
	}

}
	