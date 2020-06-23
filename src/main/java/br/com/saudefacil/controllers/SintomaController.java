package br.com.saudefacil.controllers;

import java.util.List;

import br.com.saudefacil.dao.SintomaDAO;
import br.com.saudefacil.models.Sintoma;

public class SintomaController {
	private SintomaDAO SintomaDAO = new SintomaDAO();

	public List<Sintoma> getSintoma() {
		return SintomaDAO.getSintoma();
	}

	public void update(Sintoma sintoma) {
		SintomaDAO.update(sintoma);
	}
}
