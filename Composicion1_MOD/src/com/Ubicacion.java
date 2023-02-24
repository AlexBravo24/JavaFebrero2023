package com;

public class Ubicacion {
	private String calle;
	private String localidad;
	private String municipio;
	private String estado;
	
	
	public Ubicacion() {
		
	}
	public Ubicacion(String calle, String localidad, String municipio, String estado) {
		
		this.calle = calle;
		this.localidad = localidad;
		this.municipio = municipio;
		this.estado = estado;
	}
	
	
	public String getCalle() {
		return calle;
	}
	public void setCalle(String calle) {
		this.calle = calle;
	}
	public String getLocalidad() {
		return localidad;
	}
	public void setLocalidad(String localidad) {
		this.localidad = localidad;
	}
	public String getMunicipio() {
		return municipio;
	}
	public void setMunicipio(String municipio) {
		this.municipio = municipio;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	
	
	@Override
	public String toString() {
		return "Ubicacion [calle=" + calle + ", localidad=" + localidad + ", municipio=" + municipio + ", estado="
				+ estado + "]";
	}
	
	
}
