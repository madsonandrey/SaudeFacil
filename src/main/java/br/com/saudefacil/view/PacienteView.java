package br.com.saudefacil.view;

import br.com.saudefacil.controllers.PacienteController;
import br.com.saudefacil.models.Paciente;

public class PacienteView extends PessoaView{
	
	public Paciente criarPaciente() {
		Paciente paciente = new Paciente();
		//paciente.setPessoa(criarPessoa());
		System.out.println("Paciente cadastrado com sucesso");
		paciente.setStatusPaciente(1);
		PacienteController pacienteController = new PacienteController();
		pacienteController.create(paciente);
		return paciente;
	}
	
	//public Paciente desativarCadastro() {
		//Paciente paciente = new Paciente();
		//paciente.setPessoa(criarPessoa());
		//System.out.println("Paciente desativado com sucesso!");
		//paciente.setStatusPaciente(0);
		//PacienteController pacienteController = new PacienteController();
		//pacienteController.update(paciente);
		//return paciente;
		
	
	}
	
//}
