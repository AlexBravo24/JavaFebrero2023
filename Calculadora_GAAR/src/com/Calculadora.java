package com;

public abstract class Calculadora {
	
	//ATRIBUTOS
	private String marca;
	private String modelo;
	private double costo;


	 //Constructor vacio 
	 Calculadora(){}
     
	 //Constructor con parametros 
	 public Calculadora(String marca, String modelo, double costo) {
			this.marca = marca;
			this.modelo = modelo;
			this.costo = costo;
		}
	
        //Getters & setters
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

	
	public double getCosto() {
		return costo;
	}

	public void setCosto(double costo) {
		this.costo = costo;
	}
	
 
	@Override
	public String toString() {
		return "Calculadora [marca=" + marca + ", modelo=" + modelo + ", costo=" + costo + "]";
	}

	 
	 public abstract void Suma(double a, double b);
	 public abstract void Resta(double a, double b);
	 public abstract void Multiplicacion(double a, double b);
	 public abstract void Division(double a, double b);



	

	
	
	 
	
	 


}
