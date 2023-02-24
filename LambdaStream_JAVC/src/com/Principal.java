package com;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Principal {
	
	public static void main(String[] args) {
		
//		iCalculadora numeros = (a,b)-> {
//			int resultado=a+b;
//			System.out.println("La suma es" + resultado);
//		};
//				
//				
//				numeros.suma (8,7);
//		iCalculadora nombre = ()  -> System.out.println("José Andrés");
//		
//		nombre.mensaje();
//		Stream<String> nombres = Stream.of("José Andrés", "Sebastián", "Javier");
//		//Pasamos el flujo de datos a una lista y los coleccionamos 
//		//para mostrarlos en consola
//		List<String> lista = nombres.collect(Collectors.toList());
//		System.out.println(lista);
		
		
		List<Persona> lista = new ArrayList <Persona>();
		
		List<Persona> listaFiltrada = new ArrayList<Persona>();
		
		lista.add(new Persona("Andrés",25, "MASCULINO"));
		lista.add(new Persona("Itzel",26, "FEMENINO"));
		lista.add(new Persona("Martín",28, "MASCULINO"));
		lista.add(new Persona("Gerardo",25, "MASCULINO"));
		lista.add(new Persona("Stephany",22, "FEMENINO"));
		lista.add(new Persona("Gabi",22, "FEMENINO"));
		lista.add(new Persona("Eduardo",32, "MASCULINO"));
		
//		System.out.println(lista);
		
		
//		for (int i=0;i<lista.size();i++) {
//			System.out.println(lista.get(i));
//			
//		}
//		
//		
//		for(Persona i : lista) {
//			System.out.println(i);
//			
//		}
//		
//		lista.forEach(System.out::println);
////		
//		for(Persona i: lista) {
//			if(i.getGenero().equals("MASCULINO")) {
//				listaFiltrada.add(i);
////				System.out.println(i);
//			}
//		}
//		listaFiltrada.forEach(System.out::println);
		
		//Forma imperativa
		//solo vamos solicitando lo que necesitamos
		//API Stream
		
		//Filtrando sólo personas de genero femenino
//		
//		listaFiltrada = lista.stream()
//				.filter(i ->i.getGenero()
//				.equals("FEMENINO"))
//				.collect(Collectors.toList());
//		listaFiltrada.forEach(System.out::println);
//		
//		//Ordenar por edad ascendente 
//		
//		listaFiltrada = lista.stream()
//				.sorted(Comparator.comparing(Persona::getEdad))
//				.collect(Collectors.toList());
//		listaFiltrada.forEach(System.out::println);
//		
//		//ordenar por edad descendente
//		
//		listaFiltrada = lista.stream()
//				.sorted(Comparator.comparing(Persona::getEdad).reversed())
//				.collect(Collectors.toList());
//		listaFiltrada.forEach(System.out::println);
	 
		
//		//Todos cumplen una condicion determinada
//		
//		boolean todos = lista.stream()
//				.allMatch(i ->i.getEdad()<30);
//		System.out.println(todos);
//		
//		boolean alguno = lista.stream().anyMatch(i->i.getEdad()<30);
//		System.out.println(alguno);
//		
//		boolean alguien = lista.stream().anyMatch(i->i.getNombre().equals("Andrés"));
//		System.out.println(alguien);
//		
		
		
	//Retornar un opcional
		
		Optional<Persona> menorEdad = lista.stream()
				.min(Comparator.comparing(Persona::getEdad));
		System.out.println(menorEdad);
		
		//Buscar un valor que cumpla varias condiciones con Optional
		
		
		Optional<Persona> mujerMayor = lista.stream()
				.filter(i->i.getGenero().equals("FEMENINO"))
				.max(Comparator.comparing(Persona::getEdad));
		mujerMayor.ifPresent(System.out::println);
		
		
		
	}

}
