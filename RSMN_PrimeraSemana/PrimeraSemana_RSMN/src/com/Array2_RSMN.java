package com;

public class Array2_RSMN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int suma = 0;
		float prom = 0;
		int array_int[] = new int[100];

		for (int i = 0; i < array_int.length; i++) {
			array_int[i] = i;
			suma += array_int[i];
		}
		prom = suma / array_int.length;
		System.out.println("Suma: " + suma + " promedio:");
	}
}
