package com;

public class Audifonos {

	private String tipo;
	private String marca;
	private String manoslib;
	private String funciones;
	private int dB;
	
	public Audifonos() {
		
	}

	public Audifonos(String tipo, String marca, String manoslib, String funciones, int dB) {
		super();
		this.tipo = tipo;
		this.marca = marca;
		this.manoslib = manoslib;
		this.funciones = funciones;
		this.dB = dB;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getManoslib() {
		return manoslib;
	}

	public void setManoslib(String manoslib) {
		this.manoslib = manoslib;
	}

	public String getFunciones() {
		return funciones;
	}

	public void setFunciones(String funciones) {
		this.funciones = funciones;
	}

	public int getdB() {
		return dB;
	}

	public void setdB(int dB) {
		this.dB = dB;
	}

	@Override
	public String toString() {
		return "Audifonos [tipo=" + tipo + ", marca=" + marca + ", manoslib=" + manoslib + ", funciones=" + funciones
				+ ", dB=" + dB + "]";
	}
	
	
	
	
	
	
	
}
