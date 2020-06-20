package br.com.saudefacil.models;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "sintomas")
public class Sintomas implements Serializable{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "sintomas_id")
    private Integer sintomasID;
	
	@Column(name = "descricao", columnDefinition = "VARCHAR(200)")
    private String descricao;

	public Sintomas(Integer sintomasID, String descricao) {
		super();
		this.sintomasID = sintomasID;
		this.descricao = descricao;
	}
	
	public Sintomas() {
		
	}

	public Integer getSintomasID() {
		return sintomasID;
	}

	public void setSintomasID(Integer sintomasID) {
		this.sintomasID = sintomasID;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	@Override
	public String toString() {
		return "Sintomas [sintomasID=" + sintomasID + ", descricao=" + descricao + "]";
	}
	
}


