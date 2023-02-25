package com;

public class Vector_JZZG {
	
	public static void main(String[] args) {
        //Declaración de variables enteras, con una de ellas inicializada
        int edad = 23, ejEntero;
        //Declaración de variable float con inicialización
        float importe = 1100.55F;
        //Declaración de variable float con iniciación y conversión
        float importe2 = (float)2050.54;
        
        System.out.println("Tu edad actual es: " + edad);
        System.out.println("El importe 1: " + importe);
        System.out.println("El importe 2: " + importe2);
        
        //Hacer un cast para convertir float a int
        ejEntero = (int)importe; 
        System.out.println("El importe 1 en entero: " + ejEntero);
        //Para pasar de int a float no es necesario hacer cast
        importe = ejEntero;
        System.out.println("El importe 1 en float: " + importe);
    }
}
