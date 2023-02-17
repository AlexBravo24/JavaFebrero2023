package com;

public class Array2_avt {
	public static void main(String[] args) {
	     int media=0; 
	     int suma = 0;
	        int[] numero = new int[100];
	        for (int i = 0; i < numero.length; i++) {
	        	numero[i] = i+1;
	            System.out.println(numero[i]);
	            suma += i+1;
	        }
	        media = suma / numero.length;
	        System.out.println("La suma es "+suma);
	        System.out.println("La media es "+media);
	    }
	}

