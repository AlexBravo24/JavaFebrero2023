package com;

public class Principal {

	public static void main(String[] args) {
		//instanciar Ram que formara parte de nuestra laptop
		RAM ram = new RAM("Kingston", 8, 2166, "DDR4");
		//instanciar almacenamiento
		Almacenamiento disco = new Almacenamiento("WesterDigital", "SSD", 960, 2.5);
		//instanciar procesador
		Procesador cpu = new Procesador("Intel", "i5", 8, 4);
		
		
		//Instanciar una nueva Laptop
		Laptop lap = new Laptop("HP", "ProBook", 12550.90, "Gris", ram, disco, cpu);
		System.out.println(lap);

	}

}
