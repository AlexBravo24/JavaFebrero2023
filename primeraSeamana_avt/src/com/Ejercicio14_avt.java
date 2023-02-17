package com;

import java.util.Scanner;

public class Ejercicio14_avt {

	public static void main(String[] args) {
		 Scanner Entrada = new Scanner(System.in);
	     //declaracion de variables
	     int horastrabajadas,total,horasex;
	     //ingreso de datos por el usuario
	     System.out.println("Ingrese el número de horas trabajadas");
	     horastrabajadas=Entrada.nextInt();
	     //proceso de condición
	     if(horastrabajadas <= 40){
	         total= horastrabajadas*16;
	         //uestra de datos en pantalla
	         System.out.println("Su sueldo es de $:"+total);
	     }else{
	         horasex=horastrabajadas-40;
	         total=(horasex*20)+(40*16);
	         System.out.println("Su sueldo es de $:"+total);
	     }

	}

}
