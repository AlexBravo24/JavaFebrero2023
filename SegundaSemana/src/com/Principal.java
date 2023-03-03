package com;

public class Principal {
			
			public static void main(String[] args) {
				
			//Instanciamos una nueva ram que formara parte de nuestra lap	
			RAM ram = new RAM("Kingston",8,2166,"DDR4");
			ALMACENAMIENTO disco = new ALMACENAMIENTO("ADATA","SSD","960 Gb",2.5);				
			PROCESADOR cpu = new PROCESADOR("RYZEN","i5",8,3600);	
			
			
	        //OBJETO COMPUESTO POR VARIAS CLASES
			Laptop lap = new Laptop("HP","ProBook",12550.90,"AZUL",ram,disco,cpu);
			
			System.out.println(lap);
			
			
			
			
			}
}
