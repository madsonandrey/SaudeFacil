/*
 * Author: Relton Lima
 * Last alter date: 03-06-2020 03:52:01
 */
package br.com.saudefacil.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import br.com.saudefacil.models.PlanoSaude;

public class PlanoSaudeDAO {

	static Session session;

	public List<PlanoSaude> getPlanosSaude() {

		try {
			session = HibernatesUtil.getSessionFactory().openSession();
			Query query = session.createQuery("SELECT p FROM PlanoSaude p");
			List<PlanoSaude> planosSaude = query.list();
			return planosSaude;

		} catch (Exception sqlException) {
			if (null != session.getTransaction()) {
				session.getTransaction().rollback();
			}

			sqlException.printStackTrace();
			return null;

		} finally {
			if (session != null) {
				session.close();
			}
		}
	} // FIM getPlanosSaude
	
	public PlanoSaude getPlanoSaude(Integer id) {
		
		return null;
	}
	
	public void createPlanoSaude(PlanoSaude planoSaude) {
		
	}
	
	public void updatePlanoSaude(PlanoSaude planoSaude) {
		
	}
	
	public void deletetPlanoSaude() {
		
	}

}
