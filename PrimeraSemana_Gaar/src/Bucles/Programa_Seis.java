package Bucles;
//Una persona desea invertir $1000.00 en un banco, el cual le otorga un 2% de inter�s 
//mensual. �Cu�l ser� la cantidad de dinero que esta persona tendr� al cabo de un a�o si 
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
	   System.out.print("\n\nCantidad Que Recibira En Un A�o : "+(Inversion+acum));
}
}
