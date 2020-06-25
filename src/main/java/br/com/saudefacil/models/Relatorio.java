package br.com.saudefacil.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

import org.hibernate.annotations.Immutable;

@Entity
@Immutable
@Table(name = "uVW_CLINICAS_COM_ESPECIALIDADES")
@IdClass(RelatorioId.class)
public class Relatorio {
	
	@Column
	@Id
	private String clinica;

	@Id
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