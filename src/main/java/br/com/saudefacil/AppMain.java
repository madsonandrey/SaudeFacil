package br.com.saudefacil;

import java.util.Scanner;

import br.com.saudefacil.controllers.PacienteController;
import br.com.saudefacil.controllers.PessoaController;
import br.com.saudefacil.dao.HibernatesUtil;
import br.com.saudefacil.models.Pessoa;
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
	    	PessoaController pessoaController = new PessoaController();
			PessoaView pessoaView = new PessoaView();
			PacienteView pacienteView = new PacienteView();
	    	switch(opcao) {
	    		case 1: 
		    		pessoaView.criarPessoa();
		    		break;
	    		
	    		case 2: 
	    			pessoaView.atualizarCadastro();
	    			break;
	    		case 3:
	    			pacienteView.desativarCadastro();
	    			break;
	    		case 4:
	    			pessoaView.getListaPessoa();
	    			break;
	    		case 5:
	    			System.exit(0);
	    		case 6:
	    			
	    		default: 
	    			System.out.println("Opção inválida. Digite uma opção válida.");
	    		  
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
    	System.out.println("[5] Sair do Saúde Fácil");

    }
    
}