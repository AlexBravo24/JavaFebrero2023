
public class Sucursal {
private String país;
private String ciudad;
private int número;
private String matriz;

public Sucursal () {
	
}

public Sucursal(String país, String ciudad, int número, String matriz) {
	super();
	this.país = país;
	this.ciudad = ciudad;
	this.número = número;
	this.matriz = matriz;
}

public String getPaís() {
	return país;
}

public void setPaís(String país) {
	this.país = país;
}

public String getCiudad() {
	return ciudad;
}

public void setCiudad(String ciudad) {
	this.ciudad = ciudad;
}

public int getNúmero() {
	return número;
}

public void setNúmero(int número) {
	this.número = número;
}

public String getMatriz() {
	return matriz;
}

public void setMatriz(String matriz) {
	this.matriz = matriz;
}

@Override
public String toString() {
	return "Sucursal [país=" + país + ", ciudad=" + ciudad + ", número=" + número + ", matriz=" + matriz + "]";
}

}
