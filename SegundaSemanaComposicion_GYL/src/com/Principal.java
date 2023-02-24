package com;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Intanciamos una nueva ram que formara parte de nuestra Laptop
		RAM ram = new RAM ("Kingston", 8, 2166, "DDR4");
		//Intanciamos una nueva almacenamiento que formara parte de nuestra Laptop
		Almacenamiento disco = new Almacenamiento ("WesternDigital", "SSD", 960, 2.5);
		//Intanciamos una nueva procesador que formara parte de nuestra Laptop
		Procesador cpu = new Procesador("Intel", "i5", 8, 4);
		
		
		//Instanciar una nueva Laptop
		Laptop lap = new Laptop("HP", "ProBook", 12550.90, "Negra", ram, disco, cpu);
		
		System.out.println(lap);
	}

}
