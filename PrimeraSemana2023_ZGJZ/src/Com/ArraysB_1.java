package Com;
import java.util.Scanner;
public class ArraysB_1 { 
    public static void main(String[] args){
Scanner entrada = new Scanner(System.in); 


String matriz [] [] = new String [4][4];

for(int fil=0; fil<4; fil++){
   for (int col=0; col<4; col++){
       System.out.println("dijita cadena ");
       matriz[fil][col]=entrada.nextLine();
  }
}

for(int fil=0; fil<4; fil++){
   for (int col=0; col<4; col++)
       System.out.print("\t"+matriz[fil][col]);
System.out.println("\n");
}
}
}