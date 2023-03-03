package com;

public class Series {
  private String nombre;
  private String duraci�n;
  private double capitulos;
  private String compa��a;
 private String lanzamiento;

public Series() {
	
}

public Series(String nombre, String duraci�n, double capitulos, String compa��a, String lanzamiento) {
	this.nombre = nombre;
	this.duraci�n = duraci�n;
	this.capitulos = capitulos;
	this.compa��a = compa��a;
	this.lanzamiento=lanzamiento;
	
}

public String getLanzamiento() {
	return lanzamiento;
}

public void setLanzamiento(String lanzamiento) {
	this.lanzamiento = lanzamiento;
}

public Series(String lanzamiento) {
	super();
	this.lanzamiento = lanzamiento;
}

public String getNombre() {
	return nombre;
}

public void setNombre(String nombre) {
	this.nombre = nombre;
}

public String getDuraci�n() {
	return duraci�n;
}

public void setDuraci�n(String duraci�n) {
	this.duraci�n = duraci�n;
}

public double getCapitulos() {
	return capitulos;
}

public void setCapitulos(double capitulos) {
	this.capitulos = capitulos;
}

public String getCompa��a() {
	return compa��a;
}

public void setCompa��a(String compa��a) {
	this.compa��a = compa��a;
}

@Override
public String toString() {
	return "Series [nombre=" + nombre + ", duraci�n=" + duraci�n + ", capitulos=" + capitulos + ", compa��a=" + compa��a
			+ ", lanzamiento=" + lanzamiento + "]";
}




}
