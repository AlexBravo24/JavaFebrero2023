package com;

public class Principal {

	
	
	public static void main(String[] args) {
		double number_one=56.2;
		double number_two = 0;
		
		
		Cientifica cal = new Cientifica("Texas","1",4000);
 
        System.out.println(cal);
        cal.Suma(number_one, number_two);
		cal.Resta(number_one, number_two);
		cal.Multiplicacion(number_one, number_two);
		cal.Division(number_one, number_two);
		cal.tomarfoto();
		
	}
}
