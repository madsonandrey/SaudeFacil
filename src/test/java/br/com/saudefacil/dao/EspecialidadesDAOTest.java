package br.com.saudefacil.dao;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.hibernate.Session;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;
import org.junit.jupiter.api.TestReporter;

import br.com.saudefacil.models.Especialidades;

/**
 * EspecielidadesDAOTest implements an application test simply displays "ALL
 * Especialidades!" standard output to string.
 *
 * @author Relton Lima
 * @version 1.0
 * @since 2020-06-24
 */

class EspecialidadesDAOTest {

	Especialidades especialidades;
	List<Especialidades> especielidades;
	EspecialidadesDAO especialidadeDAO;
	
	TestInfo testInfo;
	TestReporter testReport;
	
	@BeforeEach
	void init(TestInfo testInfo, TestReporter testReporter) {
		HibernatesUtil conn;
		especialidadeDAO = new EspecialidadesDAO();
		List<Especialidades> especielidades;
		this.testInfo = testInfo;
		this.testReport = testReporter;
		System.out.println("=== Inicio de Método ====");
	}

	@Nested
	@DisplayName("Cenario CT001 - Teste Listar Todas as Especialidade")

	class ListaEspecialidade {

		@Test
		@DisplayName("CT001.1 - Teste listar especialidade")
		void listaAllEspecialidades() {
			testReport.publishEntry("Foi Executado: " + testInfo.getDisplayName());
			especielidades = especialidadeDAO.getEspecialidades();

			if (especialidadeDAO.toString() != null) {
				assertEquals(1, 1);
				System.out.println(especielidades.toString());
			} else {
				assertEquals(1, 0);
			}
		}
	}
	
	@Test
	@DisplayName("CT001.2 Teste Salvar uma Especialidade")
	void salvarEspecialidades() {
		testReport.publishEntry("Foi Executado: " + testInfo.getDisplayName());
		Especialidades esp = new Especialidades();
		esp.setDescricao("Cardiologia Pediátrica");
		
		Session session = HibernatesUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		Integer savedEspecialidade = (Integer) session.save(esp);
		session.getTransaction();
		Assertions.assertTrue(savedEspecialidade > 0);
			
	}
	
	@Test
	@DisplayName("CT001.03 - Test Listar especialidades(erro)")
	void listaEspecialidades() {
		testReport.publishEntry("Foi Executado com erro: " + testInfo.getDisplayName());
		especialidades = especialidadeDAO.getEspecialidades().get(2);

		String resultadoAtual = especialidades.getDescricao();
		String resultadoEsperado = "Pediatria";
		assertEquals(resultadoEsperado, resultadoAtual, "Especialidade não cadastrada");


	}
}
