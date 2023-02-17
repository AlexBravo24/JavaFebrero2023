package com;

import java.util.Scanner;

public class Ejercicio5_EAAB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		
		int nota, edad;
		char sexo;
		
		System.out.print("Introduzca su nota: ");
		nota = entrada.nextInt();
		System.out.print("Introduzca su edad: ");
		edad = entrada.nextInt();
		System.out.print("Introduzca su genero Masculino (M) o Femenino (F): ");
		sexo = entrada.next().charAt(0);
		
		entrada.close();
		
		if (nota >= 5 && edad >= 18 && (sexo == 'm' || sexo == 'M')) {
			System.out.println(" SOLICITUD POSIBLE ");
		}
		else if(nota >= 5 && edad >=18 && (sexo== 'f' || sexo == 'F')) {
			System.out.println(" SOLICITUD ACEPTADA ");
			
		}
		else {
			System.out.println("SOLICITUD NO ACEPTADA");
		}
		

	}

}
