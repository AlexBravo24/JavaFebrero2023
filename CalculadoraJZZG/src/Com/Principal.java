package Com;

public class Principal {

	public static void main(String[]args) {
		
		Cientifica calculadora =new Cientifica("casio","fx 2000","roja");
		
		
		int a= 3;
		int b =3;
	calculadora.sumar(3, 3);
	calculadora.restar(5, 3);
	//declaro otro metodo de multiplicar con valores de teclado 
	calculadora.multiplicar(a,b);
	//operacion con tipo de variable int
	//y lo mismo pero con 3 int , y se crea una sobre carga de argumentos
	calculadora.multiplicar();
	calculadora.multiplicar(2, 2, 2);
	
	calculadora.tomarfoto();
	}
}
