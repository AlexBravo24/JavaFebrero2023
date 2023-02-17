package Bidi;

public class Programa_Dos {
  public static void main(String[] args) {
	  
	  String[][] A = {
				 {"5","x","9","4","t"},
				 {"3","z","p","c","6"},
				 {"8","3","f","i","7"}
				             };
	  String[][] B = {
				 {"7","P","4","g","8"},
				 {"5","w","Y","10","2"},
				 {"4","7","v","o","6"}
				             };
	  
	  int[][] C = new int [3][5];
	  int num=0;
	    for(int i=0; i<3; i++)
	    {
	    	for(int j=0; j<5; j++)
	    	{
	    	if (conversion(A[i][j]) == true && conversion(B[i][j]) == true) {
	            num = Integer.parseInt(A[i][j]);
	            num += Integer.parseInt(B[i][j]);
	            C[i][j] = num;
	            num=0;
	        } 
	    	else 
	    	{
	        	C[i][j] = 0;
	            num=0;
	        }
	    	}
	    }
	    
	    for(int i=0; i<3; i++)
	    {
	    	for(int j=0; j<5; j++)
	    		System.out.print(C[i][j]+"\t");
	      System.out.println("\n");
	    }
}
  
  public static boolean conversion(String cadena) {

      boolean resultado;

      try {
          Integer.parseInt(cadena);
          resultado = true;
      } catch (NumberFormatException excepcion) {
          resultado = false;
      }

      return resultado;
  }
  
}
