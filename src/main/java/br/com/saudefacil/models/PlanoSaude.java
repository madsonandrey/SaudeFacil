package br.com.saudefacil.models;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "plano_saude")
public class PlanoSaude{
    
	@Id
    @Column(name = "id_plano")
    private Integer planoId;
 
    @Column(name = "descricao")
    private String descricao;
 
    @Column(name = "status_plano")
    private Integer statusPlan;
    
    public PlanoSaude() {
    	
    }

	public Integer getPlanoId() {
		return planoId;
	}

	public void setPlanoId(Integer planoId) {
		this.planoId = planoId;
	}

	public String getDescription() {
		return descricao;
	}

	public void setDescription(String description) {
		this.descricao = description;
	}

	public Integer getStatusPlan() {
		return statusPlan;
	}

	public void setStatusPlan(Integer statusPlan) {
		this.statusPlan = statusPlan;
	}

	@Override
	public String toString() {
		return "PlanoSaude [planoId=" + planoId + ", description=" + descricao + ", statusPlan=" + statusPlan + "]";
	}

	public PlanoSaude(Integer planoId, String description, Integer statusPlan) {
		//super();
		this.planoId = planoId;
		this.descricao = description;
		this.statusPlan = statusPlan;
	}
    
    
}

