package com;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class JavaFRW_MGAV {

	public static void main(String[] args) {
		
		//String linea = "";
		
		
		try {
//			File archivo = new File("C:\\Users\\TOSHIBA\\Desktop\\fichero.txt");
//			
//			FileReader fr = new FileReader (archivo);
//			
//			BufferedReader buffer = new BufferedReader (fr);
//			
//			//Procedemos a leer cada una de las lineas del archivo
//			//lo realizamos con un ciclo, guardando la linea en el String declarado
//			while((linea = buffer.readLine()) != null) {//asignamos el valor y mientras linea no este vacia
//				System.out.println("Linea: "+linea);
//				
//			}
			
			//Escritura en un archivo
			String abc = "\nlkfnvfdbn\n";
			File archivo = new File("C:\\Users\\TOSHIBA\\Desktop\\fichero.txt");
			FileWriter linea = new FileWriter(archivo, true);
			//creamos un ciclo para iterar sobre nuestro String caracter por caracter
			for(int i=0; i<abc.length(); i++) {
				linea.write(abc.charAt(i)+"\n");//escribimos cada caracter en una nueva linea en el archivo			
			}
			linea.close();//cerramos linea para liberar espacio en memoria
			
			
		}catch (Exception ex){
			
		}

	}

}
