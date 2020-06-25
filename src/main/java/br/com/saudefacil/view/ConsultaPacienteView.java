package br.com.saudefacil.view;

import java.util.List;
import java.util.Scanner;

import br.com.saudefacil.controllers.ConsultaPacienteController;
import br.com.saudefacil.models.ConsultaPaciente;

public class ConsultaPacienteView {
	Scanner leTeclado = new Scanner(System.in);
	ConsultaPacienteController consultaPacienteController = new ConsultaPacienteController();
	
	public void getEspecialista(){
		System.out.println("Digite o seu sintoma");
		String sintoma = leTeclado.nextLine();
		List<ConsultaPaciente> sintomas = consultaPacienteController.getEspecialista(sintoma);
		sintomas.forEach(System.out::println);
	}
	
}
