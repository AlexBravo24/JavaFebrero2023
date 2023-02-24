package com;

public class Principal {

	public static void main (String[] args) {
		//Instanciamos una nueva ram que formará parte de nuestra laptop
		RAM ram= new RAM("Kingston", 8,2166,"DDR4");
		
		//Instanciamos un nuevo almacenamiento que formará parte de nuestra laptop
		Almacenamiento disco = new Almacenamiento ("WesternDigital","SSD", 960,2.5);
		
		//Instanciamos un nuevo procesador que formará parte de nuestra laptop
		Procesador cpu= new Procesador("Intel","i5",8, 4);
		
		//Instanciar una nueva Laptop
		Laptop lap = new Laptop("HP","ProBook", 12550.90 , "Gris",ram,disco,cpu);
		
		
		System.out.println(lap);
		
	}
}
