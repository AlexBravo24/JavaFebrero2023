package com;

import java.util.Scanner;

public class Ciclo10_RSMN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        int numero;

        System.out.print("Introduce un número (0 para acabar): ");
        numero = sc.nextInt();

        while (numero != 0) {

            if (numero > 0) {
                System.out.print("Positivo");
            } else {
                System.out.print("Negativo");
            }
            if(numero % 2 == 0){
                System.out.println(" Par");
            }else{
                System.out.println(" Impar");
            }

            System.out.print("Introduce un número (0 para acabar): ");                                  
            numero = sc.nextInt();
        }
    


	}
	public static void imprime(String mt_text){
		System.out.println(mt_text);
	}
}
