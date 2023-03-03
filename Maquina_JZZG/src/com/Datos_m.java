package com;

public class Datos_m {

	private int num_maquina;
	private String empresa;
	private String tipo_consumo;

	public Datos_m() {}

	public Datos_m(int num_maquina, String empresa, String tipo_consumo) {
		super();
		this.num_maquina = num_maquina;
		this.empresa = empresa;
		this.tipo_consumo = tipo_consumo;
	}

	public int getNum_maquina() {
		return num_maquina;
	}

	public void setNum_maquina(int num_maquina) {
		this.num_maquina = num_maquina;
	}

	public String getEmpresa() {
		return empresa;
	}

	public void setEmpresa(String empresa) {
		this.empresa = empresa;
	}

	public String getTipo_consumo() {
		return tipo_consumo;
	}

	public void setTipo_consumo(String tipo_consumo) {
		this.tipo_consumo = tipo_consumo;
	}

	@Override
	public String toString() {
		return "Datos_m [num_maquina=" + num_maquina + ", empresa=" + empresa + ", tipo_consumo=" + tipo_consumo + "]";
	}


	

	
	
	}

	
	
	

