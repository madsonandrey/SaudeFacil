package br.com.saudefacil.view;
import java.util.Scanner;

import br.com.saudefacil.controllers.ProfissionalController;
import br.com.saudefacil.exception.ProfissionalException;
import br.com.saudefacil.models.Profissional;

public class ProfissionalView extends PessoaView {
	private static final int PROFISSIONAL_ATIVO = 1;
	Scanner leTeclado = new Scanner(System.in);
	ProfissionalController profissionalController = new ProfissionalController();
	Profissional profissional = new Profissional();
	
	public Profissional criarProfissional() {
		
		profissional.setPessoa(criarPessoa());
		System.out.println("Digite sua credencial");
		String credencial = leTeclado.next();
		profissional.setCredencial(credencial);
		
		System.out.println("Atende em clínica? Digite 1 para sim e 0 para não");
		Integer atendeClinica = leTeclado.nextInt();
		profissional.setAtendeClinica(atendeClinica);
		
		System.out.println("Trabalha como autônomo? Digite 1 para sim e 0 para não");
		Integer atendeAutonomo = leTeclado.nextInt();
		profissional.setStatusAutonomo(atendeAutonomo);
		
		if(profissional.getPessoa() != null) {
			profissional.setStatusProfissional(PROFISSIONAL_ATIVO);
			profissionalController.create(profissional);
			System.out.println("Paciente cadastrado com sucesso");
			return profissional;
		}
	return null;
	}
	
	public void alterarCadastro(){
		System.out.println("Digite o CPF do profissional que deseja alterar o cadastro");
		String cpf = leTeclado.next();
		Profissional profissional = profissionalController.getProfissional(cpf);
		if(profissional == null) {
			throw new ProfissionalException("Profissional não cadastrado");
		}
		System.out.println("Profissional cadastrado: " + profissional.getPessoa().getNome());
		System.out.println("O que você deseja alterar? [1]nome [2]sexo [3]cpf [4]rg [5]data de nascimento [6]tipo sanguíneo [7]cancelar");
	
	}
}