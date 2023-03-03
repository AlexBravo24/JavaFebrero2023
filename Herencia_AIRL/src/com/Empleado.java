package com;

//En este ejemplo un Empleado tambien es una persona ademas de los atributos 
//que tiene como empleado, esos atributos los tenemos en la clase Persona
//Pare realizar herencia de esos atributos
//Se hace con la palabra "extends" despues del nombre de  la clase 
public abstract class Empleado extends Persona{
	
	private int idEmpleado;
	private String puesto;
	private String rfc;
	private String horario;
	private double salario;
	
	//constructos vacio
	public Empleado() {
		
	}
	
//Constructor con todos los parametros 
	//Heredamos los atributos de la clase padre o superclase
	public Empleado(String nombre, String sexo, int edad, int idEmpleado, String puesto, String rfc, String horario,
			double salario) {
		super(nombre, sexo, edad);
		this.idEmpleado = idEmpleado;
		this.puesto = puesto;
		this.rfc = rfc;
		this.horario = horario;
		this.salario = salario;
	}

	public int getIdEmpleado() {
		return idEmpleado;
	}

	public void setIdEmpleado(int idEmpleado) {
		this.idEmpleado = idEmpleado;
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
		return "Empleado [idEmpleado=" + idEmpleado + ", puesto=" + puesto + ", rfc=" + rfc + ", horario=" + horario
				+ ", salario=" + salario + ", getNombre()=" + getNombre() + ", getSexo()=" + getSexo() + ", getEdad()="
				+ getEdad() + "]";
	}
	//En las clases tambien podemos crear o implementar metodos propios
		//con el modificador void indicamos que se va a realizar algo pero sin que nos retorne algo
		
		//metodo propio al tener un cuerpo definimos el que va a hacer
		public void checarEntrada() {
			System.out.println("Checando entrada: 8:00am");
		}
		
		//Metodo abstracto es aquel que define el QUE pero no el COMO
		//Al establecer un metodo abstracto, tengo que volver la clase abstracta
		//y las clases 
		public abstract void trabajar();
		
		
		
	

}
