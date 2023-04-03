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
public class Ejercicio7 {
    
    public static void main(String[] args) {
       
        /*Dado un tiempo en minutos, calcular su equivalente en días, horas y minutos. Por
        ejemplo, si el usuario ingresa 1600 minutos, el sistema debe calcular su equivalente:
        1 día, 2 horas y 40 minutos. DATO: un dia tiene 1440 minutos*/
        
               
        Scanner scan = new Scanner(System.in);
         
        int num = scan.nextInt();
        
        int dias = num/1440;
        int horas = (num%1440)/60;
        int minutos = (num%1440)%60;
        
        System.out.println("El valor ingresado " + num + " expresado en dias, horas y minutos es "
        + " dias" + dias + " horas " + horas + " minutos " + minutos);
        
        
        
        
        
      
      
                
    }
    
}
