package br.com.saudefacil.models;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.Immutable;
@Entity
@Immutable
@Table(name = "uVW_PROFISSIONAL_POR_SINTOMA")
public class ConsultaPaciente implements Serializable {

		@Column
		@Id
		private String nome;

		@Id
		@Column
		private String descricao;
		
		@Id
		@Column
		private String especialidade;

		public String getNome() {
			return nome;
		}

		public String getDescricao() {
			return descricao;
		}
		
		public String getEspecialidade() {
			return especialidade;
		}

		@Override
		public String toString() {
			return "[Profissional = " + nome + ", Especialidade = " + especialidade + "]";
		}

}
