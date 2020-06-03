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

			System.out.println("Digite seu rg");
			String rg = leTeclado.next();

			System.out.println("Digite seu sexo");
			String sexo = leTeclado.next();

			Pessoa pessoa2 = new Pessoa(null, cpf, rg, sexo, nome, null,
					null);
    		pessoaController.create(pessoa2);
		} else {
			System.out.println("Pessoa já existente no cadastro: " + pessoa.getNome());
		}
	}
	
	public void atualizarCadastro() {

		System.out.println("O que você deseja alterar? [1]nome ou [2]sexo");
		int opcao = leTeclado.nextInt();
		PessoaController pessoaController = new PessoaController();
			if(opcao == 1) { 
				System.out.println("Digite o CPF");
				String cpf = leTeclado.next();
				Pessoa pessoa = pessoaController.getPessoa(cpf);
				System.out.println("Nome cadastrado: " + pessoa.getNome());
				System.out.println("Digite o novo nome. ");
				String nome = leTeclado.next();
				pessoa.setNome(nome);
				pessoaController.update(pessoa);
		} else {
			
		}
	}
	
	public void getListaPessoa() {
		PessoaController pessoaController = new PessoaController();
		List<Pessoa> pessoas = pessoaController.getPessoas();
		System.out.println(pessoas);
	}
}	

