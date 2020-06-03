package br.com.saudefacil.models;

import java.io.Serializable;
import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "pessoa")
public class Pessoa implements Serializable{
	
	
    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)
    @Column(name = "pessoa_id")
    private Integer pessoaId;
 
    @Column(name = "cpf")
    private String cpf;
 
    @Column(name = "rg")
    private String rg;
 
    @Column(name = "sexo")
    private String sexo;
    
    @Column(name = "nome")
    private String nome;
 
    @Column(name = "data_nascimento")
    private LocalDate data_nascimento;
    
    @Column(name = "tipo_sanguineo")
    private String tipo_sanguineo;

	public Integer getPessoaId() {
		return pessoaId;
	}
	
	public Pessoa(Integer pessoaId, String cpf, String rg, String sexo, String nome, LocalDate data_nascimento,
			String tipo_sanguineo) {
		super();
		this.pessoaId = pessoaId;
		this.cpf = cpf;
		this.rg = rg;
		this.sexo = sexo;
		this.nome = nome;
		this.data_nascimento = data_nascimento;
		this.tipo_sanguineo = tipo_sanguineo;
	}

	public Pessoa() {
		
	}
	
	public void setPessoaId(Integer pessoaId) {
		this.pessoaId = pessoaId;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public LocalDate getData_nascimento() {
		return data_nascimento;
	}

	public void setData_nascimento(LocalDate data_nascimento) {
		this.data_nascimento = data_nascimento;
	}

	public String getTipo_sanguineo() {
		return tipo_sanguineo;
	}

	public void setTipo_sanguineo(String tipo_sanguineo) {
		this.tipo_sanguineo = tipo_sanguineo;
	}

	@Override
	public String toString() {
		return "Pessoa [pessoaId=" + pessoaId + ", cpf=" + cpf + ", rg=" + rg + ", sexo=" + sexo + ", nome=" + nome
				+ ", data_nascimento=" + data_nascimento + ", tipo_sanguineo=" + tipo_sanguineo + "]";
	}
	
}