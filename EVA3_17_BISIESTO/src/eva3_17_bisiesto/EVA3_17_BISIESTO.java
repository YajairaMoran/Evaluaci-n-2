/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_17_bisiesto;

import java.util.Scanner;

/**
 *
 * @author danie
 */
public class EVA3_17_BISIESTO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner captu = new Scanner (System.in);
       System.out.println("Ingresa un año");
       int year = captu.nextInt();
       
       
       boolean resu = esBisiesto(year);
       
        if (resu)
            System.out.println("Es bisiesto");
        else 
            System.out.println("No es bisiesto");
       
    }
    public static boolean esBisiesto(int year){
     /*int resi1, resi2, resi3;
        resi1 = year % 4;
        resi2 = year % 100;
        resi3 = year % 400;
     */
       return ((year % 4 == 0) && (year % 100 ==0) && (year % 400 ==0));
         //return true; 
       
    } 
}
