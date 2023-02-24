package com;

public class Principal {
	public static void main(String[] args) {
		Autor autor = new Autor("Dan Reynolds, Ben McKee y Daniel Platzman", "M, M, M", "35, 37, 36");
		Album album = new Album("Mercury - Act 2", "Imagine Dragons", "11 de marzo de 2022", "Rock, Alternativa/Independiente");
		
		Cancion bones = new Cancion("Bones", "02:45", "Mattman & Robin", autor, album);
		
		System.out.println(bones);
	}
}
