package br.com.saudefacil.view;

import java.util.List;

import br.com.saudefacil.controllers.PacienteController;
import br.com.saudefacil.controllers.PessoaController;
import br.com.saudefacil.models.Paciente;
import br.com.saudefacil.models.Pessoa;

public class PacienteView extends PessoaView {

	public Paciente criarPaciente() {
		Paciente paciente = new Paciente();
		paciente.setPessoa(criarPessoa());
		if(paciente.getPessoa() != null) {
			paciente.setStatusPaciente(1);
			PacienteController pacienteController = new PacienteController();
			pacienteController.create(paciente);
			System.out.println("Paciente cadastrado com sucesso");
			return paciente;
		}
		System.out.println("Paciente não cadastrado"); 
		return null;
	}
	public void desativarCadastro() {
		
		Paciente paciente = new Paciente();

		System.out.println("informe o cpf do paciente");
		String cpf = leTeclado.next();
		
		PacienteController pacienteController = new PacienteController();
		paciente = pacienteController.getPaciente(cpf);
		paciente.setStatusPaciente(0);
		pacienteController.desativarPaciente(paciente);
	}
	
	public void getListaPaciente() {
		PacienteController pacienteController = new PacienteController();
		List<Paciente> pacientes = pacienteController.getPacientes();
		pacientes.forEach(System.out::println);
	}
}