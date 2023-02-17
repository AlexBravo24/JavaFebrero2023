package Prog_C;

import javax.swing.JOptionPane;

public class Problema_14 {
	
	public static void main(String[] args) {

	      int horascump;
	      float SalarioT;

	      
		horascump = Integer.parseInt(JOptionPane.showInputDialog("digite el total de horas cumplidas"));

	      if (horascump <= 40){
	           SalarioT = horascump *16;
	      } else{
	       
	          SalarioT = (40*16) + ((horascump-40) * 20);
	      }
	          
	       JOptionPane.showMessageDialog(null, " el salario total es:"+ SalarioT);

	}


	}


