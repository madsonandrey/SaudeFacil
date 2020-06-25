package br.com.saudefacil.dao;

import java.util.Properties;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;
import org.hibernate.service.ServiceRegistry;

import br.com.saudefacil.models.ConsultaPaciente;
import br.com.saudefacil.models.Especialidades;
import br.com.saudefacil.models.Paciente;
import br.com.saudefacil.models.Pessoa;
import br.com.saudefacil.models.PlanoSaude;
import br.com.saudefacil.models.Profissional;
import br.com.saudefacil.models.Relatorio;
import br.com.saudefacil.models.Sintoma;

public class HibernatesUtil {
	private static SessionFactory sessionFactory;
	public static SessionFactory getSessionFactory() {
		if (sessionFactory == null) {
			try {
				Configuration configuration = new Configuration();
				Properties settings = new Properties();
				settings.put(Environment.DRIVER, "com.mysql.jdbc.Driver");
				settings.put(Environment.URL, "jdbc:mysql://mysql669.umbler.com:41890/bd_saude_v2");
				settings.put(Environment.USER, "unit_squadbd"); 
				settings.put(Environment.PASS, "2020squadbd2020");
				settings.put(Environment.DIALECT, "org.hibernate.dialect.MySQLDialect"); 
				settings.put(Environment.SHOW_SQL, "false");
				settings.put(Environment.CURRENT_SESSION_CONTEXT_CLASS, "thread");
				settings.put(Environment.HBM2DDL_AUTO, "update");
				configuration.setProperties(settings);
				configuration.addAnnotatedClass(Pessoa.class);
				configuration.addAnnotatedClass(Paciente.class);
				configuration.addAnnotatedClass(PlanoSaude.class);
				configuration.addAnnotatedClass(Profissional.class);
				configuration.addAnnotatedClass(Relatorio.class);
				configuration.addAnnotatedClass(Sintoma.class);
				configuration.addAnnotatedClass(Especialidades.class);
				configuration.addAnnotatedClass(ConsultaPaciente.class);
				ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder()
						.applySettings(configuration.getProperties()).build();
				sessionFactory = configuration.buildSessionFactory(serviceRegistry);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return sessionFactory;
	}
	
}
