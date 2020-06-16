package br.com.saudefacil;

import java.util.InputMismatchException;
import java.util.Scanner;

import br.com.saudefacil.exception.PacienteException;
import br.com.saudefacil.exception.PessoaException;
import br.com.saudefacil.exception.ProfissionalException;
import br.com.saudefacil.view.PacienteView;
import br.com.saudefacil.view.ProfissionalView;

public class AppMain {
	
	public static void main(String[] args) {
			Scanner leTeclado = new Scanner(System.in);
			
			int opcao = -1;
				while(true) {
					try {
						menuPrincipal();
						opcao = leTeclado.nextInt();
						switch (opcao) {
						case 1:
							menuPaciente();
<<<<<<< HEAD
							break;
						case 2:
							menuProfissional();
							break;
						case 3:	
							System.out.println("Até mais!");
=======
							int opcao2 = leTeclado.nextInt();
							switch (opcao2) {
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
								return;
							default:
								System.out.println("Opção inválida. Escolha entre 1 e 6");
								break;	
							} menuPrincipal();
						// Fim do menu paciente | Início do menu profissional 
						case 2:
							menuProfissional();
							int opcao3 = leTeclado.nextInt();
							switch (opcao3) {
							case 1:
								profissionalView.criarProfissional();
								break;
							case 2:
								profissionalView.alterarCadastro();
								break;
							case 3:
								profissionalView.desativarProfissional();
								break;
							case 4:
								profissionalView.getListaProfissionais();
								break;
							case 5:
								profissionalView.getProfissional();
								break;
							case 6:
								return;
							default:
								System.out.println("Opção inválida. Escolha entre 1 e 6");
								break;
							}
							menuPrincipal();
							
						// Fim do menu profissional	
						case 3:
>>>>>>> 43dba2db5d873a6dc617c2903713871faf9793d3
							System.exit(0);
							break;
						default:
							System.out.println("Opção inválida. Escolha entre 1 e 3");
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
	public static void menuPrincipal() {
<<<<<<< HEAD
		System.out.println("Selecione uma opção");
		System.out.println("[1] Menu paciente");
		System.out.println("[2] Menu profissional");
		System.out.println("[3] Sair");
		}
	public static void menuPaciente() {
		Scanner leTeclado = new Scanner(System.in);
		PacienteView pacienteView = new PacienteView();
=======
>>>>>>> 43dba2db5d873a6dc617c2903713871faf9793d3
		System.out.println("Selecione uma opção");
		System.out.println("[1] Menu paciente");
		System.out.println("[2] Menu Profissional");
		System.out.println("[3] Sair");
		}
	
	public static void menuPaciente() {
		System.out.println("[1] Cadastrar paciente");
		System.out.println("[2] Alterar cadastro de paciente");
		System.out.println("[3] Desativar paciente");
		System.out.println("[4] Lista de pacientes");
		System.out.println("[5] Listar dados de um paciente");
		System.out.println("[6] Retornar ao menu principal");
<<<<<<< HEAD
		int opcao = leTeclado.nextInt();
		switch(opcao) {
			case 1:
				pacienteView.criarPaciente();
				break;
			case 2:	
				pacienteView.atualizarCadastro();
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
				break;
			default:
				System.out.println("Opção inválida. Escolha entre 1 e 6");
				menuPaciente();
			}
		}
	public static void menuProfissional() {
		Scanner leTeclado = new Scanner(System.in);
		ProfissionalView profissionalView = new ProfissionalView();
		System.out.println("Selecione uma opção");
=======
	}
	public static void menuProfissional() {
>>>>>>> 43dba2db5d873a6dc617c2903713871faf9793d3
		System.out.println("[1] Cadastrar profissional");
		System.out.println("[2] Alterar cadastro de profissional");
		System.out.println("[3] Desativar profissional");
		System.out.println("[4] Lista de profissionais");
		System.out.println("[5] Listar dados de um profissional");
		System.out.println("[6] Retornar ao menu principal");
<<<<<<< HEAD
		int opcao = leTeclado.nextInt();
		switch(opcao) {
			case 1:
				profissionalView.criarProfissional();
				break;
			case 2:
				profissionalView.alterarCadastro();
				break;
			case 3:
				profissionalView.desativarProfissional();
				break;
			case 4:
				profissionalView.getListaProfissionais();
				break;
			case 5:
				profissionalView.getProfissional();
				break;
			case 6:
				break;
			default:
				System.out.println("Opção inválida. Escolha entre 1 e 6");
				menuProfissional();
			}
		}
=======

>>>>>>> 43dba2db5d873a6dc617c2903713871faf9793d3
	}


}
