package Clases;

public class Casa {
	
	private String Color;
	private String Tamaño;
	private String Material;
	
	
	public Casa()
	{
		
	}


	public Casa(String color, String tamaño, String material) {
		Color = color;
		Tamaño = tamaño;
		Material = material;
	}


	public String getColor() {
		return Color;
	}


	public void setColor(String color) {
		Color = color;
	}


	public String getTamaño() {
		return Tamaño;
	}


	public void setTamaño(String tamaño) {
		Tamaño = tamaño;
	}


	public String getMaterial() {
		return Material;
	}


	public void setMaterial(String material) {
		Material = material;
	}


	@Override
	public String toString() {
		return "Casa [Color=" + Color + ", Tamaño=" + Tamaño + ", Material=" + Material + "]";
	}
	
	
	

}
