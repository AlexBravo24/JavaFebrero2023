package com;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Principal {
	
	public static void main(String[] args) {
	// las expreciones lambda son expreciiones "anonimas" que implementan
		//un metododo definido d euna interface funcional
		//su operador es (->) y su sintaxis son (los parametros)->(cuerpo)
		
		//ICalculadora numeros=(a,b) -> System.out.println("La suma es" + (a+b));
		
		//numeros.sumas(5, 7);
		//API Stream - flujo de datos
		//originalmente e declara de la  sigiente manera
		//Stream<String>nombres = Stream.of("Alex","martin","Andres");
		//loque hacmos es pasar el flujo de datos a una lista y coleccionarlos
		//para mostrarlos postarior mente
		//List<String>lista= nombres.collect(Collectors.toList());
		//System.out.println(lista);
		
		//creamos una lisa de objeto persona
		List<Persona> lista= new ArrayList<Persona>();
		
		//creamos otra lista para que en ella podamos mostrar
		//elemento filtrados
		List<Persona>listaFiltrada= new ArrayList<Persona>();
		//añadir elemenos a la lista original
		lista.add(new Persona("Gerardo",25, "masculino"));
		lista.add(new Persona("Itzel",26, "femenino"));
		lista.add(new Persona("Martin",28, "masculino"));
		lista.add(new Persona("StephanY",22, "femenino"));
		lista.add(new Persona("Andres",25, "masculino"));
		lista.add(new Persona("Eduardo",32, "masculino"));
		lista.add(new Persona("Gabi",24, "femenino"));
		
		//motraos pantalla
		//System.out.println(lista);
		
		
		//iterar cada uno de los elemtos
		//forma delarativa 
		//con ciclo for
		
		//for(int i=0;i<lista.size();i++) {
		//		System.out.println(lista.get(i));}
		
		//for each
		
		//for (Persona i:lista) {
	//		System.out.println(i);}
		
		//for each en una sola linea
		//lista.forEach(System.out::println);
		
		//for each genero agregarlo a una lista filtrada
		//for (Persona i:lista) {
			//if(i.getGenero().equals("masculino")) {
				//listaFiltrada.add(i);
				//System.out.println(i);
		//lista.forEach(System.out::println);
			//}}
		
		
		
		//foma imperactiva 
		//sola ment vamos solicitando lo que necesitamos
		//API Stream
		//filtrando solo a las perosnas del genero femenino
		
		//listaFiltrada = lista.stream()
			//	.filter(i-> i.getGenero()
				//.equals("femenino"))
				//.collect(Collectors.toList());
		//listaFiltrada.forEach(System.out::println);
		
		//ordenar por edad asendente
	//	listaFiltrada = lista.stream()
		//		.sorted(Comparator.comparing(Persona::getEdad))
			//	.collect(Collectors.toList());
	//	listaFiltrada.forEach(System.out::println);
		
		//por edad decendente
	//	listaFiltrada = lista.stream()
				//.sorted(Comparator.comparing(Persona::getEdad).reversed())
			//	.collect(Collectors.toList());
		//listaFiltrada.forEach(System.out::println);
		
		
		//todos cmplen con una condicion determnada
		
		//	boolean todos= lista.stream().allMatch(i-> i.getEdad()<33);
		//	System.out.println(todos);
		
		//alguno cumpla con una condicion
		//boolean alguno= lista.stream().anyMatch(i-> i.getEdad()<30);
		//System.out.println(alguno);
		
		//condicionar si alguno cumple con otra condicion
		
		//	boolean alguien= lista.stream().anyMatch(i-> i.getNombre().equals("Eduardo"));
	//	System.out.println(alguien);
		
		
		
		//retornar opcional
		
		Optional<Persona> menorEdad = lista.stream()
				.min(Comparator.comparing(Persona::getEdad));
		System.out.println(menorEdad);
		
		//busca un valor que cumpla con varas condicione con optional
		Optional<Persona> mujerMayor= lista.stream()
				.filter(i -> i.getGenero().equals("femenino"))
				.max(Comparator.comparing(Persona::getEdad));
		mujerMayor.ifPresent(System.out::println);
		
		}
		
		}
		
		
				



