package com;

public class Peso {
 private int peso;
 private int volumen;
 private String rigido;
 
 public Peso () {}

public Peso(int peso, int volumen, String rigido) {
	this.peso = peso;
	this.volumen = volumen;
	this.rigido = rigido;
}

public int getPeso() {
	return peso;
}

public void setPeso(int peso) {
	this.peso = peso;
}

public int getVolumen() {
	return volumen;
}

public void setVolumen(int volumen) {
	this.volumen = volumen;
}

public String getRigido() {
	return rigido;
}

public void setRigido(String rigido) {
	this.rigido = rigido;
}

@Override
public String toString() {
	return "Peso [peso=" + peso + ", volumen=" + volumen + ", rigido=" + rigido + "]";
}


 
}
