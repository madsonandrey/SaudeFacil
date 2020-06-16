package br.com.saudefacil.view;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import br.com.saudefacil.controllers.PessoaController;
import br.com.saudefacil.controllers.ProfissionalController;
import br.com.saudefacil.exception.ProfissionalException;
import br.com.saudefacil.models.Pessoa;
import br.com.saudefacil.models.Profissional;

public class ProfissionalView extends PessoaView {
	private static final int PROFISSIONAL_DESATIVADO = 0;
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
			System.out.println("Profissional cadastrado com sucesso");
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
		System.out.println("O que você deseja alterar? [1]nome [2]sexo [3]cpf [4]rg [5]data de nascimento [6]tipo sanguíneo [7]credencial [8]status autonomo [9]status clínica [10]cancelar");
		int opcao = leTeclado.nextInt();
		switch (opcao) {
		case 1:
			System.out.println("Digite o novo nome");
			String nome = leTeclado.next();
			leTeclado.nextLine();
			profissional.getPessoa().setNome(nome);
			profissionalController.update(profissional);
			System.out.println("Alteração realizada com sucesso!");
			break;

		case 2:
			System.out.println("Digite o novo sexo");
			String sexo = leTeclado.next();
			profissional.getPessoa().setSexo(sexo);
			profissionalController.update(profissional);
			System.out.println("Alteração realizada com sucesso!");
			break;
		case 3:
			System.out.println("Digite o novo cpf");
			String cpfNovo = leTeclado.next();
			leTeclado.nextLine();
			profissional.getPessoa().setCpf(cpfNovo);
			profissionalController.update(profissional);
			System.out.println("Alteração realizada com sucesso!");
			break;
		case 4:
			System.out.println("Digite o novo rg");
			String rg = leTeclado.next();
			profissional.getPessoa().setRg(rg);
			profissionalController.update(profissional);
			System.out.println("Alteração realizada com sucesso!");
			break;
		case 5:
			System.out.println("Digite a nova data de nascimento");
			String data = leTeclado.next();
			DateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
			Date date = null;
			try {
				date = formatter.parse(data);
			} catch (ParseException e) {
				System.out.println("Data inválida");
			} 
			profissional.getPessoa().setDataNascimento(date);
			profissionalController.update(profissional);
			System.out.println("Alteração realizada com sucesso!");
			break;
		case 6:
			System.out.println("Digite o novo tipo sanguíneo");
			String tipoSanguineo = leTeclado.next();
			profissional.getPessoa().setTipoSanguineo(tipoSanguineo);
			profissionalController.update(profissional);
			System.out.println("Alteração realizada com sucesso!");
			break;
		case 7:
			System.out.println("Digite a nova credencial");
			String credencial = leTeclado.next();
			profissional.setCredencial(credencial);
			profissionalController.update(profissional);
			System.out.println("Alteração realizada com sucesso!");
			break;
		case 8:
			System.out.println("Atende como autonomo? Digite para 1 para SIM ou 0 para NÃO");
			Integer statusAutonomo = leTeclado.nextInt();
			profissional.setStatusAutonomo(statusAutonomo);
			profissionalController.update(profissional);
			System.out.println("Alteração realizada com sucesso!");
			break;
		case 9:
			System.out.println("Atende em clínica? Digite um 1 para SIM ou 0 para NÃO");
			Integer statusClinica = leTeclado.nextInt();
			profissional.setAtendeClinica(statusClinica);
			profissionalController.update(profissional);
			System.out.println("Alteração realizada com sucesso!");
			break;
		case 10:
			return;
		default:
			System.out.println("Opção inválida. Tente novamente");
			atualizarCadastro();
		}
	}
	
	public void getListaProfissionais(){
		List<Profissional> profissionais = profissionalController.getProfissionais();
		profissionais.forEach(System.out::println);
	}
	
	public void getProfissional() {
		System.out.println("Digite o CPF do profissional");
		String cpf = leTeclado.next();
		profissional = profissionalController.getProfissional(cpf);
		if(profissional == null) {
			throw new ProfissionalException("Profissional não cadastrado");
		}
		System.out.print(profissional.getPessoa());
		System.out.print("[statusAutonomo: " + profissional.getStatusAutonomo() + "]");
		System.out.print("[credencial: " + profissional.getCredencial() + "]");
		System.out.print("[atendeClinca: " + profissional.getAtendeClinica() + "]");
		System.out.println("[statusProfissional: " + profissional.getStatusProfissional() + "]");
	}
	
	public void desativarProfissional() {
		System.out.println("Digite o CPF do profissional que deseja desativar");
		String cpf = leTeclado.next();
		profissional = profissionalController.getProfissional(cpf);
		profissionalController.desativarProfissional(profissional);
		System.out.println("Profissional desativado com sucesso");
	}
}