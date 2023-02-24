package Clases;

public class Mueble {
	
	 private String tipo;
	 private String color;
	 private double tamaño;
     	 
	 public Mueble()
	 {
		 
	 }

	public Mueble(String tipo, String color, double tamaño) {
		this.tipo = tipo;
		this.color = color;
		this.tamaño = tamaño;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double getTamaño() {
		return tamaño;
	}

	public void setTamaño(double tamaño) {
		this.tamaño = tamaño;
	}

	@Override
	public String toString() {
		return "Mueble [tipo=" + tipo + ", color=" + color + ", tamaño=" + tamaño + "]";
	}
	 
	
	 

}
