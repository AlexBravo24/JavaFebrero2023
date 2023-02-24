package com;

public class Juguetes {
  private String nombre;
  private String tamaño;
  private double precio;
  private String duración;
  private String público;

  public Juguetes () {
	  
  }

public Juguetes(String nombre, String tamaño, double precio, String duración, String público) {
	this.nombre = nombre;
	this.tamaño = tamaño;
	this.precio = precio;
	this.duración = duración;
	this.público = público;
}

public String getNombre() {
	return nombre;
}

public void setNombre(String nombre) {
	this.nombre = nombre;
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

public String getDuración() {
	return duración;
}

public void setDuración(String duración) {
	this.duración = duración;
}

public String getPúblico() {
	return público;
}

public void setPúblico(String público) {
	this.público = público;
}

@Override
public String toString() {
	return "Juguetes [nombre=" + nombre + ", tamaño=" + tamaño + ", precio=" + precio + ", duración=" + duración
			+ ", público=" + público + "]";
}
  
	
}
