/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_8_5_dimensiones;

/**
 *
 * @author danie
 */
public class EVA3_8_5_DIMENSIONES {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int dim [][][][][]= new int [1][2][3][4][5];//150 enteros
        for (int i = 0; i < dim.length; i++) {
            for (int j = 0; j < dim[i].length; j++) {
                for (int k = 0; k < dim[i][j].length; k++) {
                    for (int l = 0; l < dim[i][j][k].length; l++) {
                        for (int m = 0; m < dim[i][j][k][l].length; m++) {
                          dim[i][j][k][l][m]=(int)(Math.random()*100);  
                        }
                    }
                }
            }
        }
        for (int i = 0; i < dim.length; i++) {
            for (int j = 0; j < dim[i].length; j++) {
                for (int k = 0; k < dim[i][j].length; k++) {
                    for (int l = 0; l < dim[i][j][k].length; l++) {
                        for (int m = 0; m < dim[i][j][k][l].length; m++) {
                            System.out.println("[" + dim[i][j][k][l][m] + "]");  
                        }
                    }
                }
            }
        }
        
        
        
        
    }
    
}
