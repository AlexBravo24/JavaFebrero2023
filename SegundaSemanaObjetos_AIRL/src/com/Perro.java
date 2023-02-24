package com;

public class Perro {
	/*En la POO 
	 * Las clases nos van a servir como una plantilla para modelar un objeto
	 * 
	 * Un Objeto de la vida real al traerlo aqui, vamos a abstraerlo, es decir a traer esa idea
	 * y vamos a crearle atributos y comportamientos
	 * 
	 */
	
	//Establecer atributos del objeto(todo lo que pueda describirlo)
	//Para proteger nuestros datos, recurrirmos al encapsulamiento usando modificadores de acceso
	//Default, Private, Protected, Public
	
	//Private - Acceso en la misma clase
	//Default - Acceso en la misma clase y el mismo paquete
	//Protected - Acceso en la misma clase, paquete y subclases
	//Public - Acceso en la misma clase, paquete, fuera del paquete y subclases
	
	//Existen tambien otros modificadores como
	//Static podemos establecer un valor estatico, pero aun podemos modificar
	//Final nos sirve para la creacion de valores inmutables o constantes
	
	private String nombre;
	private int edad;
	private double peso;
	private String color; 
	private static int precio;
	
	
	//Metodos constructores
	//Construyen al objeto como tal, con sus atributos
	
	
	//Constructor vacio nos sirve como comodin para llamar un objeto  hasta cierto punto "vacio" 
	//tambien nos va a permitir crearlo con ciertos atributos
	public Perro() {
		
	}

	
	
	//Constructos con todos los parametros
	//va a construir el objeto con todos los atributos
	//clic derecho--source--generate constructor using fields
	//No hay un limite de constructores en la clase
	public Perro(String nombre, int edad, double peso, String color) {
		this.nombre = nombre;
		this.edad = edad;
		this.peso = peso;
		this.color = color;
	}
	
	    //Metodos getters y setters
		//Getter - devolvernos el valor de un atributo
		//Setter - nos permite establecer valor a un atributo
		//Crear   clic derecho-source-Generate Getters y Setters
		
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
	
//	public int getPrecio() {
//		return precio;
//	}
	
	public static int getPrecio() {
		return precio;
	}



	public static void setPrecio(int precio) {
		Perro.precio = precio;
	}

	    //Metodo toString 
		//Nos va a permitir mostrar los atributos del objeto, actuando como "radiografia" del objeto
		//Clic drecho-source- Generate toString
		
	



	@Override
	public String toString() {
		return "Perro [nombre=" + nombre + ", edad=" + edad + ", peso=" + peso + ", color=" + color + "]";
	}
	
	
	
	

}
