package Clases;

public class Mueble {
	
	 private String tipo;
	 private String color;
	 private double tama�o;
     	 
	 public Mueble()
	 {
		 
	 }

	public Mueble(String tipo, String color, double tama�o) {
		this.tipo = tipo;
		this.color = color;
		this.tama�o = tama�o;
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

	public double getTama�o() {
		return tama�o;
	}

	public void setTama�o(double tama�o) {
		this.tama�o = tama�o;
	}

	@Override
	public String toString() {
		return "Mueble [tipo=" + tipo + ", color=" + color + ", tama�o=" + tama�o + "]";
	}
	 
	
	 

}
