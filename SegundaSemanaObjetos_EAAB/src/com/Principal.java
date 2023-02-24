package com;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//Vamos a llamar a nuestro objeto Perro
		
		//La manera de llamarlo o crearlo es instanciarlo
		
		//doberman es la instancia de la clase Perro,
		// es el objeto en sí
		
		//Perro doberman = new Perro("firulais",1, 15.5,"negro"); // constructor con parametros
		
		// con el constructor vacio puedo instanciar un objeto
		// y posteriormente establecer sus atributos con los setters
	
		//Perro salchicha = new Perro(); // con constructor vacio
		
//		salchicha.setNombre("Fido");
//		salchicha.setEdad(2);
//		System.out.println(salchicha.getPrecio());
//		Perro.setPrecio(4000);
		
		//para desplegarlos solo escribimos el nombre del objeto
		// y gracias al metodo toString nos despliega todos los atributos
//		System.out.println(doberman); 
//		System.out.println(salchicha.getPrecio());
		
		
		//ACTIVIDAD
		//modelar 5 objetos (5 clases)
		// cada clase de 3 a 5 atributos
		// crear constructores
		// crear getters  y setters
		//crear toString
		//instanciarlos en la principal
		//instanciar 2, uno con todos sus parametros y
		//otro con los parametros a elegir
		
		//CLASE 1
		Auto civic = new Auto();
		civic.setAño(2019);
		civic.setKm(63000);
		civic.setMarca("Honda");
		
		Auto jetta = new Auto("VW",2016,45000,"ROJO");
		
		//CLASE 2
		Laptop mac = new Laptop();
		mac.setProcesador("M1");
		mac.setCapacidadHD(256);
		mac.setMarca("Apple");
		mac.setRam(8);
		mac.setSistema("mac os");
		
		Laptop inspiron = new Laptop("DELL","INTEL CORE i3",8,500);
		
		//CLASE 3
		Casa casa1 = new Casa();
		casa1.setArea(150);
		casa1.setPisos(1);
		
		Casa casa2 = new Casa(200.5,2,4,2);
		
		//CLASE 4
		Zapato tenis = new Zapato();
		tenis.setMarca("nike");
		tenis.setTalla(27);
		
		Zapato bota = new Zapato("cuadra",24,"piel");
		
		//CLASE 5
		Estudiante est1 = new Estudiante();
		est1.setNombre("Juan");
		est1.setApellido("Perez");
		
		Estudiante est2 = new Estudiante("Eduardo","Aguilar",32);
		
		//Despliegues
		
		System.out.println(civic);
		System.out.println(jetta);
		System.out.println();
		
		System.out.println(mac);
		System.out.println(inspiron);
		System.out.println();
		
		System.out.println(casa1);
		System.out.println(casa2);
		System.out.println();
		
		System.out.println(tenis);
		System.out.println(bota);
		System.out.println();
		
		System.out.println(est1);
		System.out.println(est2);
		System.out.println();
		
		
		
		

	}

}
