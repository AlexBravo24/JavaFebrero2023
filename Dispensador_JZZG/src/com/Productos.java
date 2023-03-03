package com;

public class Productos {

	private String nombredulce;
	private int    cantidad;
	private double costo;
	private double max;
	private double min;
	
	public Productos() {}

	public Productos(String nombredulce, int cantidad, double costo, double max, double min) {
		super();
		this.nombredulce = nombredulce;
		this.cantidad = cantidad;
		this.costo = costo;
		this.max = max;
		this.min = min;
	}

	public String getNombredulce() {
		return nombredulce;
	}

	public void setNombredulce(String nombredulce) {
		this.nombredulce = nombredulce;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public double getCosto() {
		return costo;
	}

	public void setCosto(double costo) {
		this.costo = costo;
	}

	public double getMax() {
		return max;
	}

	public void setMax(double max) {
		this.max = max;
	}

	public double getMin() {
		return min;
	}

	public void setMin(double min) {
		this.min = min;
	}

	@Override
	public String toString() {
		return "Productos [nombredulce=" + nombredulce + ", cantidad=" + cantidad + ", costo=" + costo + ", max=" + max
				+ ", min=" + min + "]";
	}

	


	
}
