package com;

public class Vector_JZZG {
	
	public static void main(String[] args) {
        //Declaraci�n de variables enteras, con una de ellas inicializada
        int edad = 23, ejEntero;
        //Declaraci�n de variable float con inicializaci�n
        float importe = 1100.55F;
        //Declaraci�n de variable float con iniciaci�n y conversi�n
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
