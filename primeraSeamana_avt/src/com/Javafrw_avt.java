package com;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class Javafrw_avt {

	public static void main(String[] args) {
		//uso de las clases file, filereader
		//lectura y escritura de archivos
		//String linea="";
		//utilizamos un try y catch porque se va a establecer
		
		try {
		/*	File archivo=new File("C:\\Users\\hp PAvilion 15\\Desktop\\hola.txt");
			
			FileReader fr=new FileReader(hola);
			
			BufferedReader buffer =new BufferedReader(fr);
			
			while ((linea=buffer.readLine())!=null) {
				System.out.println("Linea:"+linea );
			}*/
			
			String abc ="\nabcfghi\n";
			File hola=new File ("C:\\Users\\hp PAvilion 15\\Desktop\\hola.txt");
			FileWriter linea =new FileWriter (hola, true);
			for (int i=0;i<abc.length();i++) {
				linea.write(abc.charAt(i)+ "\n");
				
			}
			linea.close();
		}catch(Exception ex) {
			
		}
	}
	

}
