package com;

public class Principal {

	public static void main(String[] args) {
	
		// instanciamos para que el formato tenga mas atributos con nuebas clases del mismo objeto
		RAM ram = new RAM ("intel",8,2300,"DDR4");
		
		Almacenamiento disco = new Almacenamiento ("Werterndigital","SD",960,2.5);
		
		Procesador cpu = new Procesador ("intel","i5",8,4);
		
		//instanciar una nueva laoptop
		
		Laptop lap = new Laptop("HP","ProBook",2500.90,"Gris", ram, disco, cpu);
		
		 System.out.println(lap);

	}

}
