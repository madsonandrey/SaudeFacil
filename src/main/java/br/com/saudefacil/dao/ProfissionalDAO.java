package br.com.saudefacil.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import br.com.saudefacil.models.Profissional;

public class ProfissionalDAO {
static Session session;
	
	public List<Profissional> getProfissionais() {
		try {
			session = HibernatesUtil.getSessionFactory().openSession();
			Query query = session.createQuery("select p from Profissional p");
		    List<Profissional> profissionais = query.list();
		    return profissionais;
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
	
	public Profissional getProfissional(String cpf) {
		try {
			session = HibernatesUtil.getSessionFactory().openSession();
			Query query = session.createQuery("select p from Profissional p where p.pessoa.cpf = " + cpf);
		    List<Profissional> profissional = query.list();
		    if (profissional.size() > 0) {
		    	return profissional.get(0);
		    } else {
		    	return null;
		    }
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
	
	
	public void create(Profissional profissional) {
		try {
			session = HibernatesUtil.getSessionFactory().openSession();
			session.beginTransaction();
            session.save(profissional);
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
	
	public void update(Profissional profissional) {
		try {
			session = HibernatesUtil.getSessionFactory().openSession();
			session.beginTransaction();
            session.update(profissional);
            
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
	
	public void delete(Profissional profissional) {
		try {
			session = HibernatesUtil.getSessionFactory().openSession();
			session.beginTransaction();
			session.delete(profissional);
            
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
}