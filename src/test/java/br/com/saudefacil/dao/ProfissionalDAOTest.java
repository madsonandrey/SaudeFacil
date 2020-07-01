package br.com.saudefacil.dao;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;
import org.junit.jupiter.api.TestReporter;

import br.com.saudefacil.models.Profissional;

class ProfissionalDAOTest {
	
	Profissional profissional;
	ProfissionalDAO profissionalDAO;
	
	TestInfo testInfo;
	TestReporter testReport;
	
	@BeforeEach
	void init(TestInfo testInfo, TestReporter testReporter){
		HibernatesUtil con;
		profissional = new Profissional();
		profissionalDAO = new ProfissionalDAO();
		this.testInfo = testInfo;
		this.testReport = testReporter;
		System.out.println("=== Inicio de M�todo ====");
	}
	@Nested
	@DisplayName("Cenario 001 - Teste Listar Profissional")
		
		class listaProfissional {
		@Test
		@DisplayName("CT001.01 - Test Listar Profissional pelo CPF")
		void listaProfissionalPeloCpf() {
			testReport.publishEntry("Foi Executado: " + testInfo.getDisplayName());
			profissional = profissionalDAO.getProfissional("11111111111");
			String resultadoAtual = profissional.getPessoa().getCpf();
			String resultadoEsperado = "11111111111";
			assertEquals(resultadoEsperado, resultadoAtual, "CPF não confere com o cadastrado");
			}
		
		@Test
		@DisplayName("CT001.02 - Test Listar Profissional pelo Nome(erro)")
		void listaProfissionalPeloNome() {
			testReport.publishEntry("Foi Executado: " + testInfo.getDisplayName());
			profissional = profissionalDAO.getProfissional("11111111111");
			String resultadoAtual = profissional.getPessoa().getNome();
			String resultadoEsperado = "luiz";
			assertEquals(resultadoEsperado, resultadoAtual, "Nome não confere com o cadastrado");
			}
		
		@Test
		@DisplayName("CT001.03 - Test Listar Profissional pela Credencial")
		void listaProfissionalPelaCredencial() {
			testReport.publishEntry("Foi Executado: " + testInfo.getDisplayName());
			profissional = profissionalDAO.getProfissional("11111111111");
			String resultadoAtual = profissional.getCredencial();
			String resultadoEsperado = "CRA2020";
			assertEquals(resultadoEsperado, resultadoAtual, "Credencial não confere com o cadastrado");
			}
		}
		
	}
			

