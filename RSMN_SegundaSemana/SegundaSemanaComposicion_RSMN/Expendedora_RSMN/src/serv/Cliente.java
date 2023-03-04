package serv;

import java.util.HashMap;

import dom.Maquina;
import dom.Producto;

public class Cliente {

	public static void main(String[] args) {
		HashMap<String, Producto> productos = new HashMap<String, Producto>();

		productos.put("A1", new Producto("Cocacola", 5, 20));
		productos.put("A2", new Producto("Fanta", 5, 18));
		productos.put("B1", new Producto("Sabritas", 10, 18));
		productos.put("B2", new Producto("Doritos", 10, 15));
		productos.put("C1", new Producto("Carlos V", 20, 15));
		productos.put("C2", new Producto("Larin", 20, 17));
		
		Maquina mq1 = new Maquina("La tienda de la esquina", productos);
		
		System.out.println(mq1.buscarProducto("A1") + "\n");
		
		System.out.println(mq1.tomarProducto("B1", 2));
		System.out.println(mq1.buscarProducto("B1")  + "\n");
		
		System.out.println(mq1.buscarProducto("B2"));
		System.out.println(mq1.agregarProducto("B2", 10)  + "\n");
		
		System.out.println(mq1.moverProducto("A1", "D1"));
		System.out.println(mq1.buscarProducto("A1"));
		System.out.println(mq1.buscarProducto("D1"));
		
	}

}
