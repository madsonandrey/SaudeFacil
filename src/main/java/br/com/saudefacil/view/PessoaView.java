package br.com.saudefacil.view;

import java.util.List;
import java.util.Scanner;

import br.com.saudefacil.controllers.PessoaController;
import br.com.saudefacil.models.Pessoa;

public class PessoaView {
	Scanner leTeclado = new Scanner(System.in);
	public void criarPessoa() {
		
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
			
			System.out.println("Digite seu sexo");
			String sexo = leTeclado.next();
			leTeclado.nextLine();
			
			System.out.println("Digite seu tipo sangu√≠neo");
			String tipoSanguineo = leTeclado.next();
			
			//System.out.println("Digite sua data de nascimento (dd/mm/aaaa)");
			//String data = leTeclado.next();
			//DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("dd/MM/yyyy"); 
			//LocalDate date = LocalDate.parse(data, dateFormat);
	        
			Pessoa pessoa2 = new Pessoa(null, cpf, rg, sexo, nome, null,
					tipoSanguineo);
    		pessoaController.create(pessoa2);
		} else {
			System.out.println("Pessoa j· existente no cadastro: " + pessoa.getNome());
		}
	}
	
	public void atualizarCadastro() {

		System.out.println("O que vocÍ deseja alterar? [1]nome ou [2]sexo");
		int opcao = leTeclado.nextInt();
		PessoaController pessoaController = new PessoaController();
			if(opcao == 1) { 
				System.out.println("Digite o CPF");
				String cpf = leTeclado.next();
				leTeclado.nextLine();
				
				Pessoa pessoa = pessoaController.getPessoa(cpf);
				System.out.println("Nome cadastrado: " + pessoa.getNome());
				System.out.println("Digite o novo nome. ");
				String nome = leTeclado.next();
				leTeclado.nextLine();
				
				pessoa.setNome(nome);
				pessoaController.update(pessoa);
				System.out.println("AlteraÁ„o feita com sucesso!");
		} else {
			System.out.println("Vai mudar de sexo n„o!");
		}
	}
	
	public void getListaPessoa() {
		PessoaController pessoaController = new PessoaController();
		List<Pessoa> pessoas = pessoaController.getPessoas();
		pessoas.forEach(pessoa->
			System.out.println(pessoa)		
		);
	}
	
	public void deletarPessoa() {
		PessoaController pessoaController = new PessoaController();
		Pessoa pessoa = new Pessoa();
		System.out.println("Digite o cpf do usu√°rio que deseja apagar");
		String cpf = leTeclado.next();
		leTeclado.nextLine();
		pessoa = pessoaController.getPessoa(cpf);
		System.out.println("Usu√°rio: " + pessoa.getNome());
		System.out.println("Tem certeza que deseja apagar esse usu√°rio? [1]Sim | [2]N√£o");
		int opcao = leTeclado.nextInt();
		if(opcao == 1) {
			pessoaController.deletePessoa(pessoa);
			System.out.println("Usu√°rio deletado");
		} else {
			System.out.println("Opera√ß√£o cancelada");
		}
	}
}	

