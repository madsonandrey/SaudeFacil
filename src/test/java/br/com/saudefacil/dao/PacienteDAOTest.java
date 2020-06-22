package br.com.saudefacil.dao;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import br.com.saudefacil.models.Paciente;
import br.com.saudefacil.view.PacienteView;
class PacienteDAOTest {
	
	Paciente paciente;
	PacienteDAO pacienteDAO;
	PacienteView pacienteView;
	
	@BeforeEach
	void init() {
		HibernatesUtil con;
		paciente = new Paciente();
		pacienteDAO = new PacienteDAO();
		pacienteView = new PacienteView();
	}
	
	@Nested
	@DisplayName("Cenário 003 - Teste Listar Paciente")
	
		class listaPaciente{
		@Test
		@DisplayName("CT003.01 - Teste Listar Paciente Pelo Cpf")
		void listarPacientePeloCpf() {
			paciente = pacienteDAO.getPaciente("10838068455");
			String resultadoAtual = paciente.getPessoa().getCpf();
			String resultadoEsperado = "10838068455";
			assertEquals(resultadoEsperado, resultadoAtual, "CPF não confere com o cadastrado");
		}
		
		@Test
		@DisplayName("CT003.02 - Teste Listar Paciente Pelo Rg")
		void listarPacientePeloRg() {
			paciente = pacienteDAO.getPaciente("10838068455");
			String resultadoAtual = paciente.getPessoa().getRg();
			String resultadoEsperado = "8730740";
			assertEquals(resultadoEsperado, resultadoAtual, "CPF não confere com o cadastrado");
		}
		@Test
		@DisplayName("CT003.03 - Teste Listar Paciente Pelo Nome")
		void listarPacientePeloNome() {
			paciente = pacienteDAO.getPaciente("10838068455");
			String resultadoAtual = paciente.getPessoa().getNome();
			String resultadoEsperado = "médson";
			assertEquals(resultadoEsperado, resultadoAtual, "Nome não confere com o cadastrado");
		}
	}
	@Nested
	@DisplayName("Cenário 004 - Desativar Paciente")
	class desativarPaciente{
		@Test
		@DisplayName("CT004.01 - Desativar Paciente")
		void desativarPaciente() {
			paciente = pacienteDAO.getPaciente("11111111111");
			pacienteView.desativarCadastro();
		}
	}
}