package com;

public class Perro {
	
	/*En la programaci�n orientada a objetos
	 * Las clases nos van a servir como una plantilla
	 * para modelar un objeto
	 * 
	 * Un objeto de la vida real al traerlo aqu�
	 * Vamos a abstraerlo, es decir, a traer esa idea
	 * Y vamos a crearle atributos y comportamientos
	 */
	
	//Establer atributos del objeto
	
	//Para proteger nuestros datos, recurrimos al encapsulamiento
	//Y esto lo logramos con los modificadores de acceso
	//Default, Private, Protected, Public
	
	//Private - Acceso en la misma clase
	//Default - Acceso en la misma clase y el mismo paquete
	//Protected - En la clase, en el paquete y fuera del paquete y subclases
	//Public - Acceso en la clase, el paquete, afuera del paquete y subclases
	
	//Existen tambi�n otros modificadores como el
	//Static - podemos establecer un valor est�tico, pero que aun podemos modificar
	//Final - nos sirve para la creaci�n de valores inmutables o constantes
	
	private String nombre;
	private int edad;
	private double peso;
	private String color;
	private static int precio = 3000;
	
	//M�todos constructores
	//Construyen al objeto como tal, con sus atributos
	
	//Constructor vac�o
	//Este consructor nos sirve como un comod�n, para llamar a un objeto
	//hasta cierto punto "vac�o"
	//Y tambi�n nos va a permitir crearlo con determinados atributos


	public Perro() {
		
	}

		
	//Constructor con todos los par�metros
	//Va a "construir" el objeto con todos sus atributos
	//Vamos a dar click derecho, elegimos la opcion source y
	//elegimos la opcion Generate constructor using fields
	//No hay un l�mite de cuantos constructores podemos agregar
	//en una clase
	
	public Perro(String nombre, int edad, double peso, String color) {
		this.nombre = nombre;
		this.edad = edad;
		this.peso = peso;
		this.color = color;
	}

	//M�todos getters & setters
	
		//Getter - devolvernos (retorna) el valor de un atributo
		//Setter - nos va a permitir establecer el valor del atributo
		//Para crearlos utilizamos la ruta
		//Source, Generate Getters & Setters
	

	public String getNombre() {
		return nombre;
	}


	public static void setPrecio(int precio) {
		Perro.precio = precio;
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

	//M�todo ToString - convierte los valores a String
			//Nos va a permitir mostrar los atributos del objeto
			//en una salida de datos
			//Actuando como una especie de "radiograf�a" del objeto.
			//Click derecho, Source, GenerateToString

	@Override
	public String toString() {
		return "Perro [nombre=" + nombre + ", edad=" + edad + ", peso=" + peso + ", color=" + color + "]";
	}
}




