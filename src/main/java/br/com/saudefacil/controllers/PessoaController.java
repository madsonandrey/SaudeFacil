package br.com.saudefacil.controllers;

import java.util.List;

import br.com.saudefacil.dao.PessoaDAO;
import br.com.saudefacil.exception.PessoaException;
import br.com.saudefacil.models.Pessoa;

public class PessoaController {
	private static final int TAMANHO_MAXIMO_DO_NOME = 200;
	private static final int TAMANHO_CPF = 11;
	private static final int TAMANHO_RG = 7;
	
	private PessoaDAO pessoaDAO = new PessoaDAO();
	
	public void create(Pessoa pessoa) {
		Pessoa pessoaAuxiliar = pessoaDAO.getPessoa(pessoa.getCpf());
		if (pessoaAuxiliar != null) {
			throw new PessoaException("Já cadastrado!");
		}
		validaPessoa(pessoa);
		pessoaDAO.create(pessoa);
	}

	public Pessoa getPessoa(String cpf) {
		return pessoaDAO.getPessoa(cpf);
	}

	public void update(Pessoa pessoa) {
		validaPessoa(pessoa);
		pessoaDAO.update(pessoa);
	}

	public List<Pessoa> getPessoas() {
		return pessoaDAO.getPessoas();
	}

	public void deletePessoa(Pessoa pessoa) {
		pessoaDAO.delete(pessoa);
	}
	
	private void validaPessoa(Pessoa pessoa) {
		if (!pessoa.getSexo().equals("m") && !pessoa.getSexo().equals("f")) {
			throw new PessoaException("Digite 'm' ou 'f'");
		}
		if (pessoa.getNome().length() > TAMANHO_MAXIMO_DO_NOME) {
			throw new PessoaException("Nome muito extenso. Máximo de caracteres permitidos: 200");
		}
		if (pessoa.getCpf().length() != TAMANHO_CPF) {
			throw new PessoaException("CPF inválido. Tamanho deve ser 11 caracteres");
		}
		if (pessoa.getRg().length() < TAMANHO_RG) {
			throw new PessoaException("RG inválido. Mínimo de 7 números");
		}
		if (!pessoa.getTipoSanguineo().equals("a+")  && !pessoa.getTipoSanguineo().equals("a-") 
				&& !pessoa.getTipoSanguineo().equals("b+") && !pessoa.getTipoSanguineo().equals("b-") 
				&& !pessoa.getTipoSanguineo().equals("ab+") && !pessoa.getTipoSanguineo().equals("ab-") 
				&& !pessoa.getTipoSanguineo().equals("o+") && !pessoa.getTipoSanguineo().equals("o-")) {
			throw new PessoaException("O tipo sanguíneo deve ser 'a+', 'a-', 'b+', 'b-', 'ab+', 'ab-', o+' 'o-'");
		}
	}
	
}
