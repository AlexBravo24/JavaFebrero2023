
public class Nomina {

	private int sueldo;
	private String pord�a;
	private String prestaciones;
	private double utilidades;
	private String periodo;
	
public Nomina () {
	
}

public Nomina(int sueldo, String pord�a, String prestaciones, double utilidades, String periodo) {
	super();
	this.sueldo = sueldo;
	this.pord�a = pord�a;
	this.prestaciones = prestaciones;
	this.utilidades = utilidades;
	this.periodo = periodo;
}

public int getSueldo() {
	return sueldo;
}

public void setSueldo(int sueldo) {
	this.sueldo = sueldo;
}

public String getPord�a() {
	return pord�a;
}

public void setPord�a(String pord�a) {
	this.pord�a = pord�a;
}

public String getPrestaciones() {
	return prestaciones;
}

public void setPrestaciones(String prestaciones) {
	this.prestaciones = prestaciones;
}

public double getUtilidades() {
	return utilidades;
}

public void setUtilidades(double utilidades) {
	this.utilidades = utilidades;
}

public String getPeriodo() {
	return periodo;
}

public void setPeriodo(String periodo) {
	this.periodo = periodo;
}

@Override
public String toString() {
	return "Nomina [sueldo=" + sueldo + ", pord�a=" + pord�a + ", prestaciones=" + prestaciones + ", utilidades="
			+ utilidades + ", periodo=" + periodo + "]";
}

}
