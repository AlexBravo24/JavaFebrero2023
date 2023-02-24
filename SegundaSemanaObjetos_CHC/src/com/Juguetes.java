package com;

public class Juguetes {
  private String nombre;
  private String tama�o;
  private double precio;
  private String duraci�n;
  private String p�blico;

  public Juguetes () {
	  
  }

public Juguetes(String nombre, String tama�o, double precio, String duraci�n, String p�blico) {
	this.nombre = nombre;
	this.tama�o = tama�o;
	this.precio = precio;
	this.duraci�n = duraci�n;
	this.p�blico = p�blico;
}

public String getNombre() {
	return nombre;
}

public void setNombre(String nombre) {
	this.nombre = nombre;
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

public String getDuraci�n() {
	return duraci�n;
}

public void setDuraci�n(String duraci�n) {
	this.duraci�n = duraci�n;
}

public String getP�blico() {
	return p�blico;
}

public void setP�blico(String p�blico) {
	this.p�blico = p�blico;
}

@Override
public String toString() {
	return "Juguetes [nombre=" + nombre + ", tama�o=" + tama�o + ", precio=" + precio + ", duraci�n=" + duraci�n
			+ ", p�blico=" + p�blico + "]";
}
  
	
}
