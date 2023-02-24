package com;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RAM ram = new RAM("Kingstone",8,2166,"DDR4");
		Almacenamiento disco = new Almacenamiento("WesternDigital", "SSD", 960, 2.5);
		Procesador cpu = new Procesador("Intel", "Core i5", 8, 3.5);
		
		Laptop lap = new Laptop("HP", "ProBook", 12550.90, "Gris", ram, disco, cpu);
		System.out.println(lap);
	}
	

}
