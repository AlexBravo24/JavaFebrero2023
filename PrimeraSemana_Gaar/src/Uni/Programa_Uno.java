package Uni;
import java.util.Scanner;

//. Crea un array de 10 posiciones de números con valores pedidos por teclado.
//Muestra por consola el índice y el valor al que corresponde.
public class Programa_Uno {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int num[] = new  int[10];
		
		for(int i = 0; i<10; i++)
		{
			System.out.println("Ingresa Numero "+(i+1)+" :");
			num[i]= sc.nextInt();
		}
		
		for(int i = 0; i<10; i++)   // ESTO SE AHORRA CON UN  System.out.println("VALOR DEL ARRAY  : "+Arrays.toString(num));
		{
			System.out.println((i+1 )+ " : "+ num[i]);
			
		}
		
	}

}
