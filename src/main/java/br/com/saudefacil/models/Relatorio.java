package br.com.saudefacil.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.Immutable;

@Entity
@Immutable
@Table(name = "uVW_CLINICAS_COM_ESPECIALIDADES")
public class Relatorio {
	
	@Column
	@Id
	private String clinica;
	
	@Column
	private String especialidade;
	
	public String getClinica() {
		return clinica;
	}
	
	public String getEspecialidade() {
		return especialidade;
	}

	@Override
	public String toString() {
		return "Relatorio [clinica=" + clinica + ", especialidade=" + especialidade + "]";
	}
	
}