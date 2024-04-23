/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_1_arreglos;

/**
 *
 * @author danie
 */
public class EVA3_1_ARREGLOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //[] --> maneja los indices: arreglo[3] acceso a la posicion
        //declaracion = creacion (new) [tamaño del arreglo]
        int arreglo [] = new int[10];//un arreglo de 10 enteros
        //se accede a los datos a traves de indices: 
            //se necesitan conocer las posiciones de los valores
            //la primer posicion de un arreglo es cero 
            //ultima posicion de un arreglo es --> N - 1, donde 
            //N es el tamaño del arreglo
        arreglo [1] = 100;        
        System.out.println("Valor del arreglo [1] = " + arreglo[1]);
        System.out.println(arreglo);
        System.out.println(arreglo.length);// length es la cantidad d elementos
        
    }
    
}
