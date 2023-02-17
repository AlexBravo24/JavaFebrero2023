package Bucles;

//Una persona desea invertir $700.00 en un banco, el cual le otorga un 2% de interés 
//mensual. ¿En cuántos meses tendrá más de $1500, si reinvierte cada mes todo su 
//dinero?

public class Programa_Siete {

	public static void main(String[] args) {
		float acum=0,Inversion=700;
		int c=0,i=1;
		
		
			while(i != 0)
			{
			Inversion = Inversion + acum;
			acum= (float) (Inversion*.02);
			
			System.out.println(i+" Mes , Inversion "+Inversion+ " Interes Obtenido "+ acum);
			
			if(Inversion >= 1500)
			{
				c=i;
				i=-1;
			}
			i++;
		    }
		   System.out.print("\n\n Total De Meses Para La Meta : "+c);
	}
}
