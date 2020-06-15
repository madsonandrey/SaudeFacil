package br.com.saudefacil;

import java.util.Scanner;

import br.com.saudefacil.dao.HibernatesUtil;
import br.com.saudefacil.exception.PacienteException;
import br.com.saudefacil.exception.PessoaException;
import br.com.saudefacil.view.PacienteView;
import br.com.saudefacil.view.PessoaView;
import br.com.saudefacil.view.ProfissionalView;

public class AppMain {
	
	public static void main(String[] args) {
			Scanner leTeclado = new Scanner(System.in);
			HibernatesUtil.getSessionFactory().openSession();
			PessoaView pessoaView = new PessoaView();
			PacienteView pacienteView = new PacienteView();
			ProfissionalView profissionalView = new ProfissionalView();
			int opcao = -1;
				while(true) {
					try {
						imprimeMenu();
						opcao = leTeclado.nextInt();
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
							pacienteView.getPaciente();
							break;
						case 6:
							System.out.println("Até mais!");
							System.exit(0);
						case 7:
							profissionalView.criarProfissional();
							break;
						case 8:
							profissionalView.alterarCadastro();
							break;
						default:
							System.out.println("Opção inválida. Escolha entre 1 e 6");
							break;
							}
						} catch(PacienteException erro) {
							System.out.println("Erro no paciente: " + erro.getMessage());
						} catch(PessoaException erro) {
							System.out.println("Erro na pessoa: " + erro.getMessage());
						} catch(RuntimeException e) {
							System.out.println("Não é possível escolher letras ou símbolos");
						}
					}
		}
	public static void imprimeMenu() {
		System.out.println("Selecione uma opção");
		System.out.println("[1] Cadastrar paciente");
		System.out.println("[2] Alterar cadastro de paciente");
		System.out.println("[3] Desativar paciente");
		System.out.println("[4] Lista de pacientes");
		System.out.println("[5] Listar dados de um paciente");
		System.out.println("[6] Sair do Saúde Fácil");
		System.out.println("[7] Cadastrar profissional");
		System.out.println("[8] Alterar cadastro de profissional");
		}
	}
