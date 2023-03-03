package com;

public class RAM {
	
	private String marca;
	private int capacidad;
	private double frecuencia;
	private String generacion;
	
	//Constructores
	public RAM() {
		
		
	}

	public RAM(String marca, int capacidad, double frecuencia, String generacion) {
		
		this.marca = marca;
		this.capacidad = capacidad;
		this.frecuencia = frecuencia;
		this.generacion = generacion;
	}
	
	public void getmarca () {
		
	}

    public void getcapacidad () {
		
	}

    public void getfrecuencia () {
		
    }
	
    public void getgeneracion () {
		
    }

	@Override
	public String toString() {
		return "RAM [marca=" + marca + ", capacidad=" + capacidad + ", frecuencia=" + frecuencia + ", generacion="
				+ generacion + "]";
	}
	
    
    
    
}
