package Com;
public class Problema_7 {
    
    public static void main(String[]args){

float fondo=0;
float inv= 700;
int mes=0,i=1;


while(i != 0){

    inv = inv + fondo;
    fondo=(float) (inv* .02);
     System.out.println(i+"mes, inversion"+ inv+ "interes del"+ fondo);

     if(fondo >= 1500){
       
        mes=i;
        i=-1;
        }
            i++;
        }

        System.out.println("el total de meses requeridos son:"+mes);

     }
}


    

