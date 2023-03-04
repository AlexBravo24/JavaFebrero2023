package com;

public class Casa {
	private int puertas;
	private int ventanas;
	
	
	
	private Ba�os ba�oPrincipal;
	private Cocina cocina;
	private Cuartos cuartoPrincipal;
	
	public Casa() {
		
	}

	public Casa(int puertas, int ventanas, Ba�os ba�oPrincipal, Cocina cocina, Cuartos cuartoPrincipal) {
		super();
		this.puertas = puertas;
		this.ventanas = ventanas;
		this.ba�oPrincipal = ba�oPrincipal;
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

	public Ba�os getBa�oPrincipal() {
		return ba�oPrincipal;
	}

	public void setBa�oPrincipal(Ba�os ba�oPrincipal) {
		this.ba�oPrincipal = ba�oPrincipal;
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
		return "Casa [puertas=" + puertas + ", ventanas=" + ventanas + ", ba�oPrincipal=" + ba�oPrincipal + ", cocina="
				+ cocina + ", cuartoPrincipal=" + cuartoPrincipal + "]";
	}

}
