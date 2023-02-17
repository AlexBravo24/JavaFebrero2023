package Programas;

import java.util.Scanner;

//La asociación de vinicultores tiene como política fijar un precio inicial al kilo de uva, la cual se 
//clasifica en tipos (A y B), y además en tamaños (1 y 2). Cuando se realiza la venta del producto, ésta 
//es de un sólo tipo y tamaño, se requiere determinar cuánto recibirá un productor por la uva que 
//entrega en un embarque considerando lo siguiente:
//* Si es de tipo A, se le cargan 20 céntimos al precio inicial cuando es de tamaño 1 y 30 céntimos si 
//es de tamaño 2.
//* Si es de tipo B, se rebajan 30 céntimos cuando es de tamaño 1, y 50 céntimos cuando es de 
//tamaño 2.
//Precio inicial se recibe desde teclado
public class Programaseis {
  
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		Float Precioi ;
	    char tipo;
	    int tamaño,kilostotales;
		System.out.println("Ingresa El Precio Incial Por KG : ");
	    Precioi = sc.nextFloat();
	    System.out.println("Ingresa El Tipo De Uva  (A o B) : ");
	    tipo = sc.next().charAt(0);
	    System.out.println("Ingresa El Tamaño De Uva  (1 o 2) : ");
	    tamaño = sc.nextInt();
	    
	    System.out.println("Ingresa La Cantidad De Kilos Enteros Que Vendera : ");
	    kilostotales = sc.nextInt();
	    
	    
	    if(Character.compare(tipo, 'A')==0 && tamaño == 1  ) // +.20 al precio inicial
	    {
	    	Precioi = (float) (Precioi + .2);
	    	System.out.println("Precio por Kilo : "+ Precioi +" Total : "+Precioi*kilostotales);
	    	
	    }
	    else if(Character.compare(tipo, 'A')==0 && tamaño == 2  ) // +.30 al precio inicial
	    {
	    	Precioi = (float) (Precioi + .3);
	    	System.out.println("Precio por Kilo : "+ Precioi +" Total : "+Precioi*kilostotales);
	    	
	    }
	    else if(Character.compare(tipo, 'B')==0 && tamaño == 1  ) // -.30 al precio inicial
	    {
	    	Precioi = (float) (Precioi - .3);
	    	System.out.println("Precio por Kilo : "+ Precioi +" Total : "+Precioi*kilostotales);
	    	
	    }
	    else if(Character.compare(tipo, 'B')==0 && tamaño == 2  ) // -.50 al precio inicial
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
