package com;

public abstract class Calculadora {

	
	//Atributos - caracteristicas de mi objeto
	private String marca;
	private String modelo;
	private String color;
	
	//Constructores vacio y con todos los parametros
	
	public Calculadora() {}

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

	@Override
	public String toString() {
		return "Calculadora [marca=" + marca + ", modelo=" + modelo + ", color=" + color + "]";
	}
	
	//Declaro mis metodos abstractos de suma, resta, multiplicacion y division
	//indico que voy a utilizar dos variables de tipo entero en mis metodos
	//y las indico dentro de los parentesis (argumentos del metodo)
	
	public abstract void sumar(int a, int b);
	public abstract void resta(int a, int b);
	public abstract void multiplicar(int a, int b);
	//Declaro otro metodo de suma pero con valores por teclado 
	public abstract void suma();
	//Y en el siguiente con el mismo nombre pedire otro argumento
	//que sera una variable de tipo entero
	//al solicitar mas argumentos, sobrepasa el metodo con los mismos
	//tambien el tener varios metodos con el mismo nombre tenemos sobrecarga de metodos
	//y al tener distintos mecanismos nos lleva al polimorfismo (diferentes comportamientos)
	public abstract void suma(int a, int c, int b);
	//El polimorfismo va de la mano con la sobrecarga de metodos, argumentos y la sobreescritura
	public abstract void dividir(int a, int b);
}
