package com;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		// vamosa mandar a llamar a nuestro objeto perro
		
	// cual es la diferencia entre objeto o clase 
		// la calse es laplatilla
		
		//aqui en este ejemplo 
		Perro doberman = new Perro("firulais", 1, 15.5,"negro");
		
		System.out.println(doberman);
		
		Casa vecina = new Casa(5,6);
		vecina.setVentanas(4);
		Casa hacienda = new Casa(60, 32);
		System.out.println(vecina);
		System.out.println("la hacienda tiene:"+ hacienda);
	}

}
