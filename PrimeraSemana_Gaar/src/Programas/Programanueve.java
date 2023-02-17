package Programas;
//9.Realiza un programa que pida el día de la semana (del 1 al 7) y escriba el día correspondiente. Si 
//introducimos otro número nos da un error
import java.util.Scanner;

public class Programanueve {
      public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int Dia;
		System.out.println("Ingresa Un Numero Del 1 - 7");
		Dia = sc.nextInt();
		
		switch(Dia){
		case 1:  System.out.println("LUNES"); break;
		case 2:  System.out.println("MARTES"); break;
		case 3:  System.out.println("MIERCOLES"); break;
		case 4:  System.out.println("JUEVES"); break;
		case 5:  System.out.println("VIERNES"); break;
		case 6:  System.out.println("SABADO"); break;
		case 7:  System.out.println("DOMINGO"); break;
		default: System.out.println("ERROR DATO NO VALIDO"); break;
	   
		}
		
    	  
   }
}
