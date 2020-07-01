package br.com.saudefacil.dao;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.hibernate.Session;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;
import org.junit.jupiter.api.TestReporter;

import br.com.saudefacil.models.Sintoma;
import br.com.saudefacil.view.SintomaView;

class SintomaDAOTest {

	Sintoma sintoma;
	SintomaDAO sintomaDAO;
	SintomaView sintomaView;

	TestInfo testInfo;
	TestReporter testReport;

	@BeforeEach
	void init(TestInfo testInfo, TestReporter testReporter) {
		HibernatesUtil con;
		sintoma = new Sintoma();
		sintomaDAO = new SintomaDAO();
		sintomaView = new SintomaView();
		this.testInfo = testInfo;
		this.testReport = testReporter;
		System.out.println("=== Inicio de M�todo ====");
	}

	@Nested
	@DisplayName("Cenario 001 - Test Listar sintomas")

	class listaSintomas {
		@Test
		@DisplayName("CT001.01 - Test Listar sintomas")
		void listarSintomas() {
			testReport.publishEntry("Foi Executado: " + testInfo.getDisplayName());
			sintoma = sintomaDAO.getSintoma().get(4);

			String resultadoAtual = sintoma.getDescricao();
			String resultadoEsperado = "Tosse";
			assertEquals(resultadoEsperado, resultadoAtual, "Sintoma não cadastrado");
		}
	}

	@Test
	@DisplayName("CT001.02 - Test Listar sintomas(erro)")
	void listaSintomas() {
		testReport.publishEntry("Foi Executado com erro: " + testInfo.getDisplayName());
		sintoma = sintomaDAO.getSintoma().get(4);

		String resultadoAtual = sintoma.getDescricao();
		String resultadoEsperado = "Gripe";
		assertEquals(resultadoEsperado, resultadoAtual, "Sintoma não cadastrado");
	}
	
	@Test
	@DisplayName("CT001.03 - Test gravar sintomas")
	void gravarSintomas() {
		testReport.publishEntry("Foi Executado: " + testInfo.getDisplayName());
		Sintoma si = new Sintoma();
		si.setDescricao("Dor na unha");
		
		Session session = HibernatesUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		Integer savedSintoma = (Integer) session.save(si);
		session.getTransaction();
		Assertions.assertTrue(savedSintoma > 0);
		
	}
}