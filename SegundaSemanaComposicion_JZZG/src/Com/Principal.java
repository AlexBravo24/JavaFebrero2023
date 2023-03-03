package Com;

public class Principal {

	public static void main(String[] args) {
		
	// instanciamos una nueva ram que formara parte de nuestra laptop
		
		RAM ram=new RAM("Kingston",8,2166,"DDR4");
		
    // instanciamos un nuevo disco que forma parte de nuestra laptop
		
		Almacenamiento disco=new Almacenamiento("WesternDigital","SSD",960,2);
		
	// instanciamos nuestro procesador que formara nuestra laptop
		Procesador cpu=new Procesador("Ryzen","i5",8,3);
		
	// instanciamos nuestra laptop
		Laptop lap=new Laptop("Asus","vivoBOOK",12550,"roja",ram,disco,cpu);
		
		System.out.println(lap);
		System.out.println(cpu);
		System.out.println(disco);
		
		
		
	}
	
	

}
