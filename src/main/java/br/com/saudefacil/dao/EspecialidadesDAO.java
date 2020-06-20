package br.com.saudefacil.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import br.com.saudefacil.models.Especialidades;

public class EspecialidadesDAO {
	static Session session;

	public String getUvwClinicasComEspecialidades() {
		try {
			session = HibernatesUtil.getSessionFactory().openSession();
			String query = ("select p from uVW_CLINICAS_COM_ESPECIALIDADES");
			return query;
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
	}
	
	public List<Especialidades> getEspecialidades() {
		try {
			session = HibernatesUtil.getSessionFactory().openSession();
			Query query = session.createQuery("select p from uVW_CLINICAS_COM_ESPECIALIDADES p");
		    List<Especialidades> especialidades = query.list();
		    return especialidades;
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

}
