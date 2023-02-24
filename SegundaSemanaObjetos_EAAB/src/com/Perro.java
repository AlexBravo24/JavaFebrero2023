package com;

public class Perro {
	
	/* En la programacion orientada a objetos
	 * las clases nos sirven como una plantilla
	 * para modelar un objeto
	 * 
	 * Un objeto de la vida real al traerlo aqui
	 * vamos a abstraerlo, es decir, a traer esa idea
	 * y vamos a crearle atributos y comportamientos (metodos)
	 * 
	 * 
	 */
	
	//Establecer atributos del objeto
	// Para proteger nuestros datos, recurrimos al encapsulamiento
	// Esto lo logramos con los modificadores de acceso
	// Default, private, protected, public
	// Private - acceso solo en la misma clase
	// default - acceso en la misma clase y mismo paquete
	// protected -  acceso en la clase, en el paquete y subclases
	// public - acceso en la clase, el paquete, afuera del paquete y sublclases
	
	// Existen otros modificadores como:
	// static - podemos establecer un valor estatico, pero que podemos aun modificar
	// final - nos sirve para la creacion de valores inmutables (constantes)
	private String nombre;
	private int edad;
	private double peso;
	private String color;
	private static int precio = 3000;
	
	
	//Metodos constructores
	//Construyen al objeto como tal, con sus atributos
	
	//Constructor vacio
	//Nos sirve como un comodin para llamar a un objeto
	//hasta cierto punto "vacio"  para posteriormente inicializarlo
	//y tambien nos va a permitir crearlo con determinados atributos
	
	public Perro() {
		
	}

	//Constructor con todos los parametros
	// va a construir el objeto con todos sus atributos
	// clic derecho - source - generate constructor using fields y se eligen los atributos
	//no hay limite de cuantos constructores podemos agregar a una clase
	
	public Perro(String nombre, int edad, double peso, String color) {
		this.nombre = nombre;
		this.edad = edad;
		this.peso = peso;
		this.color = color;
	}
	
	
	//Metodos getters y setters
	
	//Getter - nos devuelve (retorna) el valor de un atributo
	//Setter - nos permite establecer el valor de un atributo
	// para crearlos - source - generate getters & setters
	
	
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

	
	
	
	//metodo ToString - covierte los valores a String
	//nos permite mostrar los atributos del objeto
	// en una salida de datos
	//actuando como una especie de radiografia del objeto
	
	@Override
	public String toString() {
		return "Perro [nombre=" + nombre + ", edad=" + edad + ", peso=" + peso + ", color=" + color + "]";
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
