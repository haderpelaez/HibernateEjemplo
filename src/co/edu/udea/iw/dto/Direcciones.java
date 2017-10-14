package co.edu.udea.iw.dto;

import java.io.Serializable;

public class Direcciones implements Serializable {
	private DireccionesId direccionId;
	private String direccion;
	private String telefono;
	private Ciudad ciudad;
	private Boolean preferida;
	
	//getters and setters
	public DireccionesId getDireccionId() {
		return direccionId;
	}
	
	public void setDireccionId(DireccionesId direccionId) {
		this.direccionId = direccionId;
	}
	
	public String getDireccion() {
		return direccion;
	}
	
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	
	public String getTelefono() {
		return telefono;
	}
	
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	
	public Ciudad getCiudad() {
		return ciudad;
	}
	
	public void setCiudad(Ciudad ciudad) {
		this.ciudad = ciudad;
	}
	
	public Boolean getPreferida() {
		return preferida;
	}
	
	public void setPreferida(Boolean preferida) {
		this.preferida = preferida;
	}
	
	
}