package com;

import java.util.Scanner;

public class Ejercicios13_RSMN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/* 13. Una instituci�n ben�fica recibe anualmente una donaci�n proveniente de Europa y lo reparte entre un 
		centro de salud, un comedor de ni�os y una parte lo invierte en la bolsa de acuerdo a lo siguiente:
		Si el monto de la donaci�n es de $10000 o m�s: 30% se destina al centro de salud, 50% al comedor de ni�os 
		y el resto se invierte en la bolsa.
		Si el monto de la donaci�n es menor que $10000: 25% se destina al centro de salud, 60% al comedor de 
		ni�os y el resto se invierte en la bolsa.
		La instituci�n desea saber cu�nto de dinero destinar� a cada rubro anualmente. */

				
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
					
					System.out.println("De los "+monto+" se donar�n "+primeraDonacion+" para el centro de salud");
					System.out.println("De los "+monto+" se donar�n "+segundaDonacion+" para el comedor de ni�os");
					System.out.println("Los "+bolsa+" pesos restantes se los quedar� la instituci�n");
					
				} else {
					
					primeraDonacion = monto * 0.25;
					segundaDonacion = monto * 0.6;
					 bolsa = monto - (segundaDonacion + primeraDonacion);
					
					System.out.println("De los "+monto+" se donar�n "+primeraDonacion+" pesos para el centro de salud");
					System.out.println("De los "+monto+" se donar�n "+segundaDonacion+" pesos para el comedor de ni�os");
					System.out.println("Los "+bolsa+" pesos restantes se los quedar� la instituci�n");
					
				}
				
			}

		}

