package maven;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

public class ControllerPessoa {
	static Session session;
	
	/**
	 * public ou void ou static ou private...
	 * Tipo do retorno (se não for void)
	 * nome do método
	 * ( parametros -  se houver, senão, só () )
	 * {
	 *   código
	 * }
	 * */
	
	public List<Pessoa> getPessoas() {
		try {
			session = HibernatesUtil.getSessionFactory().openSession();
			Query query = session.createQuery("select p from Pessoa p");
		    List<Pessoa> pessoas = query.list();
		    return pessoas;
		} catch(Exception sqlException) {
            if(null != session.getTransaction()) {
                System.out.println("\n.......Transaction Is Being Rolled Back.......");
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

	public Pessoa getPessoa(Integer id) {
		try {
			session = HibernatesUtil.getSessionFactory().openSession();
			Query query = session.createQuery("select p from Pessoa p where p.pessoaId = " + id.toString());
		    List<Pessoa> pessoas = query.list();
		    if (pessoas.size() > 0) {
		    	return pessoas.get(0);
		    } else {
		    	return null;
		    }
		} catch(Exception sqlException) {
            if(null != session.getTransaction()) {
                System.out.println("\n.......Transaction Is Being Rolled Back.......");
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
	public void createPessoa(Pessoa pessoa) {
		try {
			session = HibernatesUtil.getSessionFactory().openSession();
			session.beginTransaction();
            session.saveOrUpdate(pessoa);
            
            System.out.println("\n.......Records Saved Successfully To The Database.......\n");
            
            //Committing The Transactions To The Database
            session.getTransaction().commit();
		} catch(Exception sqlException) {
            if(null != session.getTransaction()) {
                System.out.println("\n.......Transaction Is Being Rolled Back.......");
                session.getTransaction().rollback();
            }
            sqlException.printStackTrace();
        } finally {
            if(session != null) {
            	session.close();
            }
        }
	}
	
	public void deletePessoa(Pessoa pessoa) {
		try {
			session = HibernatesUtil.getSessionFactory().openSession();
			session.beginTransaction();
			
            // código aqui
            
            System.out.println("\n.......Record deleted Successfully To The Database.......\n");
            
            //Committing The Transactions To The Database
            session.getTransaction().commit();
		} catch(Exception sqlException) {
            if(null != session.getTransaction()) {
                System.out.println("\n.......Transaction Is Being Rolled Back.......");
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
