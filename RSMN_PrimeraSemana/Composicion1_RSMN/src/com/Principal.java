package com;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Cuartos cuartoPrincipal = new Cuartos("kingsize", "ChocolateOscuro","Chicos");
		Ba�os ba�oPrincipal = new Ba�os ("acero inoxidable","zesus una pieza","blanco chico", "gris");
		Cocina cocina = new Cocina ("acrosGris", "Acero inoxidable","Grande");
		
		Casa casa = new Casa (7,5, ba�oPrincipal,cocina,cuartoPrincipal);
		System.out.println(casa);
		
	}

}
