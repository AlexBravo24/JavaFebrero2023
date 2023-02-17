package Com;
import java.util.Scanner;
public class Problema_8 {
    
public static void main(String[]args){

    Scanner entrada=new Scanner (System.in);

    int num1;

    int num2;

    System.out.println("ingresa el primer num");
    num1 = entrada.nextInt();

    System.out.println("ingresa el segundo num");
    
    num2 = entrada.nextInt();

        for(int i = num1; i<=num2; i++){
      
           System.out.println(+i);
         
         }

}

}
