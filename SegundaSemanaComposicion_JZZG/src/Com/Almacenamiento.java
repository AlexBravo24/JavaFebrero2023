package Com;

public class Almacenamiento {
	
	private String marca;
	private String tipo;
	private double capacidad;
	private double Tama�oFisico;
	
	public Almacenamiento() {}

	public Almacenamiento(String marca, String tipo, double capacidad, double tama�oFisico) {
		
		this.marca = marca;
		this.tipo = tipo;
		this.capacidad = capacidad;
		this.Tama�oFisico = tama�oFisico;
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

	public double getTama�oFisico() {
		return Tama�oFisico;
	}

	public void setTama�oFisico(double tama�oFisico) {
		Tama�oFisico = tama�oFisico;
	}

	@Override
	public String toString() {
		return "Almacenamiento [marca=" + marca + ", tipo=" + tipo + ", capacidad=" + capacidad + ", Tama�oFisico="
				+ Tama�oFisico + "]";
	}
	
	
	

}