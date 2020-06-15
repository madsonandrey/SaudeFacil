package br.com.saudefacil.view;

import java.util.List;

import br.com.saudefacil.controllers.PacienteController;
import br.com.saudefacil.exception.PacienteException;
import br.com.saudefacil.models.Paciente;

public class PacienteView extends PessoaView {
	
	private static final int PACIENTE_ATIVO = 1;

	public Paciente criarPaciente() {
			Paciente paciente = new Paciente();
			paciente.setPessoa(criarPessoa());
			if(paciente.getPessoa() != null) {
				paciente.setStatusPaciente(PACIENTE_ATIVO);
				PacienteController pacienteController = new PacienteController();
				pacienteController.create(paciente);
				System.out.println("Paciente cadastrado com sucesso");
				return paciente;
			}
		return null;
	}
	
	public void desativarCadastro() {
		
		Paciente paciente = new Paciente();

		System.out.println("informe o cpf do paciente");
		String cpf = leTeclado.next();
		
		PacienteController pacienteController = new PacienteController();
		paciente = pacienteController.getPaciente(cpf);
		pacienteController.desativarPaciente(paciente);
		System.out.println("Paciente desativado com sucesso");
	}
	
	public void getListaPaciente() {
		PacienteController pacienteController = new PacienteController();
		List<Paciente> pacientes = pacienteController.getPacientes();
		pacientes.forEach(System.out::println);
	}
	
	public void getPaciente() {
		System.out.println("Digite o cpf do paciente");
		String cpf = leTeclado.next();
		PacienteController pacienteController = new PacienteController();
		Paciente paciente = pacienteController.getPaciente(cpf);
		if(paciente == null) {
			throw new PacienteException("Paciente não cadastrado");
		}
		System.out.println(paciente.getPessoa());
	}
}