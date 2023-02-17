package com;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class JavaFRW_MOD {

	public static void main(String[] args) {
		// Uso de clases - File, FileWriter, FileReader, BufferedReader.
		
		// Lectura y escritura de archivos.
		
		//String linea ="";
		
		// Intentar realizar la lectura de un archivo
		try {
//			//Con la clase File asignamos la ruta del archivo a representar en memoria
//			File archivo = new File("C:\\Users\\ingor\\OneDrive\\Escritorio\\Fichero.txt"); 
//			//Una vez que tenemos el archivo, pasamos ese valor a la clase FileReader para leerlo.
//			FileReader fr = new FileReader(archivo);
//			// Pasamos la lectura del archivo a la clase BufferedReader para leer cad auna de lasa lineas del archivo
//			BufferedReader buffer = new BufferedReader(fr);//lee el contenido del archivo
//			//Procedemos a leer cada linea del archivo
//			while ((linea = buffer.readLine()) != null) {//Asignamos el valor y validamos que no este vacia
//				System.out.println("Linea: " + linea);
//				
//			}
			
			// Escritura  en un archivo
			String abc = "\nabc defg hijkl\n";
			File archivo = new File("C:\\Users\\ingor\\OneDrive\\Escritorio\\Fichero.txt");
			FileWriter linea = new FileWriter(archivo, true);
			
			for (int i = 0; i < abc.length(); i++) {
				linea.write(abc.charAt(i)+"\n");// Escribimos cada caracter en una nueva linea en el archivo
			}
			linea.close();
		} catch (Exception ex) {
			
		}
	}
}
