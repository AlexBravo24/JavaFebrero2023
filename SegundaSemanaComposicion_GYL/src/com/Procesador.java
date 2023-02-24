package com;

public class Procesador {
	
	private String maraca;
	private String modelo;
	private int nucleos;
	private int frecuencia;
	
	public Procesador() {
		
		
	}

	public Procesador(String maraca, String modelo, int nucleos, int frecuencia) {
		this.maraca = maraca;
		this.modelo = modelo;
		this.nucleos = nucleos;
		this.frecuencia = frecuencia;
	}

	public String getMaraca() {
		return maraca;
	}

	public void setMaraca(String maraca) {
		this.maraca = maraca;
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
		return "Procesador [maraca=" + maraca + ", modelo=" + modelo + ", nucleos=" + nucleos + ", frecuencia="
				+ frecuencia + "]";
	}
	
}


