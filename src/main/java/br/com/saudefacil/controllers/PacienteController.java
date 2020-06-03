package br.com.saudefacil.controllers;

import br.com.saudefacil.dao.PacienteDAO;
import br.com.saudefacil.models.Paciente;

public class PacienteController {
	private PacienteDAO pacienteDAO = new PacienteDAO();
	
	public void create(Paciente paciente) {
		pacienteDAO.create(paciente);
	}
	
	public void update(Paciente paciente) {
		pacienteDAO.update(paciente);
	}
}
