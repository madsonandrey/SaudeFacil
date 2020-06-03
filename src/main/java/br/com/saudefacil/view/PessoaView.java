package br.com.saudefacil.view;

import java.time.LocalDate;
import java.util.Scanner;

import br.com.saudefacil.models.Pessoa;

public class PessoaView {
	public Pessoa criarPessoa() {
		Scanner leTeclado = new Scanner(System.in);
		System.out.println("Digite seu nome");
		String nome = leTeclado.next();

		System.out.println("Digite seu rg");
		String rg = leTeclado.next();

		System.out.println("Digite seu cpf");
		String cpf = leTeclado.next();

		System.out.println("Digite seu sexo");
		String sexo = leTeclado.next();

		Pessoa pessoa = new Pessoa(null, cpf, rg, sexo, nome, null,
				null);
		return pessoa;
	}
}
