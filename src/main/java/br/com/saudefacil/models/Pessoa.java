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
@Data
@NoArgsConstructor
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

}