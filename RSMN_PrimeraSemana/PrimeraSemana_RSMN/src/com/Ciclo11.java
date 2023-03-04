package com;

import java.util.Scanner;

public class Ciclo11 {
	static Scanner teclado = new Scanner(System.in);
	static int n;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	    entradato();
        proceso();

	}
	
	public static void entradato() {
        System.out.print("Por favor ingrese lado del cuadrado: ");
        n = teclado.nextInt();
    }
   
    public static void proceso() {
        if(n >= 2 && n <= 50) {
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= n; j++) {
                    System.out.print(" *");
                }
                System.out.println("");
            }
        }else {
            System.out.println("Por favor ingrese un numero entre 2 y 50");
        }
    }
    
	public static void imprime(String mt_text){
		System.out.println(mt_text);
	}
}
