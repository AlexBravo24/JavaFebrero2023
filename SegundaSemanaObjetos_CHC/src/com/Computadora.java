package com;

public class Computadora {

	
	//Atributos
	private static String marca;
	private int costo;
	private String memoria;
	private String modelo;
	private String entradas;
	
	public Computadora() {
		
		
		
		
	}

	public Computadora(String marca, int costo, String memoria, String modelo, String entradas) {
		this.marca = marca;
		this.costo = costo;
		this.memoria = memoria;
		this.modelo = modelo;
		this.entradas = entradas;
	}

	public String getMarca() {
		return marca;
	}


	public static void setMarca(String marca) {
		Computadora.marca = marca;
	}

	public int getCosto() {
		return costo;
	}

	public void setCosto(int costo) {
		this.costo = costo;
	}

	public String getMemoria() {
		return memoria;
	}

	public void setMemoria(String memoria) {
		this.memoria = memoria;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getEntradas() {
		return entradas;
	}

	public void setEntradas(String entradas) {
		this.entradas = entradas;
	}
	
	

	@Override
	public String toString() {
		return "Computadora [marca=" + marca + ", costo=" + costo + ", memoria=" + memoria + ", modelo=" + modelo
				+ ", entradas=" + entradas + "]";
	}
	
	
	
	
	
}