package Com;
import java.util.Scanner;
import javax.swing.JOptionPane;
public class Arreglo_4 {
  
    /**
     * @param args
     */
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        int arreglo[];
        int narreglo;
        
        narreglo= Integer.parseInt(JOptionPane.showInputDialog("dijite el tamaño del arreglo"));
        arreglo = new int[narreglo];
        
        for(int i= 0; i<narreglo; i++){
        System.out.print("dijite un elemento:");
        arreglo[i]= entrada.nextInt();
        
        }
        
        System.out.println("");
        System.out.println("el arreglo es:");
        for(int i =0; i< narreglo; i++){
         System.out.println(arreglo[i]);
        
        }
        System.out.println("");
        
             
                 int aux[] = new int[arreglo.length];
                  for(int i= arreglo.length -1,j =0;i >= 0;i --,j++){
                        aux[j] = arreglo[i];
                       
        }
        System.out.println("el arreglo invertido es:");     
        for(int i=0; i<aux.length; i++){           
        System.out.println(aux[i]);
}
}
}
    
