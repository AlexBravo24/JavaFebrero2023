package com;

public class Mat {
   private String tipo;
   private String seguridad;
   private String ligero;
   private String pesado;
   
   public Mat () {}

public Mat(String tipo, String seguridad, String ligero, String pesado) {
	this.tipo = tipo;
	this.seguridad = seguridad;
	this.ligero = ligero;
	this.pesado = pesado;
}

public String getTipo() {
	return tipo;
}

public void setTipo(String tipo) {
	this.tipo = tipo;
}

public String getSeguridad() {
	return seguridad;
}

public void setSeguridad(String seguridad) {
	this.seguridad = seguridad;
}

public String getLigero() {
	return ligero;
}

public void setLigero(String ligero) {
	this.ligero = ligero;
}

public String getPesado() {
	return pesado;
}

public void setPesado(String pesado) {
	this.pesado = pesado;
}

@Override
public String toString() {
	return "Mat [tipo=" + tipo + ", seguridad=" + seguridad + ", ligero=" + ligero + ", pesado=" + pesado + "]";
}
   
}
