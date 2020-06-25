package br.com.saudefacil.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import br.com.saudefacil.models.Especialidades;
import br.com.saudefacil.models.Paciente;

public class EspecialidadesDAO {
	static Session session;

	public List<Especialidades> getEspecialidades() {
		try {
			session = HibernatesUtil.getSessionFactory().openSession();
			Query query = session.createQuery("select p from Especialidades p");
			List<Especialidades> especialidades = query.list();
			return especialidades;
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

}
