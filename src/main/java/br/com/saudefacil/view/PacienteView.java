package br.com.saudefacil.view;

import br.com.saudefacil.controllers.PacienteController;
import br.com.saudefacil.models.Paciente;

public class PacienteView extends PessoaView {

	public Paciente criarPaciente() {
		Paciente paciente = new Paciente();
		// paciente.setPessoa(criarPessoa());
		System.out.println("Paciente cadastrado com sucesso");
		paciente.setStatusPaciente(1);
		PacienteController pacienteController = new PacienteController();
		pacienteController.create(paciente);
		return paciente;
	}

	public void desativarCadastro() {
		
		Paciente paciente = new Paciente();

		System.out.println("informe o id do paciente");
		Integer idPaciente = leTeclado.nextInt();

		paciente.setPacienteID(idPaciente);
		paciente.setStatusPaciente(0);

		PacienteController pacienteController = new PacienteController();
		if (paciente.getStatusPaciente() == 0) {
			pacienteController.desativarPaciente(paciente);
		}
	}

}