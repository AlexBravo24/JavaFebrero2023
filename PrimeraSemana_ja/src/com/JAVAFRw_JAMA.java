package com;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class JAVAFRw_JAMA {

	public static void main(String[] args) {
		// Uso de las clases file, filereader,bufferedreader y file write
		
		
//		String linea ="";
		//UTILIZAMOS UN TRY & CATCH POR QUE SE VA A ESTABLECER
		//UnA COMUNICACION CON DATOS EXTERNOS
		try { //Vamos a intentar establecer una comunicacion para leer un archivo
			//Con la clase file asignamos la ruta del archivo a representar en memoria
//			File archivo = new File ("C:\\Users\\Imagining wolf Movil\\Desktop\\FICHERO.txt");
//			//Una vez que tenemos el archivo pasamos ese valor a la clase file reader
//			FileReader fr = new FileReader (archivo); //Sabe leer el archivo
//			//Ahora vamos a pasarle la lectura del archivo a la clase BufferReader
//			//para poder leer una de las lineas del archivo
//			BufferedReader buffer = new BufferedReader (fr);
//			//Procedemos a leer cada una de las lineas del archivo
//			//lo realizamos con un ciclo,guardando cada linea en el string declarada linea
//			
//			while((linea = buffer.readLine()) !=null) { //Asignamos el valor y mientras la linea no este vacia
//				System.out.println("linea:"+ linea);
//			}
			
		//Escritura en un archivo
			
			String abc = "\nabcdefghi\n";
			File archivo = new File ("C:\\Users\\Imagining wolf Movil\\Desktop\\FICHERO.txt");
			FileWriter linea = new FileWriter (archivo, true);
			//Creamos un ciclo para iterar sobre nuestro String caracter por caracter
		for (int i = 0; i<abc.length(); i++) {
			linea.write (abc.charAt (i) + "\n");//escribimos cada caracter en
			
		}
			linea.close();
			
			
			
			
		}catch(Exception ex) {
			
		}

	}

}
