package com;

public class Cuenta {
	
	//Objeto cuenta
	//Atributos
	
	private String numcuenta;
	private  double saldo;
	private  double min;
	private  double max;
	private  String tipo_cuenta;
	
	public Cuenta() {}

	public Cuenta(String numcuenta, double saldo, double min, double max, String tipo_cuenta) {
		this.numcuenta = numcuenta;
		this.saldo = saldo;
		this.min = min;
		this.max = max;
		this.tipo_cuenta = tipo_cuenta;
	}

	public String getNumcuenta() {
		return numcuenta;
	}

	public void setNumcuenta(String numcuenta) {
		this.numcuenta = numcuenta;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public double getMin() {
		return min;
	}

	public void setMin(double min) {
		this.min = min;
	}

	public double getMax() {
		return max;
	}

	public void setMax(double max) {
		this.max = max;
	}

	public String getTipo_cuenta() {
		return tipo_cuenta;
	}

	public void setTipo_cuenta(String tipo_cuenta) {
		this.tipo_cuenta = tipo_cuenta;
	}

	@Override
	public String toString() {
		return "Cuenta [numcuenta=" + numcuenta + ", saldo=" + saldo + ", min=" + min + ", max=" + max
				+ ", tipo_cuenta=" + tipo_cuenta + "]";
	}
	
	
	
	
	

}
