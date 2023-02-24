package com;

public class Cuenta {
	
	//objeto cuenta
	
	//Atributos
	
	private String numCuenta;
	private double saldo;
	private double saldoMin;
	private double saldoMax;
	private String tipocuenta;
	
	
	
	//constructores
	
	public Cuenta() {
	}
	
	
	
	public Cuenta(String numCuenta, double saldo, double saldoMin, double saldoMax, String tipocuenta) {
		this.numCuenta = numCuenta;
		this.saldo = saldo;
		this.saldoMin = saldoMin;
		this.saldoMax = saldoMax;
		this.tipocuenta = tipocuenta;
	}


	//setters y getters

	public String getNumCuenta() {
		return numCuenta;
	}



	public void setNumCuenta(String numCuenta) {
		this.numCuenta = numCuenta;
	}



	public double getSaldo() {
		return saldo;
	}



	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}



	public double getSaldoMin() {
		return saldoMin;
	}



	public void setSaldoMin(double saldoMin) {
		this.saldoMin = saldoMin;
	}



	public double getSaldoMax() {
		return saldoMax;
	}



	public void setSaldoMax(double saldoMax) {
		this.saldoMax = saldoMax;
	}



	public String getTipocuenta() {
		return tipocuenta;
	}



	public void setTipocuenta(String tipocuenta) {
		this.tipocuenta = tipocuenta;
	}


	//toString
	@Override
	public String toString() {
		return "Cuenta [numCuenta=" + numCuenta + ", saldo=" + saldo + ", saldoMin=" + saldoMin + ", saldoMax="
				+ saldoMax + ", tipocuenta=" + tipocuenta + "]";
	}
	
	
	
	
	
	
	
	
	
	

}
