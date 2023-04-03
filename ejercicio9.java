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
public class ejercicio9 {
    
    /*
    Implementar un programa que dado dos números enteros determine cuál es el
    mayor y lo muestre por pantalla.
    */
    
    public static void main(String[] args) {
        
        System.out.println("ingrese dos valores");
        Scanner scan = new Scanner(System.in);
        
        int a = scan.nextInt();
        int b = scan.nextInt();
        
        if (a>b){
            System.out.println("el numero mayor es " + a);
            
             }
         else
             {
                 System.out.println("el numero mayor es " + b);
             }
        
        
    }
    
}
