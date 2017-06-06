package com.proyectoingenieriasoftware.jsps.servlets.vo;

import java.io.Serializable;

public class VOLogin implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -1419348098938928922L;
	private String usuario;
	private String nombre;
	private String edad;
	private String password;
	
	public String getUsuario() {
		return usuario;
	}
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getEdad() {
		return edad;
	}
	public void setEdad(String string) {
		this.edad = string;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	
	
}