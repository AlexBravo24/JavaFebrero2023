import java.util.Scanner;

//Ahora heredaos de Calculadora con la palabra extends despu�s
//del nombre de la clase y con el nombre de la clae que vamos a 
//heredar  y posicionamos el cursor en "error" mostrado para
// 

public class Cientifica extends Calculadora implements ICamara{

	@Override
	public void sumar(int a, int b) {
		// TODO Auto-generated method stub
		System.out.println("Resultado de suma: "+ (a + b));
	}

	public Cientifica() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Cientifica(String marca, String modelo, String color) {
		super(marca, modelo, color);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void restar(int a, int b) {
		// TODO Auto-generated method stub
		
   System.out.println("El resultado de la resta es: "+ (a-b));
	}
 
	@Override
	public void multiplicar(int a, int b) {
		System.out.println("Resultado multiplicacion:" + (a*b));
		// TODO Auto-generated method stub
		
	}

	@Override
	public void dividir(int a, int b) {
		// TODO Auto-generated method stub
		System.out.println("Resultado de divisi�n: "+ (a/b));
		
	}

	@Override
	public void multiplicar() {
		int a;
		int b;
		Scanner entrada= new Scanner(System.in);
		System.out.println("Introduce el primer n�mero: ");
		a=entrada.nextInt();
		System.out.println("Introduce el segundo n�mero: ");
		b=entrada.nextInt();
		entrada.close();
		
		System.out.println("Resultado de la multiplicaci�n= " + (a*b));
		// TODO Auto-generated method stub
		
	}

	@Override
	public void multiplicar(int a, int b, int c) {
		System.out.println("Resultado de multiplicaci�n = " + (a*b*c));
		// TODO Auto-generated method stub
		
	}

	@Override
	public void tomarFoto() {
		System.out.println("Tomando una instantanea...");
		
	}
	 //IMPLEMENTACI�N DE UN M�TODO PROPIO
	public void cuadrado (int a) {
		System.out.println("Resultado del cuadrado= " + (a*a));
	}
	
	
}

