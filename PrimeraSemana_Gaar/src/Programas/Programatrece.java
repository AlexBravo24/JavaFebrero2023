package Programas;
//3. Una instituci�n ben�fica recibe anualmente una donaci�n proveniente de Europa y lo reparte entre un 
//centro de salud, un comedor de ni�os y una parte lo invierte en la bolsa de acuerdo a lo siguiente:
//Si el monto de la donaci�n es de $10000 o m�s: 30% se destina al centro de salud, 50% al comedor de ni�os 
//y el resto se invierte en la bolsa.
//Si el monto de la donaci�n es menor que $10000: 25% se destina al centro de salud, 60% al comedor de 
//ni�os y el resto se invierte en la bolsa.
//La instituci�n desea saber cu�nto de dinero destinar� a cada rubro anualmente.
import java.util.Scanner;

public class Programatrece {
  public static void main(String[] args) {
	@SuppressWarnings("resource")
	Scanner sc  = new Scanner(System.in);
	int donacion;
	
	System.out.println("Ingresa El Monto De La Donacion Anual : ");
	donacion = sc.nextInt();
	
	
	if(donacion >= 10000 )
	{
	System.out.println("El total Al centro De Salud es de : "+donacion*.3+" Total Al Comedor  : "+donacion*.5 + " Total A La Bolsa "+donacion*.2);
	}
	else if(donacion < 10000 && donacion >= 1)
	{
		System.out.println("El total Al centro De Salud es de : "+donacion*.25+ " Total Al Comedor  : "+donacion*.6 + " Total A La Bolsa "+donacion*.15);
	
	}
	else
	{
		System.out.println("DATOS NO VALIDOS");

	}
	  
	  
}
}
