package com;
	//Herencia
		//En esta clase un empleado tambien es una persona
		// Para realizar herencia se hace con la palabra extends despues del nombre de la clase
public abstract class Empleado extends Persona {
	
	
	
	
	//Atributos de la clase Empleado
	private int idEmpleado;
	private String puesto;
	private String rfc;
	private String horario;
	private double salario;
	
	
	public Empleado() {
		
	}

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
				+ ", salario=" + salario + ", getNombre()=" + getNombre() + "]";
	}

	//Se pueden crear metodos propios
	//El modificador void indica que el metodo realizara acciones pero no retornara ningun valor
	
	
	//metodo propio, al tener un cuerpo, se define las acciones que realizara dicho metodo
	public void checarEntrada() {
		System.out.println("Checando entrada 8:00 am");
	}
	
	
	public abstract void trabajar();
	
	//Clase abstracta define el que pero no el como
	
	

	
	
	
}
