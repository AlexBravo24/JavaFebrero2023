package com;

public class Principal {

	public static void main(String[] args) {
		//Instanciar Motor, Asientos, Auto
		Motor m1 = new Motor(2.0, 280, "Gasolina", 361);
		Asientos a1 = new Asientos(7, "Piel");
		
		Auto auto1 = new Auto("Teramont", "VW", 2023, "Sport", m1, a1);
		System.out.println(auto1);

	}

}
