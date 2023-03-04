package com;

import java.util.Scanner;

public class Ciclos3_RSMN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc= new Scanner(System.in);
        System.out.print("Introduce una frase (puede tener puntos, comas y espacios): ");
        String s=sc.nextLine();
        
        s=s.replace(" ", "");
        s=s.replace(",", "");
        s=s.replace(".", "");
        System.out.print(s);
        int fin = s.length()-1;
        int ini=0;
        boolean espalin=true;
        
        while(ini < fin){
            if(s.charAt(ini)!=s.charAt(fin)){
                espalin=false;
            }
        ini++;
        fin--;
        }
        if(espalin)
            System.out.print("\nEs palindromo.");
        else
            System.out.print("\nNo es palindromo.");
	}

}
