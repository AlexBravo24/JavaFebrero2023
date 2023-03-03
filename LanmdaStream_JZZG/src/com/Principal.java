package com;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Principal {
	
	public static void main(String[]args) {
		
	//	ICalculadora numeros= (a,b)->{
	//		int resultado= a+b;
	//		System.out.println("la suma es:"+(a+b));
	//	};
	
		
	
	//numeros.suma(8, 7);
		
	//ICalculadora nombre=() ->System.out.println("zahid");
	//	nombre.mensaje();
		
		
		//Stream<String>nombres =Stream.of("Alex","Gerardo","zag");
		//List<String> Lista =nombres.collect(Collectors.toList());
		//System.out.println(Lista);
		
		List<Persona> lista = new ArrayList<Persona>();
		//creamos otra lista para que en ella podamos mostrar 
		//elementos filtrados 
		
		List<Persona>listaFiltrada= new ArrayList<Persona>();
		
		//Añadir elementos a la lista original
		
		lista.add(new Persona("Gerardo",25,"Masculino"));
		lista.add(new Persona("itzel",25,"Femenino"));
		lista.add(new Persona("estefany",20,"Femeninoo"));
		lista.add(new Persona("martin",28,"Masculino"));
		
		System.out.println(lista);
		
		//Iterar sobre cada uno de los elementos 
		
		//forma declarativa 
		//ciclo for 
//		for(int i=0;i<lista.size();i++) {
			
//			System.out.println(lista.get(i));
			
//		}
		
		//for each
//		for(Persona i: lista) {
//			
//			System.out.println(i);
//		}
		
// realiza exactamente lo mismo que el for each anterior
//		lista.forEach(System.out::println);
		
		// for each genero agregarlo a una lista filtrada
	//	for(Persona i: lista) {
		//	if(i.getGenero().equals("Masculino")) {
			//	listaFiltrada.add(i);
//			System.out.println(i);
			//}
	//	}
	//	listaFiltrada.forEach(System.out::println);
		listaFiltrada = lista.parallelStream()
				.filter(i->i.getGenero().equals("Femenino"))
				.collect(Collectors.toList());
		listaFiltrada.forEach(System.out::println);
		
		//Ordenar por la edad ascendente
//		listaFiltrada = lista.parallelStream()
//				.sorted(Comparator.comparing(Persona::getEdad))
//				.collect(Collectors.toList());
//		listaFiltrada.forEach(System.out::println);
		//ordenar en reversa 
		
//		listaFiltrada = lista.parallelStream()
//				.sorted(Comparator.comparing(Persona::getEdad).reversed())
//				.collect(Collectors.toList());
//		listaFiltrada.forEach(System.out::println);
		
	// todos cumplen una coleccion determinada 
		
		boolean todos = lista.stream().allMatch(i -> i.getEdad()<25);
		System.out.println(todos);
		
	// alguni cumpla con una condicion
		
		boolean alguno = lista.stream().anyMatch(i -> i.getEdad()<30);
		System.out.println(alguno);
		
		//condicionar si alguno cumple con otra condicion
		
		boolean alguien = lista.parallelStream().anyMatch(i ->i.getNombre().equals("Alex"));
	    System.out.println(alguien);
	    
	    //Retornar un opcional
	    
	    Optional<Persona> menorEdad = lista.stream().min(Comparator.comparing(Persona::getEdad));
	    System.out.println(menorEdad);
	    
	    //buscar un valor que cumpla varias condiciones con opcional
	    
	    Optional<Persona> mujerMayor = lista.parallelStream()
	    		.filter(i ->i.getGenero().equals("Femenino"))
	    		.max(Comparator.comparing(Persona::getEdad));
	    mujerMayor.ifPresent(System.out::println);
	}
	
	//las expresiones lamda son expresiones"anonimas"que implementan un metododefinido
	//de una interface funcional  

	
	
}
