
public class Sucursal {
private String pa�s;
private String ciudad;
private int n�mero;
private String matriz;

public Sucursal () {
	
}

public Sucursal(String pa�s, String ciudad, int n�mero, String matriz) {
	super();
	this.pa�s = pa�s;
	this.ciudad = ciudad;
	this.n�mero = n�mero;
	this.matriz = matriz;
}

public String getPa�s() {
	return pa�s;
}

public void setPa�s(String pa�s) {
	this.pa�s = pa�s;
}

public String getCiudad() {
	return ciudad;
}

public void setCiudad(String ciudad) {
	this.ciudad = ciudad;
}

public int getN�mero() {
	return n�mero;
}

public void setN�mero(int n�mero) {
	this.n�mero = n�mero;
}

public String getMatriz() {
	return matriz;
}

public void setMatriz(String matriz) {
	this.matriz = matriz;
}

@Override
public String toString() {
	return "Sucursal [pa�s=" + pa�s + ", ciudad=" + ciudad + ", n�mero=" + n�mero + ", matriz=" + matriz + "]";
}

}
