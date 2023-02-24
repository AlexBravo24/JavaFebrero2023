package com;

public class Juguetes {
	 private String nombre;
	  private String tama�o;
	  private double precio;
	  private String duraci�n;
	 //Declaramos objetos que tambi�n son atributos del objeto Juguete
	  private COLOR color;
	  private Mat materiales;
	  private Peso peso;
	  
	  public Juguetes () {}

	public Juguetes(String nombre, String tama�o, double precio, String duraci�n, COLOR color, Mat materiales,
			Peso peso) {
		this.nombre = nombre;
		this.tama�o = tama�o;
		this.precio = precio;
		this.duraci�n = duraci�n;
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

	public String getTama�o() {
		return tama�o;
	}

	public void setTama�o(String tama�o) {
		this.tama�o = tama�o;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public String getDuraci�n() {
		return duraci�n;
	}

	public void setDuraci�n(String duraci�n) {
		this.duraci�n = duraci�n;
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
		return "Juguetes [nombre=" + nombre + ", tama�o=" + tama�o + ", precio=" + precio + ",\n duraci�n=" + duraci�n
				+ ", color=" + color + ",\n materiales=" + materiales + ",\n peso=" + peso + "]";
	}
	  
	  
}
