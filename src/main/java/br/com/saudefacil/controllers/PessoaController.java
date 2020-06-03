package br.com.saudefacil.controllers;
import java.util.List;

import br.com.saudefacil.dao.PessoaDAO;
import br.com.saudefacil.models.Pessoa;

public class PessoaController {

	private PessoaDAO pessoaDAO = new PessoaDAO();
	
	public void create(Pessoa pessoa) {
		Pessoa pessoaAuxiliar = pessoaDAO.getPessoa(pessoa.getCpf());
		if (pessoaAuxiliar != null) {
			throw new RuntimeException("CPF já cadastrado");
		}
		pessoaDAO.create(pessoa);
	}
	
	public Pessoa getPessoa(String cpf) {
		return pessoaDAO.getPessoa(cpf);
	}
	
	public void update(Pessoa pessoa) {
		pessoaDAO.update(pessoa);
	}

	public List<Pessoa> getPessoas() {
		return pessoaDAO.getPessoas();
	}
}