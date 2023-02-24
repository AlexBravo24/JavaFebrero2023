package Com;

public abstract class Calculadora {
	
    private String Marca;    
	private String Modelo;
	private String color;
	
	public Calculadora() {}

	public Calculadora(String marca, String modelo, String color) {
		
		Marca = marca;
		Modelo = modelo;
		this.color = color;
	}
	
	

	public String getMarca() {
		return Marca;
	}

	public void setMarca(String marca) {
		Marca = marca;
	}

	public String getModelo() {
		return Modelo;
	}

	public void setModelo(String modelo) {
		Modelo = modelo;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	
	
	@Override
	public String toString() {
		return "Calculadora [Marca=" + Marca + ", Modelo=" + Modelo + ", color=" + color + "]";
	}
	
	
	
	public abstract void sumar(int a, int b);
	public abstract void restar(int a, int b);
	public abstract void multiplicar(int a, int b);
	public abstract void multiplicar();
	public abstract void multiplicar(int a, int b ,int c);
	public abstract void dividir(int a, int b);
	

	}
	
	

