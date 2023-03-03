package com;

public class Principal {

	public static void main(String[] args) {
		
		//Vamos a llamar a nuestro objeto Perro
		//La manera de llamarlo o crearlo es instanciarlo
		
		//aqui es el ejemplo de doberman es la instancia de la clase Perro
		//Es el objeto en sí
		//La diferencia entre clase y objeto, es que la clase es la plantilla y el objeto es la instancia que consta de asignar valores a los atributos 
		//En este objeto diberman es la instancia de la clase Perro
		Perro doberman = new Perro("Firulais", 1, 15.5, "Negro");
		
		Perro salchicha = new Perro();
		salchicha.setNombre("Fido");
		salchicha.setEdad(2);
		
		
		Perro.setPrecio(4000);
		System.out.println(doberman);
		System.out.println(salchicha);
		System.out.println(Perro.getPrecio());
		
		
		//Instanciar clase Electrodomestico
		Electrodomestico Microondas = new Electrodomestico("Basico", "Daewoo", "Gris", 1950.70);
		Electrodomestico Plancha = new Electrodomestico();
		Plancha.setTipo("Con vapor");
		Plancha.setMarca("T-fal");
		System.out.println(Microondas);
		System.out.println(Plancha);
		
		
		//Instanciar clase Animales
		Animales Cocodrilo = new Animales("Reptil", "Cocodylidae", "Verde", "Hembra", 3);
		Animales Delfin = new Animales();
		Delfin.setNombre("Delphinidae");
		Delfin.setSexo("Hembra");
		System.out.println(Cocodrilo);
		System.out.println(Delfin);
		
		//Instanciar clase Frutas
		Frutas Manzana = new Frutas("Dura", "Roja", 40.99, "Dulce");
		Frutas Aguacate = new Frutas();
		Aguacate.setSabor("Salado");
		Aguacate.setTextura("Suave");
		System.out.println(Manzana);
		System.out.println(Aguacate);
		
		//Instanciar clase Zapato
		Zapato Tenis = new Zapato("Sport", "Blanco", 6, "Nike");
		Zapato Balerina = new Zapato();
		Balerina.setTipo_zapato("Casual");
		Balerina.setMarca("Flexi");
		System.out.println(Tenis);
		System.out.println(Balerina);
		
		//Instanciar clase Comida
		Comida Mole_Poblano = new Comida("Puebla", "Chiles secos", 450);
		Comida Carne_Asada = new Comida();
		Carne_Asada.setIngred_principal("Cortes");
		Carne_Asada.setOrigen("Monterrey");
		System.out.println(Mole_Poblano);
		System.out.println(Carne_Asada);
		
		//Instanciar clase Celular
		Celular cel1 = new Celular("Xiaomi", "Redmi10", "Blanco", "256GB", 6000);
		Celular cel2 = new Celular();
		cel2.setMarca("Samsung");
		cel2.setModelo("A30");
		System.out.println(cel1);
		System.out.println(cel2);
		
		//Intanciar clase Lentes
		Lentes lentes1 = new Lentes("Rebook", "Negro", 0.5, 2950, "Policarbonato");
		Lentes lentes2 = new Lentes();
		lentes2.setMarca("Vogue");
		lentes2.setPrecio(2500);
		System.out.println(lentes1);
		System.out.println(lentes2);
		
		

	}

}
