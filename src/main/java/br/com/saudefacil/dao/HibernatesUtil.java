package br.com.saudefacil.dao;

import java.util.Properties;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;
import org.hibernate.service.ServiceRegistry;

import br.com.saudefacil.models.Clinica;
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
				settings.put(Environment.DRIVER, "com.mysql.cj.jdbc.Driver");
				settings.put(Environment.URL, "jdbc:mysql://localhost:3306/saude_facil?useTimezone=true&serverTimezone=UTC");
				settings.put(Environment.USER, "root"); 
				settings.put(Environment.PASS, "root");
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
				configuration.addAnnotatedClass(Clinica.class);
				configuration.addAnnotatedClass(ConsultaPaciente.class);
				configuration.addAnnotatedClass(Sintoma.class);
				configuration.addAnnotatedClass(Especialidades.class);
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