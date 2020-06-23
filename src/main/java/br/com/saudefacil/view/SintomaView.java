package br.com.saudefacil.view;

import java.util.List;
import java.util.Scanner;

import br.com.saudefacil.controllers.SintomaController;
import br.com.saudefacil.models.Sintoma;

public class SintomaView {
	SintomaController sintomaController = new SintomaController();
	Scanner leTeclado = new Scanner(System.in);


	public void getListarSintomas(){
		List<Sintoma> relatorio = sintomaController.getSintoma();
		relatorio.forEach(System.out::println);
	}

	public void updateSintoma() {
		Sintoma sintoma = new Sintoma();
		System.out.println("Digite seu sintoma");
		String sintomaNovo =  leTeclado.nextLine();
		sintoma.setDescricao(sintomaNovo);
	    sintomaController.update(sintoma);

	}

} 
