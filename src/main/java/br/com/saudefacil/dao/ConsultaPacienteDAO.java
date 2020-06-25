package br.com.saudefacil.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import br.com.saudefacil.models.ConsultaPaciente;

public class ConsultaPacienteDAO {
	static Session session;
	
	/*
	 * public List<ConsultaPaciente> getEspecialista() { try { session =
	 * HibernatesUtil.getSessionFactory().openSession(); return
	 * session.createQuery("from ConsultaPaciente").list();
	 * 
	 * } catch(Exception sqlException) { if(null != session.getTransaction()) {
	 * session.getTransaction().rollback(); } sqlException.printStackTrace(); return
	 * null; } finally { if(session != null) { session.close(); } } }
	 */
	
	public List<ConsultaPaciente> getEspecialista(String sintoma) {
		try {
			session = HibernatesUtil.getSessionFactory().openSession();
			Query query = session.createQuery("from ConsultaPaciente p where p.descricao = '" + sintoma + "'");
		    List<ConsultaPaciente> consultaPaciente = query.list();
		    if (consultaPaciente.size() > 0) {
		    	return consultaPaciente;
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
	
}
