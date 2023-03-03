package com;

public abstract  class Calculadora {
	
	private String marca;
	private String modelo;
	

	
	public Calculadora() {
		
	}
	
	public Calculadora(String marca, String modelo) {
		
		this.marca = marca;
		this.modelo = modelo;
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

	@Override
	public String toString() {
		return "Calculadora [marca=" + marca + ", modelo=" + modelo + "]";
	}
// sobre carga de metodos es tener varios metodos con el mismo nombre pero con diferentes mecanismos
	public abstract void suma(int a, int b);
	public abstract void resta(int a, int b);
	public abstract void multiplicar(int a, int b);
	public abstract void multiplicar();
	public abstract void dividir(int a, int b);

}
