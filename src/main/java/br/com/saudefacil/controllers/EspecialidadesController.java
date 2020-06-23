package br.com.saudefacil.controllers;

import java.util.List;

import br.com.saudefacil.dao.EspecialidadesDAO;
import br.com.saudefacil.models.Especialidades;

public class EspecialidadesController {
	private EspecialidadesDAO especialidadesDAO = new EspecialidadesDAO();

	public List<Especialidades> getEspecialidades() {
		return especialidadesDAO.getEspecialidades();
	}
	
}
