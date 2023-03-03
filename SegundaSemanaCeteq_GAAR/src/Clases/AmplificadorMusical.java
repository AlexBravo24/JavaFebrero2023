package Clases;

public class AmplificadorMusical {
	
	
	private String Marca;
	private int tama�o;
	private int Potencia;
	
	
	public AmplificadorMusical(){
		
	}


	public AmplificadorMusical(String marca, int tama�o, int potencia) {
		
		Marca = marca;
		this.tama�o = tama�o;
		Potencia = potencia;
	}


	public String getMarca() {
		return Marca;
	}


	public void setMarca(String marca) {
		Marca = marca;
	}


	public int getTama�o() {
		return tama�o;
	}


	public void setTama�o(int tama�o) {
		this.tama�o = tama�o;
	}


	public int getPotencia() {
		return Potencia;
	}


	public void setPotencia(int potencia) {
		Potencia = potencia;
	}


	@Override
	public String toString() {
		return "AmplificadorMusical [Marca=" + Marca + ", tama�o=" + tama�o + ", Potencia=" + Potencia + " Watts]";
	}
	
	

}
