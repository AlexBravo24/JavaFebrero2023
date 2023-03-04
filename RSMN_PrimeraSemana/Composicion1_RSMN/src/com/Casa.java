package com;

public class Casa {
	private int puertas;
	private int ventanas;
	
	
	
	private Baños bañoPrincipal;
	private Cocina cocina;
	private Cuartos cuartoPrincipal;
	
	public Casa() {
		
	}

	public Casa(int puertas, int ventanas, Baños bañoPrincipal, Cocina cocina, Cuartos cuartoPrincipal) {
		super();
		this.puertas = puertas;
		this.ventanas = ventanas;
		this.bañoPrincipal = bañoPrincipal;
		this.cocina = cocina;
		this.cuartoPrincipal = cuartoPrincipal;
	}

	public int getPuertas() {
		return puertas;
	}

	public void setPuertas(int puertas) {
		this.puertas = puertas;
	}

	public int getVentanas() {
		return ventanas;
	}

	public void setVentanas(int ventanas) {
		this.ventanas = ventanas;
	}

	public Baños getBañoPrincipal() {
		return bañoPrincipal;
	}

	public void setBañoPrincipal(Baños bañoPrincipal) {
		this.bañoPrincipal = bañoPrincipal;
	}

	public Cocina getCocina() {
		return cocina;
	}

	public void setCocina(Cocina cocina) {
		this.cocina = cocina;
	}

	public Cuartos getCuartoPrincipal() {
		return cuartoPrincipal;
	}

	public void setCuartoPrincipal(Cuartos cuartoPrincipal) {
		this.cuartoPrincipal = cuartoPrincipal;
	}

	@Override
	public String toString() {
		return "Casa [puertas=" + puertas + ", ventanas=" + ventanas + ", bañoPrincipal=" + bañoPrincipal + ", cocina="
				+ cocina + ", cuartoPrincipal=" + cuartoPrincipal + "]";
	}

}
