/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_13_return;

import java.util.Scanner;

/**
 *
 * @author danie
 */
public class EVA3_13_RETURN {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //VOID hace algo pero no regresa resultado
        Scanner captu = new Scanner (System.in);
        System.out.println("valor 1: ");
        int val1 = captu.nextInt();
        System.out.println("valor 2: ");
        int val2 = captu.nextInt();
        // llamar a la fucion 
        //opcion 1- guardar el resiltado, conviene si el resultado se va a usar muchas veces
        int resu = sumar (val1, val2);
        System.out.println("La suma de los dos valores es: " + resu);
        //opcion 2-usar directamente la funcion, esto conviene cuando solo se va a usar una vez
        System.out.println("La suma de los dos valores es: " + 
                            sumar (val1, val2));
        //opcion 3-ignorar el resultado 
        sumar (val1, val2);
        
    }
    public static int sumar(int num1, int num2){
        int resu = num1 + num2;
        return resu;//es la ultima instruccion del return 
                    //despues de esta no puede haber mas instrucciones
        
        
    }
    
    
    
}
