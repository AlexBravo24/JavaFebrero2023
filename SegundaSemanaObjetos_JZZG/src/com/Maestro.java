package com;

public class Maestro {

	private String lado;
	private String sable;
	private String color;
	
	public Maestro() {}
	public Maestro(String lado, String sable, String color) {
		
		this.lado = lado;
		this.sable = sable;
		this.color = color;
	}

	public String getLado() {
		return lado;
	}

	public void setLado(String lado) {
		this.lado = lado;
	}

	public String getSable() {
		return sable;
	}

	public void setSable(String sable) {
		this.sable = sable;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return "Maestro [lado=" + lado + ", sable=" + sable + ", color=" + color + "]";
	}
	
	
	
	
}
