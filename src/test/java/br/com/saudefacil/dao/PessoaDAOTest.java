package br.com.saudefacil.dao;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import br.com.saudefacil.models.Pessoa;

class PessoaDAOTest {
	
	Pessoa pessoa;
	PessoaDAO pessoaDAO;
	
	@BeforeEach
	void init() {
		HibernatesUtil con;
		pessoa = new Pessoa();
		pessoaDAO = new PessoaDAO();
	}
	@Nested
	@DisplayName("Cenario 001 - Teste Listar Pessoa")
		
		class ListaPessoa{

		@Test
		@DisplayName("CT001.01 - Teste Listar Pessoa Pelo CPF")
		void listaPessoaPeloCpf() {
			pessoa = pessoaDAO.getPessoa("11111111111");
			String resultadoAtual =	pessoa.getCpf();
			String resultadoEsperado = "11111111111";
			assertEquals(resultadoEsperado, resultadoAtual, "CPF não confere com o cadastrado" );
			}
		
		@Test
		@DisplayName("CT001.02 - Teste Listar Pessoa Pelo Nome")
		void listaPessoaPeloNome() {
			pessoa = pessoaDAO.getPessoa("11111111111");
			String resultadoAtual =	pessoa.getNome();
			String resultadoEsperado = "luiza";
			assertEquals(resultadoEsperado, resultadoAtual, "Nome não confere com o cadastrado" );
			}
		
		@Test
		@DisplayName("CT001.03 - Teste Listar Pessoa Pelo Rg")
		void listaPessoaPeloRg() {
			pessoa = pessoaDAO.getPessoa("11111111111");
			String resultadoAtual =	pessoa.getRg();
			String resultadoEsperado = "1111112";
			assertEquals(resultadoEsperado, resultadoAtual, "RG não confere com o cadastrado" );
			}
		}
}
