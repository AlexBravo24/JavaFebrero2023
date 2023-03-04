package com;

import java.util.Scanner;

public class ArrayBi1_RSMN {
	public static void main (String[] args) {
		String[][] p_c = new String[4][4];
		
		for (int i = 0; i < p_c[0].length; i++) {
			System.out.print("Ingresa un pais en la posicion " + i + " :");
			p_c[0][i] = new Scanner(System.in).nextLine();
			System.out.println();
		}
		
		for (int i = 1; i < p_c.length; i++) {
			for (int j = 0; j < p_c[i].length; j++) {
				System.out.print("Ingresa una ciudad del pais " + p_c[0][j] + " :");
				p_c[i][j] = new Scanner(System.in).nextLine();
				System.out.println();
			}
		}

		for (int i = 0; i < p_c.length; i++) {
			for (int j = 0; j < p_c[i].length; j++) {
				System.out.print(j == 0 ? "Pais: " : j == 1 ? "        Ciudades: " : "       ");
				System.out.print(p_c[j][i]);
			}
			System.out.println();
		}
	}
}
