/*
 * 
 * import java.util.List;
 * 
 * import org.hibernate.Query; import org.hibernate.Session;
 * 
 * import br.com.saudefacil.models.Pessoa; import
 * br.com.saudefacil.models.Sintomas;
 * 
 * public class SintomasDAO { static Session session;
 * 
 * public List<Sintomas> getSintomas() { try { session =
 * HibernatesUtil.getSessionFactory().openSession(); return
 * session.createQuery("from Sintoma").list();
 * 
 * } catch(Exception sqlException) { if(null != session.getTransaction()) {
 * session.getTransaction().rollback(); } sqlException.printStackTrace(); return
 * null; } finally { if(session != null) { session.close(); } } }
 * 
 * public Sintomas getSintomas(String descricao) { try { session =
 * HibernatesUtil.getSessionFactory().openSession(); Query query =
 * session.createQuery("select s from Sintomas s where s.descricao = " +
 * descricao); List<Pessoa> pessoa = query.list(); if (sintomas.size() > 0) {
 * return sintomas.get(0); } else { return null; } } catch(Exception
 * sqlException) { if(null != session.getTransaction()) {
 * session.getTransaction().rollback(); } sqlException.printStackTrace(); return
 * null; } finally { if(session != null) { session.close(); } } }
 * 
 * public void create(Pessoa pessoa) { try { session =
 * HibernatesUtil.getSessionFactory().openSession(); session.beginTransaction();
 * session.save(pessoa);
 * 
 * session.getTransaction().commit(); } catch(Exception sqlException) { if(null
 * != session.getTransaction()) { session.getTransaction().rollback(); }
 * sqlException.printStackTrace(); } finally { if(session != null) {
 * session.close(); } } } public void update(Pessoa pessoa) { try { session =
 * HibernatesUtil.getSessionFactory().openSession(); session.beginTransaction();
 * session.update(pessoa);
 * 
 * session.getTransaction().commit(); } catch(Exception sqlException) { if(null
 * != session.getTransaction()) { session.getTransaction().rollback(); }
 * sqlException.printStackTrace(); } finally { if(session != null) {
 * session.close(); } } }
 * 
 * public void delete(Pessoa pessoa) { try { session =
 * HibernatesUtil.getSessionFactory().openSession(); session.beginTransaction();
 * session.delete(pessoa);
 * 
 * session.getTransaction().commit(); } catch(Exception sqlException) { if(null
 * != session.getTransaction()) { session.getTransaction().rollback(); }
 * sqlException.printStackTrace(); } finally { if(session != null) {
 * session.close(); } } } }
 * 
 */