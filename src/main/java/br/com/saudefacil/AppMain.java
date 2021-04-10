package br.com.saudefacil;

import java.util.InputMismatchException;
import java.util.Scanner;

import br.com.saudefacil.exception.PacienteException;
import br.com.saudefacil.exception.PessoaException;
import br.com.saudefacil.exception.ProfissionalException;
import br.com.saudefacil.view.ConsultaPacienteView;
import br.com.saudefacil.view.PacienteView;
import br.com.saudefacil.view.ProfissionalView;
import br.com.saudefacil.view.RelatorioView;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
@Configuration
public class AppMain {
	
	public static void main(String[] args) {
		SpringApplication.run(AppMain.class, args);
		
		Scanner leTeclado = new Scanner(System.in);
		
		  RelatorioView relatorioView = new RelatorioView(); 
			int opcao = -1;
							while(true) {
					try {
						menuPrincipal();
						opcao = leTeclado.nextInt();
						switch (opcao) {
						case 1:
							menuPaciente();
							break;
						case 2:
							menuProfissional();
							break;
			            case 3: 
				        	relatorioView.getRelatorio();
				            break;
						case 4:	
							System.out.println("Até mais!");
							System.exit(0);
						default:
							System.out.println("Digite entre 1 a 4");
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
		Scanner leTeclado = new Scanner(System.in);
		System.out.println("Selecione uma opção");
		System.out.println("[1] Menu paciente");
		System.out.println("[2] Menu profissional");
		System.out.println("[3] Relatório com especialidades das clínicas");
		System.out.println("[4] Sair");
		}
	
	public static void menuPaciente() {
		Scanner leTeclado = new Scanner(System.in);
			PacienteView pacienteView = new PacienteView();
			ConsultaPacienteView consultaPacienteView = new ConsultaPacienteView();
			System.out.println("[1] Cadastrar paciente");
			System.out.println("[2] Alterar cadastro de paciente");
			System.out.println("[3] Desativar paciente");
			System.out.println("[4] Lista de pacientes");
			System.out.println("[5] Listar dados de um paciente");
			System.out.println("[6] Pesquisa de profissionais por sintoma");
			System.out.println("[7] Retornar ao menu principal");
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
					consultaPacienteView.getEspecialista();
					break;
				case 7:
					break;
				default:
					System.out.println("Opção inválida. Escolha entre 1 e 7");
					menuPaciente();
				}
		}
		
	public static void menuProfissional() {
			Scanner leTeclado = new Scanner(System.in);
			ProfissionalView profissionalView = new ProfissionalView();
			System.out.println("Selecione uma opção");
			System.out.println("[1] Cadastrar profissional");
			System.out.println("[2] Alterar cadastro de profissional");
			System.out.println("[3] Desativar profissional");
			System.out.println("[4] Lista de profissionais");
			System.out.println("[5] Listar dados de um profissional");
			System.out.println("[6] Retornar ao menu principal");
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

	}

