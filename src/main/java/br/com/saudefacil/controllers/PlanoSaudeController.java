package br.com.saudefacil.controllers;

import br.com.saudefacil.dao.PlanoSaudeDAO;
import br.com.saudefacil.models.PlanoSaude;

public class PlanoSaudeController {
	PlanoSaudeDAO planoSaudeDAO = new PlanoSaudeDAO();
	
	
	public void  validaCreatePlanoSaude(PlanoSaude planoSaude) {
		if(null != planoSaude.getPlanoId()) {
			System.out.println(" Id do Plano: " + planoSaude.getPlanoId());
		}
		planoSaudeDAO.instertPlanoSaude(planoSaude);
		}

}
