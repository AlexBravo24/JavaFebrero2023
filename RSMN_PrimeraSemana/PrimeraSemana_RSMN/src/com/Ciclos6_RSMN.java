package com;

import java.util.Scanner;

public class Ciclos6_RSMN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double dinero = 1000;
		int mes = 1;

		while (mes<=12) {
		dinero = dinero * 1.02;
		mes++;
		}
		System.out.println(dinero);
		
		
		
	}
	
	public static void imprime(String mt_text){
		System.out.println(mt_text);
	}


}
