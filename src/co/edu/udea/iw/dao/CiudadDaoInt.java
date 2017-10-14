package co.edu.udea.iw.dao;

import java.util.List;

import co.edu.udea.iw.dto.Ciudad;
import co.edu.udea.iw.util.exception.IwException;

/**
 * Interfaz para la entidad de negocio Ciudad
 * @author Hader Pelaez Noreña - hader.pelaez@udea.edu.co
 *
 */
public interface CiudadDaoInt {

	/**
	 * Entrega la lista de ciudades disponibles en el sistema ordenada por
	 * nombre de ciudad
	 * @return lista ordenada por nombre de ciudad
	 * @throws IwException cuando hay un problema consultando las ciudades
	 */
	public List<Ciudad> obtener() throws IwException;
	
	/**
	 * Entrega los datos de una ciudad dado su codigo
	 * @param codigo de la ciudad a consultar
	 * @return una instancia de los datos de la ciudad obtenida, si
	 * no existe una ciudad con el codigo dado retorna null
	 * @throws IwException cuando ocurre un errro con la base de datos
	 */
	public Ciudad obtener (Integer codigo) throws IwException;
	
	/**
	 * Almacena la informacion de una ciudad en el sistema
	 * @param ciudad objeto ciuadad con la informacion a insertar
	 * @throws IwException cuando hay un error insertando la ciudad
	 */
	public void insertar(Ciudad ciudad) throws IwException;
}
