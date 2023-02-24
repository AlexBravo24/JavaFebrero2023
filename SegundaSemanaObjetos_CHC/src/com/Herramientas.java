package com;

public class Herramientas {

	private String herramienta;
	private String modelo;
	private String tamaño;
	private double precio;
	private String procedencia;
	
public Herramientas () {
	
}

public Herramientas(String herramienta, String modelo, String tamaño, double precio, String procedencia) {
	this.herramienta = herramienta;
	this.modelo = modelo;
	this.tamaño = tamaño;
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

public String getTamaño() {
	return tamaño;
}

public void setTamaño(String tamaño) {
	this.tamaño = tamaño;
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
	return "Herramientas [herramienta=" + herramienta + ", modelo=" + modelo + ", tamaño=" + tamaño + ", precio="
			+ precio + ", procedencia=" + procedencia + "]";
}
	


	
}
