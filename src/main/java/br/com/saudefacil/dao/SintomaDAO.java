package br.com.saudefacil.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import br.com.saudefacil.models.Pessoa;
import br.com.saudefacil.models.Sintoma;

public class SintomaDAO {
	static Session session;
	public Sintoma getPaciente;

	public List<Sintoma> getSintoma() {
		try {
			session = HibernatesUtil.getSessionFactory().openSession();
			Query query = session.createQuery("select p from Sintoma p");
		    List<Sintoma> sintoma = query.list();
		    return sintoma;
		} catch(Exception sqlException) {
            if(null != session.getTransaction()) {
                session.getTransaction().rollback();
            }
            sqlException.printStackTrace();
            return null;
        } finally {
            if(session != null) {
            	session.close();
            }
        }
	}
	
		public void update(Sintoma sintoma) {
		try {
			session = HibernatesUtil.getSessionFactory().openSession();
			session.beginTransaction();
			session.saveOrUpdate(sintoma);
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

}
