package com.senati.eti;
import java.util.Scanner;

public class Caso5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        
        String[] arrcodigo = {"A-123", "A-456", "A-789", "A-159"};
        String[] arrnombre = {"Joe Castillo", "Rosa Flores", "Carlos Benavides","Miguel Alcantara"};
        int[]arrnota = {13,8,18,10};
        
        String codigo = "";
        System.out.println("-------------------------------------");
        System.out.println("COLEGIO SENATI - MÓDULO DE BUSQUEDA");
        System.out.println("-------------------------------------");
        
        System.out.println("Codigo a buscar: ");
        codigo = sc.nextLine();
        
        int posicion = -1;
        
        for(int i = 0; i < arrcodigo.length; i++) {
        	if (arrcodigo[i].equals(codigo)) {
        		posicion = i;
        		break;
        	}
        	
        }
        
        System.out.println("            RESULTADOS");
        System.out.println("-------------------------------------");
          if (posicion == -1) {
        	  System.out.println("codigo no encontrado ....");
         }else {
        	 System.out.println("       Datos del participante");
        	 System.out.println("-------------------------------------");
        	 System.out.println("Codigo...." + arrcodigo[posicion]);
        	 System.out.println("Nombre...." + arrnombre[posicion]);
        	 System.out.println("Nota... " + arrnota[posicion]);
        	 
         }
          if (arrnota[posicion] > 11) {
        	  System.out.println("Estado:  Nota aprobatoria");
          }else {
        		  System.out.println("Estado:  Nota desaprobatoria");
          }
        	  
          

	
	}
}
