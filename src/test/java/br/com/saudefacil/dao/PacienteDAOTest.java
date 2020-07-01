package br.com.saudefacil.dao;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;
import org.junit.jupiter.api.TestReporter;

import br.com.saudefacil.models.Paciente;
import br.com.saudefacil.view.PacienteView;
class PacienteDAOTest {
	
	Paciente paciente;
	PacienteDAO pacienteDAO;

	
	TestInfo testInfo;
	TestReporter testReport;
	
	@BeforeEach
	void init(TestInfo testInfo, TestReporter testReporter) {
		HibernatesUtil con;
		paciente = new Paciente();
		pacienteDAO = new PacienteDAO();
		this.testInfo = testInfo;
		this.testReport = testReporter;
		System.out.println("=== Inicio de Método ====");
	}
	
	@Nested
	@DisplayName("Cenário 001 - Teste Listar Paciente")
	
		class listaPaciente{
		@Test
		@DisplayName("CT001.01 - Teste Listar Paciente Pelo Cpf")
		
		void listarPacientePeloCpf() {
			testReport.publishEntry("Foi Executado: " + testInfo.getDisplayName());
			paciente = pacienteDAO.getPaciente("22233344455");
			String resultadoAtual = paciente.getPessoa().getCpf();
			String resultadoEsperado = "22233344455";
			assertEquals(resultadoEsperado, resultadoAtual, "CPF não confere com o cadastrado");
		}
		
		@Test
		@DisplayName("CT001.02 - Teste Listar Paciente Pelo Rg")
		void listarPacientePeloRg() {
			testReport.publishEntry("Foi Executado: " + testInfo.getDisplayName());
			paciente = pacienteDAO.getPaciente("22233344455");
			String resultadoAtual = paciente.getPessoa().getRg();
			String resultadoEsperado = "1231231";
			assertEquals(resultadoEsperado, resultadoAtual, "CPF não confere com o cadastrado");
		}
		@Test
		@DisplayName("CT001.03 - Teste Listar Paciente Pelo Nome(erro)")
		void listarPacientePeloNome() {
			testReport.publishEntry("Foi Executado com erro: " + testInfo.getDisplayName());
			paciente = pacienteDAO.getPaciente("22233344455");
			String resultadoAtual = paciente.getPessoa().getNome();
			String resultadoEsperado = "MAURO LIMA";
			assertEquals(resultadoEsperado, resultadoAtual, "Nome não confere com o cadastrado");
		}
	}
}