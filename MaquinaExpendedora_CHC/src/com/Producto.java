package com;

public class Producto {
	    private String id;
	    private int precio;
	    private int stock; 
	   private String desc;
	    
	    
	    public Producto(String id, int precio, String desc, int cant) {
		super();
		this.id = id;
		this.precio = precio;
		this.desc = desc;
		this.stock = cant;
	    }


		public Producto(String id, int precio, int stock, String desc) {
			super();
			this.id = id;
			this.precio = precio;
			this.stock = stock;
			this.desc = desc;
		}


		public String getId() {
			return id;
		}


		public void setId(String id) {
			this.id = id;
		}


		public int getPrecio() {
			return precio;
		}


		public void setPrecio(int precio) {
			this.precio = precio;
		}


		public int getStock() {
			return stock;
		}


		public void setStock(int stock) {
			this.stock = stock;
		}


		public String getDesc() {
			return desc;
		}


		public void setDesc(String desc) {
			this.desc = desc;
		}


		@Override
		public String toString() {
			return "Producto [id=" + id + ", precio=" + precio + ", stock=" + stock + ", desc=" + desc + "]";
		}
	
	
	
	
}
