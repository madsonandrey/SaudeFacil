package br.com.saudefacil;

import java.util.Scanner;

import br.com.saudefacil.controllers.PessoaController;
import br.com.saudefacil.models.Pessoa;
import br.com.saudefacil.view.PessoaView;

public class AppMain {
	 
    public static void main(String[] args) {
    	Scanner leTeclado = new Scanner(System.in);
    	imprimeMenu();
    	int opcao = leTeclado.nextInt();
    	PessoaController pessoaController = new PessoaController();
    	if(opcao == 1) {
    		PessoaView pessoaView = new PessoaView();
    		Pessoa pessoa = pessoaView.criarPessoa();
    		pessoaController.create(pessoa);
    	}
    }
    
    public static void imprimeMenu() {
    	System.out.println("Selecione uma opção");
    	System.out.println("[1] Cadastrar pessoa");
    }
    
   
}