package com;

import java.util.Scanner;

public class Ciclo6_JAMA {

	public static void main(String[] args) {
		// Una persona desea invertir $1000.00 en un banco, el cual le otorga un 2% de interés
		// mensual. ¿Cuál será la cantidad de dinero que esta persona tendrá al cabo de un año si
		// todo el dinero lo reinvierte?
		
		
//      
//       for (int mes = 1; mes<=12; mes++){
//        	
//        	int total;
//    		int inversion = 1000;
//          double intereses;
//        	intereses = inversion * 0.02;
//        	total =  (int) ((intereses + inversion) * mes);
//            System.out.println("el valor ganado en " + mes + " meses es " + total);
//            
//        }
		
		Scanner teclado = new Scanner(System.in);
	       
        boolean numeroCorrecto = false;
        int n,m;
       
        do {
            System.out.print("Ingrese cantidad filas (número impar): ");
            n = teclado.nextInt();
            System.out.print("Ingrese cantidad columnas (número impar): ");
            m = teclado.nextInt();
           
            if(n % 2 != 0 && m % 2 != 0) {
                numeroCorrecto = true;
            }else {
                System.out.println("Datos incorrectos. Ingrese dos valores impares");
            }
            System.out.println();
           
        }while(!numeroCorrecto);
       
        char matriz [][]= new char [n][m];
       
        int mitadFilas = matriz.length / 2;
        int mitadColumnas = matriz[0].length / 2;
       
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                if(i == mitadFilas || j == mitadColumnas) {
                    matriz [i][j] = '-';
                }else {
                    matriz [i][j] = ' ';
                }
                System.out.print(matriz[i][j]+" ");
            }
            System.out.println();
        }
        
        
		
	}
}
