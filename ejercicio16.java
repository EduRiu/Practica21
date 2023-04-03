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
public class ejercicio16 {
    
    /*
    Elaborar un algoritmo en el cuál se ingrese una letra y se detecte si se trata de una
vocal. Caso contrario mostrar un mensaje.
    */
    
    public static void main(String[] args) {
        
        System.out.println("ingrese una letra");
        Scanner scan = new Scanner(System.in);
        String letra = scan.next();
        letra = letra.toUpperCase();
        
        if ("A".equals(letra) || "E".equals(letra) || "I".equals(letra) || "O".equals(letra) || "U".equals(letra)){
            
            System.out.println("ingreso una vocal");
                        
        }
        else
        {
            System.out.println("ingreso una NO vocal");
        }
        
    }
    
    
}
