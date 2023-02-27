package com;

public class Espejo {
	
	
	private String tipo;
	private int alura;
	private double bace;
	private String modelo;
	private static int precio = 400;
	
	
	public Espejo() {
		
	}


	public Espejo(String tipo, int alura, double bace, String modelo) {
		super();
		this.tipo = tipo;
		this.alura = alura;
		this.bace = bace;
		this.modelo = modelo;
	}


	public String getTipo() {
		return tipo;
	}


	public void setTipo(String tipo) {
		this.tipo = tipo;
	}


	public int getAlura() {
		return alura;
	}


	public void setAlura(int alura) {
		this.alura = alura;
	}


	public double getBace() {
		return bace;
	}


	public void setBace(double bace) {
		this.bace = bace;
	}


	public String getModelo() {
		return modelo;
	}


	public void setModelo(String modelo) {
		this.modelo = modelo;
	}


	public static int getPrecio() {
		return precio;
	}


	public static void setPrecio(int precio) {
		Espejo.precio = precio;
	}


	@Override
	public String toString() {
		return "Espejo [tipo=" + tipo + ", alura=" + alura + ", bace=" + bace + ", modelo=" + modelo + "]";
	}
	
	
	
	
	
	
	
	
	
	
	
	

}
