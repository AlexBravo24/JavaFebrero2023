
public class Empresa {

  private int año;
  private String nombre;
  private int empleados;
  private String sector;
  //Declaramos objetos que también son parte del atributo Empresa
  
  private Departamentos departamentos;
  private Nomina sueldos;
  private Sucursal sucursal;

  
  public Empresa () {} 
public Empresa(int año, String nombre, int empleados, String sector, Departamentos departamentos, Nomina sueldos,
		Sucursal sucursal) {
	this.año = año;
	this.nombre = nombre;
	this.empleados = empleados;
	this.sector = sector;
	this.departamentos = departamentos;
	this.sueldos = sueldos;
	this.sucursal = sucursal;
}
public int getAño() {
	return año;
}
public void setAño(int año) {
	this.año = año;
}
public String getNombre() {
	return nombre;
}
public void setNombre(String nombre) {
	this.nombre = nombre;
}
public int getEmpleados() {
	return empleados;
}
public void setEmpleados(int empleados) {
	this.empleados = empleados;
}
public String getSector() {
	return sector;
}
public void setSector(String sector) {
	this.sector = sector;
}
public Departamentos getDepartamentos() {
	return departamentos;
}
public void setDepartamentos(Departamentos departamentos) {
	this.departamentos = departamentos;
}
public Nomina getSueldos() {
	return sueldos;
}
public void setSueldos(Nomina sueldos) {
	this.sueldos = sueldos;
}
public Sucursal getSucursal() {
	return sucursal;
}
public void setSucursal(Sucursal sucursal) {
	this.sucursal = sucursal;
}
@Override
public String toString() {
	return "Empresa [año=" + año + ", nombre=" + nombre + ", empleados=" + empleados + ", sector=" + sector
			+ ",\n departamentos=" + departamentos + ",\n sueldos=" + sueldos + ",\n sucursal=" + sucursal + "]";
}

}
