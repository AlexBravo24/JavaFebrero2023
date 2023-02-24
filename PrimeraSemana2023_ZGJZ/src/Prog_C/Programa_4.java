/*4. Realiza un programa que lea una cadena por teclado y compruebe si es una letra mayúscula.*/

package Prog_C;

import javax.swing.JOptionPane;

public class Programa_4 {
	
	public static void main(String [] args) {
		
		char letra;
		
		letra = JOptionPane.showInputDialog(" escriba una letra :") .charAt(0);
		
		
		if(Character.isUpperCase(letra)){

		     JOptionPane.showMessageDialog(null, " es una letra mayuscula");

		}
		else{
		     JOptionPane.showMessageDialog(null,"es una letra miniscula");
		   }
		
		
		
	}

}
