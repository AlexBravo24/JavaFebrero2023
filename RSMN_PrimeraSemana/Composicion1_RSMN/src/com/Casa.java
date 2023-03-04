package com;

public class Casa {
	private int puertas;
	private int ventanas;
	
	
	
	private Baņos baņoPrincipal;
	private Cocina cocina;
	private Cuartos cuartoPrincipal;
	
	public Casa() {
		
	}

	public Casa(int puertas, int ventanas, Baņos baņoPrincipal, Cocina cocina, Cuartos cuartoPrincipal) {
		super();
		this.puertas = puertas;
		this.ventanas = ventanas;
		this.baņoPrincipal = baņoPrincipal;
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

	public Baņos getBaņoPrincipal() {
		return baņoPrincipal;
	}

	public void setBaņoPrincipal(Baņos baņoPrincipal) {
		this.baņoPrincipal = baņoPrincipal;
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
		return "Casa [puertas=" + puertas + ", ventanas=" + ventanas + ", baņoPrincipal=" + baņoPrincipal + ", cocina="
				+ cocina + ", cuartoPrincipal=" + cuartoPrincipal + "]";
	}

}
