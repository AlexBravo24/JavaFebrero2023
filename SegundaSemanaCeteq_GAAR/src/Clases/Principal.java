package Clases;

public class Principal {
	
	  public static void main(String[] args) {
		  //Clase gato con su objeto gato
		Gato bolillo = new Gato("Bolillo",1,1.356,"Pura");
		Gato juno = new Gato();
		juno.setNombre("Picora");
		juno.setEdad(5);
		juno.setPeso(0.59);
		juno.setRaza("Persa");
		System.out.println(bolillo);
		System.out.println(juno);
		
        Guitarra juana = new Guitarra("Ibanez","Negro","Electrica");
        Guitarra cuca = new Guitarra();
        cuca.setMarca("Gibson");
        cuca.setColor("Azul");
        cuca.setTipo("Acustica");
        System.out.println(juana);
		System.out.println(cuca);
		
		Mueble silla = new Mueble("Reclinable","Negro",1.23);
		Mueble mesa = new Mueble();
		mesa.setTipo("Redonda");
		mesa.setColor("Rosa");
		mesa.setTamaño(2.45);
		System.out.println(silla);
		System.out.println(mesa);
		
		Casa  infonavit = new Casa("Azul","Grande 2 pisos","Cemento");
		Casa  departamento = new Casa();
		departamento.setColor("Verde");
		departamento.setTamaño("Un Solo Nivel");
		departamento.setMaterial("Tabique");
		System.out.println(infonavit);
		System.out.println(departamento);
   		
		AmplificadorMusical naranjoso = new AmplificadorMusical("Oganre",8,50);
		AmplificadorMusical resonante = new AmplificadorMusical();
		resonante.setMarca("Marshall");
		resonante.setTamaño(8);
		resonante.setPotencia(100);
		System.out.println(naranjoso);
		System.out.println(resonante);
	}

}
