
package Prog_C;

import java.util.Scanner;

public class Problema_9 {
	
	
public static void main(String[]args) {

Scanner entrada = new Scanner(System.in);

int x;
x=0;

System.out.println("Introduce un num para saber que dia es:\n");
x = entrada.nextInt();		   

if (x >= 8){
	
	System.out.println("error:\n");
}

switch(x)
{
case 0:
{
  System.out.println("null ");
  break;
}


case 1:
{
  System.out.println("El dia es lunes ");
  break;
}

case 2:
{
  System.out.println("El dia es martes ");
  break;
}

case 3:
{
  System.out.println("El dia es miercoles ");
  break;
}

case 4:
{
  System.out.println("El dia es jueves ");
  break;

}
case 5:
{
  System.out.println("El dia es viernes ");
  break;

}
case 6:
{
  System.out.println("El dia es sabado ");
  break;
}

case 7:
{
  System.out.println("El dia es domingo");
  break;
    }
   }
  }
}

