package Bidi;

import java.util.Scanner;

public class Programa_Uno{
  public static void main(String[] args) {
	 @SuppressWarnings("resource")
	 Scanner sc = new Scanner(System.in);
	 String[][] matriz = new String [4][4];
	 
//	 String[][] matriz = {
//			 {"CHILE","ESPAÑA","FRANCIA","ITALIA"},
//			 {"BUENOS A.","MADRID","PARIS","ROMA"},
//			 {"CORDOBA","  LUGO","   NIZA","  NAPOLES"},
//			 {"LA PLATA","   SEVILLA","   LYON"," SICILIA"}
//			             };
	
	 for(int i=0; i<4; i++) {
		 for(int j=0; j<4; j++) {
			  if(j==0) {
				  System.out.println("Ingresa Nombre De Pais : ["+i+"]"+"["+j+"]");
				  matriz[i][j] = sc.nextLine();
			  			}
			  else
			  {
				  System.out.println("Ingresa Nombre De Ciudad "+matriz[i][0]+" ["+i+"]"+"["+j+"]");
				  matriz[i][j] = sc.nextLine();  
			  }
		 						}
	     System.out.println("\n");
	 						}
	 //Impresion de Datos
	 for(int i=0; i<4; i++) {
		 for(int j=0; j<4; j++) {
			 if(j==0) {
				  System.out.print("Pais :  " +matriz[j][i]+"\t");
			  			}
			  else
			  { 
				  if(j==1)
					 System.out.print("Ciudades : "); 
				  
				  System.out.print("     "+matriz[j][i]);
			  }
			 
		 						}
	     System.out.println("\n");
	 						}
	 
	  
  											}
								}
