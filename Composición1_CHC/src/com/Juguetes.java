package com;

public class Juguetes {
	 private String nombre;
	  private String tamaño;
	  private double precio;
	  private String duración;
	 //Declaramos objetos que también son atributos del objeto Juguete
	  private COLOR color;
	  private Mat materiales;
	  private Peso peso;
	  
	  public Juguetes () {}

	public Juguetes(String nombre, String tamaño, double precio, String duración, COLOR color, Mat materiales,
			Peso peso) {
		this.nombre = nombre;
		this.tamaño = tamaño;
		this.precio = precio;
		this.duración = duración;
		this.color = color;
		this.materiales = materiales;
		this.peso = peso;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getTamaño() {
		return tamaño;
	}

	public void setTamaño(String tamaño) {
		this.tamaño = tamaño;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public String getDuración() {
		return duración;
	}

	public void setDuración(String duración) {
		this.duración = duración;
	}

	public COLOR getColor() {
		return color;
	}

	public void setColor(COLOR color) {
		this.color = color;
	}

	public Mat getMateriales() {
		return materiales;
	}

	public void setMateriales(Mat materiales) {
		this.materiales = materiales;
	}

	public Peso getPeso() {
		return peso;
	}

	public void setPeso(Peso peso) {
		this.peso = peso;
	}

	@Override
	public String toString() {
		return "Juguetes [nombre=" + nombre + ", tamaño=" + tamaño + ", precio=" + precio + ",\n duración=" + duración
				+ ", color=" + color + ",\n materiales=" + materiales + ",\n peso=" + peso + "]";
	}
	  
	  
}
