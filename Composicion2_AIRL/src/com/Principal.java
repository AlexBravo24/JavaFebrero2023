package com;

public class Principal {

	public static void main(String[] args) {
		
		Estadio estad1 = new Estadio("Universitario", "San Nicolas, NL", 416515, "30 de Mayo 1967");
		Tecnico tec1 = new Tecnico("Marco Antonio", "Masculino", 53, "Mexicano", 0);
		
		Equipo equipo1 = new Equipo("Tigres", 17, 3, 22, 7, estad1, tec1);
		System.out.println(equipo1);

	}

}
