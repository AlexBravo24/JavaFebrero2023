package com;

import java.util.Scanner;

public class Arraybidimensional_avt {

	public static void main(String[] args) {
		
		    String[][] ciudades = new String[4][3];
	        String[] pa�ses = new String[4];
	        Scanner entrada = new Scanner(System.in);
	        System.out.println("Introduzca el nombre de cuatro pa�ses.");
	        int i=0; int j=0;
	        for(i=0;i<4;i++){
	            pa�ses[i] = entrada.nextLine();
	        }
	        for(i=0;i<4;i++){
	            System.out.println("Introduzca tres ciudades de "+pa�ses[i]+".");
	            for(j=0;j<3;j++){
	                ciudades[i][j] = entrada.nextLine();
	            }
	        }
	        System.out.print("\nLos pa�ses y ciudades intoducidos son los siguientes: \n");
	        for(i=0;i<4;i++){
	            System.out.print("\n"+pa�ses[i]+": \t");
	            for(j=0;j<3;j++){
	                System.out.print(ciudades[i][j]+"\t");
	            }
	        }

	}

}
