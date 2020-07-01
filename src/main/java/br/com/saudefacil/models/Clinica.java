package br.com.saudefacil.models;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Clinica {
	 	@Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    @Column(name = "clinica_id")
	    private Integer clinicaId;
	 
	    @Column(name = "forma_pagamento", columnDefinition="VARCHAR(200)")
	    private String formaPagamento;
	 
	    @Column(name = "cnpj", columnDefinition = "VARCHAR(200)")
	    private String cnpj;
	 
	    @Column(name = "status_clinica")
	    private Integer statusClinica;
	    
	    @Column(name = "razaoSocial", columnDefinition = "VARCHAR(200)")
	    private String razaoSocial;

	    public Clinica() {
	    	
	    }
	    
		public Clinica(Integer clinicaId, String formaPagamento, String cnpj, Integer statusClinica,
				String razaoSocial) {
			super();
			this.clinicaId = clinicaId;
			this.formaPagamento = formaPagamento;
			this.cnpj = cnpj;
			this.statusClinica = statusClinica;
			this.razaoSocial = razaoSocial;
		}

		public Integer getClinicaId() {
			return clinicaId;
		}

		public void setClinicaId(Integer clinicaId) {
			this.clinicaId = clinicaId;
		}

		public String getFormaPagamento() {
			return formaPagamento;
		}

		public void setFormaPagamento(String formaPagamento) {
			this.formaPagamento = formaPagamento;
		}

		public String getCnpj() {
			return cnpj;
		}

		public void setCnpj(String cnpj) {
			this.cnpj = cnpj;
		}

		public Integer getStatusClinica() {
			return statusClinica;
		}

		public void setStatusClinica(Integer statusClinica) {
			this.statusClinica = statusClinica;
		}

		public String getRazaoSocial() {
			return razaoSocial;
		}

		public void setRazaoSocial(String razaoSocial) {
			this.razaoSocial = razaoSocial;
		}

		@Override
		public String toString() {
			return "Clinica [clinicaId=" + clinicaId + ", formaPagamento=" + formaPagamento + ", cnpj=" + cnpj
					+ ", statusClinica=" + statusClinica + ", razaoSocial=" + razaoSocial + "]";
		}
	    
}
