package com;

public class Principal {

	public static void main(String[] args) {
	
		//vamos a llamar a nuestro objeto perro
		// la anera de llamarlo o crearlo es instanciarlo
		// doberman es la instacia de la clase perro
		// la diferancia en tre calase e instacia es que la clase es la plantilla del objeto mientras que 
		//la instamcia es el objeto en si 
		// al cual se le pueden asignar valores y sus atributos
		
		// en este ejemplo la instacia es doberman y Perro seria la clase
		
		Perro doberman = new Perro("Pacoelchato",2,2.3,"blanco");
		
		
		//con el consultor vacio puedo instanciar un objeto
		//y posterirormente establecer sus atributos con setters
		
		Perro salchicha= new Perro();
		salchicha.setNombre("firus");
		salchicha.setEdad(5);
		
        Perro.setPrecio(400000);
		
	  
	   
	   
	   Dulce tutsi = new Dulce ("carlota",20,200,"varios");
	  
	   Zapato calzado = new Zapato();
			   
		 calzado.setMarca("Nike");
		 calzado.getPrecio();
		 calzado.setTipo("Tenis");
	
		 System.out.println(doberman);
		   System.out.println(salchicha.getPrecio());
		   System.out.println(calzado);
		   System.out.println(tutsi);
	}

}
