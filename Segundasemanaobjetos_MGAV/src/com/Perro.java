package com;

public class Perro {

	//Establecer atributos del objeto
	// con private solo se iene acceso en esta clase
	//con defaul acceso a misma clase y paquee
	//protected en la clase, el aquete y subclases
	//public en la clase el paquete la sub clase y afuera del paquete
	
	//existen otros modificadores como
	//Static- se establece valor estatico, poro que una se puede modificar
	//Final- nos sirve para la creacion de valores inmutables o constantes.
	
	
	private String nombre;
	private int edad;
	private double peso;
	private String color;
	private static int precio = 3000;
	
	//metodo consructor para construir tributos 
	
	//constuctir vacio 
	//este constructor nos sirbe como un comodin, para llamar a un objeto
	//
	
	

	public Perro() {
		
	}
	//contructor con todos los parametros
	//va aconstruir el objeto con todos sus parametros
	// clic dereccho, opcion source y
	//elegimos la opcion generate constructor usin fields
	// No hay limite de cuantos constructtorespuedes agregar a la clase
	

	public Perro(String nombre, int edad, double peso, String color) {
	
		this.nombre = nombre;
		this.edad = edad;
		this.peso = peso;
		this.color = color;
	}
	//metodos getters y etter
	
	//getters devuelve valor de atributo
	//setters permite establacer valor a un atributo
	
// para crear se usa la ruta source , generate getters y setters


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
	
	public static void setPrecio(int precio) {
		Perro.precio = precio;
	}


	//Metodo ToString - convierte los valores a string
	//muestra atributos en especie de radiografia 
	//nos va permitir mostrar los atributos del objeto
	//en una salida de dato
	//sourc Generate ToString
	



	@Override
	public String toString() {
		return "Perro [nombre=" + nombre + ", edad=" + edad + ", peso=" + peso + ", color=" + color + "]";
	}
	
	
	
	
	
	
	
	
	
}
