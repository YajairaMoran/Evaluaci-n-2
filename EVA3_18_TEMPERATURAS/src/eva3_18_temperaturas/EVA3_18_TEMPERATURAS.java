/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_18_temperaturas;

import java.util.Scanner;

/**
 *
 * @author danie
 */
public class EVA3_18_TEMPERATURAS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner captu = new Scanner (System.in);
        System.out.println("De las siguientes converciones: ");
        System.out.println("    1 = Celsius a Fahrenheit");
        System.out.println("    2 = Celsius a Kelvin");
        System.out.println("    3 = Fahrenheit a Celsius");
        System.out.println("    4 = Kelvin a Fahrenheit");
        System.out.println("    5 = Fahrenheit a Kelvin");
        System.out.println("");
        System.out.println("¿Cual conversion quieres hacer? Digita el numero");
        int resp = captu.nextInt();
        System.out.println("");
    //--------------------------------------------------------------------------
        if (resp == 1) {
            System.out.println("Conversion de celsius a Fahrenheit");
            System.out.println("Ingresa la temperatura");
        double celcius = captu.nextInt();
        double resu = celsiusFahrenheit(celcius);
        System.out.println("La conversion es: " + resu + "°F");
        }
                else if (resp == 2) {
                    System.out.println("Conversion de celsius a Kelvin");
                    System.out.println("Ingresa la temperatura");
                double celcius = captu.nextInt();
                double resu = celsiusKelvin(celcius);
                System.out.println("La conversion es: " + resu + "K");
                }
        else if (resp == 3) {
            System.out.println("Conversion de fahrenheit a Celsius");
            System.out.println("Ingresa la temperatura");
        double fahrenheit = captu.nextInt();
        double resu = fahrenheitCelsius(fahrenheit);
        System.out.println("La conversion es: " + resu + "°C");
        }
                else if (resp == 4) {
                    System.out.println("Conversion de kelvin a Fahrenheit");
                    System.out.println("Ingresa la temperatura");
                double kelvin = captu.nextInt();
                double resu = kelvinFahrenheit(kelvin);
                System.out.println("La conversion es: " + resu + "°F");
                }
        else if (resp == 5) {
            System.out.println("Conversion de fahrenheit a Kelvin");
            System.out.println("Ingresa la temperatura");
        double fahrenheit = captu.nextInt();
        double resu = fahrenheitKelvin(fahrenheit);
        System.out.println("La conversion es: " + resu + "K");
        }
                else if(resp >= 6){
                    System.out.println("Numero no encontrado en el menu");
            }
    //--------------------------------------------------------------------------               
    }//1
    public static double celsiusFahrenheit(double celsius) {
        return (celsius * 9/5) + 32;
    }//2
    public static double celsiusKelvin(double celsius) {
        return celsius + 273.15;
    }//3
    public static double fahrenheitCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5/9;
    }//4
    public static double kelvinFahrenheit(double kelvin) {
        return (kelvin - 273.15) * 9/5 + 32;
    }//5
    public static double fahrenheitKelvin(double fahrenheit) {
        return (fahrenheit - 32) * 5/9 + 273.15;
    }
    
    
    
    
}
