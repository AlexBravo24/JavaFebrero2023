package Com;
import java.util.Scanner;

public class Arreglo_2 {
    /**
     * @param args
     */
    public static void main(String[] args){
    Scanner entrada = new Scanner(System.in);

    int acum;
    

     int [] arreglo = new int[100];
     for(int i=0; i< 3; i++){
        arreglo[i] = i + 1;
    
    }
        System.out.println("impresion del arreglo:");
        for(int i=0; i< 3; i++){
            System.out.println(arreglo[i]);
  }

  acum =0;
  for(int y=0; y< 3; y++){
    
      acum += arreglo[y];
}
System.out.println("El resultado de la suma: "+acum);
}
}