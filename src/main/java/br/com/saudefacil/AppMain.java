package br.com.saudefacil;

import java.util.Scanner;

import br.com.saudefacil.controllers.PessoaController;
import br.com.saudefacil.models.Pessoa;
import br.com.saudefacil.view.PessoaView;

public class AppMain {
	 
    public static void main(String[] args) {
    	
    	imprimeMenu();
    	   	
    	 
    	
    }
    
    public static void imprimeMenu() {
    	Scanner leTeclado = new Scanner(System.in);
    	System.out.println("Select one option");
    	System.out.println("[1] Include an person");
    	System.out.println("[11] include health plan");
    	int opcao = leTeclado.nextInt(); 
    	switch(opcao) {
		
    	case 1:
        	PessoaController pessoaController = new PessoaController();
    		PessoaView pessoaView = new PessoaView();
    		Pessoa pessoa = pessoaView.criarPessoa();
    		pessoaController.create(pessoa);
    		break;
    	case 2:
    		// your commands here
    		break;
    	case 3:
    		// your commands here
    		break;
    	case 4:
    		// your commands here
    		break;
    	case 5:
    		// your commands here
    		break;
    	case 6:
    		// your commands here
    		break;
    	case 7:
    		// your commands here
    		break;
    	case 8:
    		// your commands here
    		break;
    	case 9:
    		// your commands here
    		break;
    	case 10:
    		// your commands here
    		break;
    	case 11:
    		// your commands here
    		System.out.println("[11] Selected - include health plan");
    		break;
    	}
    }
    
   
}