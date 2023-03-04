package com;

import java.util.Scanner;

public class Ciclos7_RSMN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double dinero = 1000;
		int mes = 1;
		for (;;) {
		dinero = dinero * 1.02;
		if (dinero >= 1500) break;
		mes++;
		}
		System.out.println(mes);
		System.out.println(dinero);
		
		
		    
	}

	public static void imprime(String mt_text){
		System.out.println(mt_text);
	}
}
