
public class Nomina {

	private int sueldo;
	private String pordía;
	private String prestaciones;
	private double utilidades;
	private String periodo;
	
public Nomina () {
	
}

public Nomina(int sueldo, String pordía, String prestaciones, double utilidades, String periodo) {
	super();
	this.sueldo = sueldo;
	this.pordía = pordía;
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

public String getPordía() {
	return pordía;
}

public void setPordía(String pordía) {
	this.pordía = pordía;
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
	return "Nomina [sueldo=" + sueldo + ", pordía=" + pordía + ", prestaciones=" + prestaciones + ", utilidades="
			+ utilidades + ", periodo=" + periodo + "]";
}

}
