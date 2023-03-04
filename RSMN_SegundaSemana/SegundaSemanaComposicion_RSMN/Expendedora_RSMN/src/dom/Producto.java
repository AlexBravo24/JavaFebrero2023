package dom;

public class Producto {
	
	String nombre;
	public int cantidad;
	public float precio;

	public Producto(String nombre, int cantidad, float precio) {
		super();
		this.nombre = nombre;
		this.cantidad = cantidad;
		this.precio = precio;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public float getPrecio() {
		return precio;
	}

	public void setPrecio(float precio) {
		this.precio = precio;
	}

	@Override
	public String toString() {
		return "Productos [nombre=" + nombre + ", cantidad=" + cantidad + ", precio=" + precio + "]";
	}

}
