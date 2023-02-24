package Clases;

public class Mueble {
	
	 private String tipo;
	 private String color;
	 private double tama�o;
	 
    private MATERIAL material;
	private ESTILO estilo;
	
     	 
	 public Mueble()
	 {
		 
	 }


	public Mueble(String tipo, String color, double tama�o, MATERIAL material, ESTILO estilo) {
		this.tipo = tipo;
		this.color = color;
		this.tama�o = tama�o;
		this.material = material;
		this.estilo = estilo;
	}


	public String getTipo() {
		return tipo;
	}


	public void setTipo(String tipo) {
		this.tipo = tipo;
	}


	public String getColor() {
		return color;
	}


	public void setColor(String color) {
		this.color = color;
	}


	public double getTama�o() {
		return tama�o;
	}


	public void setTama�o(double tama�o) {
		this.tama�o = tama�o;
	}


	public MATERIAL getMaterial() {
		return material;
	}


	public void setMaterial(MATERIAL material) {
		this.material = material;
	}


	public ESTILO getEstilo() {
		return estilo;
	}


	public void setEstilo(ESTILO estilo) {
		this.estilo = estilo;
	}


	@Override
	public String toString() {
		return "Mueble [tipo=" + tipo + ", color=" + color + ", tama�o=" + tama�o + ",\nmaterial=" + material
				+ ",\nestilo=" + estilo + "]";
	}

	 
	
	 

}
