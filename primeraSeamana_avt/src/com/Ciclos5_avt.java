package com;

public class Ciclos5_avt {

	public static void main(String[] args) {
		
		for (int h = 00; h <= 23; h++)
        {
            for (int m = 00; m <= 59; m++)
            {
                for (int s = 00; s <= 59; s++)
                {
                	System.out.println(h + ":" + m + ":" + s);
                }
            }
        }
		System.out.println("Simulacion finalizada.");
      
    }
	}


