package br.com.saudefacil.view;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import br.com.saudefacil.controllers.PessoaController;
import br.com.saudefacil.exception.PessoaException;
import br.com.saudefacil.models.Pessoa;

public class PessoaView {
	Scanner leTeclado = new Scanner(System.in);
	
	public Pessoa criarPessoa() {

		System.out.println("Digite seu cpf");
		String cpf = leTeclado.next();
		PessoaController pessoaController = new PessoaController();
		Pessoa pessoa = pessoaController.getPessoa(cpf);
		if (pessoa == null) {
			System.out.println("Digite seu nome");
			String nome = leTeclado.next();
			leTeclado.nextLine();

			System.out.println("Digite seu rg");
			String rg = leTeclado.next();
			leTeclado.nextLine();

			System.out.println("Digite seu sexo [m] | [f]");
			String sexo = leTeclado.next().toLowerCase();

			System.out.println("Digite seu tipo sanguíneo: 'a+'|'a-'|'b+'|'b-'|'ab+'|'ab-'|'o+'|'o-|");
			String tipoSanguineo = leTeclado.next().toLowerCase();

			System.out.println("Digite sua data de nascimento (dd/mm/aaaa)");
			String data = leTeclado.next();
			DateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
			Date date = null;
			try {
				date = formatter.parse(data);
			} catch (ParseException e) {
				throw new PessoaException("Data inválida");
			}
			Pessoa pessoaNova = new Pessoa(null, cpf, rg, sexo, nome, date, tipoSanguineo);
			pessoaController.create(pessoaNova);
			return pessoaNova;
		} else {
			System.out.println("Pessoa já cadastrada: " + pessoa.getNome());
			throw new PessoaException("Pessoa já cadastrada");
		}
	}

	public void atualizarCadastro() {
		 
			PessoaController pessoaController = new PessoaController();
			Pessoa pessoa = new Pessoa();
			System.out.println("Digite o CPF do paciente que deseja alterar o cadastro");
			String cpf = leTeclado.next();
			leTeclado.nextLine();
			pessoa = pessoaController.getPessoa(cpf);
			if(pessoa == null) {
				throw new PessoaException("Paciente não cadastrado");
			}
			System.out.println("Nome do paciente: " + pessoa.getNome());

			System.out.println("O que você deseja alterar? [1]nome [2]sexo [3]cpf [4]rg [5]data de nascimento [6]tipo sanguíneo [7]cancelar");
			int opcao = leTeclado.nextInt();
			switch (opcao) {
			case 1:
				System.out.println("Digite o novo nome");
				String nome = leTeclado.next();
				leTeclado.nextLine();
				pessoa.setNome(nome);
				pessoaController.update(pessoa);
				System.out.println("Alteração realizada com sucesso!");
				break;

			case 2:
				System.out.println("Digite o novo sexo");
				String sexo = leTeclado.next();
				pessoa.setSexo(sexo);
				pessoaController.update(pessoa);
				System.out.println("Alteração realizada com sucesso!");
				break;
			case 3:
				System.out.println("Digite o novo cpf");
				String cpfNovo = leTeclado.next();
				leTeclado.nextLine();
				pessoa.setCpf(cpfNovo);
				pessoaController.update(pessoa);
				System.out.println("Alteração realizada com sucesso!");
				break;
			case 4:
				System.out.println("Digite o novo rg");
				String rg = leTeclado.next();
				pessoa.setRg(rg);
				pessoaController.update(pessoa);
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
				pessoa.setDataNascimento(date);
				pessoaController.update(pessoa);
				System.out.println("Alteração realizada com sucesso!");
				break;
			case 6:
				System.out.println("Digite o novo tipo sanguíneo");
				String tipoSanguineo = leTeclado.next();
				pessoa.setTipoSanguineo(tipoSanguineo);
				pessoaController.update(pessoa);
				System.out.println("Alteração realizada com sucesso!");
				break;
			case 7:
				return;
			default:
				System.out.println("Opção inválida. Tente novamente");
				atualizarCadastro();
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
		if (opcao == 1) {
			pessoaController.deletePessoa(pessoa);
			System.out.println("Usuário deletado");
		} else {
			System.out.println("Operação cancelada");
		}
	}
}
