package com;

import java.util.Scanner;

public class ejercicio6_avt {
	public static void main(String[] args) {
		 Scanner in = new Scanner(System.in);
	        int tipo_de_uva;
	        double embarque_en_kilos, pago_al_productor, precio_inicial, precio_por_kilo, tamano;
	        System.out.print("Ingresa el valor de embarque en kilos: ");
	        embarque_en_kilos = in.nextDouble();
	        in.nextLine();
	        System.out.print("Ingresa el valor de precio inicial: ");
	        precio_inicial = in.nextDouble();
	        in.nextLine();
	        System.out.print("Ingresa el valor de tamano: ");
	        tamano = in.nextDouble();
	        in.nextLine();
	        precio_por_kilo=precio_inicial;
	        System.out.println("Selecciona el valor de tipo de uva.");
	        System.out.println("\t1.- A");
	        System.out.println("\t2.- B");
	        System.out.print("\t: ");
	        do {
	            tipo_de_uva = in.nextInt();
	            in.nextLine();
	            if (tipo_de_uva<1||tipo_de_uva>2)
	                System.out.print("Valor incorrecto. Ingr\u00E9salo nuevamente.: ");
	        } while (tipo_de_uva<1||tipo_de_uva>2);
	        if(tipo_de_uva==1&&tamano==1)
	            precio_por_kilo=precio_por_kilo+0.2;
	        if(tipo_de_uva==1&&tamano==2)
	            precio_por_kilo=precio_por_kilo+0.3;
	        if(tipo_de_uva==2&&tamano==1)
	            precio_por_kilo=precio_por_kilo-0.3;
	        if(tipo_de_uva==2&&tamano==2)
	            precio_por_kilo=precio_por_kilo-0.5;
	        pago_al_productor=embarque_en_kilos*precio_por_kilo;
	        System.out.println("Valor de pago al productor: " + pago_al_productor);
	        System.out.println("Valor de precio por kilo: " + precio_por_kilo);
	    }
	}


