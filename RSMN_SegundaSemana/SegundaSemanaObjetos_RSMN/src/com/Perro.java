package com;

public class Perro {
	
	/*
	 * En la programacion orientada a objetos
	 * las clases nos van a servir como una plantilla para
	 * modelar un objeto
	 * 
	 * 
	 * un objeto de la vida real al traerlo aqui
	 * vamos a abstraerlo, es decir, a traer esa idea, vamos a 
	 * crearle atributos y comportamientos*/

	
	// establecer atributod del objeto
	
	// para proteger nuestros datos, recurrimos al encapsulamiento
	//default, private, protected, public
	
	// con el private acceso en la misma clase
	// con el default acceso en la misma clase y el paquete
	// protected en la clase, paquete, fuera del paquete y subclases
	//public acceso en la clse, paquete, afuera del paquete y subclases
	
	private String nombre;
	private int edad;
	private double peso;
	private String color;
	
	// metodos constructures
	//construyen al objeto como tal, con sus atributos
	
	// constructor vacio
	// este constructor nos sirve como un comodin , para llamar a un objeto
	// hasta cierto punto "vacio"
	//y tambien nos va a permitir crearlo con determinado atributos
	
	public Perro() {
		
	}

	
	
	// constructor con todos los parametros 
	// va a "construir" el objeto con todos sus atributos
	// vamos a dar clic derecho, elegimos la opcion source y 
	// elegimos la opcion generate constructor using fields
	
	// no hay un limite de cuantos costructores podemos generar
	
	
	public Perro(String nombre, int edad, double peso, String color) {
		
		this.nombre = nombre;
		this.edad = edad;
		this.peso = peso;
		this.color = color;
	}



	// creacion de metdos getters y setters
	
	// geter va a devolvernos (retornar) el valor de un atributo
	// setter nos va a permitir establcer el valor del atributo
	// para crearlos utilizamos la ruta
	// source, generate getters y setters
	

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



	public String getColor() {
		return color;
	}



	public void setColor(String color) {
		this.color = color;
	}




	
	
	// creacion del metodo ToString, convierte los valores a string
	// nos va a permitir mostar los atributos del objeto
	// actuando como una espcie de radiografia del objeto
	// damos clic derecho, source, generateToString
	
	@Override
	public String toString() {
		return "Perro [nombre=" + nombre + ", edad=" + edad + ", peso=" + peso + ", color=" + color + "]";
	}
	
	
	
}
