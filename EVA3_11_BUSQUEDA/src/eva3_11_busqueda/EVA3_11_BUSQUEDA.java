/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_11_busqueda;

import java.util.Scanner;

/**
 *
 * @author danie
 */
public class EVA3_11_BUSQUEDA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner captu = new Scanner(System.in);
        int[] valor = new int[10];
        for (int i = 0; i < valor.length; i++) {
        valor[i] = (int)(Math.random()*100);
        }
        for (int i = 0; i < valor.length; i++) {
       
        }
        for (int val : valor) {
            System.out.print("[ " + val+ " ]");
            }
            System.out.println("");
        System.out.println("¿Que valor quiere buscar?");
        int resp = captu.nextInt();
        //Buscar
        //recorrer el arreglo
        // comparar valor buscado contra el valor en el arreglo
        //determine si encuentra el valor o no 
        //regresar el valor buscado
        int pos = -1;//una posicion que no existe
        for (int i = 0; i < valor.length; i++) {
            if (resp == valor[i]) {
                pos=i;
                break;
            }
        }
        System.out.println("La posicion es: " + pos); 
        
    }
    
}
