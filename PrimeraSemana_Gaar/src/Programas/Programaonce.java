package Programas;

import java.util.Scanner;

//Una compañía de transporte internacional tiene servicio en algunos países de América del Norte, América 
//Central, América del Sur, Europa y Asia. El costo por servicio de transporte se basa en el peso del paquete y 
//la zona a la que va dirigida. Lo anterior se muestra en la siguiente tabla:
public class Programaonce {
   public static void main(String[] args) {
	@SuppressWarnings("resource")
	Scanner sc = new Scanner(System.in);
	float peso;
	int Ubicacion;
	
	System.out.println("Ingres Peso : ");
	peso = sc.nextFloat();
	System.out.println("___________________________________________ ");
	System.out.println("|1._AMERICA DEL NORTE || 2._AMERICA CENTRAL|\n|3._AMERICA DEL SUR || 4._ EUROPA          |\n|5._ASIA                                   | ");
	System.out.println("--------------------------------------------- ");
	System.out.println("Ingresa Ubicacion : ");
	Ubicacion = sc.nextInt();
	
	if(peso <= 5 && peso >= 1)
	{
		switch(Ubicacion) {
		
			case 1: System.out.println("TOTAL EUROS : "+24*peso); break;
			case 2: System.out.println("TOTAL EUROS : "+20*peso); break;
			case 3: System.out.println("TOTAL EUROS : "+21*peso);break;
			case 4: System.out.println("TOTAL EUROS : "+210*peso);break;
			case 5: System.out.println("TOTAL EUROS : "+18*peso);break;
			
		                  }
				
	}
	else
	{
		System.out.println("NO SE PUEDE REALIZAR ENVIO ");
	}
	
}
	
}
