package com;

public class Principal {

	public static void main(String[] args) {
//   
//     Persona persona1 = new Persona ("Ana", "Femenino",28);
//     System.out.println(persona1);
//	
//     Empleado empleado1= new Empleado ("Aaron","Masculino", 30, 12345,
//    		 "Developer Jr", "ARR8921384E","8am-5pm",30000);    
//   System.out.println(empleado1);
//   empleado1.checarEntrada();
//
     Developer desarrollador = new Developer ("Carolina", "Femenino", 24, 201635493,
    		 "Developer Jr","HECC980527","8am-5pm",3000);
     System.out.println(desarrollador);
     
     desarrollador.checarEntrada();
     desarrollador.trabajar();
     
	}

}
