package com;
//En este ejemplo, un empleado tambi�n es una persona
//adem�s de los atributos con los que cuenta como empleado
//Esos atributos persona, los tenemos en otra clase 
//as� que podemos reutilizarlos


//Para realizar herencia de esos atributos
//Se hace con la palabra "extends" despu�s del nombre de la clase

public abstract class Empleado extends Persona{
   private int idEmpleado;
   private String puesto;
   private String rfc;
   private String horario;
   private double salario;
   
   
   //Creamos el constructor vac�o
   public Empleado () { }

//Constructor con todos los par�metros
   //Heredamos los atributos de la clase padre o super clase

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
			+ "\n, salario=" + salario + ",\n getNombre()=" + getNombre() + ",\n getSexo()=" + getSexo() + ",\n getEdad()="
			+ getEdad() + "]";
}

//En las clases tambi�n podemos crear o implementar m�todos propios
/*Con el modificador void indicamos que se va a realizar algo
 * pero sin que tenga que retornar un valor 
 */

//M�todo propio- al tener un cuerpo definimos en �l que se va a hacer

public void checarEntrada() {
	System.out.println("Checando entrada 8 a.m.");
	
}

//M�todo abstracto - esaquel que define el QU�, pero no el c�mo 
//
//
//

public abstract void trabajar();



}
   
	

