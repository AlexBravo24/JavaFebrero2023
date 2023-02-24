package com;

public class Casa {
	
	//Atributos
	
	private double area;
	private int pisos;
	private int cuartos;
	private int cocheras;
	private String color;
	
	
	
	//Constructores
	
	public Casa() {
		
	}
	
	
	public Casa(double area, int pisos, int cuartos, int cocheras) {
		this.area = area;
		this.pisos = pisos;
		this.cuartos = cuartos;
		this.cocheras = cocheras;
	}


	
	
	//Getters y Setters
	
	public double getArea() {
		return area;
	}


	public void setArea(double area) {
		this.area = area;
	}


	public int getPisos() {
		return pisos;
	}


	public void setPisos(int pisos) {
		this.pisos = pisos;
	}


	public int getCuartos() {
		return cuartos;
	}


	public void setCuartos(int cuartos) {
		this.cuartos = cuartos;
	}


	public int getCocheras() {
		return cocheras;
	}


	public void setCocheras(int cocheras) {
		this.cocheras = cocheras;
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
		return "Casa [area=" + area + ", pisos=" + pisos + ", cuartos=" + cuartos + ", cocheras=" + cocheras
				+ ", color=" + color + "]";
	}
	
	
	
	

}
