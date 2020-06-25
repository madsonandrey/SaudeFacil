package br.com.saudefacil.view;

import java.util.List;
import java.util.Scanner;

import br.com.saudefacil.exception.PacienteException;
import br.com.saudefacil.exception.SintomaException;
import br.com.saudefacil.controllers.PacienteController;
import br.com.saudefacil.controllers.SintomaController;
import br.com.saudefacil.models.Paciente;
import br.com.saudefacil.models.Sintoma;

public class SintomaView {
	SintomaController sintomaController = new SintomaController();
	Sintoma sintoma = new Sintoma();
	Scanner leTeclado = new Scanner(System.in);


	public void getListarSintomas(){
		List<Sintoma> relatorio = sintomaController.getSintoma();
		relatorio.forEach(System.out::println);
	}

	public void updateSintoma() {
		System.out.println("Digite seu sintoma");
		String sintomaNovo =  leTeclado.nextLine();
		sintoma.setDescricao(sintomaNovo);
		if (sintomaNovo.equalsIgnoreCase(sintoma.getDescricao())) {
			throw new SintomaException("Sintoma já cadastrado"); 
		}
	    sintomaController.update(sintoma);

	}

} 
