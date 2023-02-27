package com;

public class Estereo {
	

	private String marca;
	private int bosinas;
	private double serie;
	private String color;
	private static int precio = 300;
	public Estereo() {
		
	}
	public Estereo(String marca, int bosinas, double serie, String color) {
		
		this.marca = marca;
		this.bosinas = bosinas;
		this.serie = serie;
		this.color = color;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public int getBosinas() {
		return bosinas;
	}
	public void setBosinas(int bosinas) {
		this.bosinas = bosinas;
	}
	public double getSerie() {
		return serie;
	}
	public void setSerie(double serie) {
		this.serie = serie;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public static int getPrecio() {
		return precio;
	}
	public static void setPrecio(int precio) {
		Estereo.precio = precio;
	}
	@Override
	public String toString() {
		return "Estereo [marca=" + marca + ", bosinas=" + bosinas + ", serie=" + serie + ", color=" + color + "]";
	}
	
	
	
	
	

}
