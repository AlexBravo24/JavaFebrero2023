package Com;
import java.util.Scanner;
public class Problema_9 {
    public static void main(String[]args){
    
    Scanner entrada=new Scanner (System.in);

    int num1;
    int num2;
    int sumap;
    int suman;

    System.out.println("ingresa el primer num");
    num1 = entrada.nextInt();

    System.out.println("ingresa el segundo num");
    num2 = entrada.nextInt();
    
    if (num2>=0 && num1>= 0){
        
    }
    else{
        System.out.println(" se detectaron num negativos");
    }

    if(num1 >= num2)
    {
    for(int i=num2; i<=num1; i++)
    {
       
        if(i % 2== 0)
        {

          System.out.println(i);  
        }
    }

    }
    else{

        for(int i=num1; i<=num2; i++)
        {
            if(i% 2==0)
            {
                
             System.out.println(i);
            }
        }
    }
}

}


