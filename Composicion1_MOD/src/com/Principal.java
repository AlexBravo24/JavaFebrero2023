package com;

public class Principal {
	public static void main(String[] args) {
		
		Ubicacion direccion = new Ubicacion("Avenida las Torres", "San jose Buenavista", "Toluca", "Estado de M�xico");
		Persona due�o = new Persona("Rafael", 60, 'M');
		
		Casa hogar = new Casa(100.5, 3, "Azul", 1500000, direccion, due�o);
		
		System.out.println(hogar);
	}

}
