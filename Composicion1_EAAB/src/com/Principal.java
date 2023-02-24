package com;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Estereo estereo = new Estereo("pioneer",true,9,true,true);
		Motor motor = new Motor(4,150,1.4,true);
		Llantas llantas = new Llantas("michellin","255/65R17",32);
		
		Auto crv = new Auto("Honda","CR-V",2021,30000,estereo,motor,llantas);
		
		System.out.println(crv);
		
		
		
		
		
		
		

	}

}
