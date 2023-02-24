package com;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Quirofano quirofano= new Quirofano (5, "Alta", 5, 5, 20, 20);
		Cuidados_Intensivos cuidados_intensivos= new Cuidados_Intensivos(8, "Baja", 5, 11);
		Farmacia farmacia= new Farmacia (5, "Baja", 4, 4, 5, "Tabletas, Jarabe, Inyecciones");
		Laboratorio laboratorio= new Laboratorio (4,"Alta", 3, 4);
		Radiologia radiologia= new Radiologia (4,"Alta", 3, 2);
		
		Hospital hospital= new Hospital ("Los Angeles","Xalapa", "Quirofano, Cuidados Intensivos, Laboratorio, etc.", 30, 5,
										quirofano, cuidados_intensivos, farmacia, laboratorio, radiologia);
	
		System.out.println(hospital);
	}

}
