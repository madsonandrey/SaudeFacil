package br.com.saudefacil.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "plano_saude")
public class PlanoSaude {
    
	@Id
    @GeneratedValue(strategy = GenerationType.TABLE)
    @Column(name = "id_plano")
    private Integer planoId;
 
    @Column(name = "descricao")
    private String description;
 
    @Column(name = "status_plano")
    private String statusPlan;
    
    public PlanoSaude() {
    	
    }

	public Integer getPlanoId() {
		return planoId;
	}

	public void setPlanoId(Integer planoId) {
		this.planoId = planoId;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getStatusPlan() {
		return statusPlan;
	}

	public void setStatusPlan(String statusPlan) {
		this.statusPlan = statusPlan;
	}

	@Override
	public String toString() {
		return "PlanoSaude [planoId=" + planoId + ", description=" + description + ", statusPlan=" + statusPlan + "]";
	}

	public PlanoSaude(Integer planoId, String description, String statusPlan) {
		//super();
		this.planoId = planoId;
		this.description = description;
		this.statusPlan = statusPlan;
	}
    
    
}

