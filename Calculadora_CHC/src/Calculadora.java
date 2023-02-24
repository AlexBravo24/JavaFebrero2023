
public abstract class Calculadora {
  private String marca;
  private String modelo;
  private String color;
  // Constructor vacío y constructor con todos los parámetros 
public Calculadora () {}



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



public Calculadora(String marca, String modelo, String color) {
	super();
	this.marca = marca;
	this.modelo = modelo;
	this.color = color;
}



@Override
public String toString() {
	return "Calculadora [marca=" + marca + ", modelo=" + modelo + ", color=" + color + "]";
}
 
//Declaramos sus métodos abstractos de + - * /
// Voy a utilizar dos variables de tipo entero en mis métodos
// y las indico dentro de los parentésis (argumentos del método)


public abstract void sumar(int a, int b);
public abstract void restar(int a, int b);
//Declaro otro método de multiplicar, pero en esto
//pedire valores por teclado 
public abstract void multiplicar(int a, int b);
public abstract void multiplicar ();
//Y en el siguiente con el mismo nombre pediré otro argumento
//que será una variable de tipo entero
//Al solicitar más argumentos, sobrecargo el método con los mismos 
//Sobrecargo argumentos 
//Y también al tener varios métodos con el mismo nombre tenemos 
//sobrecarga de métodos 
//Y estos al tener diferentes mecanismos 
//podemos sobreescribirlos y tener el polimorfismo (diferentes comportamientos)
public abstract void multiplicar(int a,int b, int c);
//El polimorfismo va de la mano con la sobrecarga de argumentos
//Métodos y la sobreescritura 

public abstract void dividir(int a, int b);



}
