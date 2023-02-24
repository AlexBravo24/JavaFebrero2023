package com;

public class Asientos {
	private int no_asientos;
	private String forro;
	
	public Asientos() {
		
	}

	public Asientos(int no_asientos, String forro) {
		this.no_asientos = no_asientos;
		this.forro = forro;
	}

	public int getNo_asientos() {
		return no_asientos;
	}

	public void setNo_asientos(int no_asientos) {
		this.no_asientos = no_asientos;
	}

	public String getForro() {
		return forro;
	}

	public void setForro(String forro) {
		this.forro = forro;
	}

	@Override
	public String toString() {
		return "Asientos [no_asientos=" + no_asientos + ", forro=" + forro + "]";
	}
	
	
	

}
