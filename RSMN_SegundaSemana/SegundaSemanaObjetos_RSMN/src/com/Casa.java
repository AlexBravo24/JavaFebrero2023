package com;

public class Casa {

	private int ventanas;
	private int puertas;
	private int baños;
	
public Casa() {
		
	}

public Casa(int ventanas, int puertas) {
	super();
	this.ventanas = ventanas;
	this.puertas = puertas;
}

public int getVentanas() {
	return ventanas;
}

public void setVentanas(int ventanas) {
	this.ventanas = ventanas;
}

public int getPuertas() {
	return puertas;
}

public void setPuertas(int puertas) {
	this.puertas = puertas;
}

@Override
public String toString() {
	return "Casa [ventanas=" + ventanas + ", puertas=" + puertas + "]";
}


}
