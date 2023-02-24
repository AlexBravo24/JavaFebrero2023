package com;

public class Motor {
	
	private int cilindros;
	private double potencia;
	private double litros;
	private boolean turbo;
	
	
	
	public Motor() {
		
	}



	public Motor(int cilindros, double potencia, double litros, boolean turbo) {
		this.cilindros = cilindros;
		this.potencia = potencia;
		this.litros = litros;
		this.turbo = turbo;
	}



	public int getCilindros() {
		return cilindros;
	}



	public void setCilindros(int cilindros) {
		this.cilindros = cilindros;
	}



	public double getPotencia() {
		return potencia;
	}



	public void setPotencia(double potencia) {
		this.potencia = potencia;
	}



	public double getLitros() {
		return litros;
	}



	public void setLitros(double litros) {
		this.litros = litros;
	}



	public boolean isTurbo() {
		return turbo;
	}



	public void setTurbo(boolean turbo) {
		this.turbo = turbo;
	}



	@Override
	public String toString() {
		return "Motor [cilindros=" + cilindros + ", potencia=" + potencia + ", litros=" + litros + ", turbo=" + turbo
				+ "]";
	}
	
	
	
	

}
