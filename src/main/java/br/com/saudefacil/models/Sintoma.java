package br.com.saudefacil.models;




import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "sintomas")
public class Sintoma{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "sintomas_id")
    private Integer sintomasId;
	
	@Column(name = "descricao")
    private String descricao;
 
	public Sintoma () {
		
	}
	
    public Integer getSintomasId() {
		return sintomasId;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	@Override
	public String toString() {
		return "Sintoma [sintomasId= " + sintomasId + ", descricao= " + descricao + "]";
	}

}
	
    
    