package Com;

public class Almacenamiento {
	
	private String marca;
	private String tipo;
	private double capacidad;
	private double TamaņoFisico;
	
	public Almacenamiento() {}

	public Almacenamiento(String marca, String tipo, double capacidad, double tamaņoFisico) {
		
		this.marca = marca;
		this.tipo = tipo;
		this.capacidad = capacidad;
		this.TamaņoFisico = tamaņoFisico;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public double getCapacidad() {
		return capacidad;
	}

	public void setCapacidad(double capacidad) {
		this.capacidad = capacidad;
	}

	public double getTamaņoFisico() {
		return TamaņoFisico;
	}

	public void setTamaņoFisico(double tamaņoFisico) {
		TamaņoFisico = tamaņoFisico;
	}

	@Override
	public String toString() {
		return "Almacenamiento [marca=" + marca + ", tipo=" + tipo + ", capacidad=" + capacidad + ", TamaņoFisico="
				+ TamaņoFisico + "]";
	}
	
	
	

}
