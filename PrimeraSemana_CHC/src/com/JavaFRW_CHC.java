package com;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class JavaFRW_CHC {

	public static void main(String[] args) {
		// USO DE LAS CLASES File, FileReader, BufferedReader y FileWriter
		
		// Lectura y escritura de archivos 
		
//		String linea = "";
//        //Utilizamos un try & catch porque se va a establecer 
//		//una comunicación con datos externos 
try { // vamos a intentar establecer una comunicación para leer un archivo
//			//Con la clase file asignamos la ruta del archivo a representar en memoria 
//			File archivo = new File("C:\\Users\\Carolina Hernández\\OneDrive\\Escritorio\\fichero.txt");
//			//Una vez que tenemos el archivo pasamos ese valor a la clase FileReader para leerlo 
//			FileReader fr= new FileReader (archivo); //Sabe leer el archivo 
//            //Ahora vamos a pasarle la lectura del archivo a la clase BufferedReader
//			//para poder leer cada una de las lineas del archivo
//			BufferedReader buffer= new BufferedReader (fr); //Lee el contenido del archivo 
//			//Procedemos a leer cada una de las líneas del archivo
//			//Lo realizamos con un ciclo, guardando cada linea en el String declarado
//			
//			while ((linea = buffer.readLine()) != null) { //Asignamos el valor y mientras la línea no esté vacía
//				System.out.println("Linea: " +linea);
//				
//			}
//			
			//Escritura en un archivo
	     String abc = "\nabcdefghi\n";
	     File archivo = new File ("C:\\Users\\Carolina Hernández\\OneDrive\\Escritorio\\fichero.txt");
	     FileWriter linea= new FileWriter(archivo, true);
	     //Creamos un ciclo para iterar sobre nuestro string carácter por carácter 
	     for ( int i= 0; i<abc.length(); i++){
	    	 linea.write(abc.charAt(i)+ "\n"); //Escribimos cada caracter en una nueva linea en el archivo
	     }
	     linea.close();
	     
	     
		}catch (Exception ex) {
			
		}
		
		
		
	}

}
