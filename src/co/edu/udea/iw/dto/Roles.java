package co.edu.udea.iw.dto;

import java.io.Serializable;

public class Roles implements Serializable {
	private String codigo;
	private String nombre;
	
	//getters and setters
	public String getCodigo() {
		return codigo;
	}
	
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	
}
