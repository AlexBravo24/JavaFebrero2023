package com;

public class Auto {
	
	private String marca;
	private String modelo;
	private int año;
	private int km;
	
	
	private Estereo estereo;
	private Motor motor;
	private Llantas llantas;
	
	
	//constructores
	public Auto() {
		
	}

	public Auto(String marca, String modelo, int año, int km, Estereo estereo, Motor motor, Llantas llantas) {
		this.marca = marca;
		this.modelo = modelo;
		this.año = año;
		this.km = km;
		this.estereo = estereo;
		this.motor = motor;
		this.llantas = llantas;
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

	public Estereo getEstereo() {
		return estereo;
	}

	public void setEstereo(Estereo estereo) {
		this.estereo = estereo;
	}

	public Motor getMotor() {
		return motor;
	}

	public void setMotor(Motor motor) {
		this.motor = motor;
	}

	public Llantas getLlantas() {
		return llantas;
	}

	public void setLlantas(Llantas llantas) {
		this.llantas = llantas;
	}

	@Override
	public String toString() {
		return "Auto [marca=" + marca + ", modelo=" + modelo + ", año=" + año + ", km=" + km + ", \nestereo=" + estereo
				+ ", \nmotor=" + motor + ", \nllantas=" + llantas + "]";
	}
	
	
	
	
	
	
	
	
	

}
