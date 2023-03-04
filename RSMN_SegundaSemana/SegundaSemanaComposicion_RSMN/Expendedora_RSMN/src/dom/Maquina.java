package dom;

import java.util.HashMap;

import com.iProducto;

public class Maquina implements iProducto {
	
	public String lugar;
	
	private HashMap<String, Producto> productos;
	
	public Maquina(String lugar, HashMap<String, Producto> productos) {
		this.lugar = lugar;
		this.productos=productos;
	}

	public String getLugar() {
		return lugar;
	}

	public void setLugar(String lugar) {
		this.lugar = lugar;
	}

	@Override
	public Producto buscarProducto(String posicion) {
		Producto p = null;
		p = this.productos.get(posicion);

		return p;
	}

	@Override
	public String tomarProducto(String posicion, int cantidad) {
		String mensaje = "";
		
		Producto p = null;
		
		p = this.productos.get(posicion);
		
		if ((p.cantidad - cantidad) > 0) {
			mensaje =  "A qui tiene " + cantidad + " de " + p.nombre;
			p.cantidad = p.cantidad - cantidad; 
		} else {
			mensaje = "El producto " + p.nombre + " no es suficiente";
		}
		
		this.productos.get(posicion).cantidad = p.cantidad;
		
		return mensaje;
	}

	@Override
	public String agregarProducto(String posicion, int cantidad) {
		String mensaje = "";
		
		Producto p = null;
		
		p = this.productos.get(posicion);
		
		if ((p.cantidad + cantidad) > 0) {
			p.cantidad = p.cantidad + cantidad; 
			mensaje =  "La cantidad del producto " + p.nombre + " cabmio a " + p.cantidad;			
		} else {
			mensaje = "El producto " + p.nombre + " no se ingresa suficiente";
		}
		
		this.productos.get(posicion).cantidad = p.cantidad;		
		
		return mensaje;
	}

	@Override
	public String moverProducto(String posicion, String posicionnueva) {
		Producto p = null;
		Producto pn = null;
		p = this.productos.get(posicion);
		pn = this.productos.get(posicionnueva);

		if(pn != null) {
			return "No cambio " + posicion;
		}else {
			this.productos.remove(posicion);
			this.productos.put(posicionnueva, p);
			return posicion + " cambio a " + posicionnueva;
		}		
				
	}
	
	
	
}
