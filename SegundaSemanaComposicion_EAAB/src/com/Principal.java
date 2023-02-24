package com;

public class Principal {

	public static void main(String[] args) {
		
		//Instanciamos una nueva ram que formara parte de nuestra laptop
		RAM ram = new RAM("KINGSTON",8,2166,"DDR4");
		
		//instanciamos un nuevo almacenamiento que formara parte de nuestra laptop
		Almacenamiento disco = new Almacenamiento("WD",512,"SSD",2.5);
		
		//instanciamos un nuevo procesador que formara parte de laptop
		Procesador cpu = new Procesador("intel","i5",8,3);
		
		//instanciar una nueva laptop
		Laptop lap = new Laptop("dell","inspiron",15000,"azul",ram,disco,cpu);
		
		System.out.println(lap);
		

	}

}
