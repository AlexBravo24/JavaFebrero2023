package com;

import java.util.Scanner;

public class Ejercicio14_EAAB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);	
		int horas, sueldo;
		
		System.out.println("ingrese horas laboradas: ");
		horas = entrada.nextInt();
		entrada.close();
		
		if( horas<=40) {
			sueldo= horas*16;
		}
		else {
			sueldo = (16*40) + ((horas-40)*20);
		}
		
		System.out.println("su salario semanal es de " +sueldo);

	}

}
