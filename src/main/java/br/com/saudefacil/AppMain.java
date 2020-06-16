package br.com.saudefacil;

import java.util.InputMismatchException;
import java.util.Scanner;

import br.com.saudefacil.exception.PacienteException;
import br.com.saudefacil.exception.PessoaException;
import br.com.saudefacil.exception.ProfissionalException;
import br.com.saudefacil.view.PacienteView;
import br.com.saudefacil.view.PessoaView;
import br.com.saudefacil.view.ProfissionalView;

public class AppMain {
	
	public static void main(String[] args) {
			Scanner leTeclado = new Scanner(System.in);
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
							profissionalView.criarProfissional();
							break;
						case 7:
							profissionalView.alterarCadastro();
							break;
						case 8:
							profissionalView.desativarProfissional();
							break;
						case 9:
							profissionalView.getListaProfissionais();
							break;
						case 10:
							profissionalView.getProfissional();
							break;
						case 11:
							System.out.println("Até mais!");
							System.exit(0);
						default:
							System.out.println("Opção inválida. Escolha entre 1 e 11");
							break;
							}
						} catch(PacienteException erro) {
							System.out.println("Erro no paciente: " + erro.getMessage());
						} catch(PessoaException erro) {
							System.out.println("Erro na pessoa: " + erro.getMessage());
						} catch(ProfissionalException erro) {
							System.out.println("Erro no profissional: " + erro.getMessage());
						} catch(InputMismatchException erroGeral) {
							System.out.println("Não é permitido inserir letras ou símbolos");
							leTeclado.next();
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
		System.out.println("[6] Cadastrar profissional");
		System.out.println("[7] Alterar cadastro de profissional");
		System.out.println("[8] Desativar profissional");
		System.out.println("[9] Lista de profissionais");
		System.out.println("[10] Listar dados de um profissional");
		System.out.println("[11] Sair");
		}
	public static void imprimeMenuPaciente() {
		
	}
	public static void imprimeMenuProfissional() {
		
	}
	}
