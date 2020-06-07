package br.com.saudefacil.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import br.com.saudefacil.models.Paciente;
import br.com.saudefacil.models.Pessoa;

public class PacienteDAO {
static Session session;
	
	public List<Paciente> getPacientes() {
		try {
			session = HibernatesUtil.getSessionFactory().openSession();
			Query query = session.createQuery("select p from Paciente p");
		    List<Paciente> pacientes = query.list();
		    return pacientes;
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
	
	public Paciente getPaciente(String cpf) {
		try {
			session = HibernatesUtil.getSessionFactory().openSession();
			Query query = session.createQuery("select p from Paciente p where p.pessoa.cpf = " + cpf);
		    List<Paciente> paciente = query.list();
		    if (paciente.size() > 0) {
		    	return paciente.get(0);
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
	
	
	public void create(Paciente paciente) {
		try {
			session = HibernatesUtil.getSessionFactory().openSession();
			session.beginTransaction();
            session.save(paciente);
            
            
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
	public void update(Paciente paciente) {
		try {
			session = HibernatesUtil.getSessionFactory().openSession();
			session.beginTransaction();
            session.update(paciente);
            
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
	
	
	public void delete(Paciente paciente) {
		try {
			session = HibernatesUtil.getSessionFactory().openSession();
			session.beginTransaction();
			session.delete(paciente);
            
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