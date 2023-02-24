package Clases;

public class Guitarra {
	
	private String marca;
	private String Color;
	private String tipo;
	
	
	public Guitarra()
	{
		
	}


	public Guitarra(String marca, String color, String tipo) {
		this.marca = marca;
		Color = color;
		this.tipo = tipo;
	}


	public String getMarca() {
		return marca;
	}


	public void setMarca(String marca) {
		this.marca = marca;
	}


	public String getColor() {
		return Color;
	}


	public void setColor(String color) {
		Color = color;
	}


	public String getTipo() {
		return tipo;
	}


	public void setTipo(String tipo) {
		this.tipo = tipo;
	}


	@Override
	public String toString() {
		return "Guitarra [marca=" + marca + ", Color=" + Color + ", tipo=" + tipo + "]";
	}
	
	

}
