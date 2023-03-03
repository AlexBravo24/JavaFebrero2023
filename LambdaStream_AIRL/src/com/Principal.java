package com;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Principal {

	public static void main(String[] args) {

		//Las expresiones Lambda son expresiones "anonimas" que implementan
		//un metodo definido de una interface funcional
		//Su operador es (->) y su sintaxis es (parametros) -> (cuerpo)
//		
//		ICalculadora numeros = (a,b) -> {
//			int resultado = a+b;
//			System.out.println("La suma es: "+(resultado));
//		};
//		numeros.suma(9,8);
		
		//API Stream - flujo de datos
		//Originalmente se declararia 
		
//		Stream<String> nombres = Stream.of("Gerardo", "Andres", "Javier");
//		//Pasar el flujo de datos a una lista y coleccionarlos
//		//Para mostrarlos en consola
//		List<String> lista = nombres.collect(Collectors.toList());
//		System.out.println(lista);
		
		//Creamos una lista de nuestro objeto Persona
		List<Persona> lista = new ArrayList<Persona>();
		//Creamos otra lista para mostrar elementos filtrados
		List<Persona> listaFiltrada = new ArrayList<Persona>();
		
		//Anadir elementos a la lista original
		lista.add(new Persona("Alma", 26, "Femenino"));
		lista.add(new Persona("Gerardo", 26, "Masculino"));
		lista.add(new Persona("Stephany", 22, "Femenino"));
		lista.add(new Persona("Martin", 25, "Masculino"));
		lista.add(new Persona("Andres", 22, "Masculino"));
		lista.add(new Persona("Eduardo", 32, "Masculino"));
		lista.add(new Persona("Gaby", 24, "Femenino"));
		
		//Mostrando en pantalla
		//System.out.println(lista);
		
		//Iterar sobre cada uno de los elementos
		//Ciclo for
//		for(int i=0; i<lista.size(); i++) {
//			System.out.println(lista.get(i));
//		}
		
//		//for each
//		for(Persona i:lista) {
//			System.out.println(i);
//		}
		
		//for each en una sola linea
		//lista.forEach(System.out::println);
		
		//for each genero agregarlo a una lista filtrada
//		for(Persona i:lista) {
//			if(i.getGenero().equals("Masculino")) {
//				listaFiltrada.add(i);
//				//System.out.println(i);
//			}
//		}
//		
//		listaFiltrada.forEach(System.out::println);
		
		//Forma imperativa
		//Solamente vamos solicitando lo que necesitamos
		//API Stream
		
		//Filtrando solo a las personas del genero femenino
//		listaFiltrada = lista.stream()
//				.filter(i -> i.getGenero()
//				.equals("Femenino"))
//				.collect(Collectors.toList());
//		listaFiltrada.forEach(System.out::println);
		
		//Ordenar por edad ascentente
//		listaFiltrada = lista.stream()
//				.sorted(Comparator.comparing(Persona::getEdad))
//				.collect(Collectors.toList());
//		
//		listaFiltrada.forEach(System.out::println);
		
		//Ordenar por edad descendente
//		listaFiltrada = lista.stream()
//				.sorted(Comparator.comparing(Persona::getEdad).reversed())
//				.collect(Collectors.toList());
//		
//		listaFiltrada.forEach(System.out::println);
		
		//Todos cumplen una condicion determinada
//		boolean todos = lista.stream().allMatch(i -> i.getEdad()<33);//si todos los valores coinciden con las condicion
//		System.out.println(todos);
		
//		//Alguno cumpla con una condicion
//		boolean alguno = lista.stream().anyMatch(i -> i.getEdad()<30);//si todos los valores coinciden con las condicion
//		System.out.println(alguno);
		
//		//Condicionar si alguno cumple con otra condicion
//		boolean alguien = lista.stream().anyMatch(i -> i.getNombre() .equals("Eduardo"));
//		System.out.println(alguien);
		
		//Retornar en opcional
//		Optional<Persona> menorEdad = lista.stream().min(Comparator.comparing(Persona::getEdad));
//		System.out.println(menorEdad);
		
		//Buscar un valor que cumpla varias condiciones
		Optional<Persona> mujerMayor = lista.stream()
				.filter(i -> i.getGenero().equals("Femenino"))
				.max(Comparator.comparing(Persona::getEdad));
		mujerMayor.ifPresent(System.out::println);
	}

}
