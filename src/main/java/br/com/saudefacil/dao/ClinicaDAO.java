package br.com.saudefacil.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import br.com.saudefacil.models.Clinica;
import br.com.saudefacil.models.Paciente;

public class ClinicaDAO {
	static Session session;
	
	public void create(Clinica clinica) {
		try {
			session = HibernatesUtil.getSessionFactory().openSession();
			session.beginTransaction();
            session.save(clinica);
            session.getTransaction().commit();
		} catch(Exception sqlException) {
            if(null != session.getTransaction()) {
                session.getTransaction().rollback();
            }
            sqlException.printStackTrace();
        } finally {
            if(session != null) {
            	session.close();
            }
        }
	}
	
	public List<Clinica> getClinicas() {
		try {
			session = HibernatesUtil.getSessionFactory().openSession();
			Query query = session.createQuery("select p from Clinica p");
		    List<Clinica> clinicas = query.list();
		    return clinicas;
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
