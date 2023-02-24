package com;

public interface Metodos {
	public void ingresarMonedas(Integer cincuentaCents, Integer unPeso, Integer dosPesos, Integer cincoPesos, Integer diezPesos);
	public boolean validarExistenciaP(String codigo);
	public void comprar(String codigo);
	public void regresarCambio(String codigo);
	public Producto buscarProducto(String codigo);
}
