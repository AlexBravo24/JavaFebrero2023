package Clases;

public class Principal {
	
	  public static void main(String[] args) {
		  
		ESTILO estilo = new ESTILO("TRENDY");
		MATERIAL material = new MATERIAL("MADERA");
		Mueble silla = new Mueble("Reclinable","Negro",1.23,material,estilo);
		System.out.println(silla);
		System.out.println("____________________________________________");
		  
		  
		  //Clase gato con su objeto gato
		COLORPELO colorpelo = new COLORPELO("ROJO");
		COLOROJOS colorojos = new COLOROJOS("MORADOS");
		Gato bolillo = new Gato("Bolillo",1,1.356,"Pura",colorojos,colorpelo);
		System.out.println(bolillo);
		System.out.println("____________________________________________");
		
       
	  }

}
