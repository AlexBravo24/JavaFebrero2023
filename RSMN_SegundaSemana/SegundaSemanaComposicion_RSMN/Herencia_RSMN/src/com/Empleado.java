package com;

// en este ejemplo un empleado tambien es una persona
// ademas de los atributos con los que cuenta como empleado}
// esos atributos de persona, los tenemos en otra clase asi que podemos reautilizarlos

// para realizar herencia de esos atributos se hace con
//la palabra "extends" del nombre de la clase
public abstract class Empleado extends Persona {

	private int idEmpleado;
	private String puesto;
	private String rfc;
	private String horario;
	private double salario;
	
	
	// creamos el constructor vacio
	public Empleado() {
		
	}

 // constructor con todos los parametros
	// heredamos todos los atributos de la suprer clase (persona)
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
	
	// en las clases tambien podemos implementar metoos propios
	// con el modificador void indicamos que se va a realizar algo
	// pero sin que tenga que retornar un valor
	
	// metodo propio
	
	public void checarEntrada() {
		System.out.println("checando entrada 8am");
		
	}
	
	//metodo abstracto es aquel que define el QUE pero no el COMO
	// al establecer un metodo abstrato tengo que volver la clase 
	
	public abstract void trabajar();
}
