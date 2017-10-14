package co.edu.udea.iw.dao.impl;

import static org.junit.Assert.*;

import java.util.Date;

import org.hibernate.HibernateException;
import org.junit.Test;

import co.edu.udea.iw.dao.ClienteDaoInt;
import co.edu.udea.iw.dto.Cliente;
import co.edu.udea.iw.util.exception.IwException;

public class ClienteDaoImplTest {

	@Test
	public void testInsertar() {
		ClienteDaoInt dao = null;
		Cliente cliente = null; 
		
		try {
			cliente = new Cliente();
			cliente.setCedula("1038406771");
			cliente.setNombres("John Hader");
			cliente.setApellidos("Pelaez Noreña");
			cliente.setEmail("hader.pelaez@udea.edu.co");
			//cliente.setUsuarioCrea("hader");
			cliente.setFechaCreacion(new Date());
			
			dao = new ClienteDao();
			
			dao.insertar(cliente);
		}catch(IwException e) {
			System.out.println(e.getMessage());
			fail("Not yet implemented");
		}
		
	}

}
