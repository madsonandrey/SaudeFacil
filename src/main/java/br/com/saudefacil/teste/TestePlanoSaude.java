package br.com.saudefacil.teste;

import java.util.List;

import br.com.saudefacil.dao.EspecialidadesDAO;
import br.com.saudefacil.dao.HibernatesUtil;
import br.com.saudefacil.models.Especialidades;
import br.com.saudefacil.view.PlanoSaudeView;

public class TestePlanoSaude {

	public static void main(String[] args) {
			PlanoSaudeView planoSaudeView = new PlanoSaudeView();

			//planoSaudeView.createPlanoSaude();
			
			//planoSaudeView.updatePlanoSaude();
			
			//planoSaudeView.desabilitaPlanoSaude();
			List<Especialidades> especielidades;
			EspecialidadesDAO especialidadeDAO = new EspecialidadesDAO();
			especielidades = especialidadeDAO.getEspecialidades();
			System.out.println(especielidades.toString());
	}
	

}