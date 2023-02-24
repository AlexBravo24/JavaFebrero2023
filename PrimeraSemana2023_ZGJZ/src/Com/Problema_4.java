package Com;
import java.util.Scanner;
public class Problema_4 {
	
   

    public static void main(String[]args){ 
    	 String palabra = "ojo";
    System.out.println("la palabra: "+ palabra +"espalindromo?"+ espalindromo(palabra));
    
    }
    public static boolean espalindromo(String palabra){
    
         palabra =palabra.toLowerCase();
    
            for(int i= 0, j= palabra.length() -1; i <=j; i++, j--) {
        if(palabra.charAt(i) != palabra.charAt(j)){
    
    
        return false;
    }
    }
       return true;
}
}
    

