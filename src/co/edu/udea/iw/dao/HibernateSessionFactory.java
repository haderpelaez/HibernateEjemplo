package co.edu.udea.iw.dao;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import co.edu.udea.iw.util.exception.IwException;

/**
 * Clase implementada bajo el patron SINGLETON
 * Me entrega siempre la sesion activa en el sistema
 * @author Hader Pelaez Noreña - hader.pelaez@udea.edu.co
 *
 */

public class HibernateSessionFactory {

	private static HibernateSessionFactory instancia = null;
	private static SessionFactory sessionFactory = null;
	private static Configuration configuration = new Configuration();
	
	
	private HibernateSessionFactory() {
		
	}

	/**
	 * Entrega la instancia del objeto creado
	 * @return La instancia creada
	 */
	public static HibernateSessionFactory getInstancia() {
		if(instancia == null) {
			instancia = new HibernateSessionFactory();
		}
		return instancia;
	}
	
	/**
	 * 
	 * @return Entrega una sesion abierta a la base de datos
	 * @throws IwException
	 */
	public Session getSession() throws IwException{
		try {
			if (sessionFactory == null) {
				configuration.configure("co/edu/udea/iw/dao/hibernate.cfg.xml");
				
				sessionFactory = configuration.buildSessionFactory();
			}
			
			return sessionFactory.openSession();
			
		} catch(HibernateException e){
			throw new IwException(e);
		}
		
	}

}