package Clases;

public class Casa {
	
	private String Color;
	private String Tama�o;
	private String Material;
	
	
	public Casa()
	{
		
	}


	public Casa(String color, String tama�o, String material) {
		Color = color;
		Tama�o = tama�o;
		Material = material;
	}


	public String getColor() {
		return Color;
	}


	public void setColor(String color) {
		Color = color;
	}


	public String getTama�o() {
		return Tama�o;
	}


	public void setTama�o(String tama�o) {
		Tama�o = tama�o;
	}


	public String getMaterial() {
		return Material;
	}


	public void setMaterial(String material) {
		Material = material;
	}


	@Override
	public String toString() {
		return "Casa [Color=" + Color + ", Tama�o=" + Tama�o + ", Material=" + Material + "]";
	}
	
	
	

}
