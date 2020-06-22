package br.com.saudefacil.dao;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import br.com.saudefacil.models.Profissional;

class ProfissionalDAOTest {
	
	Profissional profissional;
	ProfissionalDAO profissionalDAO;
	
	@BeforeEach
	void init(){
		HibernatesUtil con;
		profissional = new Profissional();
		profissionalDAO = new ProfissionalDAO();
	}
	@Nested
	@DisplayName("Cenario 002 - Teste Listar Profissional")
		
		class listaProfissional {
		@Test
		@DisplayName("CT002.01 - Test Listar Profissional pelo CPF")
		void listaProfissionalPeloCpf() {
			profissional = profissionalDAO.getProfissional("11111111111");
			String resultadoAtual = profissional.getPessoa().getCpf();
			String resultadoEsperado = "11111111111";
			assertEquals(resultadoEsperado, resultadoAtual, "CPF não confere com o cadastrado");
			}
		
		@Test
		@DisplayName("CT002.02 - Test Listar Profissional pelo Nome")
		void listaProfissionalPeloNome() {
			profissional = profissionalDAO.getProfissional("11111111111");
			String resultadoAtual = profissional.getPessoa().getNome();
			String resultadoEsperado = "luiz";
			assertEquals(resultadoEsperado, resultadoAtual, "Nome não confere com o cadastrado");
			}
		
		@Test
		@DisplayName("CT002.03 - Test Listar Profissional pela Credencial")
		void listaProfissionalPelaCredencial() {
			profissional = profissionalDAO.getProfissional("11111111111");
			String resultadoAtual = profissional.getCredencial();
			String resultadoEsperado = "CRA2020";
			assertEquals(resultadoEsperado, resultadoAtual, "Credencial não confere com o cadastrado");
			}
		}
		
	}
			

