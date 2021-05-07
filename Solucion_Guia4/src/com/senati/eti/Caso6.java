package com.senati.eti;

public class Caso6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[][]  mDatos = { {"Joe Castillo", "Rosa Alvarez" , "Carlos Santos"},
		{"Callao", "Comas", "San Miguel"}};	
		 System.out.println("  IMPRESION DE VALORES POR FILAS");
    	 System.out.println("-------------------------------------");
	     
    	 for (int f = 0; f < mDatos.length; f++) {
    		 for (int c=0; c < mDatos[0].length; c++) {
    			 System.out.print(String.format("%-20s", mDatos[f][c]));
    		 }
    		 System.out.println();
    	 }
    	 System.out.println("  IMPRESION DE VALORES POR COLUMNAS");
    	 System.out.println("-------------------------------------");
    	 
    		 for (int c=0; c < mDatos[0].length; c++)  {
    		 for (int f = 0; f < mDatos.length; f++) {
    			 System.out.print(String.format("%-20s", mDatos[f][c]));
    		 }
    		 System.out.println();
    	 }
		

	}

}
