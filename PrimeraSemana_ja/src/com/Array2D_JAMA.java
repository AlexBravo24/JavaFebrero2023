package com;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Array2D_JAMA {

	public static void main(String[] args) {
		/* Crea un programa que pida por pantalla cuatro países y a continuación tres
		ciudades de cada uno de estos países. Los nombres de ciudades deben
		almacenarse en un array multidimensional cuyo primer índice sea el
		número asignado a cada país y el segundo índice el número asignado a
		cada ciudad.
		 */
		
		
		
//		String [][] datos =new String[4][4];
//        String tabla="";
//        @SuppressWarnings("resource")
//		Scanner entrada = new Scanner(System.in);
//
//        for (int i=0;i<4;i++){
//            System.out.print("Introduce el nombre del pais "+(i+1)+" : ");
//            datos[i][0] = entrada.nextLine()+":";         
//        }
//        for (int j=0;j<4;j++){
//            for (int i=1;i<4;i++){
//                System.out.print("Introduce el nombre de la ciudad "+(i)+" del pais "+(j+1)+" : ");
//                datos[j][i] = entrada.nextLine();             
//            }
//        }
//        for(int i=0; i<4; i++){
//            for(int j=0; j<4; j++){
//                tabla+= datos[i][j]+"        ";
//            }
//            tabla+="\n";
//        }
//        System.out.print(tabla);
		
		
		
		
	    Scanner sc = new Scanner(System.in);
        PrintWriter salida = null;
  
        try {
            salida = new PrintWriter("d:/datos.txt");   //se crea el fichero
            String cadena;
            System.out.println("Introduce texto. Para acabar introduce la cadena FIN:");
            cadena = sc.nextLine();                             //se introduce por teclado una cadena de texto    
            while (!cadena.equalsIgnoreCase("FIN")) {
                salida.println(cadena);                         //se escribe la cadena en el fichero
                cadena = sc.nextLine();                         //se introduce por teclado una cadena de texto    
            }
            salida.flush();
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());                                                                   
        } finally {         
            salida.close();
        }


	}

}
