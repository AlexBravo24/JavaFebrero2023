package com;

public class Llantas {
	
	private String marca;
	private String medida;
	private int presion;
	
	
	
	public Llantas() {
		
	}



	public Llantas(String marca, String medida, int presion) {
		this.marca = marca;
		this.medida = medida;
		this.presion = presion;
	}



	public String getMarca() {
		return marca;
	}



	public void setMarca(String marca) {
		this.marca = marca;
	}



	public String getMedida() {
		return medida;
	}



	public void setMedida(String medida) {
		this.medida = medida;
	}



	public int getPresion() {
		return presion;
	}



	public void setPresion(int presion) {
		this.presion = presion;
	}



	@Override
	public String toString() {
		return "Llantas [marca=" + marca + ", medida=" + medida + ", presion=" + presion + "]";
	}

	
	
	
	
}
