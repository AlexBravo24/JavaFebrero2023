package com;

public class Productos {
	
	public String tipo;
	public double precio;
	public int canidad;
	
	public Productos() {
		
	}

	public Productos(String tipo, double precio, int canidad) {
		super();
		this.tipo = tipo;
		this.precio = precio;
		this.canidad = canidad;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public int getCanidad() {
		return canidad;
	}

	public void setCanidad(int canidad) {
		this.canidad = canidad;
	}

	@Override
	public String toString() {
		return "Productos [tipo=" + tipo + ", precio=" + precio + ", canidad=" + canidad + "]";
	}

}
