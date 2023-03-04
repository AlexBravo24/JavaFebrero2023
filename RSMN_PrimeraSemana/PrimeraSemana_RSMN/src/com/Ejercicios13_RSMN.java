package com;

import java.util.Scanner;

public class Ejercicios13_RSMN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/* 13. Una institución benéfica recibe anualmente una donación proveniente de Europa y lo reparte entre un 
		centro de salud, un comedor de niños y una parte lo invierte en la bolsa de acuerdo a lo siguiente:
		Si el monto de la donación es de $10000 o más: 30% se destina al centro de salud, 50% al comedor de niños 
		y el resto se invierte en la bolsa.
		Si el monto de la donación es menor que $10000: 25% se destina al centro de salud, 60% al comedor de 
		niños y el resto se invierte en la bolsa.
		La institución desea saber cuánto de dinero destinará a cada rubro anualmente. */

				
				Scanner entrada = new Scanner(System.in);
				
				double primeraDonacion;
				double segundaDonacion;
				double bolsa;
				
				System.out.print("Ingrese el monto de la donacion: ");
				double monto = entrada.nextDouble();
				
				if ( monto >= 10000 ) {
					
					primeraDonacion = monto * 0.3;
					segundaDonacion = monto * 0.5;
					bolsa = monto - (segundaDonacion + primeraDonacion);
					
					System.out.println("De los "+monto+" se donarán "+primeraDonacion+" para el centro de salud");
					System.out.println("De los "+monto+" se donarán "+segundaDonacion+" para el comedor de niños");
					System.out.println("Los "+bolsa+" pesos restantes se los quedará la institución");
					
				} else {
					
					primeraDonacion = monto * 0.25;
					segundaDonacion = monto * 0.6;
					 bolsa = monto - (segundaDonacion + primeraDonacion);
					
					System.out.println("De los "+monto+" se donarán "+primeraDonacion+" pesos para el centro de salud");
					System.out.println("De los "+monto+" se donarán "+segundaDonacion+" pesos para el comedor de niños");
					System.out.println("Los "+bolsa+" pesos restantes se los quedará la institución");
					
				}
				
			}

		}

