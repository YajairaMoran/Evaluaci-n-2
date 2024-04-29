/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_7_cubo;

/**
 *
 * @author danie
 */
public class EVA3_7_CUBO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int cubo [][][]= new int [10][5][3];//150 enteros
        for (int i = 0; i < cubo.length; i++) {
            for (int j = 0; j < cubo[i].length; j++) {
                for (int k = 0; k < cubo[i][j].length; k++) {
                    cubo[i][j][k]=(int)(Math.random()*100);
                }
            }
        }
        
        for (int i = 0; i < cubo.length; i++) {
            for (int j = 0; j < cubo[i].length; j++) {
                for (int k = 0; k < cubo[i][j].length; k++) {
                    System.out.println("[" + cubo[i][j][k] + "]");
                }
            }  
        }
    }
         
}
