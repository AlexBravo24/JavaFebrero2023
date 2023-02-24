package Com;
import java.util.Scanner;
public class Problema {
    public static void main(String[]args){       

    Scanner entrada = new Scanner(System.in);

    int n; 
    int jf;

    System.out.println("ingresa el numero de la tabla que desees");
    n = entrada.nextInt();

    if (n > 0){
    
      for(int i = 1; i<=10; i++){
    
         System.out.println(n+" X "+i+" = "+n*i);
       
       }
      
    }
    
        else{
    
             System.out.println("este numero no puede ser multiplicado");
    
         }
    

}
    }

