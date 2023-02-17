package Programas;

import java.util.Scanner;

public class Programadiez {
    public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int Mes;
		System.out.println("Ingresa Un Numero Del 1 - 12");
		Mes = sc.nextInt();
		
		switch(Mes){
		case 1:  System.out.println("ENERO : 31 DIAS"); break;
		case 2:  System.out.println("FEBRERO : 28 DIAS"); break;
		case 3:  System.out.println("MARZO : 31 DIAS"); break;
		case 4:  System.out.println("ABRIL : 30 DIAS"); break;
		case 5:  System.out.println("MAYO : 31 DIAS"); break;
		case 6:  System.out.println("JUNIO : 30 DIAS"); break;
		case 7:  System.out.println("JULIO : 31 DIAS"); break;
		case 8:  System.out.println("AGOSTO : 31 DIAS"); break;
		case 9:  System.out.println("SEPTIEMBRE : 30 DIAS"); break;
		case 10:  System.out.println("OCTUBRE : 31 DIAS"); break;
		case 11:  System.out.println("NOVIEMBRE : 30 DIAS"); break;
		case 12:  System.out.println("DICIEMBRE : 31 DIAS"); break;
		default: System.out.println("ERROR DATO NO VALIDO"); break;
	   
		}
    }	
}
