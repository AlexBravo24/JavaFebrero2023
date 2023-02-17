package com;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class JavaFRW_JCCD {

	public static void main(String[] args) {
		
		// Uso de las clases File, FileReader, BufferedReader y FileWriter
		//Lectura y escritura de archivos
		
//		String linea = "";
		//Utilizamos un try & catch porque se va establecer una
		//comunicacion con datos externos
		try { //Vamos a intentar establecer una comunicacion para leer un archivo
//			File archivo = new File("C:\\Users\\domin\\OneDrive\\Escritorio\\fichero.txt");
//			//una vez tenemos el archivo pasamos ese valor a la clase FileReader para leer
//			FileReader fr = new FileReader(archivo); //sabe leer el archivo
//			//ahora vamos a pasarle la lectura del archivo a BufferedReader
//			//para poder leer cada una de las lineas del archivo
//			BufferedReader buffer = new BufferedReader (fr); //lee el contenido del archivo
//			//Procedemos a leer cada una de las lineas del archivo
//			//lo realizamos con un ciclo, guardando cada linea en el String declarado
//			while ((linea = buffer.readLine()) !=null) { //asignamos el valor
//				System.out.println("Linea: " + linea);
//			}
//			
			
		//Escritura en un archivo
			String abc = "\nabcdefghi\n";
			File archivo = new File ("C:\\Users\\domin\\OneDrive\\Escritorio\\fichero.txt");
			FileWriter linea = new FileWriter (archivo, true);
			//creamos un ciclo para iterar sobre nuestro String caracter
			for (int i = 0; i<abc.length(); i++) {
				linea.write(abc.charAt(i) + "\n"); //escribimos cada caracter en una nueva linea
			}
			
			linea.close();
			
		}catch(Exception ex) {
			
		}
		

	}

}
