
public class Principal {

	public static void main(String[] args) {
		//Aqu� esto es la instancia del objeto calculadora de mi clase cientifica 
		Cientifica calculadora = new Cientifica ("Casio","FX-2000","Negro") ;
		//M�todos heredados de calculadora
//		 calculadora.sumar(3, 3);
//		 calculadora.restar(5, 2);
//		calculadora.multiplicar(3, 3);
//     calculadora.multiplicar();
 //    calculadora.multiplicar(4, 5, 4);
		
		/*Las clases toman comportamientos de 3 lugares;
		 * 1. De ella misma con m�todos propios
		 * 2. De clases abstractas
		 * 3. De interfaces
		 */
		//Ejemplo de m�todo de la interface ICamara
		
     calculadora.tomarFoto();
     
     //M�todo de la clase cientifica
     calculadora.cuadrado(4);;
     
	}

}
