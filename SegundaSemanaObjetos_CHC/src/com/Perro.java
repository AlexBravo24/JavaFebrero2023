package com;

public class Perro {

	/* En la Programación Orientada a objetos 
	 * las clases nos van a servir como una plantilla
	 * para modelar un objeto 
	 * 
	 * Un objeto de la vida real al traerlo aquí
	 * vamos a abstraerlo, es decir, a traer esa idea 
	 * y vamos a crearle atributos y comportamientos 
	 * 
	 */
	//Establecer atributos del objeto
	//Para proteger nuestros datos, recurrimos al encapsulamiento
	//y esto lo logramos con los modificadores de acceso
	// Default, Private, Protected, Public
	
	//Private -Acceso en la misma clase
	//Default -Acceso en la misma clase y el mismo paquete
	//Protected -En la clase, en el paquete, fuera del paquete y subclases
	//Public- Acceso en la clase, el paquete, afuera del paquete y subclases 
	
	
	private String nombre;
	private int edad;
	private double peso;
	private String color;
	private static int precio=3000;
	
	//Métodos constructores
	//Construye un objeto 
	
	
	//Constructor vacío
	/*Este constructor nos sirve como un comodín, para llamar a un objeto
	 * hasta cierto punto "vacio"
	 * y también nos va a permitir crearlo con determinados atributos 
	 * 
	 */
	
	public Perro() {
		
	}



	
/*Constructor con todos los parámetros
 * va a "construir" el objeto con todos sus atributos
 *vamos a dar click derecho, elegimos la opción source y
 *elegimos la opción Generate contructor using fields
 * No hay un límite de cuantos constructores podemos agregar 
 * en una clase
 */
		public Perro(String nombre, int edad, double peso, String color) {
		this.nombre = nombre;
		this.edad = edad;
		this.peso = peso;
		this.color = color;
	
	}


		//Métodos getters & setters
		
				//Getter=devolvernos(retorna) el valor de un atributo
				//Setter= nos va a permitir establecer el valor del atributo
				//Para crearlos utilizamos la ruta
				//Source, generate getters & setters

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
		public static int getPrecio() {
			return precio;
		}




		public static void setPrecio(int precio) {
			Perro.precio = precio;
		}



//Método ToString
		//Nos va a permitir mostrar los atributos del objeto
		// en una salida de datos 
		//Actuando como especie de "radiografia" del objeto.
		// click derecho, source, GenerateToString
		




		@Override
		public String toString() {
			return "Perro [nombre=" + nombre + ", edad=" + edad + ", peso=" + peso + ", color=" + color + "]";
		}
	 

		
		



}//llave de cierre de la clase
