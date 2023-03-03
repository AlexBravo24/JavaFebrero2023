package com;

public class Principal {

	public static void main(String[] args) {
		
		//Vamos a llamar a nuestro objeto perro
		
		//La manera de llamarlo o crearlo es instanciarlo
		
		//Aqui en este ejemplo doberman es la instancia de la clase Perro
		//Es el objeto en sí
		//La diferencia entre clase e instancia
		//Es que la clase es la plantilla del objeto
		//Mientras que la instancia es el objeto en sí
		//Al cual ya podemos asignarle valores a sus atributos
		
		//En este ejemplo doberman es la instancia de la clase Perro
		
		Automovil camaro=new Automovil("chevrolet","automatico","dosmil","negro","manual",6);
	    
		Automovil lambo= new Automovil();
		
		System.out.println(camaro);
		System.out.println(lambo);
		
		
		Maestro jedi=new Maestro("luminoso","unico","azul");
		Maestro sith=new Maestro();
		
		
		System.out.println(jedi);
		System.out.println(sith);
		
		Refresco coca=new Refresco("coca","cola","2023","negro");
		Refresco sprite=new Refresco();
		
		
		System.out.println(coca);
		System.out.println(sprite);
		
		Laptop asus=new Laptop("notebook","portable","2023","roja");
		Laptop lenovo=new Laptop();
		
		
		System.out.println(asus);
		System.out.println(lenovo);
		
		Chocolate mazapan=new Chocolate("chocolate"," circular","redonda");
		Chocolate normal=new Chocolate();
		
		
		System.out.println(mazapan);
		System.out.println(normal);
		
		
		
		//Con el constructor vacío puedo instanciar un objeto
		//Y posteriormente establecer sus atributos con los setters
		
		
		
		
		

	}

}