package Programas;
//3. Una institución benéfica recibe anualmente una donación proveniente de Europa y lo reparte entre un 
//centro de salud, un comedor de niños y una parte lo invierte en la bolsa de acuerdo a lo siguiente:
//Si el monto de la donación es de $10000 o más: 30% se destina al centro de salud, 50% al comedor de niños 
//y el resto se invierte en la bolsa.
//Si el monto de la donación es menor que $10000: 25% se destina al centro de salud, 60% al comedor de 
//niños y el resto se invierte en la bolsa.
//La institución desea saber cuánto de dinero destinará a cada rubro anualmente.
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
