package com;

import java.util.Scanner;

public class SET {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 /*conjunto de elementos (SET) es la encargada del tratamiento de conjuntos en el api de Java. 
		  * Un conjunto en Java es una colección de elementos que, como el conjunto en matemáticas, 
		  * no permite elementos duplicados dentro de ella y no tiene orden entre sus elementos. Más formalmente, 
		  * no permite elementos e1, e2 tales que: e1.equals(e2) sea true. 
		  * Además nos obliga a implementar determinados métodos, por ejemplo el método hashCode() entre otros.*/
		
		 /* Ahora declaramos tres variables
         * y las iniciamos*/
        String dniPersona="";
        String nombrePersona="";
        int edadPersona=0;
         
        /* Declaramos un objeto de tipo Scanner*/
        Scanner lectura=new Scanner(System.in);
         
        /* Pedimos el DNI. Lo introducimos dentro
         * de la variable dniPersona y dentro de
         * un bucle while para que se repita
         * la pregunta si la longitud no es correcta.*/
        do {
             
            System.out.println("Introduce un DNI:");
            dniPersona=lectura.nextLine();
             
        }while(dniPersona.equalsIgnoreCase("")
                || dniPersona.length()<8);
         
        /* Pedimos el nombre. Lo introducimos dentro
         * de la variabla nombrePersona y dentro de
         * un bucle while para que se repita
         * la pregunta si el nombre queda vacio*/
        do {
             
            System.out.println("Introduce un nombre:");
            nombrePersona=lectura.nextLine();
             
        }while(nombrePersona.equalsIgnoreCase(""));
         
        /* Pedimos la edad. La introducimos dentro
         * de la variabla edadPersona y dentro de
         * un bucle while para que se repita
         * la pregunta si el edad es cero*/
        do {
             
            System.out.println("Introduce una edad:");
            edadPersona=lectura.nextInt();
             
        }while(edadPersona==0);
         
        /* Creamos una variable objeto de tipo persona
         * y le pasamos las tres variables. */
        Persona nuevaPersona=new Persona(dniPersona,nombrePersona,edadPersona);
         
        /* El objeto nuevaPersona tiene ahora métodos
         * set para asignar un valor a cada característica
         * y get para mostrar el valor de cada característica.
         * Los valores que queremos introducir están en las
         * variables dniPersona, nombrePersona y edadPersona
         * así que vamos a asignar valores al dni, al nombre
         * y a la edad, a través de los métodos correspondientes*/
        nuevaPersona.setDni(dniPersona);
        nuevaPersona.setNombre(nombrePersona);
        nuevaPersona.setEdad(edadPersona);
         
        // Mostramos los datos de la persona por pantalla
        System.out.println("El DNI es: " + nuevaPersona.getDni());
        System.out.println("El nombre es: " + nuevaPersona.getNombre());
        System.out.println("La edad es: " + nuevaPersona.getEdad());    
    }
}

	}

}
