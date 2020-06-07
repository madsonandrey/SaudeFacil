package br.com.saudefacil.controllers;

import java.util.List;

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
	
	public void desativarPaciente(Paciente paciente) {
		pacienteDAO.update(paciente);
	}
	
	public Paciente getPaciente(String cpf) {
		return pacienteDAO.getPaciente(cpf);
	}
	
	public List<Paciente> getPacientes() {
		return pacienteDAO.getPacientes();
	}
}
