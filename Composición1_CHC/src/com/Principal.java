package com;

public class Principal {

	public static void main(String[] args) {
		// Instanciamos un nuevo color que forma parte de juguetes
		COLOR color= new COLOR ("Rojo","con Amarillo", 4, "Mate");
		
		//Instanciamos un nuevo material que forma parte de juguetes
		Mat material = new Mat ("Plástico","Muy seguro","Súper ligero", "No pesa");
		
        //Instanciamos un nuevo Peso que forma paarte de juguetes
		Peso peso = new Peso (500,30,"No es rigido");
		
		//Instanciamos un nuevo juguete
		Juguetes toy = new Juguetes("BuzzLightyear","Grande",900,"20 años", color, material, peso);
		
		System.out.println(toy);
	}

}
