package com;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Principal {

	public static void main(String[] args) {
		
		//Lambda - La expresiones lambda son expresiones anonimas que implementan 
		//un metodo definido de una interface funcional
		//Su operador es (->) y su sintaxis es (parametros)->(cuerpo) o con llaves
		
		//Sin necesidad de hacer tantas clases
//		iCalculadora numeros = (a,b) -> {
//			int resultado = a+b;
//			System.out.println("La suma es "+ resultado);
//		};
//		numeros.suma(4,6);
		
		//Solo se ocupa una por metodo
//		iCalculadora nombre = () -> System.out.println("Gabriela");
//		nombre.mensaje();
	
	//API Stream = Flujo de datos
		
		//Originalmente se declararia de la siguiente manera
	
//	Stream <String> nombres =Stream.of("Gabi","Raul","Fernando","Lucia");
//	//Lo que hacemos es pasar el flujo de datos a una lista y coleccionarlos
//	//Para mostrarlos posteriormente en consola
//	List<String> Lista=nombres.collect(Collectors.toList());
//	System.out.println(Lista);
		
		//Crea nueva lista de nuestro objeto Persona
		List<Persona> lista=new ArrayList<Persona>();
		
		//Creamos otra lista para que en ella podamos mostrar 
		//elementos filtrados
		List<Persona> listaFiltrada =new ArrayList<Persona>();
		
		//Añadir elementos a la lista original
		lista.add(new Persona("Raul", 25, "Masculino"));
		lista.add(new Persona("Gabriela", 24, "Femenino"));
		lista.add(new Persona("Fernando", 5, "Masculino"));
		lista.add(new Persona("Lucia", 3, "Femenino"));
		
		//FORMAS DE MOSTRAR PANTALLA
		//Mostrar pantalla
//		System.out.println(lista);
		
		//Iterar sobre cada uno de los elementos
	
		//Fprma declarativa
		//Ciclo for
	//Para manera de lista
//		for(int i=0;i<lista.size();i++) {
//			System.out.println(lista.get(i));
//		}
		
		//for each
		//Forma simplificada del for para mostrar pantalla
//		for(Persona i:lista) {
//			System.out.println(i);
//		}
		
		//for each en una sola linea
//		lista.forEach(System.out::println);
//		
//		//for each genero agregarlo a una lista filtrada
//		for (Persona i: lista) {
//			if (i.getGenero().equals("Masculino"))
//				listaFiltrada.add(i);
//			System.out.println(i);
//		}
		
//		listaFiltrada.forEach(System.out::println);
		
		//Forma imperativa
		//Solamente vamos solicitando lo que necesitamos
		//API Stream
		
	//Filtrado solo a las personas del genero femenino - otra forma mas resumida
//		listaFiltrada=lista.stream()
//				.filter(i -> i.getGenero()
//				.equals("Femenino"))
//				.collect(Collectors.toList());
//		listaFiltrada.forEach(System.out::println);
	
	//Ordenar por edad ascendente 
	
//	listaFiltrada = lista.stream()
//			.sorted(Comparator.comparing(Persona::getEdad))
//			.collect(Collectors.toList());
//	listaFiltrada.forEach(System.out::println);
//		
//	//Ordenar por edad descendente
//	
//	listaFiltrada = lista.stream()
//			.sorted(Comparator.comparing(Persona::getEdad).reversed())
//			.collect(Collectors.toList());
//	listaFiltrada.forEach(System.out::println);	
		
	//Todos cumplen una condicion determinada true o false
//		//todos tienen menos de 30
//		boolean todos = lista.stream().allMatch(i -> i.getEdad()<30);
//		System.out.println(todos);
//		
//	//Alguno cumpls con una condicion
//		//Aguno es mayor a 30
//		boolean alguno = lista.stream().anyMatch(i -> i.getEdad()>30);
//		System.out.println(alguno);
//		
//		//Condicionar si alguno cumple con otra condicion true o false si esta el nombre
//		boolean alguien = lista.stream().anyMatch(i -> i.getNombre().equals("Gabi"));
//		System.out.println(alguien);
	
		//Retornar un opcional, no puede ser lista filtrada por que busca uno por uno opciones
		//Quien es el de menos edad
//	Optional<Persona> menorEdad = lista.stream().min(Comparator.comparing(Persona::getEdad));
//	System.out.println(menorEdad);
	
	//Buscar un valor que cumpla varias condiciones con Optional
	Optional<Persona> mujerMayor = lista.stream()
			.filter(i ->i.getGenero().equals("Femenino"))
			.max(Comparator.comparing(Persona::getEdad));
	mujerMayor.ifPresent(System.out::println);
	
	
	
	
	
	
	
	}
}
