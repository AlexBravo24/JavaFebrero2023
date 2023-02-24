package com;

import java.util.HashMap;

public class MaquinaBotanas implements Metodos {
	private double pagoCliente = 0;
	private HashMap<String, Integer> monedas;
	private HashMap<String, Producto> productos;

	public MaquinaBotanas() {
	}

	public MaquinaBotanas(HashMap<String, Integer> monedas, HashMap<String, Producto> productos) {
		this.monedas = monedas;
		this.productos = productos;
	}

	// Guardamos en una variable la cantidad ingresada a la maquina
	@Override
	public void ingresarMonedas(Integer cincuentaCents, Integer unPeso, Integer dosPesos, Integer cincoPesos,
			Integer diezPesos) {
		this.pagoCliente = cincuentaCents * 0.5 + unPeso * 1 + dosPesos * 2 + cincoPesos * 5 + diezPesos * 10;
		// Agregamos las monedas en cada compartimento de la caja segun el valor
		this.monedas.put("cincuentaCents", monedas.get("cincuentaCents") + cincuentaCents);
		this.monedas.put("unPeso", monedas.get("unPeso") + unPeso);
		this.monedas.put("dosPesos", monedas.get("dosPesos") + dosPesos);
		this.monedas.put("cincoPesos", monedas.get("cincoPesos") + cincoPesos);
		this.monedas.put("diezPesos", monedas.get("diezPesos") + diezPesos);
	}

	@Override
	public boolean validarExistenciaP(String codigo) {
		boolean existeProducto = false;
		if (this.productos.containsKey(codigo)) {
			if (this.productos.get(codigo).getExistencia() > 0) {
				existeProducto = true;
			}
		}
		return existeProducto;
	}

	@Override
	public void comprar(String codigo) {
		// Validamos si el producto deseado aun sigue en existencia con el metodo
		// buscarProducto
		if (this.validarExistenciaP(codigo)) {
			// si aun hay producto verificamos si el dinero ingresado cubre el costo
			if (this.pagoCliente >= this.productos.get(codigo).getPrecio()) {
				// Se resta un producto a la existencia
				this.productos.get(codigo).setExistencia(this.productos.get(codigo).getExistencia() - 1);
				// Se regrea cambio si es que aplica
				this.regresarCambio(codigo);
			} else {
				System.out.println("Faltan $" + (this.productos.get(codigo).getPrecio() - this.pagoCliente)
						+ " para completar su compra");
			}
		} else {
			System.out.println("Producto agotado");
		}

	}

	@Override
	public void regresarCambio(String codigo) {
		int cincuentaC = 0;
		int peso = 0;
		int dos = 0;
		int cinco = 0;
		int diez = 0;
		double cambio = 0;

		//si el dinero ingresado es mayor al presio calculamos el cambio!
		if (this.pagoCliente > this.productos.get(codigo).getPrecio()) {
			cambio = this.pagoCliente - this.productos.get(codigo).getPrecio();
			System.out.println("Su cambio es de: " + cambio);
			diez = (int) cambio / 10;
			cambio = cambio % 10;
			
			if (cambio > 0) {
				cinco = (int) cambio / 5;
				cambio = cambio % 5;
				
				if (cambio > 0) {
					dos = (int) cambio / 2;
					cambio = cambio % 2;
					
					if (cambio > 0) {
						peso = (int) cambio / 1;
						cambio = cambio % 1;
						
						if (cambio > 0) {
							cincuentaC = (int) (cambio / .5);
							cambio = cambio % .5;
						}
					}
				}
			}
			System.out.println("En monedas de:\ncincuenta centavos: " + cincuentaC + " \nun peso: " + peso + " \ndos pesos: "
					+ dos + " \ncinco pesos: " + cinco + " \ndiez pesos: " + diez);
			
			// Descontamos las monedas en cada compartimento de la caja segun el valor
			this.monedas.put("cincuentaCents", monedas.get("cincuentaCents") - cincuentaC);
			this.monedas.put("unPeso", monedas.get("unPeso") - peso);
			this.monedas.put("dosPesos", monedas.get("dosPesos") - dos);
			this.monedas.put("cincoPesos", monedas.get("cincoPesos") - cinco);
			this.monedas.put("diezPesos", monedas.get("diezPesos") - diez);
			
		}
		System.out.println("Gracias por su compra!");
	}

	@Override
	public Producto buscarProducto(String codigo) {
		Producto producto= null;
		
		if (this.productos.containsKey(codigo)) {
			producto = this.productos.get(codigo);
		}
		
		return producto;
	}

}
