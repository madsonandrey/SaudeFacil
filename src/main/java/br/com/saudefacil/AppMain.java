package br.com.saudefacil;

import java.util.Scanner;

import br.com.saudefacil.controllers.PessoaController;
import br.com.saudefacil.dao.HibernatesUtil;
import br.com.saudefacil.view.PessoaView;

public class AppMain {
	 
    public static void main(String[] args) {
    	HibernatesUtil.getSessionFactory().openSession();
    	while (true) {
	    	Scanner leTeclado = new Scanner(System.in);
	    	imprimeMenu();
	    	int opcao = leTeclado.nextInt();
	    	PessoaController pessoaController = new PessoaController();
			PessoaView pessoaView = new PessoaView();
	    	switch(opcao) {
	    		case 1: 
		    		pessoaView.criarPessoa();
		    		break;
	    		case 2: 
	    			pessoaView.atualizarCadastro();
	    			break;
	    		case 3:
	    			pessoaView.deletarPessoa();
	    			break;
	    		case 4:
	    			pessoaView.getListaPessoa();
	    			break;
	    	}
    	}
    }
    
    public static void imprimeMenu() {
		System.out.println();
		System.out.println("Selecione uma opção");
		System.out.println("[1] Cadastrar paciente");
		System.out.println("[2] Alterar cadastro de paciente");
		System.out.println("[3] Desativar paciente");
		System.out.println("[4] Listar paciente");
		System.out.println("[5] Sair do Sa�de F�cil");

	}
}