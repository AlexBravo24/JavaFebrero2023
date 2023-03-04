package com;

public class PrecioProducto {
	
	private int cantidadProducto;
	private int precioProducto;
	private int cambioDevuelto;
	private int pagarProducto;
	
	public PrecioProducto(){
		
	}

	public PrecioProducto(int cantidadProducto, int precioProducto, int cambioDevuelto, int pagarProducto) {
		super();
		this.cantidadProducto = cantidadProducto;
		this.precioProducto = precioProducto;
		this.cambioDevuelto = cambioDevuelto;
		this.pagarProducto = pagarProducto;
	}

	public int getCantidadProducto() {
		return cantidadProducto;
	}

	public void setCantidadProducto(int cantidadProducto) {
		this.cantidadProducto = cantidadProducto;
	}

	public int getPrecioProducto() {
		return precioProducto;
	}

	public void setPrecioProducto(int precioProducto) {
		this.precioProducto = precioProducto;
	}

	public int getCambioDevuelto() {
		return cambioDevuelto;
	}

	public void setCambioDevuelto(int cambioDevuelto) {
		this.cambioDevuelto = cambioDevuelto;
	}

	public int getPagarProducto() {
		return pagarProducto;
	}

	public void setPagarProducto(int pagarProducto) {
		this.pagarProducto = pagarProducto;
	}

	@Override
	public String toString() {
		return "PrecioProducto [cantidadProducto=" + cantidadProducto + ", precioProducto=" + precioProducto
				+ ", cambioDevuelto=" + cambioDevuelto + ", pagarProducto=" + pagarProducto + "]";
	}

	
	
	

}
