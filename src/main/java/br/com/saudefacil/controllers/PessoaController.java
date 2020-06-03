package br.com.saudefacil.controllers;
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
}