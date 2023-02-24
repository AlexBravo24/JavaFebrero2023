package com;

//En este ejemplo , un empleado tambien es una persona
//ademas de los atributos con los que cuenta como empleado
//Esos atributos de persona, los tenemos en otra clase
//Asi como podemos reutilizarlos

//Para realizar herencia de esos atributos
//Se hace con la palabra "estends" despues del nombre de la clase

public abstract class Empleado extends Persona{

	private int idempleado;
	private String puesto;
	private String rfc;
	private String horario;
	private double salario;
	
	//Creamos el constructor vacio
	
	public Empleado() {}

	//Constructor con todos los parametros
	//Heredamos los atributos de la clase padre o superclase
	public Empleado(String nombre, String sexo, int edad, int idempleado, String puesto, String rfc, String horario,
			double salario) {
		super(nombre, sexo, edad);
		this.idempleado = idempleado;
		this.puesto = puesto;
		this.rfc = rfc;
		this.horario = horario;
		this.salario = salario;
	}

	public int getIdempleado() {
		return idempleado;
	}

	public void setIdempleado(int idempleado) {
		this.idempleado = idempleado;
	}

	public String getPuesto() {
		return puesto;
	}

	public void setPuesto(String puesto) {
		this.puesto = puesto;
	}

	public String getRfc() {
		return rfc;
	}

	public void setRfc(String rfc) {
		this.rfc = rfc;
	}

	public String getHorario() {
		return horario;
	}

	public void setHorario(String horario) {
		this.horario = horario;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	@Override
	public String toString() {
		return "Empleado [idempleado=" + idempleado + ", puesto=" + puesto + ", rfc=" + rfc + ", horario=" + horario
				+ ", salario=" + salario + ", getNombre()=" + getNombre() + ", getSexo()=" + getSexo() + ", getEdad()="
				+ getEdad() + "]";
	}
	
	//En las clases t-+ambien podemos crear o implementar metodos propios
	
	//Con el modificador void indicamos que se va a realizar algo
	//pero sin que tenga que retomar un valor
	
	//Metodo propio- al tener un cuerpo, definimos en el que se va a hacer
	public void checarEntrada() {
	System.out.println("Checando entrada 6 AM");
	}
	//Metodo abstracto - es aquel que define el QUE, pero no el COMO
	public abstract void trabajar();
	
	
}
