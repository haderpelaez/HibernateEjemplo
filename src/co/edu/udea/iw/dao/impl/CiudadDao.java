package co.edu.udea.iw.dao.impl;

import java.util.ArrayList;
import java.util.List;


import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;

import co.edu.udea.iw.dao.CiudadDaoInt;
import co.edu.udea.iw.dao.HibernateSessionFactory;
import co.edu.udea.iw.dto.Ciudad;
import co.edu.udea.iw.dto.Cliente;
import co.edu.udea.iw.util.exception.IwException;

public class CiudadDao implements CiudadDaoInt {

	@Override
	public List<Ciudad> obtener() throws IwException {
		
		List <Ciudad> ciudades = new ArrayList<Ciudad>();
		
		try {
			Session session = HibernateSessionFactory.getInstancia().getSession();
		
			// criterio de busqueda en la base de datos
			// solo busquedas sencillas
			Criteria crit = session.createCriteria(Ciudad.class)
					.addOrder(Order.asc("nombre"));
			
			ciudades = crit.list();
			
		}catch(HibernateException e) {
			throw new IwException("Hubo un error ingresando la ciudad", e);
		}
		
		
		return ciudades;
	}
	
	
	@Override
	public Ciudad obtener(Integer codigo) throws IwException {
		Ciudad ciudad = null;
		
		try {
			Session session = HibernateSessionFactory.getInstancia().getSession();
		
			ciudad = (Ciudad) session.load(Ciudad.class, codigo);
			
		}catch(HibernateException e) {
			throw new IwException("Hubo un error ingresando la ciudad", e);
		}
		
		
		return ciudad;
	}


	@Override
	public void insertar(Ciudad ciudad) throws IwException {
		
		try {
			
			Session session = HibernateSessionFactory.getInstancia().getSession();
		
			Transaction tx = session.beginTransaction();
			
			//guardo en la base de datos el dato ciudad
			session.save(ciudad);
			tx.commit();
			
		}catch(HibernateException e) {
			throw new IwException("Hubo un error consultando las ciudades", e);
		}

	}
	
}
