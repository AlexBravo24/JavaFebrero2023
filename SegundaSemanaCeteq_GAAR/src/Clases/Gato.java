package Clases;

public class Gato {
	//Atributos
	 private String nombre;
	   private int edad;
	   private double peso;
	   private	String raza;
	   
	
	public Gato() {
		// Consultor Vacio
	}


	public Gato(String nombre, int edad, double peso, String raza) { //consultor
		this.nombre = nombre;
		this.edad = edad;
		this.peso = peso;
		this.raza = raza;
	}


	
	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public int getEdad() {
		return edad;
	}


	public void setEdad(int edad) {
		this.edad = edad;
	}


	public double getPeso() {
		return peso;
	}


	public void setPeso(double peso) {
		this.peso = peso;
	}


	public String getRaza() {
		return raza;
	}


	public void setRaza(String raza) {
		this.raza = raza;
	}


	@Override
	public String toString() {
		return "Gato [nombre=" + nombre + ", edad=" + edad + ", peso=" + peso + ", raza=" + raza + "]";
	}
	
	
	
	
}
