package br.com.saudefacil.controllers;

import java.util.List;

import br.com.saudefacil.dao.RelatorioDAO;
import br.com.saudefacil.models.Relatorio;

public class RelatorioController {
	RelatorioDAO relatorioDAO = new RelatorioDAO();
	
	public List<Relatorio> getRelatorio(){
		return relatorioDAO.getRelatorio();
	}
}
