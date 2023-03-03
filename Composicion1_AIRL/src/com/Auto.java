package com;

public class Auto {
	private String auto;
	private String marca;
	private int modelo;
	private String version;
	
	private Motor motor;
	private Asientos asientos;
	
	public Auto() {
		
	}

	public Auto(String auto, String marca, int modelo, String version, Motor motor, Asientos asientos) {
		super();
		this.auto = auto;
		this.marca = marca;
		this.modelo = modelo;
		this.version = version;
		this.motor = motor;
		this.asientos = asientos;
	}

	public String getAuto() {
		return auto;
	}

	public void setAuto(String auto) {
		this.auto = auto;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public int getModelo() {
		return modelo;
	}

	public void setModelo(int modelo) {
		this.modelo = modelo;
	}

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	public Motor getMotor() {
		return motor;
	}

	public void setMotor(Motor motor) {
		this.motor = motor;
	}

	public Asientos getAsientos() {
		return asientos;
	}

	public void setAsientos(Asientos asientos) {
		this.asientos = asientos;
	}

	@Override
	public String toString() {
		return "Auto [auto=" + auto + ", marca=" + marca + ", modelo=" + modelo + ", version=" + version + ", \nmotor="
				+ motor + ", \nasientos=" + asientos + "]";
	}



	

}
