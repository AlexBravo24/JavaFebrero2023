package com;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class JavaFRW_EAAB {

	public static void main(String[] args) {
		// Uso de las clases File, FileReader, FileWriter y BufferedReader
		
		//Lectura y escritura de archivos
		
		String linea = "";
		
		
		//utilizamos un try & catch porque se va a establecer una comunicacion 
		// con datos externos
		
		try { //vamos a intentar establecer una comunicacion para leer un archivo
			
			//Con la clase File asignamos la ruta del archivo a representar en memoria
			File archivo = new File ("/Users/eduardo/Desktop/fichero.txt");
			
			//una vez que tenemos el archivo pasamos el valor a la clase FileReader para leerlo
			FileReader fr = new FileReader (archivo);
			
			//Ahora le pasamos la lectura del archivo a la clase BufferedReader para
			// poder leer cada una de las lineas del archivo
			
			BufferedReader buffer = new BufferedReader (fr); //lee el contenido del archivo
			
			//Procedemos a leer cada una de las lineas del archivo
			
			while((linea = buffer.readLine()) != null) {
				System.out.println("linea: "+linea);
				
			}
			buffer.close();
		
			//Escritura en un archivo
			String abc = "\nabcdefghi\n";
			File archivo2 = new File("/Users/eduardo/Desktop/fichero.txt");
			FileWriter linea2 = new FileWriter(archivo2, true);
			
			//creamos un ciclo para iterar sobre nuestro string caracter por caracter
			for(int i = 0; i<abc.length();i++) {
				
				linea2.write(abc.charAt(i)+"\n");//escribimos cada caracter en una nueva linea en el archivo
			}
			
			linea2.close();
			
			
			
			
			
		}catch(Exception ex) {
			
		}

	}

}
