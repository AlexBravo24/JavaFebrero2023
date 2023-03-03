package com;

public abstract class Empleado extends Persona {
	
//	EN este ejemplo un empleado tambien es una persona 
//	Ademas de los atributos con los que cuenta una paersona
//	Esos atributos de persona los tenemos en otra clase
//	Asi que podemos Reutilizarlos
//	
//	para Realizar herencia de esos atributos 
//	se emplea la palabra extends despues de la clase
//	
	  private int id;
	  private String puesto;
	  private String rfc;
	  private String horario;
	  private double salario;
	  
	  
	  
	  public Empleado()
	  {}



	public Empleado(String nombre, String sexo, int edad, int id, String puesto, String rfc, String horario,
			double salario) {
		super(nombre, sexo, edad);
		this.id = id;
		this.puesto = puesto;
		this.rfc = rfc;
		this.horario = horario;
		this.salario = salario;
	}



	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
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
		return "Empleado [id=" + id + ", puesto=" + puesto + ", rfc=" + rfc + ", horario=" + horario + ", salario="
				+ salario + ", getNombre()=" + getNombre() + ", getSexo()=" + getSexo() + ", getEdad()=" + getEdad()
				+ "]";
	}
	  
	//METODO PROPIO 
	public void checarEntrada() {
		
		System.out.println("Checando entrada 8am");
		
	}
	 //METODO ABSTRACTO 
	
	public abstract void trabajar();
	  
	

}
