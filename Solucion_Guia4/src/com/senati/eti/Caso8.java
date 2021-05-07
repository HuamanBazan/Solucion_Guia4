package com.senati.eti;
import java.util.Scanner;
import java.util.ArrayList;
public class Caso8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);
         ArrayList<String> arrnombre = new ArrayList<String>();
         ArrayList<Integer> arredad = new ArrayList<Integer>();
         String rp = "S", nombre = "";
         int nr = 0, edad = 0;
         while (rp.equals("S") || rp.equals("s")) {
        	 nr++;
        	 System.out.println("REGISTRO N." + nr);
        	 System.out.println("------------");
        	 
        	 System.out.print("NOMBRE.... :");
        	 nombre = sc.nextLine();
        	 System.out.print("EDAD.... :");
        	 edad = sc.nextInt();
        	 
        	 arrnombre.add(nombre);
        	 arredad.add(edad);
        	 
        	 sc.nextLine();
        	 
        	 System.out.println("¿Continue? [S] [N]:");
        	 rp = sc.nextLine();
         }
	}    

}
