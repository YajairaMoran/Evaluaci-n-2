/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_15_sumatoria;

import java.util.Scanner;

/**
 *
 * @author danie
 */
public class EVA3_15_SUMATORIA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int resu = 0;
        Scanner captu = new Scanner (System.in);
        System.out.println("Numero 1: ");
        int val1 = captu.nextInt();
        System.out.println("Numero 2: ");
        int val2 = captu.nextInt();
        //calsular la potencia
        int resp = sumatoria(val1,val2);
        System.out.println("El resultado es: " + resp);
        
        
    }
   public static int sumatoria(int num1,int num2){
       int resp = 0;
       for (int i = 0; i < num2; i++) {
           resp += resp + num1;
       }
       return resp;
   }
}
