package com;

public class Principal {
  public static void main(String[] args) {
	//Vamos a llamas a nuestro objeto perro
	//la menra de llamarlo o crearlo es instanciarlo 
	//Diferencia entre clase e instancia
	 //La clase es una plantilla 
	  //La intancia es el objeto al cual ya se le asignan valores
	  //Ejemplo es la instancia de la clase perro
	  Perro doberman = new Perro("Firulais", 15, 10.5, "rojo",150.5);
	  Perro Salchica = new Perro();
	  Salchica.setEdad(15);
	  System.out.println(Salchica.getEdad());
	  System.out.println(doberman);
	  
	 Salchica.setPrecio(152.3);
	  
	  
  	}
}
