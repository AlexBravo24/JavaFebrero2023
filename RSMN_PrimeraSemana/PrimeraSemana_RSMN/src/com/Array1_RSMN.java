package com;

import java.util.Scanner;

public class Array1_RSMN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array_int[] = new int[10];

		for (int i = 0; i < array_int.length; i++) {
			array_int[i] = new Scanner(System.in).nextInt();
		}
		for (int i = 0; i < array_int.length; i++) {
			System.out.println("indice:" + i + " valor:" + array_int[i]);
		}
	}
}
