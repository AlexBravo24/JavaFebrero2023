package com;

public class Producto {
	
	//Atributos
	
	private String producto;
	private int precio;
	private int cantidad;
	
	
	
	
	//CONSTRUCTORES
	
	public Producto() {
		
	}


	public Producto(String producto, int precio, int cantidad) {
		this.producto = producto;
		this.precio = precio;
		this.cantidad = cantidad;
	}


	
	//GETTERS Y SETTERS
	
	public String getProducto() {
		return producto;
	}


	public void setProducto(String producto) {
		this.producto = producto;
	}


	public int getPrecio() {
		return precio;
	}


	public void setPrecio(int precio) {
		this.precio = precio;
	}


	public int getCantidad() {
		return cantidad;
	}


	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}


	@Override
	public String toString() {
		return "Producto [producto=" + producto + ", precio=" + precio + ", cantidad=" + cantidad + "]";
	}
	
	
	
	
	
	
	
	
	

}
