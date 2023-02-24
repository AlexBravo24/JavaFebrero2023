package com;

public class Producto {
	private String producto;
	private double precio;
	private double saldo;
	private int existencia;
	
	public Producto() {
		
	}

	

	public Producto(String producto, double precio, double saldo, int existencia) {
		super();
		this.producto = producto;
		this.precio = precio;
		this.saldo = saldo;
		this.existencia = existencia;
	}


	public String getProducto() {
		return producto;
	}



	public void setProducto(String producto) {
		this.producto = producto;
	}



	public double getPrecio() {
		return precio;
	}



	public void setPrecio(double precio) {
		this.precio = precio;
	}



	public double getSaldo() {
		return saldo;
	}



	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public int getExistencia() {
		return existencia;
	}

	public void setExistencia(int existencia) {
		this.existencia = existencia;
	}



	@Override
	public String toString() {
		return "Producto [producto=" + producto + ", precio=" + precio + ", saldo=" + saldo + ", existencia="
				+ existencia + "]";
	}

	

}
