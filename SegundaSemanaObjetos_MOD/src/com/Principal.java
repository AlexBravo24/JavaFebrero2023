package com;

public class Principal {

	public static void main(String[] args) {
		// llamamos a nuestro objeto perro- instanciarlo

		// CLASE: Plantilla del objeto
		// Instancia: Objeto en si con sus valores asignados

		// doberman y akita es la instancia de la clase Perro
//		Perro doberman = new Perro();
//		Perro akita = new Perro("Jorjais", 2, 14.5, "Blanco");
//		Perro salchicha = new Perro();
//		
//		salchicha.setNombre("Simon");
//		salchicha.setEdad(10);
//			
//		doberman.setNombre("Firulais");
//		doberman.setEdad(1);
//		doberman.setPeso(15.5);
//		doberman.setColor("Negro");

		// Instanciando Clase Alumno
		Alumno martin = new Alumno("Martin", 28, "México", "Toluca", "Sistemas computacionales");
		Alumno natalia = new Alumno();

		natalia.setNombre("Natalia");
		natalia.setPais("Colombia");
		
		System.out.println(martin);
		System.out.println(natalia);
		System.out.println();
		
		// Instanciando Clase Laptop
		Laptop pc = new Laptop("HP", "Intel core i5", "8GB", "256GB", 14500);
		Laptop pc2 = new Laptop();
		
		pc2.setMarca("Lenovo");
		pc2.setPrecio(20000);
		
		System.out.println(pc);
		System.out.println(pc2);
		System.out.println();
		
		// Instanciando Clase Casa
		Casa casa = new Casa(120.5, 4, 2, 1);
		Casa casa2 = new Casa();
		
		casa2.setSuperficie(80.5);
		casa2.setHabitaciones(2);
		
		System.out.println(casa);
		System.out.println(casa2);
		System.out.println();
		
		//Instanciando Clase Empleado
		Empleado jose = new Empleado(1008, "Jose", "Desarrollo", "Mixto");
		Empleado miguelA = new Empleado();
		
		miguelA.setNombre("Miguel Angel");
		miguelA.setNumero(404);
		
		System.out.println(jose);
		System.out.println(miguelA);
		System.out.println();
		
		//Instanciando Clase Cancion
		Cancion joseJ = new Cancion("Preso", "Jose Jose", 1981, "Pop");
		Cancion ramstein = new Cancion();
		
		ramstein.setCantante("Ramstein");
		ramstein.setNombre("Du Hast");
		
		System.out.println(joseJ);
		System.out.println(ramstein);
	}
}
