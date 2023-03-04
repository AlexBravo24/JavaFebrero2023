package com;

import java.util.HashMap;

public class Precio implements Metodos {

	private String maquina;

	private HashMap<String, Producto> producto;

	private int folio = 0;

	public Precio() {

	}

	public Precio(String sucursal, HashMap<String, Producto> cuentas) {

		this.maquina = sucursal;
		this.producto = cuentas;
	}

	@Override
	public Producto buscarProducto(int folioProduto) {
		// TODO Auto-generated method stub
		
		Producto cuenta = null; // instanciando un objeto cuenta
		
		// identificar la cuenta sobre la cual vamos a realizar operaciones 
		//buscamos dentro del conjunto de llaves al hasmap
		
		for(String i:this.cuentas.keySet()) {// iteramos sobre cada llave del objetocuenta
			// una ves que recorrimos las cuentas , si una de ellas es igual al nombredel
			// que queremos buscar
			if (i.contentEquals(nombreCliente)) {
				cuenta = this.cuentas.get(i); // entonces nuestros objetos = null, toma el valor
				//de la cuenta localizada
				
				break; // rompo el ciclo de busqueda
			}
		return null;
	}

	@Override
	public PrecioProducto pagarProducto(int pagarProducto, double monto) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public PrecioProducto devolverCambio(int cambioProducto, double monto) {
		// TODO Auto-generated method stub
		return null;
	}

}
