package com;

public class Casa {
	
	//Atributos
	private double superficie;
	private int habitaciones;
	private int ba�os;
	private int estacionamiento;
	
	
	public Casa() {
		
	}
	
	public Casa(double superficie, int habitaciones, int ba�os, int estacionamiento) {
		
		this.superficie = superficie;
		this.habitaciones = habitaciones;
		this.ba�os = ba�os;
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
	public int getBa�os() {
		return ba�os;
	}
	public void setBa�os(int ba�os) {
		this.ba�os = ba�os;
	}
	public int getEstacionamiento() {
		return estacionamiento;
	}
	public void setEstacionamiento(int estacionamiento) {
		this.estacionamiento = estacionamiento;
	}
	
	
	@Override
	public String toString() {
		return "Casa [superficie=" + superficie + " m2" + ", habitaciones=" + habitaciones + ", ba�os=" + ba�os
				+ ", estacionamiento=" + estacionamiento + "]";
	}
	
	
}
