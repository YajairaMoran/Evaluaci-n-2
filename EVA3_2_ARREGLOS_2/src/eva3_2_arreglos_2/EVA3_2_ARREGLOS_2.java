/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_2_arreglos_2;

/**
 *
 * @author danie
 */
public class EVA3_2_ARREGLOS_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //java: 0 primer elemento
        // N - 1; ultimo elemento
        //N --> tota de elemtos almacenados en el arreglo
        
        //crear un arreglo y llenarlo con valores aleatorios
        //int datos [], x, y; --> solo DATOS es un arreglo
        //int [] datos, x, y; --> todas las variables son arreglos
        int datos[] = new int[10];
        
        
        //asignar valores aleatorios entre 0 y 99, (1 y 100(se le suma 1))
        for (int i = 0; i < datos.length; i++) {
            datos [i] = (int)(Math.random() * 100);
        }
        // imprimir los elementos del arreglo
         for (int i = 0; i < datos.length; i++) {
             System.out.print("[" + datos[i] + "]" );
            //datos [i] = (int)(Math.random() * 100);
        
         }
        
    }
    
}
