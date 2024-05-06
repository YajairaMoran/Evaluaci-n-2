/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_12_metodos;

/**
 *
 * @author danie
 */
public class EVA3_12_METODOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //invocar al método --> llamada --> call
        //para corregir el error se tiene que mandar un mensaje tipo String para 
        //que se guarde en la variable (String mensaje)
        //a fuerzas los metodos deben ser static si no marca error 
        //no puede haber dos metodos con el mismo nombre en java
        mostrarMensaje("Hola mundo!!");
        System.out.println("");
        repMensaje("Hola!!", 3);   
    }
    
    //public static --> para la materia de POO
    //la palabra void se puede cambiar 
    //void --> (tipo de dato) valor que regresa el método 
    //void --> no regresa nada
    //nombre del método -->identificador válido
    //                      debe empezar en minúsculas, debe ser verbo
    //() <-- parámetros del método (argumento) --> valores que necesita para funcionar
    //{} <-- bloques de codigo
    //(String mensaje) <-- sirve para comunicarse entre parametros
    public static void mostrarMensaje(String mensaje){//emcabezado (nombre del método)
    //cuerpo del método:aquí va el mensaje que se quiere mostrar
        System.out.println(mensaje);
    }
    
    public static void repMensaje(String mensaje, int veces){
        for (int i = 0; i < veces; i++) {
            System.out.println(mensaje);
        }
         
    }     
    
}
