package br.com.saudefacil.models;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Especialidades")
public class Especialidades implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "especialidade_id")

	private Integer especialidadeID;

	@Column(name = "descricao")
	private String descricao;

	public Especialidades() {
	}

	public Integer getEspecialidadeID() {
		return especialidadeID;
	}

	public void setEspecialidadeID(Integer especialidadeID) {
		this.especialidadeID = especialidadeID;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	@Override
	public String toString() {
		return "Especialidades [especialidadeID=" + especialidadeID + ", descricao=" + descricao + "]";
	}

}