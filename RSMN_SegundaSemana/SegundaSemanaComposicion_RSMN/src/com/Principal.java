package com;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		RAM ram = new RAM ("kingston",8,2166,"ddr4");
		Almacenamiento disco = new Almacenamiento ("westerndigital","ssd",960,2.5);
		Procesador cpu = new Procesador("intel","i5",8,4);
		
		Laptop lap = new Laptop("hp", "probook", 12550.90,"gris",ram,disco,cpu );
		System.out.println(lap);

	}

}
