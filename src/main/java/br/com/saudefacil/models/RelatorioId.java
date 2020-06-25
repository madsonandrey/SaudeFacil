package br.com.saudefacil.models;

import java.io.Serializable;

public class RelatorioId implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3812246682335617951L;

	private String clinica;

	private String especialidade;

	public String getClinica() {
		return clinica;
	}

	public void setClinica(String clinica) {
		this.clinica = clinica;
	}

	public String getEspecialidade() {
		return especialidade;
	}

	public void setEspecialidade(String especialidade) {
		this.especialidade = especialidade;
	}
	

}
