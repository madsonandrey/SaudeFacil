package br.com.saudefacil.dao;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;
import org.junit.jupiter.api.TestReporter;

import br.com.saudefacil.models.Pessoa;

class PessoaDAOTest {
	
	Pessoa pessoa;
	PessoaDAO pessoaDAO;
	
	TestInfo testInfo;
	TestReporter testReport;
	
	@BeforeEach
	void init(TestInfo testInfo, TestReporter testReporter) {
		HibernatesUtil con;
		pessoa = new Pessoa();
		pessoaDAO = new PessoaDAO();
		this.testInfo = testInfo;
		this.testReport = testReporter;
		System.out.println("=== Inicio de M�todo ====");
	}
	@Nested
	@DisplayName("Cenario 001 - Teste Listar Pessoa")
		
		class ListaPessoa{

		@Test
		@DisplayName("CT001.01 - Teste Listar Pessoa Pelo CPF")
		void listaPessoaPeloCpf() {
			testReport.publishEntry("Foi Executado: " + testInfo.getDisplayName());
			pessoa = pessoaDAO.getPessoa("11111111111");
			String resultadoAtual =	pessoa.getCpf();
			String resultadoEsperado = "11111111111";
			assertEquals(resultadoEsperado, resultadoAtual, "CPF não confere com o cadastrado" );
			}
		
		@Test
		@DisplayName("CT001.02 - Teste Listar Pessoa Pelo Nome")
		void listaPessoaPeloNome() {
			testReport.publishEntry("Foi Executado: " + testInfo.getDisplayName());
			pessoa = pessoaDAO.getPessoa("11111111111");
			String resultadoAtual =	pessoa.getNome();
			String resultadoEsperado = "luiza";
			assertEquals(resultadoEsperado, resultadoAtual, "Nome não confere com o cadastrado" );
			}
		
		@Test
		@DisplayName("CT001.03 - Teste Listar Pessoa Pelo Rg (erro)")
		void listaPessoaPeloRg() {
			testReport.publishEntry("Foi Executado com erro: " + testInfo.getDisplayName());
			pessoa = pessoaDAO.getPessoa("11111111111");
			String resultadoAtual =	pessoa.getRg();
			String resultadoEsperado = "1111112";
			assertEquals(resultadoEsperado, resultadoAtual, "RG não confere com o cadastrado" );
			}
		}
}
