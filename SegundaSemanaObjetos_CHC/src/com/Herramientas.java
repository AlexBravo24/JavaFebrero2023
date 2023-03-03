package com;

public class Herramientas {

	private String herramienta;
	private String modelo;
	private String tama�o;
	private double precio;
	private String procedencia;
	
public Herramientas () {
	
}

public Herramientas(String herramienta, String modelo, String tama�o, double precio, String procedencia) {
	this.herramienta = herramienta;
	this.modelo = modelo;
	this.tama�o = tama�o;
	this.precio = precio;
	this.procedencia = procedencia;
}

public String getHerramienta() {
	return herramienta;
}

public void setHerramienta(String herramienta) {
	this.herramienta = herramienta;
}

public String getModelo() {
	return modelo;
}

public void setModelo(String modelo) {
	this.modelo = modelo;
}

public String getTama�o() {
	return tama�o;
}

public void setTama�o(String tama�o) {
	this.tama�o = tama�o;
}

public double getPrecio() {
	return precio;
}

public void setPrecio(double precio) {
	this.precio = precio;
}

public String getProcedencia() {
	return procedencia;
}

public void setProcedencia(String procedencia) {
	this.procedencia = procedencia;
}

@Override
public String toString() {
	return "Herramientas [herramienta=" + herramienta + ", modelo=" + modelo + ", tama�o=" + tama�o + ", precio="
			+ precio + ", procedencia=" + procedencia + "]";
}
	


	
}
