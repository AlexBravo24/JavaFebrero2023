package com;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Principal {

	public static void main (String [] args) {
		//Las expresiones lambda son expresiones "anonimas" 
		//que implementan  un método definido de una interface
		//funcional 
		//Su operador es (->) y su sintaxis es (parametros) ->(cuerpo)
		
//		ICalculadora numeros = (a,b) -> {
//			int resultado= a+b;
//			System.out.println("La suma es " + resultado);
//		};
//		
//		numeros.suma(8,7);
	
//		ICalculadora nombre = () -> System.out.println("Carolina");
//		nombre.mensaje();
		
	//API STREAM - Flujo de datos 
		
		//Originalmente se delcararía de la siguiente manera:
		
//		Stream<String> nombres= Stream.of("Carolina","Saúl","Diego","Iris");
//		//Lo que hacemos es pasar el flujo de datos a una lista y colecciones 
//		//para mostrarlos posteriormente en consola 
//	    List<String> lista= nombres.collect(Collectors.toList());
//		System.out.println(lista);
//	
	
		//Creamos una lista de nuestro objeto persona
		
		List<Persona> lista = new ArrayList<Persona> ();
		
		//Creamos otra lista para que en ella podamos mostrar elementos 
		//filtrados 
		List<Persona> listaFiltrada = new ArrayList<Persona>();
		
		//Añadir elementos a la lista original
		lista.add(new Persona("Gerardo",25, "MASCULINO"));
		lista.add(new Persona("Itzel",26, "FEMENINO"));
		lista.add(new Persona("Martín",28, "MASCULINO"));
		lista.add(new Persona("Stephany",22, "FEMENINO"));
		lista.add(new Persona("Andres",25, "MASCULINO"));
		lista.add(new Persona("Eduardo",32, "MASCULINO"));
		lista.add(new Persona("Gabi",24, "FEMENINO"));

		//Mostrando en pantalla 
//		System.out.println(lista);
//		
//		//Iterar sobre cada uno de los elementos 
//		
//		
//		//Forma declarativa 
//		//Ciclo for
//		
//		for (int i=0;i<lista.size(); i++) {
//			System.out.println(lista.get(i));
//			
//		}
//	// for each
//		for( Persona i:lista) {
//			
//			System.out.println(i);
//		}
		//for each en una sola línea 
//		lista.forEach(System.out::println);
//		
		//for each genero agregarlo a una lista filtrada
//		for (Persona i: lista) {
//			if (i.getGenero().equals("MASCULINO")) {
//				listaFiltrada.add(i);
//				System.out.println(i);
//				
//			}
//		}
//		listaFiltrada.forEach(System.out::println);
//		//Forma imperativa
		//Solamente vamos solicitando lo que necesitamos
		//API Stream
		//Filtrando solo a las personas del genero femenino 
//		
//		listaFiltrada = lista.stream()
//				.filter(i -> i.getGenero()
//				.equals("FEMENINO"))
//				.collect(Collectors.toList());
//		listaFiltrada.forEach(System.out::println);
		
		
//		//Ordenar por edad ascendente 
//		listaFiltrada = lista.stream().sorted(Comparator.comparing(Persona::getEdad))
//				.collect(Collectors.toList());
//		listaFiltrada.forEach(System.out::println);
//	
//Ordenar por edad descendente
//		listaFiltrada = lista.stream().sorted(Comparator.comparing(Persona::getEdad).reversed())
//				.collect(Collectors.toList());
//		listaFiltrada.forEach(System.out::println);
		
		//Todos cumplen con una condición determinada
//		boolean todos= lista.stream().allMatch(i->i.getEdad()<30);
//		System.out.println(todos);
//		
//		//Alguno cumpla con una condición 
//		boolean alguno = lista.stream().anyMatch(i-> i.getEdad()<30);
//		System.out.println(alguno);
//		
//		//condicionar si alguno cumple con otra condición 
//		boolean alguien = lista.stream().anyMatch(i-> i.getNombre().equals("Alex"));
//		System.out.println(alguien);
//		
		
		Optional<Persona> menorEdad = lista.stream().min(Comparator.comparing(Persona::getEdad));
		System.out.println(menorEdad);
		
		//Buscar un valor que cumple varias condiciones con Optional
		
		Optional<Persona> mujerMayor = lista.parallelStream().filter(i-> i.getGenero().equals ("FEMENINO"))
				.max(Comparator.comparing(Persona::getEdad));
		mujerMayor.ifPresent(System.out::println);
	}
}

