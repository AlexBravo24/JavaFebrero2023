package Programas;

import java.util.Scanner;

//La asociaci�n de vinicultores tiene como pol�tica fijar un precio inicial al kilo de uva, la cual se 
//clasifica en tipos (A y B), y adem�s en tama�os (1 y 2). Cuando se realiza la venta del producto, �sta 
//es de un s�lo tipo y tama�o, se requiere determinar cu�nto recibir� un productor por la uva que 
//entrega en un embarque considerando lo siguiente:
//* Si es de tipo A, se le cargan 20 c�ntimos al precio inicial cuando es de tama�o 1 y 30 c�ntimos si 
//es de tama�o 2.
//* Si es de tipo B, se rebajan 30 c�ntimos cuando es de tama�o 1, y 50 c�ntimos cuando es de 
//tama�o 2.
//Precio inicial se recibe desde teclado
public class Programaseis {
  
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		Float Precioi ;
	    char tipo;
	    int tama�o,kilostotales;
		System.out.println("Ingresa El Precio Incial Por KG : ");
	    Precioi = sc.nextFloat();
	    System.out.println("Ingresa El Tipo De Uva  (A o B) : ");
	    tipo = sc.next().charAt(0);
	    System.out.println("Ingresa El Tama�o De Uva  (1 o 2) : ");
	    tama�o = sc.nextInt();
	    
	    System.out.println("Ingresa La Cantidad De Kilos Enteros Que Vendera : ");
	    kilostotales = sc.nextInt();
	    
	    
	    if(Character.compare(tipo, 'A')==0 && tama�o == 1  ) // +.20 al precio inicial
	    {
	    	Precioi = (float) (Precioi + .2);
	    	System.out.println("Precio por Kilo : "+ Precioi +" Total : "+Precioi*kilostotales);
	    	
	    }
	    else if(Character.compare(tipo, 'A')==0 && tama�o == 2  ) // +.30 al precio inicial
	    {
	    	Precioi = (float) (Precioi + .3);
	    	System.out.println("Precio por Kilo : "+ Precioi +" Total : "+Precioi*kilostotales);
	    	
	    }
	    else if(Character.compare(tipo, 'B')==0 && tama�o == 1  ) // -.30 al precio inicial
	    {
	    	Precioi = (float) (Precioi - .3);
	    	System.out.println("Precio por Kilo : "+ Precioi +" Total : "+Precioi*kilostotales);
	    	
	    }
	    else if(Character.compare(tipo, 'B')==0 && tama�o == 2  ) // -.50 al precio inicial
	    {
	    	Precioi = (float) (Precioi - .5);
	    	System.out.println("Precio por Kilo : "+ Precioi +" Total : "+Precioi*kilostotales);
	    	
	    }
	    else
	    {
	    	System.out.println("DATOS NO VALIDOS ");
	    }
	    
	    
		
 }
	
}
