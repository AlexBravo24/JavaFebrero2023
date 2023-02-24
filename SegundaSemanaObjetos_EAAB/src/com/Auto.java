package com;

public class Auto {
	
	
	//Atributos
	
	private String marca;
	private int año;
	private int km;
	private String color;
	
	
	
	
	//Constructores
	
	public Auto() {
		
	}
	
	public Auto(String marca, int año, int km, String color) {
		this.marca = marca;
		this.año = año;
		this.km = km;
		this.color = color;
	}

	
	//Getters y Setters
	
	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public int getAño() {
		return año;
	}

	public void setAño(int año) {
		this.año = año;
	}

	public int getKm() {
		return km;
	}

	public void setKm(int km) {
		this.km = km;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	
	//toString
	@Override
	public String toString() {
		return "Auto [marca=" + marca + ", año=" + año + ", km=" + km + ", color=" + color + "]";
	}
	
	

}
