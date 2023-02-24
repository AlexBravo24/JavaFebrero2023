package com;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class JAVAFRW_JAVC {

	public static void main(String[] args) {
	
		//Uso de las clases file, filereader, bufferedReader y filewriter
		
		//Lectura y escritura de archivos
		
//		String linea= "";
		//Utilizamos un try y catch porque se va a establecer
		//una comunicacion con datos externos
		try { //intentaremos establecer una comunicacion para leer un archivo
//			File archivo = new File ("C:\\Users\\Andrés Val\\OneDrive\\Escritorio\\fichero.txt");
//		FileReader fr = new FileReader (archivo); //Sabe leer el archivo 
//		//Ahora vamos a pasarle la lectura del archivo a la clase BufferedReader
//		//para poder leer cada una de las lineas del archivo
//		BufferedReader buffer = new BufferedReader (fr); 
//		// Procedemos a ller cada una de las lineas del archivo
//		
//		
//		while((linea=buffer.readLine()) !=null) {
//			System.out.println ("Linea:"+ linea);
			
//			}

         //Escritura en un archivo
		
		String abc = "\nabcdefghi\n";
		File archivo = new File ("C:\\Users\\Andrés Val\\OneDrive\\Escritorio\\fichero.txt");
		FileWriter linea = new FileWriter (archivo, true);
		
		for  (int i = 0; i<abc.length (); i++) {
			linea.write(abc.charAt(i)+ "\n");
		}
		linea.close();
		
					
				
		}catch (Exception ex) {
		
		}
		
		
		
		
		
		
		
	}

}
