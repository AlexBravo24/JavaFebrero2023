package com;

import java.util.Scanner;

public class Array3_avt {

	public static void main(String[] args) {
		   Scanner sn=new Scanner(System.in);
	         
	        //Pido al usuario que escriba una frase
	        System.out.println("Escriba una frase");
	         
	        //Recomiendo usar nextLine en lugar de next por los espacios
	        String frase=sn.nextLine(); 
	         
	        //Creamos un array de caracteres usando el metodo de String
	        char caracteres[]=frase.toCharArray();
	         
	        //Recorremos la frase y cogemos cada caracter y lo metemos en el array
	        for(int i=0;i<frase.length();i++){
	            System.out.println(caracteres[i]);
	        }
	}
}
