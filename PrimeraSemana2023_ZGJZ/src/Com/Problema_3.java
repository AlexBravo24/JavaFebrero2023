package Com;
import java.util.Scanner;
public class Problema_3 {
    
   
 public static void main(String[]args){
   
 Scanner entrada =new Scanner(System.in);

 String frase;
 char letra;
 int total=0;

 System.out.println("ingresa la frase");
 frase= entrada.nextLine();
 System.out.println("ingresa la letra");
 letra = entrada.next().charAt(0);

   for (int i =0; i< frase.length(); i++){

        if (frase.charAt(i)== letra)
       {
          total++;

       }
    
 }
 System.out.println("total de veces"+total);
}
}