package co.edu.udea.iw.dto;

import java.io.Serializable;
import java.util.Date;

public class Cliente implements Serializable{
	private String cedula;
	private String nombres;
	private String apellidos;
	private String email;
	private Usuarios usuarioCrea;
	private Date fechaCreacion;
	private Usuarios usuarioModifica;
	private Date fechaModificacion;
	private Boolean eliminado;
	private Usuarios usuarioElimina;
	private Date fechaEliminacion;
	
	//getters and setters
	public String getCedula() {
		return cedula;
	}
	
	public void setCedula(String cedula) {
		this.cedula = cedula;
	}
	
	public String getNombres() {
		return nombres;
	}
	
	public void setNombres(String nombres) {
		this.nombres = nombres;
	}
	
	public String getApellidos() {
		return apellidos;
	}
	
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public Usuarios getUsuarioCrea() {
		return usuarioCrea;
	}
	
	public void setUsuarioCrea(Usuarios usuarioCrea) {
		this.usuarioCrea = usuarioCrea;
	}
	
	public Date getFechaCreacion() {
		return fechaCreacion;
	}
	
	public void setFechaCreacion(Date fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}
	
	public Usuarios getUsuarioModifica() {
		return usuarioModifica;
	}
	
	public void setUsuarioModifica(Usuarios usuarioModifica) {
		this.usuarioModifica = usuarioModifica;
	}
	
	public Date getFechaModificacion() {
		return fechaModificacion;
	}
	
	public void setFechaModificacion(Date fechaModificacion) {
		this.fechaModificacion = fechaModificacion;
	}
	
	public Boolean getEliminado() {
		return eliminado;
	}
	
	public void setEliminado(Boolean eliminado) {
		this.eliminado = eliminado;
	}
	
	public Usuarios getUsuarioElimina() {
		return usuarioElimina;
	}
	
	public void setUsuarioElimina(Usuarios usuarioElimina) {
		this.usuarioElimina = usuarioElimina;
	}
	
	public Date getFechaEliminacion() {
		return fechaEliminacion;
	}
	
	public void setFechaEliminacion(Date fechaEliminacion) {
		this.fechaEliminacion = fechaEliminacion;
	}
	
}
