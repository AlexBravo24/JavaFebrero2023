package com;

public class Principal {

	public static void main(String[] args) {
		
		
		/*Vamos a llamar a nuestro objeto perro 
		 * la manera de llamarlo o crearlo es instanciarlo 
		 */

 //Aquí en este ejemplo doberman es la instancia de la clase Perro
		//Es el objeto en si 
		//La diferencia entre clase e instancia
		//es que la clase es la plantilla del objeto
		//Mientras que la instancia es el objeto en si
		//Al cual ya podemos asignarle valores a sus atributos
		
		
	//En este ejemplo doberman es la instancia de la clase Perro 	
//	Perro doberman = new Perro("Firulais",1,15.5,"Negro");
//	//Con el constructor vacío puedo instanciar un objeto
//	// y posteriormente establecer sus atributos con los setters
//	
//	Perro salchicha =  new Perro();
//	salchicha.setNombre("Fido");
//	salchicha.setEdad(2);
//	
//	Perro.setPrecio(4000);
//	
//	System.out.println(doberman);
//    System.out.println(salchicha.getPrecio());
//    
    //Actividad
    //Modelar 5 objetos (los que ustedes quieran)
    //Cada objeto debe llevar de 3 a 5 atributos
    //Crean sus constructores
    //Crear sus métodos getters y setters
    //Método ToString
    //Instanciar aquí en la clase principal
    //Van a instanciar 2 objetos, uno con sus parámetros 
    // y otro con los parámetros que ustedes eligen
    // y le dan salida en consola para visualizar atributos

    
    

//Objeto compu
	Computadora Huawei = new Computadora("Huawei",20000,"1tb","2020","USB,C,HDMI");
	Computadora dell = new Computadora("dell",30000,"500Gb","2022","USB,Ethernet,HDMI");
	System.out.println(Huawei);
	System.out.println(dell);
	
	
//Objeto Audifonos 	
	
	Audifonos Sony = new Audifonos ("Inalambricos","Sony","Si","Cancelación de ruido, escuchar exterior y estereo", 30);
	Audifonos Samsung=new Audifonos ("Alámbricos", "Samsung", "Si","Solo modo estereo",25);
	System.out.println(Sony);
	System.out.println(Samsung);
	
	
//Objeto Herramientas
	Herramientas Stanley = new Herramientas ("Pinzas", "GV10","8in",460,"México");
	Herramientas Craftsman = new Herramientas ("Multímetro","Digital","Estandar", 1080, "USA");
	System.out.println(Stanley);
	System.out.println(Craftsman);
	
//Objeto SeriesNetflix
	Series Netflix = new Series ("Aterrizaje de Emergencia", "1 hr ", 10, "Netflix","Salió en 2020");
	Series Amazon = new Series ("Good Doctor", "30min", 50, "Amazon Series","Salió en 2019");
	System.out.println(Netflix);
	System.out.println(Amazon);

//Objeto Juguetes
	Juguetes Fisher = new Juguetes ("FisherPrice","Pequeños", 400 ,"3 años","Niños de 3+");
	Juguetes Mattel = new Juguetes ("Mattel","Grandes", 500, "10 años", "Niños de todas las Edades");
	System.out.println(Fisher);
	System.out.println(Mattel);
	
	
	
	
	
	
	
	
	}	
}
