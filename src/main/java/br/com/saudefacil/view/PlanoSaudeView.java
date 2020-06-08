package br.com.saudefacil.view;

import java.util.Scanner;

import br.com.saudefacil.controllers.PlanoSaudeController;
import br.com.saudefacil.dao.PlanoSaudeDAO;
import br.com.saudefacil.models.PlanoSaude;

public class PlanoSaudeView {
	private Scanner scanner;

	public void createPlanoSaude() {

		PlanoSaude planoSaude = new PlanoSaude();

		scanner = new Scanner(System.in);
		System.out.println("Digite o ID do Plano que você quer cadastrar");
		Integer idPlano = scanner.nextInt();
		planoSaude.setPlanoId(idPlano);

		System.out.println("Informe o nome do plano de saúde");
		String descricao = scanner.next();
		planoSaude.setDescription(descricao);

		planoSaude.setStatusPlan(1);
		PlanoSaudeController planoSaudeController = new PlanoSaudeController();
		planoSaudeController.validaCreatePlanoSaude(planoSaude);

	}

	public void updatePlanoSaude() {
		PlanoSaude planoSaude = new PlanoSaude();
		PlanoSaudeController planoSaudeController = new PlanoSaudeController();

		scanner = new Scanner(System.in);
		try {

			System.out.println("Indorme o ID do plnano que pretende alterar");
			Integer planoId = scanner.nextInt();
			planoSaude.setPlanoId(planoId);
			System.out.println("Informe o nome do plano:");
			String nomePlano = scanner.next();
			planoSaude.setDescription(nomePlano);
			planoSaude.setStatusPlan(1);
			planoSaudeController.validaUpdadePlanoSaude(planoSaude);

		} catch (Exception e) {
			System.out.println("Ouve um erro ao tentar alterar as informações do plano de saúde");
		}
	}

	public void desabilitaPlanoSaude() {
		
		PlanoSaude planoSaude = new PlanoSaude();
		PlanoSaudeController planoSaudeController = new PlanoSaudeController();
		scanner = new Scanner(System.in);
		try {
			System.out.println("Indorme o ID do plnano para desabilitar o plano de saúde");
			Integer planoId = scanner.nextInt();
			planoSaude.setPlanoId(planoId);
			planoSaude.setStatusPlan(0);
			planoSaudeController.validaUpdadePlanoSaude(planoSaude);
		} catch (Exception e) {
			System.out.println("Ouve um erro ao tentar desabilitar o plano de saúde");
		}
	}

}
