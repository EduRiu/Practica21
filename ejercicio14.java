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
public class ejercicio14 {
    /*
    Escriba un programa que pida una frase o palabra y valide si la primera letra de esa
frase es una ‘A’. Si la primera letra es una ‘A’, se deberá de imprimir un mensaje por
pantalla que diga “CORRECTO”, en caso contrario, se deberá imprimir
“INCORRECTO”. Nota: investigar la función Substring y equals() de Java.
    */
    public static void main(String[] args) {
        
     System.out.println("ingrese una frase");
     Scanner scan = new Scanner(System.in);
     String frase = scan.nextLine();
      
     
     
     String inicial = frase.substring(0, 1);
     
     
     
     if ("A".equals(inicial)){
         System.out.println("CORRECTO");
     }
     else
     {
         System.out.println("INCORRECTO");
     }
         
     
     
     
     
     
        
    }






}

