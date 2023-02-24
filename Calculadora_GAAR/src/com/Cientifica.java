package com;

public class Cientifica extends Calculadora implements ICamara{
	
	
      public Cientifica(){super();}
      
      public Cientifica(String marca, String modelo, double costo)
      {
    	  super(marca,modelo,costo);
      }
      

	@Override
	public void Suma(double a, double b) {
		// TODO Auto-generated method stub
		 System.out.println("S :"+(a+b));

	}

	@Override
	public void Resta(double a, double b) {
		// TODO Auto-generated method stub
		 System.out.println("Resta :"+(a-b));

	}

	@Override
	public void Multiplicacion(double a, double b) {
		// TODO Auto-generated method stub
		 System.out.println("Multiplicacion :"+(a*b));
	}

	@Override
	public void Division(double a, double b) {
		// TODO Auto-generated method stub
		
		if(b==0)
			System.out.println("ERROR DIVISION");
		else
		 System.out.println("Division :"+(a/b));
		
	}

	@Override
	public void tomarfoto() {
		// TODO Auto-generated method stub
		System.out.println("Tomando foto instantanea....");
	}
     

	
}
