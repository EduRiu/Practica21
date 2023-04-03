/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

import java.util.Scanner;

/**
 *
 * @author eduardo
 */
public class ejercicio12 {
    
    /*
Crear un programa que pida una frase y si esa frase es igual a “eureka” el programa
pondrá un mensaje de Correcto, sino mostrará un mensaje de Incorrecto. Nota:
investigar la función equals() en Java.
    */

        public static void main(String[] args) {
        
            System.out.println("Ingrese una palabra");
            Scanner scan = new Scanner(System.in);
            
            String frase = scan.nextLine();
            
            if ("eureka".equals(frase)){
                
                System.out.println("la frase es correcta");
                }
            else
            {
                System.out.println("la frase es incorrecta");
            }
                
            
        }
        

    
}
