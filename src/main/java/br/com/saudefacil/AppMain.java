package br.com.saudefacil;

import java.util.Scanner;

import br.com.saudefacil.dao.HibernatesUtil;
import br.com.saudefacil.view.PacienteView;
import br.com.saudefacil.view.PessoaView;

public class AppMain {

	public static void main(String[] args) {
		HibernatesUtil.getSessionFactory().openSession();
		int opcao = -1;
		while (opcao != 5) {
			Scanner leTeclado = new Scanner(System.in);
			imprimeMenu();
			opcao = leTeclado.nextInt();
			PessoaView pessoaView = new PessoaView();
			PacienteView pacienteView = new PacienteView();
			switch (opcao) {
			case 1:
				pacienteView.criarPaciente();
				break;

			case 2:
				pessoaView.atualizarCadastro();
				break;
			case 3:
				pacienteView.desativarCadastro();
				break;
			case 4:
				pacienteView.getListaPaciente();
				break;
			case 5:
				System.exit(0);
				
			default:
				System.out.println("Opção inválida. Digite uma opção válida.");
			}
		}
	}

	public static void imprimeMenu() {
		System.out.println();
		System.out.println("Selecione uma op��o");
		System.out.println("[1] Cadastrar paciente");
		System.out.println("[2] Alterar cadastro de paciente");
		System.out.println("[3] Desativar paciente");
		System.out.println("[4] Listar paciente");
		System.out.println("[5] Sair do Sa�de F�cil");

	}

}