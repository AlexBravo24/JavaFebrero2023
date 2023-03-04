package com;

public abstract class Calculadora {

	//atributos son caracteristicas del objeto
	private String marca;
	private String modelo;
	private String color;
	
	
	public Calculadora() {
		
	}


	public Calculadora(String marca, String modelo, String color) {
		this.marca = marca;
		this.modelo = modelo;
		this.color = color;
	}


	public String getMarca() {
		return marca;
	}


	public void setMarca(String marca) {
		this.marca = marca;
	}


	public String getModelo() {
		return modelo;
	}


	public void setModelo(String modelo) {
		this.modelo = modelo;
	}


	public String getColor() {
		return color;
	}


	public void setColor(String color) {
		this.color = color;
	}


	// genero el metodo toString para poder visualizar en consola
	@Override
	public String toString() {
		return "Calculadora [marca=" + marca + ", modelo=" + modelo + ", color=" + color + "]";
	}
	
	//Declaro mis metodos abstractos de suma, resta multiplicacion, division
	// indico que voy a utilizar 2 variables de tipo entero dentro de los parentecis (argumentos del metodo)
	public abstract void sumar(int a, int b);
	public abstract void restar(int a, int b);
	public abstract void multiplicar(int a, int b);
	// declaro otro metodo de multiplicar, pero en este 
	// de valores por teclado
	public abstract void multiplicar();
	// en el siguiente pedire otro argumento que sera una variavle entero
	//pasa a solicitar mas argumentos, es decir una sobrecarga de argumentos
	//y tambien  al tener varios metodos con el mismo nombre, tenemos sobre carga de metodos
	//y estos al tener diferentes mecanismos podemos sobreescribirlos y tener el polimorfismo, es decir diferentes comportamientos
	public abstract void multiplicar(int a, int b, int c);
	// el polimorfismo va de la mano con la sobre carga de metodos y la sobre escritura
	
	
	public abstract void dividir(int a, int b);
	
	
	
}

