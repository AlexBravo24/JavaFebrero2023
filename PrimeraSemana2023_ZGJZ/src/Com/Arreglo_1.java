package Com;
import java.util.Scanner;
import javax.swing.JOptionPane;
public class Arreglo_1 {
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

}
}