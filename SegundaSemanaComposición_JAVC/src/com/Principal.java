package com;

public class Principal {

	public static void main(String[] args) {
	     //Instanciamos una nueva ram que formara parte de nuestra laptop
		RAM ram = new RAM("Kingston", 8, 2166, "DDR4");
		//Instanciamos una nuevo almacenamiento que formara parte de nuestra laptop
		Almacenamiento disco = new Almacenamiento ("WesternDigital","SSD",960, 2.5);
		//Instanciamos una nuevo procesador que formara parte de nuestra laptop
		Procesador cpu = new Procesador ("Intel", "i5", 8, 4);
		
		//Ya podemos instanciar una nueva laptop
		
		laptop lap = new laptop ("HP", "ProBook", 12500.90, "Gris", ram, disco, cpu);
		
		System.out.println(lap);
		
		
		

	}

}
