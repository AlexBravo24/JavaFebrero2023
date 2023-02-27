package com;

public class Principal {

	public static void main(String[] args) {
		
		
		Cardio car = new Cardio("Ana gabriela",200,"60 segundos");
		
		Nutricion nutri = new Nutricion ("Dr. Laura",3500,5);
		
		Fuerza fuerza= new Fuerza ("Mario Aragon",200, 3);
		
		Entrenamiento ent = new Entrenamiento ("Sr.Pablo", "varios",3500,"stroung", car , nutri , fuerza);

		
		 System.out.println(ent);
	}

}
