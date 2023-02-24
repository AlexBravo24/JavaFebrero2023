package com;

public class Casa {
	
	//Atributos
	private double superficie;
	private int habitaciones;
	private int baños;
	private int estacionamiento;
	
	
	public Casa() {
		
	}
	
	public Casa(double superficie, int habitaciones, int baños, int estacionamiento) {
		
		this.superficie = superficie;
		this.habitaciones = habitaciones;
		this.baños = baños;
		this.estacionamiento = estacionamiento;
	}
	
	
	public double getSuperficie() {
		return superficie;
	}
	public void setSuperficie(double superficie) {
		this.superficie = superficie;
	}
	public int getHabitaciones() {
		return habitaciones;
	}
	public void setHabitaciones(int habitaciones) {
		this.habitaciones = habitaciones;
	}
	public int getBaños() {
		return baños;
	}
	public void setBaños(int baños) {
		this.baños = baños;
	}
	public int getEstacionamiento() {
		return estacionamiento;
	}
	public void setEstacionamiento(int estacionamiento) {
		this.estacionamiento = estacionamiento;
	}
	
	
	@Override
	public String toString() {
		return "Casa [superficie=" + superficie + " m2" + ", habitaciones=" + habitaciones + ", baños=" + baños
				+ ", estacionamiento=" + estacionamiento + "]";
	}
	
	
}
