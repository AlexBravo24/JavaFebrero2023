package com;

import java.util.Scanner;

public class Ejercicio4_JAMA {

	public static void main(String[] args) {
		// Ejercicio - . Realiza un programa que lea una cadena por teclado y compruebe si es una letra mayúscula
		
		String robot ;
		String crobot;
		
		
		Scanner entrada = new Scanner (System.in); 
		System.out.println("Escribe una palabra"); 
		
		robot = entrada.nextLine();
		crobot = robot.toLowerCase();
		
		if(robot.equals(crobot)){
			System.out.println("No se escribio en mayuscula");
		}else {
			System.out.println("Se escribio con mayuscula");
		}

	}

}
