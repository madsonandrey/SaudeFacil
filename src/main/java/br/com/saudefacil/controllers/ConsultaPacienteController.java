package br.com.saudefacil.controllers;

import java.util.List;

import br.com.saudefacil.dao.ConsultaPacienteDAO;
import br.com.saudefacil.models.ConsultaPaciente;

public class ConsultaPacienteController {
	
ConsultaPacienteDAO consultaPacienteDAO = new ConsultaPacienteDAO();
	
	public List<ConsultaPaciente> getEspecialista(String sintoma){
		return consultaPacienteDAO.getEspecialista(sintoma);
	}

}
