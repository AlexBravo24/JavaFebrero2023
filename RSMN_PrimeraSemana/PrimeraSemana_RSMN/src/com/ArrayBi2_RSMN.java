package com;

public class ArrayBi2_RSMN {
	public static void main(String[] args) {
		String[][] a = {{"5","x","9","4","t"},{"3","z","P","c","6"},{"8","3","f","i","7"}};
		String[][] b = {{"7","P","4","g","8"},{"5","w","Y","10","2"},{"4","7","v","o","6"}};
		String[][] c = new String[3][5];
		
		
		
		for (int i = 0; i < c.length; i++) {
			for (int j = 0; j < c[i].length; j++) {
				c[i][j] = isNumeric(a[i][j]) && isNumeric(b[i][j]) ? " " + (Integer.parseInt(a[i][j]) + Integer.parseInt(b[i][j])) : "0"  ;
			}
		}
		
		for (int i = 0; i < c.length; i++) {
			for (int j = 0; j < c[i].length; j++) {
				System.out.print(c[i][j] + "   ");
			}
			System.out.println();
		}
		
	}
	
	private static boolean isNumeric(String cadena){
		try {
			Integer.parseInt(cadena);
			return true;
		} catch (NumberFormatException nfe){
			return false;
		}
	}
}
