package com;

public class Zapato {
	
	//Atributos
	
	private String marca;
	private double talla;
	private String material;
	
	
	//Constructores
	
	public Zapato() {
		
	}
	
	
	public Zapato(String marca, double talla, String material) {
		this.marca = marca;
		this.talla = talla;
		this.material = material;
	}

	
	//Getters y Setters

	public String getMarca() {
		return marca;
	}


	public void setMarca(String marca) {
		this.marca = marca;
	}


	public double getTalla() {
		return talla;
	}


	public void setTalla(double talla) {
		this.talla = talla;
	}


	public String getMaterial() {
		return material;
	}


	public void setMaterial(String material) {
		this.material = material;
	}


	//toString
	@Override
	public String toString() {
		return "Zapato [marca=" + marca + ", talla=" + talla + ", material=" + material + "]";
	}
	
	
	
	
	
	
	

}
