package br.com.saudefacil.view;

import java.util.List;

import br.com.saudefacil.controllers.RelatorioController;
import br.com.saudefacil.models.Relatorio;

public class RelatorioView {
	RelatorioController relatorioController = new RelatorioController();
	
	public void getRelatorio(){
		List<Relatorio> relatorio = relatorioController.getRelatorio();
		relatorio.forEach(System.out::println);
	}
}
