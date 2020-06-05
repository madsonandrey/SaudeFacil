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

	public List<PlanoSaude> getPlanosSaude(Integer idPlano) {

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
	
	public void create(PlanoSaude planoSaude) {
		try {
			session = HibernatesUtil.getSessionFactory().openSession();
			session.beginTransaction();
			session.save(planoSaude);
			session.getTransaction().commit();
			
		}catch (Exception sqlException) {

			if(null != session.getTransaction()) {
				session.getTransaction().rollback();
			}
			sqlException.printStackTrace();
		} finally {
			if (session != null) {
				session.close();
			}
		}
	}
	
	public void update(PlanoSaude planoSaude) {
		try {
			session = HibernatesUtil.getSessionFactory().openSession();
			session.beginTransaction();
			session.update(planoSaude);
			session.getTransaction().commit();
		}catch (Exception sqlException) {

			if (null != session.getTransaction() ) {
				session.getTransaction().rollback();
				
			}
			sqlException.printStackTrace();
		} finally {
			if (session != null) {
				session.close();
			}
		}
		
	}
	
	public void delete() {
		
	}

}
