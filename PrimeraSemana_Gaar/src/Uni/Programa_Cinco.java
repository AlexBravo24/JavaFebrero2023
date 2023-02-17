package Uni;
//Crea dos arrays, uno para mostrar n productos y otro para mostrar sus 
//respectivos precios. Muestra en consola la lista de productos y sus precios. 
//Por lo menos 5 productos o artículos
public class Programa_Cinco {
	public static void main(String[] args) {
		String vec[] = {"Jamon","Bolillo","Queso","Chorizo","Papas","Chile","Longana"};	
		int  vec2[] = {50,2,65,120,17,23,80};
		 
		for(int i=0; i<vec.length; i++)
		System.out.println("PRODUCTO : "+vec[i]+" \t PRECIO : "+vec2[i]);
		
	}

}
