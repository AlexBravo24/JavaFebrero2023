package com;

public class Empleado {
	
	//Atributos
	private int numero;
	private String nombre;
	private String departamento;
	private String turno;
	
	
	public Empleado() {
	}
	
	public Empleado(int numero, String nombre, String departamento, String turno) {

		this.numero = numero;
		this.nombre = nombre;
		this.departamento = departamento;
		this.turno = turno;
	}
	
	
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDepartamento() {
		return departamento;
	}
	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}
	public String getTurno() {
		return turno;
	}
	public void setTurno(String turno) {
		this.turno = turno;
	}
	
	
	@Override
	public String toString() {
		return "Empleado [numero=" + numero + ", nombre=" + nombre + ", departamento=" + departamento + ", turno="
				+ turno + "]";
	}
	
	
}
