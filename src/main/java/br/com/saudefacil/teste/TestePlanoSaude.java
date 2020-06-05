package br.com.saudefacil.teste;

import br.com.saudefacil.dao.HibernatesUtil;
import br.com.saudefacil.view.PlanoSaudeView;

public class TestePlanoSaude {

	public static void main(String[] args) {
		HibernatesUtil.getSessionFactory().openSession();
			PlanoSaudeView planoSaudeView = new PlanoSaudeView();

			planoSaudeView.createPlanoSaude();
			
			planoSaudeView.updatePlanoSaude();
			
			planoSaudeView.desblilitaPlanoSaude();
	}
	

}