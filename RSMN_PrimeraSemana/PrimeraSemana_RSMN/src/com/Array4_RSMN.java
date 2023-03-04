package com;

public class Array4_RSMN {
	public static void main(String[] args) {
		
		int[] a = {1,2,3,4,5};
		int[] b = new int[a.length];
		
		for (int i = 0; i < a.length; i++) {
			b[(a.length-1) - i] = a[i];
		}
		
		for (int i = 0; i < b.length; i++) {
			System.out.print(b[i]);
		}
	}
}
