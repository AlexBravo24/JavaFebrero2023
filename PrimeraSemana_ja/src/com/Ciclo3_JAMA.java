package com;

import java.util.*;

public class Ciclo3_JAMA {

	public static void main(String[] args) {
		// . Realiza un programa para determinar si un String es palíndromo
		
    Scanner entrada= new Scanner(System.in);
    System.out.print("Introduce una frase: \n");
    String cadena =entrada.nextLine();
    System.out.print(cadena);
    cadena=cadena.replace(" ", "");
    
    int ultima = cadena.length()-1;
    int primera =0;
    boolean palindromo=true;
    
    while(primera < ultima){
        if(cadena.charAt(primera)!=cadena.charAt(ultima)){
        	palindromo=false;
        }
        primera++;
    ultima--;
    }
    if(palindromo)
        System.out.print("\nEs palindromo.");
    else
        System.out.print("\nNo es palindromo.");
    
	}// cierre de main	
	
	
}// cierre de clase