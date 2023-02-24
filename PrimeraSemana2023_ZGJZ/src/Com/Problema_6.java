package Com;

public class Problema_6 {
    
    public static void main(String[]args){

        float fondo  =0;
        float inv    =1000;
        
        for(int i=1; i<=12; i++){ //for para declarar el año 
        
         inv=inv +fondo;
         fondo=(float)(inv * .02);
        System.out.println(i+"mes, inversion"+ inv+ "interes del"+ fondo);
        
        }
        System.out.println("el monto total anual adquirido: "+(inv+fondo));
        
        }

}

