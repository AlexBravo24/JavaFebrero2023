package com;

public class Series {
  private String nombre;
  private String duración;
  private double capitulos;
  private String compañía;
 private String lanzamiento;

public Series() {
	
}

public Series(String nombre, String duración, double capitulos, String compañía, String lanzamiento) {
	this.nombre = nombre;
	this.duración = duración;
	this.capitulos = capitulos;
	this.compañía = compañía;
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

public String getDuración() {
	return duración;
}

public void setDuración(String duración) {
	this.duración = duración;
}

public double getCapitulos() {
	return capitulos;
}

public void setCapitulos(double capitulos) {
	this.capitulos = capitulos;
}

public String getCompañía() {
	return compañía;
}

public void setCompañía(String compañía) {
	this.compañía = compañía;
}

@Override
public String toString() {
	return "Series [nombre=" + nombre + ", duración=" + duración + ", capitulos=" + capitulos + ", compañía=" + compañía
			+ ", lanzamiento=" + lanzamiento + "]";
}




}
