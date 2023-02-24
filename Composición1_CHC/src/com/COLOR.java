package com;

public class COLOR {

	 private String tono;
	 private String mezcla;
	 private double numcolor;
	 private String aspecto;
	 
	 
	 public COLOR () {}


	public COLOR(String tono, String mezcla, double numcolor, String aspecto) {
		this.tono = tono;
		this.mezcla = mezcla;
		this.numcolor = numcolor;
		this.aspecto = aspecto;
	}


	public String getTono() {
		return tono;
	}


	public void setTono(String tono) {
		this.tono = tono;
	}


	public String getMezcla() {
		return mezcla;
	}


	public void setMezcla(String mezcla) {
		this.mezcla = mezcla;
	}


	public double getNumcolor() {
		return numcolor;
	}


	public void setNumcolor(double numcolor) {
		this.numcolor = numcolor;
	}


	public String getAspecto() {
		return aspecto;
	}


	public void setAspecto(String aspecto) {
		this.aspecto = aspecto;
	}


	@Override
	public String toString() {
		return "COLOR [tono=" + tono + ", mezcla=" + mezcla + ", numcolor=" + numcolor + ", aspecto=" + aspecto + "]";
	}
	 
	 
}
