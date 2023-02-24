package com;


public class Perro {
 
	  /* Las clases son una plantilla para moldear un objeto de 
	   la vida real 
	   
	   */
	//Modificadores para el encapsulamiento (Default, private , Public, Protected)
	//Private - Acceso en la misma clase
	//default - Acceso en la misma clase y paquete
	// Protected - En la clase, paquete y subclases
	// Public - Acceso en todos lados.
   private String nombre;
   private int edad;
   private double peso;
   private	String color;
   private Double precio;
	 
    //METODOS CONSTRUCTORES
	// Metodo conceptual construyen al objeto con atributos
   
   //Consultor Vacio sirve como comodin para llamar un objet
   //Hasta cierto punto ("vacio")
   //Tambien permite crearlo con determinados atributos
   
   public Perro()
   {
	  //CONSTRUCTOR CON TODOS LOS PARAMETROS 
	  // click derecho, elegimos la opcion source y
	   //elegimos la opcion Generate Constructor using fields
	   //No hay kimite de cuantos constructores podemos agregar
	   
   }

public Perro(String nombre, int edad, double peso, String color, double precio) {
	this.nombre = nombre;
	this.edad = edad;
	this.peso = peso;
	this.color = color;
	this.precio = precio;
}
 //Creacion de metodos qetters y setters
//Getter - devuelve el valor de un atributo
// Setter - permite establecer el valor de un atributo
//Para crearlo usamos la ruta :
// source - generate getters and setters


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

public Double getPrecio() {
	return precio;
}

public void setPrecio(Double precio) {
	this.precio = precio;
}

@Override
public String toString() {
	return "Perro [nombre=" + nombre + ", edad=" + edad + ", peso=" + peso + ", color=" + color + ", precio=" + precio
			+ "]";
}


//METODO toString
//Nos va a permitir mostrar atributos 
//Actuando como una especie de radiografia del objeto
//Source generate To string
//MODIFICADORES STATIC Y FINAL
//STATIC ESTABLECEMOS VALOR ESTATICO MODIFICABLE
//FINAL CREAMOS VALORES INMUTABLES O CONSTANTES


   
}
