package com.senati.eti;
import java.util.Arrays;
public class Caso1 {

	public static void main(String[] args) {
		String[] arrNombre = new String[4];
        arrNombre[0] = "Joe Castillo";	  
        arrNombre[1] = "Rosa Mejia";
        arrNombre[2] = "Joe Castro";
        arrNombre[3] = "Joel Gonzales";
        System.out.println("Forma 1");
        System.out.println("--------");
        System.out.println(Arrays.toString(arrNombre));
        
        System.out.println("");
        
        System.out.println("Forma 2");
        System.out.println("--------");
        for (int x = 0; x< arrNombre.length; x++)
        System.out.println("Nombre " + (x+1) + ": " + arrNombre[x]);
	
        System.out.println("");
        
        System.out.println("Forma 3");
        System.out.println("--------");
        for(String nombre:arrNombre) {
        	System.out.println("Nombre " + ":" + nombre);
        	
        }
        
        
	
	}

}
