/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_10_for.each;

/**
 *
 * @author danie
 */
public class EVA3_10_FOREACH {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //En el for-each no se pueden imprimir los valores de manera inversa
        String diasSemana[] = {"Domingo","Lunes","Martes","Miercoles",
                                "Jueves","Viernes","Sabado"};
        for (String dia : diasSemana){
            System.out.println(dia);
        }
        System.out.println("");
        int salario[] = {255,3646,64644,6564,366,5989,6448};
        for (int cant : salario) 
            System.out.println("$" + cant);
        //-----------------------
        System.out.println("");
        String meses[] = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio",
                        "Julio", "Agosto", "Septiembre", "Octubre", "Diciembre"};
        for (String mes : meses) {
            System.out.println(mes);
        }
        
        
        
        
        
        
        
    }
    
}
