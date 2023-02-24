package com;

public abstract class Calculadora {
	//Atributos = caracteristicas de mi objeto
	private String marca;
	private String modelo;
	private String color;
	
	//contructor vacio
	public Calculadora() {
		
	}
	//constructor todos parametros
	public Calculadora(String marca, String modelo, String color) {
		this.marca = marca;
		this.modelo = modelo;
		this.color = color;
	}
	
	
	//getter setter
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
	
	
	//tostring
	@Override
	public String toString() {
		return "Calculadora [marca=" + marca + ", modelo=" + modelo + ", color=" + color + "]";
	}	
	
	//metodos abstactos
	//indico que voy a utilizar dos variables en mis metodos, argumentos de mi metodo
	public abstract void sumar(int a, int b);
	public abstract void restar(int a, int b);
	
	//Metodos con el mismo nombre pero con diferentes acciones o instrucciones es polimorfismo
	public abstract void multiplicar(int a, int b);//dos numeros
	public abstract void multiplicar();//sin argumentos, se piden por teclado
	public abstract void multiplicar(int a, int b, int c);//3 numeros, al solicitar mas argumentos, sobrecargo el metodo con los mismos
	//sobrecarga de argumentos, y tambien al tener varios metodos con el mismo nombre tenemos sobrecarga de metodos
	//y estos, al tener diferente comportamiento, podemos sobreescribirlos y tener polimorfismo
	//el polimorfismo va de la mano con la sobrecarga de argumentos, sobrecarga de metosdos y la sobreescritura
	public abstract void division(int a, int b);
	
	

}
