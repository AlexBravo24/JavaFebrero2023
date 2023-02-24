package com;

import java.io.ObjectInputStream.GetField;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@SuppressWarnings("unused")
public class Principal {
	
	public static void main(String[] args) {
		
		//las expresiones lambda son expresiones anonimas que implementan 
		//un metodo definido de una interface funcional
		//Su operador es (->) y su sintaxis es (parametros)->(Cuerpo)
		
		
		//ICalculadora numeros = (a,b) -> System.out.println("La suma es :"+ (a+b));
		
		
//		ICalculadora numeros = (a,b) -> {
//			System.out.println("La suma es :"+ (a+b));
//			System.out.println("La resta es :"+ (a-b));
//			System.out.println("La division es :"+ (a/b));
//			System.out.println("La multiplicacion :"+ (a*b));
//		};
//		
//		
//		numeros.operacion(14,5);
		
		
		
		// API STREAM - flujo de datos 
		
		//declaran de la siguiente manera
		
//		Stream<String> nombres = Stream.of("alex","gerardo","itzel","andres");
//		List<String> lista = nombres.collect(Collectors.toList());
//		System.out.println(lista);
		
		
		//creamos una lista de nuestro objeto persona 
		List<Persona> lista = new ArrayList<Persona>();
		//Creamos otra lista que en ella podramos mostrar 
		//Elementos filtrados
		
		List<Persona> listaFiltrada = new ArrayList<Persona>();
		
		//Añadir elementos a la lista Original
		
		lista.add(new Persona("GERARDO",25,"MASCULINO"));
		lista.add(new Persona("ITZEL",26,"FEMENINO"));
		lista.add(new Persona("MARTIN",28,"MASCULINO"));
		lista.add(new Persona("STEPHANY",22,"FEMENINO"));
		lista.add(new Persona("ANDRES",25,"MASCULINO"));
		lista.add(new Persona("EDUARDO",32,"MASCULINO"));
		lista.add(new Persona("GABI",24,"FEMENINO"));
		lista.add(new Persona("EDUARDO",22,"MASCULINO"));
		
		//MOSTRANDO EN PANTALLA
		//System.out.println(lista);	
		
		//ITERAR SOBRE CADA UNO DE LOS ELEMENTOS
		
//		for(int i=0; i<lista.size(); i++)
//		{
//			System.out.println(lista.get(i));	
//		}
		
		//for each
		
//		for (Persona i: lista)
//		{
//			System.out.println(i);
//		}
//		
		//for each en una sola linea
		//lista.forEach(System.out::println);
		
		//for each generos
		
//		  for(Persona i: lista)
//		  {
//			  if(i.getGenero().equals("MASCULINO"))
//			  {
//			  listaFiltrada.add(i);
//			 // System.out.println(i);
//			  }
//		  }
//		
		  //listaFiltrada.forEach(System.out::println);
		  
		

		  
		  //forma imperativa para solicitar lo que necesitamos 
		
//		  listaFiltrada = lista.stream()
//				  .filter(i -> i.getGenero()
//				  .equals("FEMENINO"))
//				  .collect(Collectors.toList());
//		  
//		  listaFiltrada.forEach(System.out::println);
		  
		  //ORDENAR POR EDAD ASCENDENTE
		  
//		  listaFiltrada = lista.stream().sorted(Comparator.comparing(Persona::getEdad)).collect(Collectors.toList());
//		  listaFiltrada.forEach(System.out::println);
		  
 //ORDENAR POR EDAD DESCENDENTE
		  
//		  listaFiltrada = lista.stream()
//				  .sorted(Comparator.comparing(Persona::getEdad).reversed())
//				  .collect(Collectors.toList());
//		  listaFiltrada.forEach(System.out::println);
		
		
		//Valor Boleano (Todos cumplen una condicion determinada)
//		boolean todos = lista.stream().allMatch(i -> i.getEdad()<30);
//		System.out.println(todos);
		
		//Alguno cmpla con una condicion 
//		boolean alguno = lista.stream().anyMatch(i -> i.getEdad()<30);
//		System.out.println(alguno);
		  
		//Condicion si alguno cumple otra condicion
		
		boolean alguien = lista.stream().anyMatch(i -> i.getNombre().equals("GERARDO"));
		System.out.println(alguien);
		
		//Retornar un opcional
		
		
		Optional<Persona> menorEdad  = lista.stream().min(Comparator.comparing(Persona::getEdad));
		System.out.println(menorEdad);
		
		//Cumpla varias Condiciones
		
		Optional<Persona> mujerMayor  = lista.stream()
				.filter(i -> i.getGenero().equals("FEMENINO"))
				.max(Comparator.comparing(Persona::getEdad));
		System.out.println(mujerMayor);
		
		
	}
	
	

}
