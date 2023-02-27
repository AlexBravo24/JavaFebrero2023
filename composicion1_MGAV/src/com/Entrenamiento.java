package com;

public class Entrenamiento {
	
	 private String nombre;
	 private String entrenador;
	 private double precio;
	 private String disiplina;
	 //se declaran atributos de los objetos con otras claces
	 private Cardio car;
	 private Nutricion nutri;
	 private Fuerza fuerza;
	 
	public Entrenamiento() {
	
	}
	public Entrenamiento(String nombre, String entrenador, double precio, String disiplina, Cardio car, Nutricion nutri,
			Fuerza fuerza) {
		super();
		this.nombre = nombre;
		this.entrenador = entrenador;
		this.precio = precio;
		this.disiplina = disiplina;
		this.car = car;
		this.nutri = nutri;
		this.fuerza = fuerza;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getEntrenador() {
		return entrenador;
	}
	public void setEntrenador(String entrenador) {
		this.entrenador = entrenador;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public String getDisiplina() {
		return disiplina;
	}
	public void setDisiplina(String disiplina) {
		this.disiplina = disiplina;
	}
	public Cardio getCar() {
		return car;
	}
	public void setCar(Cardio car) {
		this.car = car;
	}
	public Nutricion getNutri() {
		return nutri;
	}
	public void setNutri(Nutricion nutri) {
		this.nutri = nutri;
	}
	public Fuerza getFuerza() {
		return fuerza;
	}
	public void setFuerza(Fuerza fuerza) {
		this.fuerza = fuerza;
	}
	@Override
	public String toString() {
		return "Entrenamiento [nombre=" + nombre + ", entrenador=" + entrenador + ", precio=" + precio + ", disiplina="
				+ disiplina + ", car=" + car + ", nutri=" + nutri + ", fuerza=" + fuerza + ", getNombre()="
				+ getNombre() + ", getEntrenador()=" + getEntrenador() + ", getPrecio()=" + getPrecio()
				+ ", getDisiplina()=" + getDisiplina() + ", getCar()=" + getCar() + ", getNutri()=" + getNutri()
				+ ", getFuerza()=" + getFuerza() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}
	

}
