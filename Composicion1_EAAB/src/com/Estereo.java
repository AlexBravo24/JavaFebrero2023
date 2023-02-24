package com;

public class Estereo {
	
	private String marca;
	private boolean camReversa;
	private double tamaño;
	private boolean gps;
	private boolean bt;
	
	
	//constructores
	
	public Estereo() {
		
	}


	public Estereo(String marca, boolean camReversa, double tamaño, boolean gps, boolean bt) {
		this.marca = marca;
		this.camReversa = camReversa;
		this.tamaño = tamaño;
		this.gps = gps;
		this.bt = bt;
	}


	public String getMarca() {
		return marca;
	}


	public void setMarca(String marca) {
		this.marca = marca;
	}


	public boolean isCamReversa() {
		return camReversa;
	}


	public void setCamReversa(boolean camReversa) {
		this.camReversa = camReversa;
	}


	public double getTamaño() {
		return tamaño;
	}


	public void setTamaño(double tamaño) {
		this.tamaño = tamaño;
	}


	public boolean isGps() {
		return gps;
	}


	public void setGps(boolean gps) {
		this.gps = gps;
	}


	public boolean isBt() {
		return bt;
	}


	public void setBt(boolean bt) {
		this.bt = bt;
	}


	@Override
	public String toString() {
		return "Estereo [marca=" + marca + ", camReversa=" + camReversa + ", tamaño=" + tamaño + ", gps=" + gps
				+ ", bt=" + bt + "]";
	}
	
	

}
