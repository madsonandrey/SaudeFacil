package br.com.saudefacil.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import br.com.saudefacil.models.Pessoa;

public class PessoaDAO {
	static Session session;
	
	public List<Pessoa> getPessoas() {
		try {
			session = HibernatesUtil.getSessionFactory().openSession();
			Query query = session.createQuery("select p from Pessoa p"); //= list
		    List<Pessoa> pessoas = query.list();
		    return pessoas;
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

	public Pessoa getPessoa(String cpf) {
		try {
			session = HibernatesUtil.getSessionFactory().openSession();
			Query query = session.createQuery("select p from Pessoa p where p.cpf = " + cpf);
		    List<Pessoa> pessoa = query.list();
		    if (pessoa.size() > 0) {
		    	return pessoa.get(0);
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
	public void create(Pessoa pessoa) {
		try {
			session = HibernatesUtil.getSessionFactory().openSession();
			session.beginTransaction();
            session.saveOrUpdate(pessoa);
            
            
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
	
	public void delete(Pessoa pessoa) {
		try {
			session = HibernatesUtil.getSessionFactory().openSession();
			session.beginTransaction();
			session.delete(pessoa);
            
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
