package co.edu.udea.iw.dao.impl;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;

import co.edu.udea.iw.dao.CiudadDaoInt;

import co.edu.udea.iw.dto.Ciudad;
import co.edu.udea.iw.util.exception.IwException;

public class CiudadDaoImplTest {

	//@Test
	public void testInsertar() {
		CiudadDaoInt dao = null;
		Ciudad ciudad = null; 
		
		try {
			ciudad = new Ciudad();
			ciudad.setCodigo(16l);
			ciudad.setNombre("popayan");
			ciudad.setCodigoArea("2");
			
			dao = new CiudadDao();
			
			dao.insertar(ciudad);
			
		} catch (IwException e) {
			System.out.println(e.getMessage());
			fail(e.getMessage());
		}
	}
	
	@Test
	public void testObtener() {
		CiudadDaoInt dao = null;
		List<Ciudad> lista = null;
		
		try {
			dao = new CiudadDao();
			
			lista = dao.obtener();
			
			for(Ciudad ciudad: lista) {
				System.out.println("Codigo: "+ ciudad.getCodigo());
				System.out.println("Nombre: "+ ciudad.getNombre());
				System.out.println("Codigo Area: "+ ciudad.getCodigoArea());
				System.out.println("/**********************************");
			}
		} catch (IwException e) {
			System.out.println(e.getMessage());
			fail(e.getMessage());
		}
	}

}
