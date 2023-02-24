package com;

import java.util.Scanner;

public class Ciclos11_EAAB {

	public static void main(String[] args) {
		// Dibuja un cuadrado, como en la imagen que acompaña, 
		//introducir desde teclado el ancho y el alto. Ejemplo: 8 x 8
		
		Scanner entrada = new Scanner(System.in);
		
		int alto, ancho;
		
		
		System.out.print("Ingrese la altura: ");
		alto= entrada.nextInt();
		System.out.print("Ingrese el ancho: ");
		ancho= entrada.nextInt();
			
		entrada.close();
		System.out.print("\n");
		
		for(int i=0;i<alto;i++) {
			for(int j=0;j<ancho;j++) {
				
				System.out.print("* ");
				
				
			}
			System.out.print("\n");
			
			
		}
		
		

	}

}
