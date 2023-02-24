package com;

//en este ejemplo, un empleado tambien es una persona
// ademas de los atributos con los que cuenta como empleado
// estos estributos de persona los tenemos en otra clase
//asi que podemos reutilizarlos



public abstract class Empleado extends Persona{
	
	private int idEmpleado;
	private String puesto;
	private String rfc;
	private String horario;
	private double salario;
	
	//constructores
	
	public Empleado() {
		
	}
	
	
	//Constructor con todos los parametros
	//heredamos los atributos de la clase padre o Superclase
	
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
	
	//en las clases podemos implementar metodos propios
	// el modificador void indica que el metodo no va a retornar un valor
	
	public void checarEntrada() {
		System.out.println("checando entrada 8am");
		
	}
	
	//metodo abstracto
	// es aquel de define el qué pero no el cómo
	
	public abstract void trabajar();
	

}
