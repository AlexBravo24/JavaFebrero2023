package com;

import java.util.Scanner;

public class Ejercicio3_avt {

	public static void main(String[] args) {
		
		double numero1=0;
		double numero2=0;
		Scanner entrada =new Scanner(System.in);
		System.out.println("introduce el primer numero");
		numero1 =entrada.nextInt();
		System.out.println("introduce el segundo numero");
		numero2 =entrada.nextInt();
		 if (numero1 != 0){
		        System.out.println(numero1/numero2);
		    }else {
		        System.out.println("el segundo numero no es valido");
		    }  

	}

}
