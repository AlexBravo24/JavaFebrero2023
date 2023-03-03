package Clases;

public class Gato {
	//Atributos
	 private String nombre;
	 private int edad;
	 private double peso;
	 private	String raza;
	 
	 private COLOROJOS color;
	 private COLORPELO colorpelo;  
	
	public Gato() {
		// Consultor Vacio
	}

	public Gato(String nombre, int edad, double peso, String raza, COLOROJOS color, COLORPELO colorpelo) {
		this.nombre = nombre;
		this.edad = edad;
		this.peso = peso;
		this.raza = raza;
		this.color = color;
		this.colorpelo = colorpelo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public String getRaza() {
		return raza;
	}

	public void setRaza(String raza) {
		this.raza = raza;
	}

	public COLOROJOS getColor() {
		return color;
	}

	public void setColor(COLOROJOS color) {
		this.color = color;
	}

	public COLORPELO getColorpelo() {
		return colorpelo;
	}

	public void setColorpelo(COLORPELO colorpelo) {
		this.colorpelo = colorpelo;
	}

	@Override
	public String toString() {
		return "Gato [nombre=" + nombre + ", edad=" + edad + ", peso=" + peso + ", raza=" + raza + ",\ncolor=" + color
				+ ",\ncolorpelo=" + colorpelo + "]";
	}

	
	
       
	
	
	
	
}
