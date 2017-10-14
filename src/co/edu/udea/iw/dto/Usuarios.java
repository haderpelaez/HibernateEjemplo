package co.edu.udea.iw.dto;

import java.io.Serializable;

public class Usuarios implements Serializable {
	private String login;
	private String nombres;
	private String apellidos;
	private String contrasena;
	private Roles rol;
	
	//getters and setters
	public String getLogin() {
		return login;
	}
	
	public void setLogin(String login) {
		this.login = login;
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
	
	public String getContrasena() {
		return contrasena;
	}
	
	public void setContrasena(String contrasena) {
		this.contrasena = contrasena;
	}
	
	public Roles getRol() {
		return rol;
	}
	
	public void setRol(Roles rol) {
		this.rol = rol;
	}
	
}
