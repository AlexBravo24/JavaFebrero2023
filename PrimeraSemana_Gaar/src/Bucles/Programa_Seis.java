package Bucles;
//Una persona desea invertir $1000.00 en un banco, el cual le otorga un 2% de interés 
//mensual. ¿Cuál será la cantidad de dinero que esta persona tendrá al cabo de un año si 
//todo el dinero lo reinvierte?
public class Programa_Seis {
   public static void main(String[] args) {
	float acum=0,Inversion=1000;
	
	for(int i=1; i<=12; i++)
	{
		Inversion = Inversion + acum;
		acum= (float) (Inversion*.02);
		
		System.out.println(i+" Mes , Inversion "+Inversion+ " Interes Obtenido "+ acum);
	}
	   System.out.print("\n\nCantidad Que Recibira En Un Año : "+(Inversion+acum));
}
}
