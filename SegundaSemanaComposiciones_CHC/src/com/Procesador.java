package com;

public class Procesador {

	private String marca;
	private String modelo;
	private int nucleos;
	private int frecuencia;
	public Procesador(String marca, String modelo, int nucleos, int frecuencia) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.nucleos = nucleos;
		this.frecuencia = frecuencia;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public int getNucleos() {
		return nucleos;
	}
	public void setNucleos(int nucleos) {
		this.nucleos = nucleos;
	}
	public int getFrecuencia() {
		return frecuencia;
	}
	public void setFrecuencia(int frecuencia) {
		this.frecuencia = frecuencia;
	}
	@Override
	public String toString() {
		return "Procesador [marca=" + marca + ", modelo=" + modelo + ", nucleos=" + nucleos + ", frecuencia="
				+ frecuencia + "]";
	}
	
	
	
	
	
	
}
