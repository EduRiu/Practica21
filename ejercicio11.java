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
public class ejercicio11 {
    
    /*
    Crear un programa que dado un numero determine si es par o impar.
    */
    
    public static void main(String[] args) {
        
        System.out.println("Ingrese un valor para determinar si es par o impar");
        
        Scanner scan = new Scanner(System.in);
        
        int a = scan.nextInt();
        
        if (a%2 == 0) {
            System.out.println("el numero es par");
        }
        else
        {
            System.out.println("el numero es impar");
        }
        
        
    }
}


