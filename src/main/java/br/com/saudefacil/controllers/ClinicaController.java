package br.com.saudefacil.controllers;

import java.util.List;

import br.com.saudefacil.dao.ClinicaDAO;
import br.com.saudefacil.models.Clinica;

public class ClinicaController {
	private static final int STATUS_CLINICA_ATIVADO = 1;
	ClinicaDAO clinicaDao = new ClinicaDAO();
	
	public void cadastrarClinica(Clinica clinica) {
		clinica.setStatusClinica(STATUS_CLINICA_ATIVADO);
		clinicaDao.create(clinica);
	}
	
	public List<Clinica> getClinicas() {
		return clinicaDao.getClinicas();
	}
}
