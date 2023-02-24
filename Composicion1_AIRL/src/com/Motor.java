package com;

public class Motor {
	private double motor;
	private int potencia;
	private String combustible;
	private double torque;
	
	public Motor() {
		
	}

	public Motor(double motor, int potencia, String combustible, double torque) {
		this.motor = motor;
		this.potencia = potencia;
		this.combustible = combustible;
		this.torque = torque;
	}

	public double getMotor() {
		return motor;
	}

	public void setMotor(double motor) {
		this.motor = motor;
	}

	public int getPotencia() {
		return potencia;
	}

	public void setPotencia(int potencia) {
		this.potencia = potencia;
	}

	public String getCombustible() {
		return combustible;
	}

	public void setCombustible(String combustible) {
		this.combustible = combustible;
	}

	public double getTorque() {
		return torque;
	}

	public void setTorque(double torque) {
		this.torque = torque;
	}

	@Override
	public String toString() {
		return "Motor [motor=" + motor + ", potencia=" + potencia + ", combustible=" + combustible + ", torque="
				+ torque + "]";
	}
	
	
	
	

}
