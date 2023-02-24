package com;

import java.io.ObjectInputStream.GetField;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Principal  {
	public static void main(String[] args) {
		//Las expresiones lambsa son funciones "anónimas" que implementan 
		//un metodo definido de una interface funcional
		//su operador es el siguiente (->)
		//sintáxis (parametros)->{cuerpo}
		
//		ICalculadora numeros = (a,b) -> {
//			int resultado=a+b;
//			System.out.println("La suma es " + resultado);
//		};
//		numeros.suma(8, 7);
//		
//		//Uso del API Stream - flujo de datos
//		
//		//declaracion
//		
//		Stream<String> nombres = Stream.of("Alex", "Gerardo","Itzel","Aaron");
//		
//		//Pasamos el flujo de datos a una lista y colecionarlos para mostrarlos posteriormente en consola
//		List<String> lista = nombres.collect(Collectors.toList());
//		System.out.println(lista);
//		
		//Creamos una lista de Personas
		List<Persona> lista= new ArrayList<Persona>();
		
		//Creamos otra lista para mostrar n elementos filtrados
		List<Persona> listaFiltrada= new ArrayList<Persona>();
		
		//Añadimos elementos a la lista 
		lista.add(new Persona("Gerardo", 25, "Masculino"));
		lista.add(new Persona("Itzel", 26,"Femenino"));
		lista.add(new Persona("Martin", 28, "Masculino"));
		lista.add(new Persona("Stephany", 22, "Femenino"));
		lista.add(new Persona("Andres", 25, "Masculino"));
		lista.add(new Persona("Eduardo", 32, "Masculino"));
		lista.add(new Persona("Gabi", 24, "Femenino"));
		
		//Mostrando en pantalla
//		System.out.println(lista);
		
		//ITERAR SOBRE CADA UNO DE LOS ELEMENTOS
		//mediante un foreach
//		for (Persona persona : lista) {
//			System.out.println(persona);
//		}
//		
//		//mediante un for
//		for (int i = 0; i < lista.size(); i++) {
//			System.out.println(lista.get(i));
//		}
//		
		//foreach en una sola linea
//		lista.forEach(System.out::println);
		
		//for each genero agregarlo a una lista filtrada
//		for (Persona persona : lista) {
//			if(persona.getGenreo().equals("Masculino")) {
//				listaFiltrada.add(persona);
//				System.out.println(persona);
//			}
//		}
		
		//Forma imperativa
		//	Solamente vamos solicitando lo que necesitamos
		//	API Stream
//		listaFiltrada = lista.stream().filter(i-> i.getGenreo().equals("Femenino")).collect(Collectors.toList());
//		
//		listaFiltrada.forEach(System.out::println);
//		
//		//Ordenar poredad acendente
//		listaFiltrada = lista.stream().sorted(Comparator.comparing(Persona::getEdad)).collect(Collectors.toList());
//		
//		//ordenar por nombre
//		listaFiltrada = lista.stream().sorted(Comparator.comparing(Persona::getNombre)).collect(Collectors.toList());
//		
//		listaFiltrada.forEach(System.out::println);
		
//		//Ordenar por edad pero descendente
//		listaFiltrada = lista.stream().sorted(Comparator.comparing(Persona::getEdad).reversed()).collect(Collectors.toList());
//		listaFiltrada.forEach(System.out::println);
	
		//Evaluar si todos cumplen una condicion determinada
		boolean todos = lista.stream().allMatch(i -> i.getEdad()<30);
		System.out.println(todos);
		
		//Si solo alguno cumpla con una condicion
		boolean alguno = lista.stream().anyMatch(i -> i.getEdad()<30);
		System.out.println(alguno);
		
		//Condicionar  algunocumple con otra condicion
		boolean alguien = lista.stream().anyMatch(i->i.getNombre().equals("Martin"));
		System.out.println(alguien);
		
		//Retornar un opcional - en este caso el valor mas bajo
		Optional<Persona> menorDeEdad = lista.stream().min(Comparator.comparing(Persona::getEdad));
		System.out.println(menorDeEdad);
		
		//Retornar un valor que cumpla varias condiciones
		Optional<Persona> mujerMayor = lista.stream().filter(i->i.getGenreo().equals("Femenino")).max(Comparator.comparing(Persona::getEdad));
		mujerMayor.ifPresent(System.out::println);
	}
}
