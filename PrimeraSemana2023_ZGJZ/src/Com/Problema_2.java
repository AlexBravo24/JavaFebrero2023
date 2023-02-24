package Com;
import java.util.Scanner;
public class Problema_2 {

        public static void main(String[]args){       
    
        Scanner entrada = new Scanner(System.in);
    
        int n; 
        int jf;
    
        System.out.println("ingresa el primer num");
        n = entrada.nextInt();
    
        System.out.println("ingresa el segundo num a multiplicar");
        jf = entrada.nextInt();
        
        if (n > 0){
        
          for(int i = 1; i<=jf; i++){
        
             System.out.println(n+" X "+i+" = "+n*i);
           
           }
          
        }
        
            else{
        
                 System.out.println("este numero no puede ser multiplicado");
        
             }
        
            }
          
          }