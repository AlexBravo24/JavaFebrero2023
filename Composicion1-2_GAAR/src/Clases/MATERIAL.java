package Clases;

public class MATERIAL {
    
	  private String material;
	  
	  public MATERIAL() {}

	public MATERIAL(String material) {
		this.material = material;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	@Override
	public String toString() {
		return "MATERIAL [material=" + material + "]";
	}
	  
	  
	   
}
