package com;

public class Cuenta {
	
	// crear objeto cuenta 
	//atributos de la cuenta
	
	private String numcuenta;
	private double saldo;
	private double min;
	private double max;
	private String tipocuenta;
	public Cuenta() {
			}
	public Cuenta(String numcuenta, double saldo, double min, double max, String tipocuenta) {
		
		this.numcuenta = numcuenta;
		this.saldo = saldo;
		this.min = min;
		this.max = max;
		this.tipocuenta = tipocuenta;
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
	public String getTipocuenta() {
		return tipocuenta;
	}
	public void setTipocuenta(String tipocuenta) {
		this.tipocuenta = tipocuenta;
	}
	@Override
	public String toString() {
		return "Cuenta [numcuenta=" + numcuenta + ", saldo=" + saldo + ", min=" + min + ", max=" + max + ", tipocuenta="
				+ tipocuenta + "]";
	}
	
	
	

}
