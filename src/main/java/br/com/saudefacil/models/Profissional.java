package br.com.saudefacil.models;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
	
	@Entity
	@Table(name = "profissional")
	 
	public class Profissional implements Serializable  {
		private static final long serialVersionUID = 1L;
		
		@Id
	    @Column(name = "credencial")
		private String credencial;
		
		@ManyToOne
		private Pessoa pessoa;
		
		@Column(name = "autonomo")
		private Integer statusAutonomo;
		
		@Column(name = "atende_clinica")
		private Integer atendeClinica;
		
		@Column(name = "status_profissional")
		private Integer statusProfissional;
		
		public Profissional() {
			
		} 

		public Profissional(String credencial, Pessoa pessoa, Integer statusAutonomo, Integer atendeClinica,
				Integer statusProfissional) {
			super();
			this.credencial = credencial;
			this.pessoa = pessoa;
			this.statusAutonomo = statusAutonomo;
			this.atendeClinica = atendeClinica;
			this.statusProfissional = statusProfissional;
		}

		public String getCredencial() {
			return credencial;
		}

		public void setCredencial(String credencial) {
			this.credencial = credencial;
		}

		public Pessoa getPessoa() {
			return pessoa;
		}

		public void setPessoa(Pessoa pessoa) {
			this.pessoa = pessoa;
		}

		public Integer getStatusAutonomo() {
			return statusAutonomo;
		}

		public void setStatusAutonomo(Integer statusAutonomo) {
			this.statusAutonomo = statusAutonomo;
		}

		public Integer getAtendeClinica() {
			return atendeClinica;
		}

		public void setAtendeClinica(Integer atendeClinica) {
			this.atendeClinica = atendeClinica;
		}

		public Integer getStatusProfissional() {
			return statusProfissional;
		}

		public void setStatusProfissional(Integer statusProfissional) {
			this.statusProfissional = statusProfissional;
		}
		
		@Override
		public String toString() {
			return "Profissional [credencial=" + credencial + ", pessoa=" + pessoa + ", statusAutonomo="
					+ statusAutonomo + ", atendeClinica=" + atendeClinica + ", statusProfissional=" + statusProfissional
					+ "]";
		}
	}
