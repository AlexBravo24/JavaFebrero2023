package com;

public class Perro {
	/*
	 * En la POO 
	 * Las clases nos van a servir como una plantilla para modelar un objeto
	 * 
	 * Un objeto de la vida real al traerlo aqui
	 * vamos a abstraerlo, y vamos a crearle atributos y caracteristicas.
	 */
	
	
	// Para proteger nuestros datos, recurrimos al encapsulamiento, mediante los modificadores de acceso
	// default, private, protected, public
	
	//Private- solo se tiene acceso a los atributos en esta clase.
	//default- se tiene acceso en la clase y el paquete
	//protected - en la clase, el paquete y subclase
	//public - se siene acceso en la clase, paquete, subclases y fuera del paquete.
	
	//Existen tambien otros modificadores
	// Static - Podemos asignar un valor estatico, pero que aun podemos modificar
	// Final -nos permite la creacion de valores constantes o inmutables
	
	
	private String nombre;
	private int edad;
	private double peso;
	private String color;
	private final int precio = 3000;
	private static int precio2 = 4000; 
	
	
	//Métodos constructores:
	// construyen al objeto como tal, con sus atributos
	
	//constructor vacio
	//Sirve como comodin para llamar un objeto hasta cierto punto vacio
	// Tambien se puede crear con siertos atributos, segun sea la necesidad
	
	public Perro() {
		
	}

	// Genera el contructor con todos sus atributos
	//No hay un limite de cuantos constructores se pueden agregar en una clase
	
	public Perro(String nombre, int edad, double peso, String color) {
		this.nombre = nombre;
		this.edad = edad;
		this.peso = peso;
		this.color = color;
	}
	
	//Metodos getter y setters
		//getter - devuelve el valor de un atributo
		//setter - permite establecer un valoa a un atributo

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
	
	public int getPrecio() {
		return precio;
	}


	public static int getPrecio2() {
		return precio2;
	}

	public static void setPrecio2(int precio2) {
		Perro.precio2 = precio2;
	}
	
	//Método toString
		//Permite mostrar los atributos del objeto
		//Como una espeecie de "radiografia"
		//permitiendo mostrar los valores en en una salida de datos



	@Override
	public String toString() {
		return "Perro [nombre=" +   nombre + ", edad=" + edad + ", peso=" + peso + ", color=" + color + ", precio="
				+ precio + "]";
	}

	
	
	
}
