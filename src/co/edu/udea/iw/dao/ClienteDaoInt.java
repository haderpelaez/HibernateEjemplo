package co.edu.udea.iw.dao;

import java.util.List;

import co.edu.udea.iw.dto.Cliente;
import co.edu.udea.iw.util.exception.IwException;

public interface ClienteDaoInt {
	
	public Cliente insertar (Cliente cliente) throws IwException;
	
	public Cliente modificar (Cliente cliente) throws IwException;
	
	public void eliminar (Cliente cliente) throws IwException;
	
	public List<Cliente> obtener (Cliente cliente) throws IwException;
	
	public Cliente obtener (String cedula) throws IwException;
}
