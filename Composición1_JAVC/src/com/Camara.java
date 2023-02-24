package com;

public class Camara {
	
	private String camaras;
	private int megapixeles;
	private String lente1;
	private String lente2;
	
	public Camara () {
		
	}

	public Camara(String camaras, int megapixeles, String lente1, String lente2) {
		super();
		this.camaras = camaras;
		this.megapixeles = megapixeles;
		this.lente1 = lente1;
		this.lente2 = lente2;
	}

	public String getCamaras() {
		return camaras;
	}

	public void setCamaras(String camaras) {
		this.camaras = camaras;
	}

	public int getMegapixeles() {
		return megapixeles;
	}

	public void setMegapixeles(int megapixeles) {
		this.megapixeles = megapixeles;
	}

	public String getLente1() {
		return lente1;
	}

	public void setLente1(String lente1) {
		this.lente1 = lente1;
	}

	public String getLente2() {
		return lente2;
	}

	public void setLente2(String lente2) {
		this.lente2 = lente2;
	}

	@Override
	public String toString() {
		return "Camara [camaras=" + camaras + ", megapixeles=" + megapixeles + ", lente1=" + lente1 + ", lente2="
				+ lente2 + "]";
	}
	
	
	
	
	
	
	
	

}
