package Programas;

import java.util.Scanner;

//Realiza un programa que lea una cadena por teclado y compruebe si es una letra mayúscula.

public class Programacuatro {
	
	
	public static void main(String[] args) {
         @SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
        String Cadena;
     
        System.out.println("Ingresa LA Cadena De Texto : ");
        Cadena = sc.nextLine();

           
        if(Cadena.equals(Cadena.toUpperCase()))
        {
        	System.out.println("La Cadena Esta En Mayusculas ");
        }
        else if(Cadena.equals(Cadena.toLowerCase()))
        {
        	System.out.println("La Cadena Esta En Minusculas");
        }
        else
        {
        	System.out.println("La Cadena Contiene Mayusculas Y Minusculas ");
        }
         
	}
	
}
