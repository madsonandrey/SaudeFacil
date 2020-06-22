package br.com.saudefacil.dao;

import java.util.List;

import org.hibernate.Session;

import br.com.saudefacil.models.Relatorio;

public class RelatorioDAO {
	static Session session;
	
	public List<Relatorio> getRelatorio() {
		try {
			session = HibernatesUtil.getSessionFactory().openSession();
			return session.createQuery("from Relatorio").list();
			 
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
