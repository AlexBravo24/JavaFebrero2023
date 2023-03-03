package com;
//En este caso un empleado tmb es una persona además
// de los atributos con los que cuenta
//esos atributos de persona, los tenemos en otra clase
//así que podemos reutilizarlos

//Para realizar la herencia de esos atributos
//Se hace con  la palabra "extends" despues del nombnre de la clase
public abstract class Empleado extends Persona {
	
	private String puesto;
	private int idEmpleado;
	private String rfc;
	private String horario;
	private double salario;
	
	
	//Creamos el constrcutor vacío
	
	public Empleado () {}


	public Empleado(String nombre, String sexo, int edad, String puesto, int idEmpleado, String rfc, String horario,
			double salario) {
		super(nombre, sexo, edad);
		this.puesto = puesto;
		this.idEmpleado = idEmpleado;
		this.rfc = rfc;
		this.horario = horario;
		this.salario = salario;
	}


	public String getPuesto() {
		return puesto;
	}


	public void setPuesto(String puesto) {
		this.puesto = puesto;
	}


	public int getIdEmpleado() {
		return idEmpleado;
	}


	public void setIdEmpleado(int idEmpleado) {
		this.idEmpleado = idEmpleado;
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
		return "Empleado [puesto=" + puesto + ", idEmpleado=" + idEmpleado + ", rfc=" + rfc + ", horario=" + horario
				+ ", salario=" + salario + ", Nombre=" + getNombre() + "]";
	}
	
	
	//En las clases también podemos crear o implementar metodos propios
		//Con el modificador void indicamos que se va a realizar algo
		//pero sin que tenga que retornar un valor
		
		//Metodo propio
	public void checarEntrada () {
		
		System.out.println("Checando entrada 8am");
	}
	
	
	public abstract void trabajar ();
	
	
	

}
