
public class Principal {

	public static void main(String[] args) {
		//Aquí esto es la instancia del objeto calculadora de mi clase cientifica 
		Cientifica calculadora = new Cientifica ("Casio","FX-2000","Negro") ;
		//Métodos heredados de calculadora
//		 calculadora.sumar(3, 3);
//		 calculadora.restar(5, 2);
//		calculadora.multiplicar(3, 3);
//     calculadora.multiplicar();
 //    calculadora.multiplicar(4, 5, 4);
		
		/*Las clases toman comportamientos de 3 lugares;
		 * 1. De ella misma con métodos propios
		 * 2. De clases abstractas
		 * 3. De interfaces
		 */
		//Ejemplo de método de la interface ICamara
		
     calculadora.tomarFoto();
     
     //Método de la clase cientifica
     calculadora.cuadrado(4);;
     
	}

}
