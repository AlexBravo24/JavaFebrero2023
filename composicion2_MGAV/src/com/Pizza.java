package com;

public class Pizza {
	
	
	
	
	private String nombre;
	 private String medida;
	 private double rebanadas;
	 private String ingredienteextra;
	 private  int chica ;
	 private int mediana ;
     private int grande ;
	
	 private Mexicana mex;
	 private Hahuayana hah;

	 public Pizza() {
		
	}

	public Pizza(String nombre, String medida, double rebanadas, String ingredienteextra, int chica, int mediana,
			int grande, Mexicana mex, Hahuayana hah) {
		super();
		this.nombre = nombre;
		this.medida = medida;
		this.rebanadas = rebanadas;
		this.ingredienteextra = ingredienteextra;
		this.chica = chica;
		this.mediana = mediana;
		this.grande = grande;
		this.mex = mex;
		this.hah = hah;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getMedida() {
		return medida;
	}

	public void setMedida(String medida) {
		this.medida = medida;
	}

	public double getRebanadas() {
		return rebanadas;
	}

	public void setRebanadas(double rebanadas) {
		this.rebanadas = rebanadas;
	}

	public String getIngredienteextra() {
		return ingredienteextra;
	}

	public void setIngredienteextra(String ingredienteextra) {
		this.ingredienteextra = ingredienteextra;
	}

	public int getChica() {
		return chica;
	}

	public void setChica(int chica) {
		this.chica = chica;
	}

	public int getMediana() {
		return mediana;
	}

	public void setMediana(int mediana) {
		this.mediana = mediana;
	}

	public int getGrande() {
		return grande;
	}

	public void setGrande(int grande) {
		this.grande = grande;
	}

	public Mexicana getMex() {
		return mex;
	}

	public void setMex(Mexicana mex) {
		this.mex = mex;
	}

	public Hahuayana getHah() {
		return hah;
	}

	public void setHah(Hahuayana hah) {
		this.hah = hah;
	}

	@Override
	public String toString() {
		return "Pizza [nombre=" + nombre + ", medida=" + medida + ", rebanadas=" + rebanadas + ", ingredienteextra="
				+ ingredienteextra + ", chica=" + chica + ", mediana=" + mediana + ", grande=" + grande + ", mex=" + mex
				+ ", hah=" + hah + "]";
	}
}