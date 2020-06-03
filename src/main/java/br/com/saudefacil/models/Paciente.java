package br.com.saudefacil.models;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "paciente")
public class Paciente implements Serializable {
	@Id
    @GeneratedValue(strategy = GenerationType.TABLE)
    @Column(name = "id_paciente")
    
	private Integer pacienteID;
	
	@ManyToOne
	private Pessoa pessoa;
	
	@Column(name = "status_paciente")
	private Integer statusPaciente;
	
	public Paciente() {
		
	}

	public Integer getPacienteID() {
		return pacienteID;
	}

	public void setPacienteID(Integer pacienteID) {
		this.pacienteID = pacienteID;
	}

	public Pessoa getPessoa() {
		return pessoa;
	}

	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}

	public Integer getStatusPaciente() {
		return statusPaciente;
	}

	public void setStatusPaciente(Integer statusPaciente) {
		this.statusPaciente = statusPaciente;
	}

	@Override
	public String toString() {
		return "Paciente [pacienteID=" + pacienteID + ", pessoa=" + pessoa + ", statusPaciente=" + statusPaciente + "]";
	}
}
