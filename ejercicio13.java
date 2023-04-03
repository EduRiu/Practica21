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
public class ejercicio13 {
    /*
Realizar un programa que pida introducir solo frases o palabras de 8 de largo. Si el
usuario ingresa una frase o palabra de 8 de largo se deberá de imprimir un mensaje
por pantalla que diga “CORRECTO”, en caso contrario, se deberá imprimir
“INCORRECTO”. Nota: investigar la función Lenght() en Java.
    */
    
    public static void main(String[] args) {
        
        System.out.println("Ingrese una frase");
        Scanner scan = new Scanner(System.in);
        
        String frase = scan.nextLine();
        
     if (frase.length()== 8) {
         System.out.println("La frase es correcta");
     }   
        else
     {
         System.out.println("la frase es incorrecta");
     }
        
        
    }
    
}
