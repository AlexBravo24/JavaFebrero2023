package com;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	//las expresiones lambda son expresiones "anonimas" que implementan
		// un metodo definido de una interface funcional
		
		// su operador es (->) y su sintaxis es
		//  (parametros) -> { cuerpo }
		
		
		// con esta expresion implementamos un metodo de una interface funcional (abstracta)
			// nos ahorra crear una clase que implemente los metodos 
			// y despues instanciar el objeto en main para usar los metodos
		ICalculadora numeros = (a,b) -> System.out.println("la suma es: "+(a+b));
		
		ICalculadora numero = (a,b) -> {
			int resultado = a+b;
			System.out.println("la suma es: "+resultado);
			
		};
		
		numeros.suma(8, 7);
		
		numero.suma(10, 15);
		
		
		//API Stream - Flujo de datos
		
			// originalmente se declararia de la siguiente manera
		
//		Stream<String> nombres = Stream.of("pepe","paco","luis","jose");
		
		// lo que hacemos es pasar el flujo de datos a una lista y coleccionarlos
		// para mostrarlos posteriormente en consola
		
//		List<String> lista = nombres.collect(Collectors.toList());
//		System.out.println(lista);
		
		
		
		//cREAMOS UNA LISTA DE NUESTRO OBJETO PERSONA
		
		List<Persona> lista = new ArrayList<Persona>();
		
		//creamos otra lista para que en ella podamos mostrar elementos filtrados
		
		List<Persona> listaFiltrada = new ArrayList<Persona>();
		
		//añadir elementos a la lista original
		
		
		lista.add(new Persona("gerardo",25,"m"));
		lista.add(new Persona("itzel",26,"f"));
		lista.add(new Persona("martin",28,"m"));
		lista.add(new Persona("stephany",22,"f"));
		lista.add(new Persona("andres",25,"m"));
		lista.add(new Persona("eduardo",32,"m"));
		lista.add(new Persona("gabi",24,"f"));
		
		//mostrar en pantalla
//		System.out.println(lista);
		
		//iterar sobre cada elemento
		
			//forma declarativa
			//ciclo for
		
//		for(int i=0;i<lista.size();i++) {
//			System.out.println(lista.get(i));
//			
//		}
		
			//for each
		
//		for(Persona i:lista) {
//			System.out.println(i);
//		}
		
			//for each en una sola linea
		
//		lista.forEach(System.out::println);
		
		//for each genero agregarlo a una lista filtrada
		
//		for(Persona i : lista) {
//			if(i.getGenero().equals("m")) {
//				listaFiltrada.add(i);
//				//System.out.println(i);
//			}
//		}
//		
//		// o .foreach de listaFiltrada
//		
//		listaFiltrada.forEach(System.out::println);
//		
		
		//FORMA IMPERATIVA
			//solamente vamos solicitando lo que necesitamos
			// API Stream
		
		//filtrando solo a las personas del genero femenino
		
		
//		listaFiltrada = lista.stream() // convierte la lista en un stream
//				.filter(i -> i.getGenero()  //filtra los elementos del stream por genero
//				.equals("f")) // iguales a genero femenino
//				.collect(Collectors.toList()); // los colecta y convierte en lista
//		
//		listaFiltrada.forEach(System.out::println);
		
		
		//ordenar por edad ascendente
		
//		listaFiltrada = lista.stream()
//				.sorted(Comparator.comparing(Persona::getEdad))
//				.collect(Collectors.toList());
//		
//		listaFiltrada.forEach(System.out::println);
	
		
		//ordenar por edad descendente
//		listaFiltrada = lista.stream()
//				.sorted(Comparator.comparing(Persona::getEdad).reversed())
//				.collect(Collectors.toList());
//		
//		listaFiltrada.forEach(System.out::println);
		
		
		//Todos cumplen una condicion determinada
		
		boolean todos = lista.stream().allMatch(i -> i.getEdad()<30);
		System.out.println(todos);
		
		
		//alguno cumpla con una condicion 
		
		boolean alguno = lista.stream().anyMatch(i -> i.getEdad()<30);
		System.out.println(alguno);
		
		//ningun elemento cumple la condicion
		boolean ninguno = lista.stream().noneMatch(i -> i.getEdad()<30);
		System.out.println(ninguno);
		
		
		//retornar un optional
		
		Optional<Persona> menorEdad = lista.stream().min(Comparator.comparing(Persona::getEdad));
		System.out.println(menorEdad);
		
		
		
		//buscar un valor que cimpla con varias condiciiones con optional
		
		Optional<Persona> mujerMayor = lista.stream()
				.filter(i -> i.getGenero().equals("f"))
				.max(Comparator.comparing(Persona::getEdad));
		
		System.out.println(mujerMayor);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
