package Clases;

public class AmplificadorMusical {
	
	
	private String Marca;
	private int tamaño;
	private int Potencia;
	
	
	public AmplificadorMusical(){
		
	}


	public AmplificadorMusical(String marca, int tamaño, int potencia) {
		
		Marca = marca;
		this.tamaño = tamaño;
		Potencia = potencia;
	}


	public String getMarca() {
		return Marca;
	}


	public void setMarca(String marca) {
		Marca = marca;
	}


	public int getTamaño() {
		return tamaño;
	}


	public void setTamaño(int tamaño) {
		this.tamaño = tamaño;
	}


	public int getPotencia() {
		return Potencia;
	}


	public void setPotencia(int potencia) {
		Potencia = potencia;
	}


	@Override
	public String toString() {
		return "AmplificadorMusical [Marca=" + Marca + ", tamaño=" + tamaño + ", Potencia=" + Potencia + " Watts]";
	}
	
	

}
