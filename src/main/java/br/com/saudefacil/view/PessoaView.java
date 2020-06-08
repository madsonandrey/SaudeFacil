package br.com.saudefacil.view;

import java.util.Date;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Scanner;

import br.com.saudefacil.controllers.PessoaController;
import br.com.saudefacil.models.Pessoa;

public class PessoaView {
	Scanner leTeclado = new Scanner(System.in);
	
	public Pessoa criarPessoa() {
		
		System.out.println("Digite seu cpf");
		String cpf = leTeclado.next();
		PessoaController pessoaController = new PessoaController();
		Pessoa pessoa = pessoaController.getPessoa(cpf);
		if(pessoa == null) {
			System.out.println("Digite seu nome");
			String nome = leTeclado.next();
			leTeclado.nextLine();

			System.out.println("Digite seu rg");
			String rg = leTeclado.next();
			leTeclado.nextLine();
			
			System.out.println("Digite seu sexo [m] | [f]");
			String sexo = leTeclado.next();
			leTeclado.nextLine();
			
			System.out.println("Digite seu tipo sanguíneo");
			String tipoSanguineo = leTeclado.next();
			
			System.out.println("Digite sua data de nascimento (dd/mm/aaaa)");
			String data = leTeclado.next();
			
			DateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
			Date date = null;
			try {
				date = formatter.parse(data); 
			} catch (ParseException e) {
				System.out.println("Data inválida");
				return null;
			}
	        try {
				Pessoa pessoa2 = new Pessoa(null, cpf, rg, sexo, nome, date,
						tipoSanguineo);
	    		pessoaController.create(pessoa2);
	    		return pessoa2;
	        } catch(Exception erro) {
	        	System.out.println("Erro ao cadastrar pessoa: " + erro.getMessage());
	        	return null;
	        }
		} else {
			System.out.println("Pessoa j� existente no cadastro: " + pessoa.getNome());
			return pessoa;
		}
	}
	
	public void atualizarCadastro() {

		System.out.println("O que voc� deseja alterar? [1]nome [2]sexo [3]cpf [4]rg [5]data de nascimento [6]tipo sanguíneo");
		try { 
				int opcao = leTeclado.nextInt();
				PessoaController pessoaController = new PessoaController();
				
					switch(opcao) { 
						case 1: 
							System.out.println("Digite o CPF");
							String cpf = leTeclado.next();
							leTeclado.nextLine();
							Pessoa pessoa = pessoaController.getPessoa(cpf);
							System.out.println("Nome cadastrado: " + pessoa.getNome());
							System.out.println("Digite o novo nome");
							String nome = leTeclado.next();
							leTeclado.nextLine();
							pessoa.setNome(nome);
							pessoaController.update(pessoa);
							System.out.println("Altera��o feita com sucesso!");
							break;
						
						case 2:
							System.out.println("Digite o CPF");
							String cpf2 = leTeclado.next();
							leTeclado.nextLine();
							Pessoa pessoa2 = pessoaController.getPessoa(cpf2);
							System.out.println("Nome cadastrado: " + pessoa2.getNome());
							System.out.println("Digite o novo sexo");
							String sexo = leTeclado.next();
							pessoa2.setSexo(sexo);
							pessoaController.update(pessoa2);
							System.out.println("Altera��o feita com sucesso!");
							break;
						case 3: 	
							System.out.println("Digite o CPF");
							String cpf3 = leTeclado.next();
							leTeclado.nextLine();
							Pessoa pessoa3 = pessoaController.getPessoa(cpf3);
							System.out.println("Nome cadastrado: " + pessoa3.getNome());
							System.out.println("Digite o novo cpf");
							String cpf4 = leTeclado.next();
							pessoa3.setCpf(cpf4);
							pessoaController.update(pessoa3);
							System.out.println("Altera��o feita com sucesso!");
							break;
						case 4: 	
							System.out.println("Digite o CPF");
							String cpf5 = leTeclado.next();
							leTeclado.nextLine();
							Pessoa pessoa4 = pessoaController.getPessoa(cpf5);
							System.out.println("Nome cadastrado: " + pessoa4.getNome());
							System.out.println("Digite o novo rg");
							String rg = leTeclado.next();
							pessoa4.setRg(rg);
							pessoaController.update(pessoa4);
							System.out.println("Altera��o feita com sucesso!");
							break;
						case 5: 	
							System.out.println("Digite o CPF");
							String cpf6 = leTeclado.next();
							leTeclado.nextLine();
							Pessoa pessoa5 = pessoaController.getPessoa(cpf6);
							System.out.println("Nome cadastrado: " + pessoa5.getNome());
							System.out.println("Digite a nova data de nascimento");
							String data = leTeclado.next();
							DateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
							Date date = null;
							try {
								date = formatter.parse(data); 
							} catch (ParseException e) {
								System.out.println("Data inválida");
								
							}
							pessoa5.setDataNascimento(date);
							pessoaController.update(pessoa5);
							System.out.println("Altera��o feita com sucesso!");
							break;
						
						case 6: 	
							System.out.println("Digite o CPF");
							String cpf7 = leTeclado.next();
							leTeclado.nextLine();
							Pessoa pessoa6 = pessoaController.getPessoa(cpf7);
							System.out.println("Nome cadastrado: " + pessoa6.getNome());
							System.out.println("Digite o novo tipo sanguíneo");
							String tipoSanguineo = leTeclado.next();
							pessoa6.setTipoSanguineo(tipoSanguineo);
							pessoaController.update(pessoa6);
							System.out.println("Altera��o feita com sucesso!");
							break;
						default:
							System.out.println("Opção inválida. Tente novamente");
							atualizarCadastro();
				}
			} catch(Exception erro) {
	        	System.out.println("Opção inválida. Tente novamente");
			}
	}
	public void getListaPessoa() {
		PessoaController pessoaController = new PessoaController();
		List<Pessoa> pessoas = pessoaController.getPessoas();
		pessoas.forEach(System.out::println);
	}

	public void deletarPessoa() {
		PessoaController pessoaController = new PessoaController();
		Pessoa pessoa = new Pessoa();
		System.out.println("Digite o cpf do usuário que deseja apagar");
		String cpf = leTeclado.next();
		leTeclado.nextLine();
		pessoa = pessoaController.getPessoa(cpf);
		System.out.println("Usuário: " + pessoa.getNome());
		System.out.println("Tem certeza que deseja apagar esse usuário? [1]Sim | [2]Não");
		int opcao = leTeclado.nextInt();
		if(opcao == 1) {
			pessoaController.deletePessoa(pessoa);
			System.out.println("Usuário deletado");
		} else {
			System.out.println("Operação cancelada");
		}
	}
}

