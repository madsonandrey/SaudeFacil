package br.com.saudefacil.view;

import java.util.List;
import java.util.Scanner;

import br.com.saudefacil.controllers.ClinicaController;
import br.com.saudefacil.models.Clinica;

public class ClinicaView {
	Scanner leTeclado = new Scanner(System.in);
	Clinica clinicaNova;
	ClinicaController clinicaController = new ClinicaController();
	
	public Clinica cadastrarClinica() {
		System.out.println("Digite o nome da clínica");
		String razaoSocial = leTeclado.next();
		
		System.out.println("Digite o CNPJ da clínica");
		String cnpj = leTeclado.next();
		
		clinicaNova = new Clinica(null, null, cnpj, null, razaoSocial);
		clinicaController.cadastrarClinica(clinicaNova);
		return clinicaNova;
	}
	
	public void getClinicas() {
		List<Clinica> clinicas = clinicaController.getClinicas();
		clinicas.forEach(System.out::println);
	}
	
}
