/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_6_arreglos_multi;

/**
 *
 * @author danie
 */
public class EVA3_6_ARREGLOS_MULTI {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int matriz [][]= new int [3][2];
        matriz [0][0] = 100;
        matriz [0][1] = 200;
        matriz [1][0] = 300;
        matriz [1][1] = 400;
        matriz [2][0] = 500;
        matriz [2][1] = 600;
        //------------------
        
        System.out.println("matriz.length = " + matriz.length);
        //se va arecorrer la primer dimension
        for (int i = 0; i < matriz.length; i++) {// controla las filas ---
             for (int j = 0; j < matriz[i].length; j++){// controla las columnas (dos columnas |||)
                 System.out.println("matriz [" + i + "][" + j + "] = " + matriz [i][j]);
             }
        }
        
    }
    
}
