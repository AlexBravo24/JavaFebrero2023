package com;

public class Principal {

	public static void main(String[] args) {
		
		
		Hahuayana hah = new Hahuayana ("Hahuayana","Piña, Queso, Salsa, Especias",45);
		Mexicana mex = new Mexicana ("Mexicana","Jalapeño, Carne de Puerco, Jamon, Salchicha, Salsa, Especiasl, Queso ",45);
		Pizza piz = new Pizza("Pizza", "Chica, Mediana, Grande", 8, "50 pesos",300,3000,30000, mex, hah);

		
		 System.out.println(piz);
	}

}
