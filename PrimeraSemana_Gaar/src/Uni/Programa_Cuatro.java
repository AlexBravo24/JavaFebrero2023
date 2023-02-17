package Uni;
import java.util.Arrays;

//Dado un array de números de 5 posiciones con los siguientes valores:
//{1,2,3,4,5}. Guardar los valores de este array en otro array distinto pero con 
//los valores invertidos, es decir, que el segundo array deberá tener los valores 
//{5,4,3,2,1}
public class Programa_Cuatro {
	 public static void main(String[] args) {

		   int[] A = {1, 2, 3, 4, 5};
		   int[] B = new int[5];   
		   int z=4;
		    for(int i=0;i<5;i++){
		    	B[i] = A[z];
		    	z--;
		    	}
		      System.out.println("VALOR DEL ARRAY B : "+Arrays.toString(B));
		      System.out.println("VALOR DEL ARRAY A : "+Arrays.toString(A));

	   }
}
