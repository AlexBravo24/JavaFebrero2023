package Clases;

public class Mueble {
	
	 private String tipo;
	 private String color;
	 private double tamaño;
	 
    private MATERIAL material;
	private ESTILO estilo;
	
     	 
	 public Mueble()
	 {
		 
	 }


	public Mueble(String tipo, String color, double tamaño, MATERIAL material, ESTILO estilo) {
		this.tipo = tipo;
		this.color = color;
		this.tamaño = tamaño;
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


	public double getTamaño() {
		return tamaño;
	}


	public void setTamaño(double tamaño) {
		this.tamaño = tamaño;
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
		return "Mueble [tipo=" + tipo + ", color=" + color + ", tamaño=" + tamaño + ",\nmaterial=" + material
				+ ",\nestilo=" + estilo + "]";
	}

	 
	
	 

}
