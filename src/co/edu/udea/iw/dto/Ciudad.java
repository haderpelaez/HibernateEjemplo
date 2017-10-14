package co.edu.udea.iw.dto;

import java.io.Serializable;

/**
 * DTO para las ciudades del sistema
 * @author Hader Pelaez Noreña - hader.pelaez@udea.edu.co
 *
 */

public class Ciudad implements Serializable {

	/**
	 * Campos que tiene la tabla Ciudad en la BD
	 */
	private Long codigo;
	private String nombre;
	private String codigoArea;
	
	public Long getCodigo() {
		return codigo;
	}
	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getCodigoArea() {
		return codigoArea;
	}
	public void setCodigoArea(String codigoArea) {
		this.codigoArea = codigoArea;
	}
	
	

}
