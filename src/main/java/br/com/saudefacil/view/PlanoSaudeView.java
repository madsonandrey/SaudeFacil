package br.com.saudefacil.view;

import java.util.Scanner;

import br.com.saudefacil.models.PlanoSaude;

public class PlanoSaudeView {
	private Scanner scanner;

	public PlanoSaude criarPlanoSaude() {
		
		PlanoSaude planoSaude = new PlanoSaude();
		
		scanner = new Scanner(System.in);
		System.out.println("Digite o ID do Plano seguindo o a partir do id 5455");
		Integer idPlano = scanner.nextInt();
		planoSaude.setPlanoId(idPlano);
		
		System.out.println("Informe o nome do plano de saúde");
		String descricao = scanner.next();
		planoSaude.setDescription(descricao);
		
		planoSaude.setPlanoId(1);
		return planoSaude;
	}

}
