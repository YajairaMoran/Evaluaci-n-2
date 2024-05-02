/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_9_arreglos;

/**
 *
 * @author danie
 */
public class EVA3_9_ARREGLOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String diasSemana[] = {"Domingo","Lunes","Martes","Miercoles",
            "Jueves","Viernes","Sabado"};
        char vocales [] = {'A','E','I','O','U'};
        System.out.println("Tamaño del arreglo diasSemana = " + diasSemana.length);
        System.out.println("Tamaño del arreglo vocales = " + vocales.length);
        
        System.out.println("");
        System.out.println("Dias de la semana");
        for (int i = 0; i < diasSemana.length; i++) {
            System.out.println(diasSemana[i]);
        }
        System.out.println("");
        System.out.println("Vocales");
        for (int i = 0; i < vocales.length; i++) {
            System.out.println(vocales[i]);
        }
        System.out.println("");
        String menu[]= {"archivo","nueva factura","modificar","salir"};
        for (int i = 0; i < menu.length ; i++) {
            System.out.println(i + " Menu " + menu[i]);
        }
        
    }
    
}
