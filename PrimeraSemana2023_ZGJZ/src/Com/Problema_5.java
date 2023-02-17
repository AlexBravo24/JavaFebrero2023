package Com;
public class Problema_5 {
    public static void main (String[]args)throws InterruptedException{

     for(int horas=0; horas<=23; horas++){

        for(int min=0; min<=59; min++){

            for(int seg=0; seg<=59; seg++){

                System.out.println(horas+ ": "+min+" : "+seg);
                Thread.sleep(1000);

            }

        }
               if(horas == 23){
                horas= -1;
               }
     }

    }
}
